package Aplicable;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class S_SOLVER {

	public static void main(String[] args) {

		String[] lineas = new String[9];

		lineas[0] = "000000000";
		lineas[1] = "000000000";
		lineas[2] = "000000000";
		lineas[3] = "000000000";
		lineas[4] = "000000000"; // CEROS 81
		lineas[5] = "000000000";
		lineas[6] = "000000000";
		lineas[7] = "000000000";
		lineas[8] = "000000000";

		resuelve(lineas, 1);

	}

	public static void resuelve(String[] lineas, int num_soluciones) {

		timer t = new timer();

		t.set_inicio();

		double ceros = dime_ceros(lineas);

		double f_vacias = dime_filas_vacias(lineas);

		double f_casi_vacias = dime_filas_casi_vacias(lineas);

		if (sigo(lineas)) {

			if (ceros == 81 && num_soluciones == 0) {

				System.out.println(
						"Lo siento, pero no tengo la potencia computacional necesaria para\ndarte las 9! × 722 × 27 × 27,704,267,971 soluciones posibles para este sudoku,\ntardaria aprox unos 140.000.000.000 años, tiempo en el universo podria haber acabado");

			} else {

				int[][] sudoku = dime_sudoku(lineas);

				if (num_soluciones == 1) {

					sudoku = mete_lqp(sudoku);

				}

				lineas = devuelve_Array(sudoku);

				ArrayList<ArrayList<String>> soluciones = new ArrayList();

				double t_estimado = (Math.floor(
						(((double) (ceros / 100)) + ((double) f_vacias * 0.36) + ((double) f_casi_vacias * 0.15)) * 10)
						/ 10) + 0.5;

				if (!esta_completo(lineas)) {

					if (ceros == 81) {
						t_estimado = 1;
						System.out.println("Tiempo estimado 1 segs\n");
						soluciones = solve(lineas, num_soluciones);

					} else {

						System.out.println("Tiempo estimado: " + t_estimado + " segs\n");
						soluciones = solve(lineas, num_soluciones);

					}

				} else {

					t_estimado = 0.05;

					System.out.println("Tiempo estimado: " + t_estimado + " segs\n");

					ArrayList<String> sa = new ArrayList();

					for (int i = 0; i < lineas.length; i++) {

						sa.add(lineas[i]);

					}
					soluciones.add(sa);
				}

				t.set_fin();

				for (int n = 0; n < soluciones.size(); n++) {
					System.out.println("Solucion " + (n + 1) + "/" + soluciones.size() + ": \n");
					for (int n2 = 0; n2 < soluciones.get(n).size(); n2++) {

						System.out.println(soluciones.get(n).get(n2));

					}
					System.out.println();
				}

				double p_error = (double) ((double) (t_estimado - t.dime_segs_tot()) * 100) / t.dime_segs_tot();

				System.out.println(t.dime_tiempo());
				System.out.println("Ceros: " + ceros);
				System.out.println("Segundos: " + t.dime_segs_tot());
				System.out.println("Porcentaje de error: " + Math.abs(p_error) + " %");
				System.out.println(
						"Velocidad de resolucion: " + (ceros / t.dime_segs_tot()) * soluciones.size() + " ceros/seg");

			}

		} else {

			System.out.println("Sudoku no valido");

		}

	}

	public static boolean sigo(String[] s) {

		boolean t_f = true;

		for (int i = 0; i < s.length; i++) {

			if (s[i].length() == 9 == false) {

				t_f = false;

			}

		}

		try {

			for (int i = 0; i < 9; i++) {

				for (int j = 0; j < 9; j++) {

					if (s[i].charAt(j) == '0' == false) {

						if (!se_puede(dime_sudoku(s), Integer.parseInt(Character.toString(s[i].charAt(j))), i, j)) {

							t_f = false;
							break;
						}

					}

				}
				if (!t_f) {
					break;
				}
			}

		} catch (Exception e) {

			t_f = false;

		}

		return t_f;

	}

	public static void crea_todas() {

		String line = "";

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				if (j == i == false) {

					for (int j2 = 1; j2 < 10; j2++) {

						if (j2 == j == false && j2 == i == false) {

							for (int k = 1; k < 10; k++) {

								if (k == j2 == false && k == j == false && k == i == false) {

									for (int k2 = 1; k2 < 10; k2++) {

										if (k2 == k == false && k2 == j2 == false && k2 == j == false
												&& k2 == i == false) {

											for (int l = 1; l < 10; l++) {

												if (l == k2 == false && l == k == false && l == j2 == false
														&& l == j == false && l == i == false) {

													for (int l2 = 1; l2 < 10; l2++) {

														if (l2 == l == false && l2 == k2 == false && l2 == k == false
																&& l2 == j2 == false && l2 == j == false
																&& l2 == i == false) {

															for (int m = 1; m < 10; m++) {

																if (m == l2 == false && m == l == false
																		&& m == k2 == false && m == k == false
																		&& m == j2 == false && m == j == false
																		&& m == i == false) {

																	for (int m2 = 1; m2 < 10; m2++) {

																		if (m2 == m == false && m2 == l2 == false
																				&& m2 == l == false && m2 == k2 == false
																				&& m2 == k == false && m2 == j2 == false
																				&& m2 == j == false
																				&& m2 == i == false) {

																			line = i + "" + j + "" + j2 + "" + k + ""
																					+ k2 + "" + l + "" + l2 + "" + m
																					+ "" + m2;
																			todas.add(line);

																		}

																	}

																}

															}

														}

													}

												}

											}

										}

									}

								}

							}

						}

					}

				}
			}

		}

	}

	public static ArrayList<String> dime_combs(String s, String[] l, int num) {

		boolean valido;

		ArrayList<String> combinaciones = new ArrayList();

		ArrayList<String> combs = new ArrayList();

		ArrayList<String> c = new ArrayList();
		ArrayList<Integer> pos = new ArrayList();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '0' == false) {

				c.add(Character.toString(s.charAt(i)));
				pos.add(i);

			}

		}
		double d = dime_ceros(l);
		if (c.size() == 0 && d == 81) {

			combs = todas;

		} else {

			if (c.size() == 0) {

				boolean reu = false;

				for (int i = 0; i < num_v.size(); i++) {

					if (num_v.get(i) == num) {

						reu = true;

					}

				}

				if (reu) {

					combs = temp;

				} else {

					for (int i = 0; i < todas.size(); i++) {

						valido = true;

						l[num] = todas.get(i);

						int[][] sudoku = dime_sudoku(l);

						for (int k = 0; k < 9; k++) {

							if (!se_puede(sudoku, sudoku[num][k], num, k)) {

								valido = false;
								break;
							}

						}

						l[num] = s;

						if (valido) {

							combs.add(todas.get(i));

						}

					}

				}

				temp = combs;

				if (num == 0 || num == 1 || num == 2) {
					num_v = new ArrayList();
					num_v.add(1);
					num_v.add(2);

				}
				if (num == 3 || num == 4 || num == 5) {
					num_v = new ArrayList();
					num_v.add(4);
					num_v.add(5);

				}
				if (num == 6 || num == 7 || num == 8) {
					num_v = new ArrayList();
					num_v.add(7);
					num_v.add(8);

				}
			} else {

				if (c.size() == 9 == false) {

					for (int i = 0; i < todas.size(); i++) {

						valido = true;

						for (int j = 0; j < c.size(); j++) {

							if ((todas.get(i).charAt(pos.get(j)) == c.get(j).charAt(0)) == false) {

								valido = false;
								break;
							}

						}

						if (valido) {

							combinaciones.add(todas.get(i));

						}

					}

					for (int i = 0; i < combinaciones.size(); i++) {

						valido = true;

						l[num] = combinaciones.get(i);

						int[][] sudoku = dime_sudoku(l);

						for (int k = 0; k < 9; k++) {

							if (!se_puede(sudoku, sudoku[num][k], num, k)) {

								valido = false;
								break;
							}

						}

						l[num] = s;

						if (valido) {

							combs.add(combinaciones.get(i));

						}

					}

				} else {

					String str = "";
					for (int i = 0; i < c.size(); i++) {

						str = str + c.get(i);

					}
					combs.add(str);

				}

			}

		}

		return combs;

	}

	public static ArrayList<ArrayList<String>> solve(String[] lineas, int n) {

		boolean salir = false;

		int c = 0;

		crea_todas();

		ArrayList<String> f1 = dime_combs(lineas[0], lineas, 0);
		ArrayList<String> f2 = dime_combs(lineas[1], lineas, 1);
		ArrayList<String> f3 = dime_combs(lineas[2], lineas, 2);
		ArrayList<String> f4 = dime_combs(lineas[3], lineas, 3);
		ArrayList<String> f5 = dime_combs(lineas[4], lineas, 4);
		ArrayList<String> f6 = dime_combs(lineas[5], lineas, 5);
		ArrayList<String> f7 = dime_combs(lineas[6], lineas, 6);
		ArrayList<String> f8 = dime_combs(lineas[7], lineas, 7);
		ArrayList<String> f9 = dime_combs(lineas[8], lineas, 8);

		ArrayList<ArrayList<String>> soluciones = new ArrayList();

		for (int i = 0; i < f1.size(); i++) {

			for (int j = 0; j < f2.size(); j++) {

				if (es_valida(f1.get(i), f2.get(j)) && es_valida2(f1.get(i), f2.get(j))) {

					for (int j2 = 0; j2 < f3.size(); j2++) {

						if (es_valida(f1.get(i), f3.get(j2)) && es_valida(f2.get(j), f3.get(j2))
								&& es_valida2(f1.get(i), f3.get(j2)) && es_valida2(f2.get(j), f3.get(j2))) {

							for (int k = 0; k < f4.size(); k++) {

								if (es_valida(f1.get(i), f4.get(k)) && es_valida(f2.get(j), f4.get(k))
										&& es_valida(f3.get(j2), f4.get(k))) {

									for (int k2 = 0; k2 < f5.size(); k2++) {

										if (es_valida(f1.get(i), f5.get(k2)) && es_valida(f2.get(j), f5.get(k2))
												&& es_valida(f3.get(j2), f5.get(k2)) && es_valida(f4.get(k), f5.get(k2))
												&& es_valida2(f4.get(k), f5.get(k2))) {

											for (int l = 0; l < f6.size(); l++) {

												if (es_valida(f1.get(i), f6.get(l)) && es_valida(f2.get(j), f6.get(l))
														&& es_valida(f3.get(j2), f6.get(l))
														&& es_valida(f4.get(k), f6.get(l))
														&& es_valida(f5.get(k2), f6.get(l))
														&& es_valida2(f4.get(k), f6.get(l))
														&& es_valida2(f5.get(k2), f6.get(l))) {

													for (int l2 = 0; l2 < f7.size(); l2++) {

														if (es_valida(f1.get(i), f7.get(l2))
																&& es_valida(f2.get(j), f7.get(l2))
																&& es_valida(f3.get(j2), f7.get(l2))
																&& es_valida(f4.get(k), f7.get(l2))
																&& es_valida(f5.get(k2), f7.get(l2))
																&& es_valida(f6.get(l), f7.get(l2))) {

															for (int m1 = 0; m1 < f8.size(); m1++) {

																if (es_valida(f1.get(i), f8.get(m1))
																		&& es_valida(f2.get(j), f8.get(m1))
																		&& es_valida(f3.get(j2), f8.get(m1))
																		&& es_valida(f4.get(k), f8.get(m1))
																		&& es_valida(f5.get(k2), f8.get(m1))
																		&& es_valida(f6.get(l), f8.get(m1))
																		&& es_valida(f7.get(l2), f8.get(m1))
																		&& es_valida2(f7.get(l2), f8.get(m1))) {

																	for (int m2 = 0; m2 < f9.size(); m2++) {

																		if (es_valida(f1.get(i), f9.get(m2))
																				&& es_valida(f2.get(j), f9.get(m2))
																				&& es_valida(f3.get(j2), f9.get(m2))
																				&& es_valida(f4.get(k), f9.get(m2))
																				&& es_valida(f5.get(k2), f9.get(m2))
																				&& es_valida(f6.get(l), f9.get(m2))
																				&& es_valida(f7.get(l2), f9.get(m2))
																				&& es_valida(f8.get(m1), f9.get(m2))
																				&& es_valida2(f7.get(l2), f9.get(m2))
																				&& es_valida2(f8.get(m1), f9.get(m2))) {

																			ArrayList<String> s1 = new ArrayList();

																			s1.add(f1.get(i));
																			s1.add(f2.get(j));
																			s1.add(f3.get(j2));
																			s1.add(f4.get(k));
																			s1.add(f5.get(k2));
																			s1.add(f6.get(l));
																			s1.add(f7.get(l2));
																			s1.add(f8.get(m1));
																			s1.add(f9.get(m2));

																			soluciones.add(s1);

																			c++;

																			if (c == n) {

																				salir = true;

																			}

																		}

																	}
																	if (salir) {
																		break;
																	}
																}
																if (salir) {
																	break;
																}
															}
															if (salir) {
																break;
															}
														}
														if (salir) {
															break;
														}
													}
													if (salir) {
														break;
													}
												}
												if (salir) {
													break;
												}
											}
											if (salir) {
												break;
											}
										}
										if (salir) {
											break;
										}
									}
									if (salir) {
										break;
									}
								}
								if (salir) {
									break;
								}
							}
							if (salir) {
								break;
							}
						}
						if (salir) {
							break;
						}
					}
					if (salir) {
						break;
					}
				}
				if (salir) {
					break;
				}
			}
			if (salir) {
				break;
			}
		}

		return soluciones;

	}

	public static boolean se_puede(int[][] sudoku, int num, int fila, int columna) {

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

		return t_f;

	}

	public static ArrayList<String> dime_segs(int[][] sudoku, int num) {

		ArrayList<String> a = dime_posibilidades(sudoku);

		ArrayList<String> s = new ArrayList();

		int contador;

		for (int i = 0; i < a.size(); i++) {

			contador = 0;

			String p1 = Character.toString(a.get(i).charAt(1)) + Character.toString(a.get(i).charAt(2));

			for (int j = 0; j < a.size(); j++) {

				String p2 = Character.toString(a.get(j).charAt(1)) + Character.toString(a.get(j).charAt(2));

				if (p1.equalsIgnoreCase(p2)) {

					contador++;

				}

			}

			if (contador == num) {

				s.add(a.get(i));

			}

		}

		return s;

	}

	public static ArrayList<String> dime_posibilidades(int[][] sudoku) {

		ArrayList<String> s = new ArrayList();

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {

				int num = sudoku[i][j];

				if (num == 0) {

					for (int k = 1; k < 10; k++) {

						if (se_puede(sudoku, k, i, j)) {

							s.add(Integer.toString(k) + Integer.toString(i) + Integer.toString(j));

						}

					}

				}

			}
		}

		return s;

	}

	public static int[][] mete_lqp(int[][] sudoku) {

		boolean b = true;

		while (b) {

			ArrayList<String> s = dime_segs(sudoku, 1);
			for (int i1 = 0; i1 < s.size(); i1++) {

				int num = Integer.parseInt(Character.toString(s.get(i1).charAt(0)));
				int fila = Integer.parseInt(Character.toString(s.get(i1).charAt(1)));
				int columna = Integer.parseInt(Character.toString(s.get(i1).charAt(2)));

				sudoku[fila][columna] = num;

			}
			if (s.size() == 0) {
				break;
			}
		}

		return sudoku;

	}

	public static boolean esta_completo(String[] lineas) {

		boolean t_f = true;

		for (int i = 0; i < lineas.length; i++) {

			for (int j = 0; j < lineas[i].length(); j++) {

				if (lineas[i].charAt(j) == '0') {

					t_f = false;

				}

			}

		}
		return t_f;

	}

	public static boolean es_valida2(String f1, String f2) {

		boolean valido = true;

		for (int i = 0; i < f1.length(); i++) {

			if (i >= 0 && i <= 2) {

				for (int j = 0; j < 3; j++) {

					if (f1.charAt(i) == f2.charAt(j)) {

						valido = false;

					}

				}

			}
			if (i >= 3 && i <= 5) {

				for (int j = 3; j < 6; j++) {

					if (f1.charAt(i) == f2.charAt(j)) {

						valido = false;

					}

				}

			}
			if (i >= 6 && i <= 8) {

				for (int j = 6; j < 9; j++) {

					if (f1.charAt(i) == f2.charAt(j)) {

						valido = false;

					}

				}

			}
		}

		return valido;

	}

	public static boolean es_valida(String f1, String f2) {

		boolean valido = true;

		for (int i = 0; i < f1.length(); i++) {

			if (f1.charAt(i) == f2.charAt(i)) {

				valido = false;

			}

		}

		return valido;

	}

	public static String[] devuelve_Array(int[][] s) {
		String[] st = new String[9];
		for (int i = 0; i < 9; i++) {
			String l = "";
			for (int j = 0; j < 9; j++) {

				l = l + s[i][j];

			}
			st[i] = l;
		}
		return st;

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

	public static double dime_filas_casi_vacias(String[] s) {

		double c = 0;

		for (int i = 0; i < s.length; i++) {
			int co = 0;
			for (int j = 0; j < s[i].length(); j++) {

				if (s[i].charAt(j) == '0') {

					co++;

				}

			}
			if (co == 8) {
				c++;
			}
		}

		return c;

	}

	public static double dime_filas_vacias(String[] s) {

		double c = 0;

		for (int i = 0; i < s.length; i++) {
			boolean t = true;
			for (int j = 0; j < s[i].length(); j++) {

				if (s[i].charAt(j) == '0' == false) {

					t = false;

				}

			}
			if (t) {
				c++;
			}
		}

		return c;

	}

	static ArrayList<Integer> num_v = new ArrayList();

	static ArrayList<String> temp = new ArrayList();

	static ArrayList<String> todas = new ArrayList();

}

class timer {

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