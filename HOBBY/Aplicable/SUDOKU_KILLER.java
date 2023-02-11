package Aplicable;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
//Import BufferedReader
import java.io.BufferedReader;

public class SUDOKU_KILLER {

	public static void main(String[] args) {

		crono2 t = new crono2();

		// String[] lineas = new String[9];

		// lineas[0] = "300000004";
		// lineas[1] = "000609000";
		// lineas[2] = "006000900";
		// lineas[3] = "080302060";
		// lineas[4] = "000070000";
		// lineas[5] = "010805070";
		// lineas[6] = "007000800";
		// lineas[7] = "000708000";
		// lineas[8] = "900000007";

		// Read lines from file
		String[] lineas = new String[9];
		String path = "./sudoku.sdk";
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(path));
			for (int i = 0; i < 9; i++) {
				lineas[i] = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error Reading File: " + e.getMessage());
		}
		int numSoluciones = args.length > 0 ? Integer.parseInt(args[0]) : 1;

		boolean knightsmoves = args.length > 1 ? Boolean.parseBoolean(args[1]) : false;

		boolean diagonals = args.length > 2 ? Boolean.parseBoolean(args[2]) : false;

		boolean kingmoves = args.length > 3 ? Boolean.parseBoolean(args[3]) : false;

		boolean consecutive = args.length > 4 ? Boolean.parseBoolean(args[4]) : false;

		if (sigo(lineas, knightsmoves, diagonals, kingmoves, consecutive)) {

			int[][] sudoku = dime_sudoku(lineas);

			double ceros = dime_ceros(lineas);

			if (numSoluciones == 0 && ceros == 81 && !knightsmoves && !diagonals) {

				System.out.println(
						"Lo siento, pero no tengo la potencia computacional necesaria para\ndarte las 9! × 722 × 27 × 27,704,267,971 soluciones posibles para este sudoku,\ntardaria aprox unos 163.538.674 años, tiempo en el universo podria haber acabado");

			} else if (numSoluciones == 0 && ceros > 69 && !knightsmoves && !diagonals) {

				System.out.println("Demasiadas soluciones");

			} else {

				t.set_inicio();

				solve(sudoku, numSoluciones, knightsmoves, diagonals, kingmoves, consecutive);

				t.set_fin();

				if (!solved) {

					System.out.println("No hay solucion");

				}

				System.out.println(t.dime_tiempo());

			}

		} else {

			System.out.println("Sudoku no valido");

		}

	}

	public static boolean sigo(String[] s, boolean k, boolean d, boolean ck, boolean cons) {

		int[][] sud = dime_sudoku(s);

		for (int i = 0; i < s.length; i++) {

			if (s[i].length() == 9 == false) {

				return false;

			}

		}

		try {

			for (int i = 0; i < 9; i++) {

				for (int j = 0; j < 9; j++) {

					if (s[i].charAt(j) == '0' == false) {

						if (!se_puede(sud, Integer.parseInt(Character.toString(s[i].charAt(j))), i, j, k, d, ck,
								cons)) {

							return false;

						}

					}

				}

			}

		} catch (Exception e) {

			return false;

		}

		return true;

	}

	static int c = 0;
	static boolean solved = false;

	public static void solve(int[][] sudoku, int numSoluciones, boolean k, boolean d, boolean ck, boolean cons) {

		if (c < numSoluciones) {

			ArrayList<String> ramas = new ArrayList();

			if (!resuelto(sudoku)) {

				ramas = dimeRamasNext(sudoku, k, d, ck, cons);

			} else {

				imprimir(sudoku);
				solved = true;

				if (numSoluciones != 0) {

					c++;

				}

			}

			for (int i = 0; i < ramas.size(); i++) {

				int n = Integer.parseInt(Character.toString(ramas.get(i).charAt(0)));
				int f = Integer.parseInt(Character.toString(ramas.get(i).charAt(1)));
				int c = Integer.parseInt(Character.toString(ramas.get(i).charAt(2)));

				sudoku[f][c] = n;
				solve(sudoku, numSoluciones, k, d, ck, cons);
				sudoku[f][c] = 0;

			}

		}

	}

	public static ArrayList<String> dimeRamasNext(int[][] sudoku, boolean k, boolean d, boolean ck, boolean cons) {

		ArrayList<String> s = new ArrayList();

		String pos = dimePosNext(sudoku);

		int f = Integer.parseInt(Character.toString(pos.charAt(0)));
		int c = Integer.parseInt(Character.toString(pos.charAt(1)));

		for (int i = 1; i < 10; i++) {

			if (se_puede(sudoku, i, f, c, k, d, ck, cons)) {

				s.add(i + "" + f + "" + c);

			}

		}

		return s;

	}

	public static String dimePosNext(int[][] sudoku) {

		String s = "";

		for (int i = 0; i < sudoku.length; i++) {

			for (int j = 0; j < sudoku.length; j++) {

				if (sudoku[i][j] == 0) {

					s = s + i;
					s = s + j;
					return s;

				}

			}

		}

		return s;

	}

	public static void imprimir(int[][] sudoku) {

		for (int i = 0; i < sudoku.length; i++) {

			for (int j = 0; j < sudoku.length; j++) {

				System.out.print(sudoku[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean resuelto(int[][] sudoku) {

		for (int i = 0; i < sudoku.length; i++) {

			for (int j = 0; j < sudoku.length; j++) {

				if (sudoku[i][j] == 0) {

					return false;

				}

			}

		}

		return true;

	}

	public static boolean se_puede(int[][] sudoku, int num, int fila, int columna, boolean k, boolean d, boolean ck,
			boolean cons) {

		boolean t_f = true;

		for (int j = 0; j < 9; j++) {

			if (j == columna == false) {

				if (num == sudoku[fila][j]) {

					t_f = false;

				}

			}

		}

		for (int i = 0; i < 9; i++) {

			if (i == fila == false) {

				if (num == sudoku[i][columna]) {

					t_f = false;

				}

			}

		}
		String posicion = null;
		if (fila <= 2 && fila >= 0) {

			if (columna <= 2 && columna >= 0) {

				posicion = "00";

			}
			if (columna <= 5 && columna >= 3) {

				posicion = "03";

			}
			if (columna <= 8 && columna >= 6) {

				posicion = "06";

			}

		} else {

			if (fila <= 5 && fila >= 3) {

				if (columna <= 2 && columna >= 0) {

					posicion = "30";

				}
				if (columna <= 5 && columna >= 3) {

					posicion = "33";

				}
				if (columna <= 8 && columna >= 6) {

					posicion = "36";

				}

			} else {

				if (fila <= 8 && fila >= 6) {

					if (columna <= 2 && columna >= 0) {

						posicion = "60";

					}
					if (columna <= 5 && columna >= 3) {

						posicion = "63";

					}
					if (columna <= 8 && columna >= 6) {

						posicion = "66";

					}
				}
			}

		}

		int inicio_i = Integer.parseInt(Character.toString(posicion.charAt(0)));
		int inicio_j = Integer.parseInt(Character.toString(posicion.charAt(1)));

		int fin_i = inicio_i + 3;
		int fin_j = inicio_j + 3;

		for (int i = inicio_i; i < fin_i; i++) {

			for (int j = inicio_j; j < fin_j; j++) {

				if (i == fila == false && j == columna == false) {

					if (num == sudoku[i][j]) {

						t_f = false;

					}

				}

			}

		}

		if (k) {

			int i = fila;
			int j = columna;
			int n = num;
			int[][] s = sudoku;

			if (i + 2 < s.length && j + 1 < s.length) {

				if (s[i + 2][j + 1] == n) {

					return false;

				}

			}
			if (i + 1 < s.length && j + 2 < s.length) {

				if (s[i + 1][j + 2] == n) {

					return false;

				}

			}
			if (i - 1 >= 0 && j + 2 < s.length) {

				if (s[i - 1][j + 2] == n) {

					return false;

				}

			}
			if (i - 2 >= 0 && j + 1 < s.length) {

				if (s[i - 2][j + 1] == n) {

					return false;

				}

			}
			if (i - 2 >= 0 && j - 1 >= 0) {

				if (s[i - 2][j - 1] == n) {

					return false;

				}

			}
			if (i - 1 >= 0 && j - 2 >= 0) {

				if (s[i - 1][j - 2] == n) {

					return false;

				}

			}
			if (i + 1 < s.length && j - 2 >= 0) {

				if (s[i + 1][j - 2] == n) {

					return false;

				}

			}
			if (i + 2 < s.length && j - 1 >= 0) {

				if (s[i + 2][j - 1] == n) {

					return false;

				}

			}

		}

		if (d) {

			int n = num;
			int[][] s = sudoku;

			if (fila == columna || fila + columna == 8) {

				for (int i = 1; i < sudoku.length; i++) {

					if (fila + i < sudoku.length && columna + i < sudoku.length) {

						if (sudoku[fila + i][columna + i] != 0) {

							if (s[fila + i][columna + i] == num) {

								return false;

							}

						}

					} else {

						break;

					}

				}

				for (int i = 1; i < sudoku.length; i++) {

					if (fila - i >= 0 && columna - i >= 0) {

						if (sudoku[fila - i][columna - i] != 0) {

							if (s[fila - i][columna - i] == num) {

								return false;

							}

						}

					} else {

						break;

					}

				}

				for (int i = 1; i < sudoku.length; i++) {

					if (fila - i >= 0 && columna + i < sudoku.length) {

						if (sudoku[fila - i][columna + i] != 0) {

							if (s[fila - i][columna + i] == num) {

								return false;

							}

						}

					} else {

						break;

					}

				}

				for (int i = 1; i < sudoku.length; i++) {

					if (fila + i < sudoku.length && columna - i >= 0) {

						if (sudoku[fila + i][columna - i] != 0) {

							if (s[fila + i][columna - i] == num) {

								return false;

							}

						}

					} else {

						break;

					}

				}

			}

		}

		if (ck) {

			int n = num;
			int[][] s = sudoku;

			if (fila + 1 < sudoku.length && columna + 1 < sudoku.length) {

				if (sudoku[fila + 1][columna + 1] != 0) {

					if (s[fila + 1][columna + 1] == num) {

						return false;

					}

				}

			}

			if (fila - 1 >= 0 && columna - 1 >= 0) {

				if (sudoku[fila - 1][columna - 1] != 0) {

					if (s[fila - 1][columna - 1] == num) {

						return false;

					}

				}

			}

			if (fila - 1 >= 0 && columna + 1 < sudoku.length) {

				if (sudoku[fila - 1][columna + 1] != 0) {

					if (s[fila - 1][columna + 1] == num) {

						return false;

					}

				}

			}

			if (fila + 1 < sudoku.length && columna - 1 >= 0) {

				if (sudoku[fila + 1][columna - 1] != 0) {

					if (s[fila + 1][columna - 1] == num) {

						return false;

					}

				}

			}

		}

		if (cons) {

			if (fila + 1 < sudoku.length) {

				if ((sudoku[fila + 1][columna] == num - 1 || sudoku[fila + 1][columna] == num + 1)
						&& sudoku[fila + 1][columna] != 0) {

					return false;

				}

			}

			if (fila - 1 >= 0) {

				if ((sudoku[fila - 1][columna] == num - 1 || sudoku[fila - 1][columna] == num + 1)
						&& sudoku[fila - 1][columna] != 0) {

					return false;

				}

			}

			if (columna + 1 < sudoku.length) {

				if ((sudoku[fila][columna + 1] == num - 1 || sudoku[fila][columna + 1] == num + 1)
						&& sudoku[fila][columna + 1] != 0) {

					return false;

				}

			}

			if (columna - 1 >= 0) {

				if ((sudoku[fila][columna - 1] == num - 1 || sudoku[fila][columna - 1] == num + 1)
						&& sudoku[fila][columna - 1] != 0) {

					return false;

				}

			}

		}

		return t_f;

	}

	public static int[][] dime_sudoku(String[] l) {

		int[][] sudoku = new int[9][9];

		String[] lineas = l;

		for (int i = 0; i < 9; i++) {

			String fila = lineas[i];

			for (int j = 0; j < 9; j++) {

				sudoku[i][j] = Integer.parseInt(Character.toString(fila.charAt(j)));

			}

		}

		return sudoku;

	}

	public static double dime_ceros(String[] s) {

		double c = 0;

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s[i].length(); j++) {

				if (s[i].charAt(j) == '0') {

					c++;

				}

			}

		}

		return c;

	}

}

class crono2 {

	static LocalDateTime i;
	static LocalDateTime j;
	static double nanos;
	static String tiempo = "";

	public void set_inicio() {

		i = LocalDateTime.now();

	}

	public void set_fin() {

		j = LocalDateTime.now();

	}

	public double dime_segs_tot() {

		nanos = Duration.between(i, j).toNanos();

		return (double) nanos / 1000000000;

	}

	public String dime_tiempo() {

		int horas = 0, mins = 0;

		nanos = Duration.between(i, j).toNanos();

		double segs = (double) nanos / 1000000000;

		if (segs >= 3600) {

			horas = (int) segs / 3600;

			segs = segs - horas * 3600;

		}

		if (segs >= 60) {

			mins = (int) (segs / 60);

			segs = segs - mins * 60;

		}

		tiempo = horas + " hrs : " + mins + " mins : " + segs + " segs";

		return tiempo;

	}

}
