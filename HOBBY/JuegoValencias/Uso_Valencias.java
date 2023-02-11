package JuegoValencias;

import javax.swing.*;
import java.util.*;
import java.util.prefs.Preferences;
import Elements_;

public class Uso_Valencias {

	public static void main(String[] args) {

		Preferences high_scoref = Preferences.userNodeForPackage(Uso_Valencias.class);
		Preferences high_scorem = Preferences.userNodeForPackage(Uso_Valencias.class);
		Preferences high_scored = Preferences.userNodeForPackage(Uso_Valencias.class);

		boolean todo = true;
		int numero_ebaus = 0;

		Elements_[] elemento = new Elements_[38];

		elemento[0] = new Elements_("Litio", "Li", "Metal alcalino", 3, 7, "1", true, false);
		elemento[1] = new Elements_("Sodio", "Na", "Metal alcalino", 11, 23, "1", true, false);
		elemento[2] = new Elements_("Potasio", "K", "Metal alcalino", 19, 39, "1", true, false);
		elemento[3] = new Elements_("Rubidio", "Rb", "Metal alcalino", 37, 85.4, "1", true, false);
		elemento[4] = new Elements_("Cesio", "Cs", "Metal alcalino", 55, 132.9, "1", true, false);
		elemento[5] = new Elements_("Francio", "Fr", "Metal alcalino", 87, 223, "1", true, false);
		elemento[6] = new Elements_("Berilio", "Be", "Metal alcalinoterreo", 4, 9, "2", true, false);
		elemento[7] = new Elements_("Magnesio", "Mg", "Metal alcalinoterreo", 12, 24.3, "2", true, false);
		elemento[8] = new Elements_("Calcio", "Ca", "Metal alcalinoterreo", 20, 40, "2", true, false);
		elemento[9] = new Elements_("Estroncio", "Sr", "Metal alcalinoterreo", 38, 87.6, "2", true, false);
		elemento[10] = new Elements_("Bario", "Ba", "Metal alcalinoterreo", 56, 137.3, "2", true, false);
		elemento[11] = new Elements_("Radio", "Ra", "Metal alcalinoterreo", 88, 226, "2", true, false);
		elemento[12] = new Elements_("Escandio", "Sc", "Metal de transicion", 21, 45, "3", true, false);
		elemento[13] = new Elements_("Itrio", "Y", "Metal de transicion", 39, 89, "3", false, false);
		elemento[14] = new Elements_("Titanio", "Ti", "Metal de transicion", 22, 47.8, "4", true, false);
		elemento[15] = new Elements_("Zirconio", "Zr", "Metal de transicion", 40, 91.2, "4", false, false);
		elemento[16] = new Elements_("Hafnio", "Hf", "Metal de transicion", 72, 178.5, "2,3,4", false, false);
		elemento[17] = new Elements_("Rutherfordio", "Rf", "Metal de transicion", 104, 261, "4", false, false);
		elemento[18] = new Elements_("Vanadio", "V", "Metal de transicion", 23, 51, "2,3,4,5", true, false);
		elemento[19] = new Elements_("Niobio", "Nb", "Metal de transicion", 41, 93, "2,3,4,5", false, false);
		elemento[20] = new Elements_("Tantalio", "Ta", "Metal de transicion", 73, 181, "5", false, false);
		elemento[21] = new Elements_("Dubnio", "Db", "Metal de transicion", 105, 262, "5", false, false);
		elemento[22] = new Elements_("Cromo", "Cr", "Metal de transicion", 24, 52, "2,3,6", true, false);
		elemento[23] = new Elements_("Molibdeno", "Mo", "Metal de transicion", 42, 96, "2,3,4,5,6", true, false);
		elemento[24] = new Elements_("Wolframio", "W", "Metal de transicion", 74, 183.8, "4,6", true, false);
		elemento[25] = new Elements_("Seaborgio", "Sg", "Metal de transicion", 105, 262, "6", false, false);
		elemento[26] = new Elements_("Manganeso", "Mn", "Metal de transicion", 25, 55, "2,3,4,6,7", true, false);
		elemento[27] = new Elements_("Tecnecio", "Tc", "Metal de transicion", 43, 98, "4,7", false, false);
		elemento[28] = new Elements_("Renio", "Re", "Metal de transicion", 75, 186.2, "4", false, false);
		elemento[29] = new Elements_("Bohrio", "Bh", "Metal de transicion", 107, 264, "7", false, false);
		elemento[30] = new Elements_("Hierro", "Fe", "Metal de transicion", 26, 55.8, "2,3", true, false);
		elemento[31] = new Elements_("Rutenio", "Ru", "Metal de transicion", 44, 101, "2,3,4,6,8", false, false);
		elemento[32] = new Elements_("Osmio", "Os", "Metal de transicion", 76, 190, "4", false, false);
		elemento[33] = new Elements_("Hassio", "Hs", "Metal de transicion", 108, 277, "8", false, false);
		elemento[34] = new Elements_("Cobalto", "Co", "Metal de transicion", 27, 59, "2,3", true, false);
		elemento[35] = new Elements_("Rodio", "Rh", "Metal de transicion", 45, 103, "3", false, false);
		elemento[36] = new Elements_("Iridio", "Ir", "Metal de transicion", 77, 192.2, "3,4", false, false);
		elemento[37] = new Elements_("Meitnerio", "Mt", "Metal de transicion", 109, 268, "0", false, false);

		Arrays.sort(elemento);

		for (int i = 0; i < elemento.length; i++) {

			if (elemento[i].dime_ebau() == true) {

				numero_ebaus++;

			}

		}

		while (todo == true) {

			boolean aprendamos = true;
			boolean numat = true;
			boolean aleat = true;
			boolean eligamos = true;
			boolean practicar = true;
			boolean practicando = true;
			boolean muerte_subita = true;
			boolean examen = true;
			boolean okey = true;
			boolean okey2 = true;
			boolean okey3 = true;
			boolean okey4 = true;
			boolean okey5 = true;

			boolean always = true;

			boolean descarte = true;
			boolean descartar = false;
			boolean descartar_ebau = false;
			boolean descartar_alc = false;
			boolean descartar_alct = false;
			boolean descartar_metdet = false;
			boolean descartar_ext = false;
			boolean descartar_semi = false;
			boolean descartar_nom = false;
			boolean descartar_nobles = false;
			boolean descartar_otrosm = false;
			boolean descartar_halogenos = false;
			boolean descarte_doble = true;

			boolean nombre;
			boolean simbolo = false;
			boolean grupo;
			boolean num_at = false;
			boolean masa_at;
			boolean valen;

			if (okey == true) {

				try {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch (Exception e) {
					/* No hacer nada */
				}

				System.out.println(
						"\nJUEGO PARA APRENDER VALENCIAS          (Si desea salir del programa escriba 'exit')");
				System.out.println("\nElige modo de juego:");
				System.out.println("Modo APRENDER (pulse 1)");
				System.out.println("Modo PRACTICAR (pulse 2)");
				System.out.println("Modo MUERTE SUBITA (pulse 3)");
				System.out.println("Modo EXAMEN (pulse 4)");

			} else {

				okey = true;

			}

			Scanner sc1 = new Scanner(System.in);
			String eleccion1 = sc1.nextLine();

			if (eleccion1.equalsIgnoreCase("exit")) {
				break;
			}
			if (eleccion1.equalsIgnoreCase("1")) {

				while (aprendamos == true) {

					if (okey2 == true) {

						try {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						} catch (Exception e) {
							/* No hacer nada */
						}

						System.out.println("\nAPRENDAMOS          (Si desea salir del modo aprender escriba 'exit')");
						System.out.println("\nElige una de las siguientes opciones de aprendizaje:\n");
						System.out.println("-Elementos ordenados por Numero Atomico (pulse 1)");
						System.out.println("-Elementos aleatorios (pulse 2)");
						System.out.println("-Elegir elemento (pulse 3)");

					} else {

						okey2 = true;

					}

					Scanner sc2 = new Scanner(System.in);
					String eleccion2 = sc2.nextLine();

					if (eleccion2.equalsIgnoreCase("exit")) {
						break;
					}
					if (eleccion2.equalsIgnoreCase("1")) {

						while (numat == true) {

							try {
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							} catch (Exception e) {
								/* No hacer nada */
							}

							for (int i = 0; i < elemento.length; i++) {

								System.out.println("\n" + elemento[i].dime_nombre().toUpperCase());

								Scanner pausa1 = new Scanner(System.in);
								String pausa1_1 = pausa1.nextLine();

								if (pausa1_1.equalsIgnoreCase("exit")) {
									break;
								}

								System.out.println("SIMBOLO: " + elemento[i].dime_simbolo());
								System.out.println("GRUPO: " + elemento[i].dime_grupo());
								System.out.println("NUMERO ATOMICO: " + elemento[i].dime_numero_atomico());
								System.out.println("MASA ATOMICA: " + elemento[i].dime_masa_atomica());
								System.out.println("VALENCIAS: " + elemento[i].dime_valencias());

								Scanner pausa2 = new Scanner(System.in);
								String pausa2_1 = pausa2.nextLine();

								if (pausa2_1.equalsIgnoreCase("exit")) {
									break;
								}

								try {
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								} catch (Exception e) {
									/* No hacer nada */
								}

							}

							System.out.println("\nSi desea repetir escriba 'repetir' o pulse 'Enter'");
							System.out.println("Si desea volver atras escriba 'atras'");
							System.out.println("Si desea volver al inicio escriba 'inicio'");

							Scanner volver_atras = new Scanner(System.in);
							String backw = volver_atras.nextLine();

							if (backw.equalsIgnoreCase("atras")) {

								numat = false;

							} else if (backw.equalsIgnoreCase("inicio")) {

								aprendamos = false;
								numat = false;

							} else if (backw.equalsIgnoreCase("repetir")) {

							}

						}

					} else if (eleccion2.equalsIgnoreCase("2")) {

						while (aleat == true) {

							try {
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							} catch (Exception e) {
								/* No hacer nada */
							}

							int numapal = (int) Math.round(Math.random() * (elemento.length - 1));

							System.out.println("\n" + elemento[numapal].dime_nombre().toUpperCase()
									+ "          Cuando desee salir escriba 'exit'");

							Scanner pausa3 = new Scanner(System.in);
							String pausa3_1 = pausa3.nextLine();

							if (pausa3_1.equalsIgnoreCase("exit")) {
								break;
							}

							System.out.println("");
							System.out.println("SIMBOLO: " + elemento[numapal].dime_simbolo());
							System.out.println("GRUPO: " + elemento[numapal].dime_grupo());
							System.out.println("NUMERO ATOMICO: " + elemento[numapal].dime_numero_atomico());
							System.out.println("MASA ATOMICA: " + elemento[numapal].dime_masa_atomica());
							System.out.println("VALENCIAS: " + elemento[numapal].dime_valencias());

							Scanner pausa4 = new Scanner(System.in);
							String pausa4_1 = pausa4.nextLine();

							if (pausa4_1.equalsIgnoreCase("exit")) {
								break;
							}

						}

						System.out.println("\nSi desea volver atras escriba 'atras'");
						System.out.println("Si desea volver al inicio escriba 'inicio'");

						Scanner volver_atras1 = new Scanner(System.in);
						String backw1 = volver_atras1.nextLine();

						if (backw1.equalsIgnoreCase("atras")) {

						} else if (backw1.equalsIgnoreCase("inicio")) {

							aprendamos = false;

						}

					} else if (eleccion2.equalsIgnoreCase("3")) {

						while (eligamos == true) {

							if (okey3 == true) {

								try {
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								} catch (Exception e) {
									/* No hacer nada */
								}

								System.out.println(
										"\nEscriba el nombre del elemento          (Cuando desee salir, escriba 'exit')");

							}

							okey3 = false;

							Scanner sc3 = new Scanner(System.in);
							String elegir_nom = sc3.nextLine();

							if (elegir_nom.equalsIgnoreCase("exit")) {

								eligamos = false;
								break;

							} else {

								for (int i = 0; i < elemento.length; i++) {

									if (elemento[i].dime_nombre().equalsIgnoreCase(elegir_nom)) {

										okey3 = true;

										try {
											new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
										} catch (Exception e) {
											/* No hacer nada */
										}

										System.out.println("\n");
										System.out.println("SIMBOLO: " + elemento[i].dime_simbolo());
										System.out.println("GRUPO: " + elemento[i].dime_grupo());
										System.out.println("NUMERO ATOMICO: " + elemento[i].dime_numero_atomico());
										System.out.println("MASA ATOMICA: " + elemento[i].dime_masa_atomica());
										System.out.println("VALENCIAS: " + elemento[i].dime_valencias());
										System.out.println("\n(Pulse 'Enter' para continuar)");

										Scanner pausa5 = new Scanner(System.in);
										String pausa5_1 = pausa5.nextLine();

										if (pausa5_1.equalsIgnoreCase("exit")) {

											eligamos = false;
											break;

										}

									}

								}

								if (okey3 == false) {

									System.out.println("Valor no valido. Introduzcalo de nuevo");

								}

							}

						}

						System.out.println("\nSi desea volver al inicio escriba 'inicio'");
						System.out.println("Si no, pulse cuaquier tecla");

						Scanner volver_atras2 = new Scanner(System.in);
						String backw2 = volver_atras2.nextLine();

						if (backw2.equalsIgnoreCase("inicio")) {

							aprendamos = false;

						}

					} else {

						System.out.println("Valor no valido. Introduzcalo de nuevo");
						okey2 = false;

					}
				}

			} else if (eleccion1.equalsIgnoreCase("2")) {

				while (practicar == true) {

					boolean bucsc = true;

					boolean saliendo = false;
					boolean saliendo1 = false;

					if (okey4) {

						try {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						} catch (Exception e) {
							/* No hacer nada */
						}

						System.out.println("\nPRACTIQUEMOS          (Si desea salir del modo aprender escriba 'exit')");
						System.out.println("\nElige que quieres practicar:\n");
						System.out.println("-Numero y Masa Atomico/as (pulse 1)");
						System.out.println("-Simbolos y Valencias (pulse 2)");
						System.out.println("-Grupos (pulse 3)");
					}
					okey4 = true;
					Scanner scp = new Scanner(System.in);
					String eleccion_p = scp.nextLine();

					if (eleccion_p.equalsIgnoreCase("exit")) {
						break;
					}
					if ((eleccion_p.equalsIgnoreCase("1") == false) & (eleccion_p.equalsIgnoreCase("2") == false)
							& (eleccion_p.equalsIgnoreCase("3") == false)) {

						System.out.println("Valor no valido. Introduzcalo de nuevo");
						okey4 = false;

					} else {

						if (eleccion_p.equalsIgnoreCase("1")) {

							num_at = true;
							masa_at = true;

						} else if (eleccion_p.equalsIgnoreCase("2")) {

							simbolo = true;
							valen = true;

						} else if (eleccion_p.equalsIgnoreCase("3")) {

							grupo = true;

						}

						while (bucsc == true) {

							if (okey5) {

								try {
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								} catch (Exception e) {
									/* No hacer nada */
								}

								System.out.println(
										"\nDESCARTAR ELEMENTOS:          (Si desea salir del modo practicar pulse '123')");
								System.out.println("\nElige que quieres descartar:\n");
								System.out.println("-Todos los complicados (pulse 1)");
								System.out.println("-Grupos personalizados (pulse 2)");
								System.out.println("-Nada (pulse 3)");
							}
							okey5 = true;

							Scanner scp13 = new Scanner(System.in);
							int eleccion_p13 = scp13.nextInt();

							if (eleccion_p13 == 123) {
								saliendo = true;
								break;
							}
							if (eleccion_p13 != 1 & eleccion_p13 != 2 & eleccion_p13 != 3) {

								okey5 = false;
								System.out.println("Valor no valido.Introduzcalo de nuevo.");

							} else {

								bucsc = false;

								if (eleccion_p13 == 1) {

									descartar = true;
									descartar_ebau = true;
									break;

								} else if (eleccion_p13 == 2) {

									descartar = true;

									System.out
											.println("\nDesea descartar alcalinos?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp3 = new Scanner(System.in);
									String eleccion_p3 = scp3.nextLine();
									if (eleccion_p3.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p3.equalsIgnoreCase("si")) {

										descartar_alc = true;

									}
									System.out.println(
											"\nDesea descartar alcalinoterreos?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp4 = new Scanner(System.in);
									String eleccion_p4 = scp4.nextLine();
									if (eleccion_p4.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p4.equalsIgnoreCase("si")) {

										descartar_alct = true;

									}
									System.out.println(
											"\nDesea descartar metales de transicion?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp5 = new Scanner(System.in);
									String eleccion_p5 = scp5.nextLine();
									if (eleccion_p5.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p5.equalsIgnoreCase("si")) {

										descartar_metdet = true;

									}
									System.out.println(
											"\nDesea descartar semi-metales?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp6 = new Scanner(System.in);
									String eleccion_p6 = scp6.nextLine();
									if (eleccion_p6.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p6.equalsIgnoreCase("si")) {

										descartar_semi = true;

									}
									System.out.println(
											"\nDesea descartar tierras raras?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp7 = new Scanner(System.in);
									String eleccion_p7 = scp7.nextLine();
									if (eleccion_p7.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p7.equalsIgnoreCase("si")) {

										descartar_ext = true;

									}
									System.out.println(
											"\nDesea descartar no metales?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp8 = new Scanner(System.in);
									String eleccion_p8 = scp8.nextLine();
									if (eleccion_p8.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p8.equalsIgnoreCase("si")) {

										descartar_nom = true;

									}
									System.out.println(
											"\nDesea descartar gases nobles?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp9 = new Scanner(System.in);
									String eleccion_p9 = scp9.nextLine();
									if (eleccion_p9.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p9.equalsIgnoreCase("si")) {

										descartar_nobles = true;

									}
									System.out
											.println("\nDesea descartar halogenos?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp21 = new Scanner(System.in);
									String eleccion_p21 = scp21.nextLine();
									if (eleccion_p21.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p21.equalsIgnoreCase("si")) {

										descartar_halogenos = true;

									}
									System.out.println(
											"\nDesea descartar al bloque p?     (Si=si,'Enter'=no, Salir=exit)");

									Scanner scp10 = new Scanner(System.in);
									String eleccion_p10 = scp10.nextLine();
									if (eleccion_p10.equalsIgnoreCase("exit")) {
										saliendo = true;
										break;
									}
									if (eleccion_p10.equalsIgnoreCase("si")) {

										descartar_otrosm = true;

									}

									break;

								} else if (eleccion_p13 == 3) {

									break;

								}
							}
						}

						if (saliendo) {
							break;
						}
						while (practicando) {

							boolean probando = true;
							boolean probando1 = true;
							descarte_doble = true;
							descarte = true;
							int numapal = 0;

							try {
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							} catch (Exception e) {
								/* No hacer nada */
							}

							if (descartar = false) {

								numapal = (int) Math.round(Math.random() * (elemento.length - 1));

							} else {
								while (descarte_doble) {
									while (descarte) {

										numapal = (int) Math.round(Math.random() * (elemento.length - 1));

										if (descartar_ebau) {

											if (elemento[numapal].dime_ebau() == false) {

												break;

											}

										}
										if (descartar_halogenos) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Halogeno")) {

												break;

											}

										}
										if (descartar_alc) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Metal alcalino")) {

												break;

											}

										}
										if (descartar_alct) {

											if (elemento[numapal].dime_grupo()
													.equalsIgnoreCase("Metal alcalinoterreo")) {

												break;

											}

										}
										if (descartar_metdet) {

											if (elemento[numapal].dime_grupo()
													.equalsIgnoreCase("Metal de transicion")) {

												break;

											}

										}
										if (descartar_ext) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Lantanido")
													|| elemento[numapal].dime_grupo().equalsIgnoreCase("Actinido")) {

												break;

											}

										}
										if (descartar_semi) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Semimetal")) {

												break;

											}

										}
										if (descartar_nom) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("No metal")) {

												break;

											}

										}
										if (descartar_nobles) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Gas noble")) {

												break;

											}

										}
										if (descartar_otrosm) {

											if (elemento[numapal].dime_grupo().equalsIgnoreCase("Bloque p")) {

												break;

											}

										}

										descarte_doble = false;
										descarte = false;

									}
								}
							}
							if (num_at) {
								System.out.println("\n" + "" + elemento[numapal].dime_nombre().toUpperCase()
										+ "          (Si desea salir pulse '123').");
							} else {

								System.out.println("\n" + "" + elemento[numapal].dime_nombre().toUpperCase()
										+ "          (Si desea salir escriba 'exit').");

							}
							if (num_at) {

								int respuesta_p = -1;
								double respuesta_p1 = -1;

								while (probando) {

									System.out.println("\n-Numero atomico:");

									try {

										Scanner scpn = new Scanner(System.in);
										respuesta_p = scpn.nextInt();

										if (respuesta_p == 123) {
											saliendo1 = true;
											break;
										}
										probando = false;

									} catch (Exception e) {

										System.out.println("Valor no valido.Introducelo de nuevo");

									}

								}

								if (saliendo1) {
									break;
								}
								while (probando1) {

									System.out.println("-Masa atomica:");

									try {

										Scanner scpn1 = new Scanner(System.in);
										respuesta_p1 = scpn1.nextDouble();
										if (respuesta_p1 == 123) {
											saliendo1 = true;
											break;
										}
										probando1 = false;

									} catch (Exception e) {

										System.out.println("Valor no valido.Introducelo de nuevo");

									}

								}

								if (saliendo1) {
									break;
								}

								if (respuesta_p == elemento[numapal].dime_numero_atomico()
										& respuesta_p1 == ((int) elemento[numapal].dime_masa_atomica())) {

									System.out.println("PERFECTO!!!");

								} else if ((respuesta_p == elemento[numapal].dime_numero_atomico()
										& respuesta_p1 == ((int) elemento[numapal].dime_masa_atomica())) == false) {

									System.out.println("\nMenudo Noob!!");
									System.out.println("\nSoluciones:\n");
									System.out.println("-NUMERO ATOMICO: " + (elemento[numapal].dime_numero_atomico()));
									System.out.println("-MASA ATOMICA: " + (elemento[numapal].dime_masa_atomica()));

								} else {

									System.out.println("\nCasi casi...");

									if ((respuesta_p == elemento[numapal].dime_numero_atomico()) == false) {

										System.out.println("\nHas fallado el numero atomico!\n");
										System.out.println(
												"-NUMERO ATOMICO: " + (elemento[numapal].dime_numero_atomico()));
									}

									if ((respuesta_p1 == ((int) elemento[numapal].dime_masa_atomica()) == false)) {

										System.out.println("\nHas fallado la masa atomica!\n");
										System.out.println("-MASA ATOMICA: " + (elemento[numapal].dime_masa_atomica()));
									}

								}

							} else if (simbolo) {

								String respuesta_p = "";
								String respuesta_p1 = "";

								while (probando) {
									System.out.println("\n-Simbolo:");

									Scanner scpn = new Scanner(System.in);
									respuesta_p = scpn.nextLine();
									if (respuesta_p.equalsIgnoreCase("exit")) {
										break;
									}
									if (respuesta_p.equalsIgnoreCase("")) {

									} else {
										probando = false;
									}
								}
								if (respuesta_p.equalsIgnoreCase("exit")) {
									break;
								}
								while (probando1) {
									System.out.println("-Valencias:");

									Scanner scpn1 = new Scanner(System.in);
									respuesta_p1 = scpn1.nextLine();
									if (respuesta_p1.equalsIgnoreCase("exit")) {
										break;
									}
									if (respuesta_p1.equalsIgnoreCase("")) {

									} else {
										probando1 = false;
									}
								}

								if (respuesta_p.equalsIgnoreCase("exit")) {
									break;
								}

								if (respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())
										& respuesta_p1.equalsIgnoreCase(elemento[numapal].dime_valencias())) {

									System.out.println("PERFECTO!!!");

								} else if ((respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())) == false
										& (respuesta_p1
												.equalsIgnoreCase(elemento[numapal].dime_valencias())) == false) {

									System.out.println("\nMenudo Noob!!");
									System.out.println("\nSoluciones:\n");
									System.out.println("-SIMBOLO: " + (elemento[numapal].dime_simbolo()));
									System.out.println("-VALENCIAS: " + (elemento[numapal].dime_valencias()));

								} else {

									System.out.println("\nCasi casi...");

									if (respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo()) == false) {

										System.out.println("\nHas fallado el simbolo!\n");
										System.out.println("-SIMBOLO: " + (elemento[numapal].dime_simbolo()));
									}

									if ((respuesta_p1.equalsIgnoreCase(elemento[numapal].dime_valencias()) == false)) {

										System.out.println("\nHas fallado las valencias!\n");
										System.out.println("-VALENCIAS: " + (elemento[numapal].dime_valencias()));
									}

								}

							} else {

								String respuesta_p = "";

								while (probando) {
									System.out.println("\n-Grupo:          (Si desea salir escriba 'exit')");

									Scanner scpn = new Scanner(System.in);
									respuesta_p = scpn.nextLine();

									if (respuesta_p.equalsIgnoreCase("")) {

									} else {
										probando = false;
									}
								}

								if (respuesta_p.equalsIgnoreCase("exit")) {
									break;
								}

								if (respuesta_p.equalsIgnoreCase(elemento[numapal].dime_grupo())) {

									System.out.println("PERFECTO!!!");

								} else {

									System.out.println("\nMenudo Noob!!");
									System.out.println("\nSolucion:\n");
									System.out.println("-GRUPO: " + (elemento[numapal].dime_grupo()));

								}

							}

							System.out.println("\nSIGUENTE     (Pulse 'Enter')");
							System.out.println("ATRAS     (Escriba 'atras')");
							System.out.println("INICIO    (Escriba 'inicio')");

							Scanner volver_atras1 = new Scanner(System.in);
							String backw1 = volver_atras1.nextLine();

							if (backw1.equalsIgnoreCase("inicio")) {

								practicar = false;
								break;

							} else if (backw1.equalsIgnoreCase("atras")) {

								break;

							} else {
							}

						}

					}
				}
			} else if (eleccion1.equalsIgnoreCase("3")) {

				while (muerte_subita) {

					boolean bucsc = true;
					practicando = true;

					int score = 0;
					int vida = 5;

					boolean jugando = true;

					boolean saliendo = false;
					boolean saliendo1 = false;
					boolean saliendo2 = false;
					boolean saliendo3 = false;
					boolean saliendo4 = false;
					boolean saliendo5 = false;

					boolean facil = false;
					boolean normal = false;
					boolean hardc = false;

					if (okey4) {

						try {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						} catch (Exception e) {
							/* No hacer nada */
						}

						System.out.println(
								"\nMUERTE SUBITA          (Si desea salir del modo muerte subita escriba 'exit')");
						System.out.println("\nJuega para conseguir el record mas alto\n");
						System.out.println("-Jugar ya    (pulse 1)");
						System.out.println("-Ver record actual     (pulse 2)");

					}
					okey4 = true;
					Scanner scp = new Scanner(System.in);
					String eleccion_p = scp.nextLine();

					if (eleccion_p.equalsIgnoreCase("exit")) {
						saliendo1 = true;
						break;
					}
					if ((eleccion_p.equalsIgnoreCase("1") == false) & (eleccion_p.equalsIgnoreCase("2") == false)) {

						System.out.println("Valor no valido. Introduzcalo de nuevo");
						okey4 = false;

					} else if (eleccion_p.equalsIgnoreCase("2")) {

						okey4 = false;

						System.out.println("\n RECORD ACTUAL (Facil): " + high_scoref.getInt("recordf", 0) + "\n");
						System.out.println("\n RECORD ACTUAL (Normal): " + high_scorem.getInt("recordm", 0) + "\n");
						System.out.println("\n RECORD ACTUAL (Hardcore): " + high_scored.getInt("recordd", 0) + "\n");

						System.out.println("-Jugar ya!            (pulse 1)");
						System.out.println("-Salir del modo      (escriba 'exit')");

					} else {

						while (bucsc == true) {

							if (okey5) {

								try {
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								} catch (Exception e) {
									/* No hacer nada */
								}

								System.out.println(
										"\nDIFICULTAD:\n          (Si desea salir del modo muerte subita pulse '123')");
								System.out.println("-Facil (pulse 1)");
								System.out.println("-Normal (pulse 2)");
								System.out.println("-Hardcore (pulse 3)");
							}
							okey5 = true;

							Scanner scp13 = new Scanner(System.in);
							int eleccion_p13 = scp13.nextInt();

							if (eleccion_p13 == 123) {
								saliendo = true;
								break;
							}
							if (eleccion_p13 != 1 & eleccion_p13 != 2 & eleccion_p13 != 3) {

								okey5 = false;
								System.out.println("Valor no valido.Introduzcalo de nuevo.");

							} else {

								bucsc = false;

								if (eleccion_p13 == 1) {

									facil = true;
									descartar = true;
									descartar_ebau = true;
									bucsc = false;

								} else if (eleccion_p13 == 2) {

									normal = true;
									descartar = true;
									descartar_ext = true;
									bucsc = false;

								} else if (eleccion_p13 == 3) {

									hardc = true;
									bucsc = false;

								}
							}
						}

						if (saliendo) {
							break;
						}

						while (jugando = true) {

							score = 0;

							if (facil) {

								vida = 3;

							}
							if (normal) {

								vida = 5;

							}
							if (hardc) {

								vida = 10;

							}
							while (practicando) {

								boolean probando = true;
								boolean probando1 = true;
								descarte_doble = true;
								descarte = true;
								int numapal = 0;

								try {
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								} catch (Exception e) {
									/* No hacer nada */
								}

								if (descartar = false) {

									numapal = (int) Math.round(Math.random() * (elemento.length - 1));

								} else {
									while (descarte_doble) {
										while (descarte) {

											numapal = (int) Math.round(Math.random() * (elemento.length - 1));

											if (descartar_ebau) {

												if (elemento[numapal].dime_ebau() == false) {

													break;

												}

											}
											if (descartar_halogenos) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Halogeno")) {

													break;

												}

											}
											if (descartar_alc) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Metal alcalino")) {

													break;

												}

											}
											if (descartar_alct) {

												if (elemento[numapal].dime_grupo()
														.equalsIgnoreCase("Metal alcalinoterreo")) {

													break;

												}

											}
											if (descartar_metdet) {

												if (elemento[numapal].dime_grupo()
														.equalsIgnoreCase("Metal de transicion")) {

													break;

												}

											}
											if (descartar_ext) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Lantanido")
														|| elemento[numapal].dime_grupo()
																.equalsIgnoreCase("Actinido")) {

													break;

												}

											}
											if (descartar_semi) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Semimetal")) {

													break;

												}

											}
											if (descartar_nom) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("No metal")) {

													break;

												}

											}
											if (descartar_nobles) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Gas noble")) {

													break;

												}

											}
											if (descartar_otrosm) {

												if (elemento[numapal].dime_grupo().equalsIgnoreCase("Bloque p")) {

													break;

												}

											}

											descarte_doble = false;
											descarte = false;

										}
									}
								}

								System.out.println("\n" + "" + elemento[numapal].dime_nombre().toUpperCase()
										+ "          (Si desea rendirse y perder la puntuacion escriba 'exit').");
								System.out.println("               Vida = " + vida + "   Puntuacion = " + score);

								String respuesta_p = "";
								String respuesta_p1 = "";

								while (probando) {
									System.out.println("-Simbolo:");

									Scanner scpn = new Scanner(System.in);
									respuesta_p = scpn.nextLine();
									if (respuesta_p.equalsIgnoreCase("exit")) {
										jugando = false;
										saliendo2 = true;
										break;
									}
									if (respuesta_p.equalsIgnoreCase("")) {

									} else {
										probando = false;
									}
								}
								if (saliendo2) {
									break;
								}
								while (probando1) {
									System.out.println("-Valencias:");

									Scanner scpn1 = new Scanner(System.in);
									respuesta_p1 = scpn1.nextLine();
									if (respuesta_p1.equalsIgnoreCase("exit")) {
										jugando = false;
										saliendo3 = true;
										break;
									}
									if (respuesta_p1.equalsIgnoreCase("")) {

									} else {
										probando1 = false;
									}
								}

								if (saliendo3) {
									break;
								}

								if (respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())
										& respuesta_p1.equalsIgnoreCase(elemento[numapal].dime_valencias())) {

									System.out.println("PERFECTO!!!");
									score += 3;

								} else if ((respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())) == false
										& (respuesta_p1
												.equalsIgnoreCase(elemento[numapal].dime_valencias())) == false) {

									System.out.println("\nHAS FALLADO LAS DOS!!");
									vida -= 2;

								} else {

									System.out.println("\nFIFTY FIFTY...");

									vida -= 1;
									score += 1;

								}

								if (facil) {

									if (score > high_scoref.getInt("recordf", 0)) {

										high_scoref.putInt("recordf", score);

									}

								}
								if (normal) {

									if (score > high_scorem.getInt("recordm", 0)) {

										high_scoref.putInt("recordm", score);

									}

								}
								if (hardc) {

									if (score > high_scored.getInt("recordd", 0)) {

										high_scoref.putInt("recordd", score);

									}

								}

								if (vida <= 0) {

									System.out.print("\nGAME OVER");
									System.out.print("      Puntuacion: " + score);

									if (facil) {

										if (score > high_scoref.getInt("recordf", 0)) {

											System.out.print("\nHas superado el record. ENHORABUENA!!!\n");

										} else if (score == high_scoref.getInt("recordf", 0)) {

											System.out.println("\nCasi lo consigues amigo. Has IGUALADO el record.\n");

										}

									}
									if (normal) {

										if (score > high_scorem.getInt("recordm", 0)) {

											System.out.print("\nHas superado el record. ENHORABUENA!!!\n");

										} else if (score == high_scorem.getInt("recordm", 0)) {

											System.out.println("\nCasi lo consigues amigo. Has IGUALADO el record.\n");

										}

									}
									if (hardc) {

										if (score > high_scored.getInt("recordd", 0)) {

											System.out.print("\nHas superado el record. ENHORABUENA!!!\n");

										} else if (score == high_scored.getInt("recordd", 0)) {

											System.out.println("\nCasi lo consigues amigo. Has IGUALADO el record.\n");

										}

									}
									System.out.println("VOLVER A JUGAR     (Pulse  'Enter')");
									System.out.println("VOLVER A MODO MUERTE SUBITA     (Escriba  'Atras')");
									System.out.println("INICIO    (Escriba 'inicio')");

									Scanner volver_atras19 = new Scanner(System.in);
									String backw69 = volver_atras19.nextLine();

									if (backw69.equalsIgnoreCase("inicio")) {

										muerte_subita = false;
										jugando = false;
										saliendo4 = true;
										break;

									} else if (backw69.equalsIgnoreCase("atras")) {

										saliendo4 = true;
										jugando = false;
										break;

									} else {

									}

								} else {

									System.out.println("\nSIGUENTE     (Pulse 'Enter')");
									System.out.println("RENDIRSE Y VOLVER A MUERTE SUBITA     (Escriba 'atras')");
									System.out.println("RENDIRSE E IR A INICIO    (Escriba 'inicio')");

									Scanner volver_atras6 = new Scanner(System.in);
									String backw6 = volver_atras6.nextLine();

									if (backw6.equalsIgnoreCase("inicio")) {

										muerte_subita = false;
										jugando = false;
										saliendo5 = true;
										break;

									} else if (backw6.equalsIgnoreCase("atras")) {

										jugando = false;
										saliendo5 = true;
										break;

									} else {

									}

								}
							}

							if (saliendo || saliendo2 || saliendo3 || saliendo4 || saliendo5) {
								break;
							}

						}

					}

				}

				/* EXAMEN */ } else if (eleccion1.equalsIgnoreCase("4")) {

				while (examen == true) {

					double puntos = 0;
					int duracion = 0;
					boolean bucsc = true;

					boolean saliendo = false;
					boolean saliendo1 = false;

					if (okey4) {

						try {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						} catch (Exception e) {
							/* No hacer nada */
						}

						System.out.println("\nEXAMEN         (Si desea salir del modo examen escriba 'exit')");
						System.out.println("\nElige la duracion:\n");
						System.out.println("-10 elementos (pulse 1)");
						System.out.println("-30 elementos (pulse 2)");
						System.out.println("-Todos los elementos (ebau) (pulse 3)");
					}
					okey4 = true;
					Scanner scp = new Scanner(System.in);
					String eleccion_p = scp.nextLine();

					if (eleccion_p.equalsIgnoreCase("exit")) {
						break;
					}
					if ((eleccion_p.equalsIgnoreCase("1") == false) & (eleccion_p.equalsIgnoreCase("2") == false)
							& (eleccion_p.equalsIgnoreCase("3") == false)) {

						System.out.println("Valor no valido. Introduzcalo de nuevo");
						okey4 = false;

					} else {

						if (eleccion_p.equalsIgnoreCase("1")) {

							duracion = 10;

						} else if (eleccion_p.equalsIgnoreCase("2")) {

							duracion = 30;

						} else if (eleccion_p.equalsIgnoreCase("3")) {

							duracion = numero_ebaus;

						}

						if (saliendo) {
							break;
						}

						for (int u = 0; u < duracion; u++) {

							boolean probando = true;
							boolean probando1 = true;
							descarte_doble = true;
							descarte = true;
							int numapal = 0;

							try {
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							} catch (Exception e) {
								/* No hacer nada */
							}

							while (descarte_doble) {
								while (descarte) {

									numapal = (int) Math.round(Math.random() * (elemento.length - 1));

									if (elemento[numapal].dime_repe() == true) {

										break;

									}

									elemento[numapal].set_repe();

									if (elemento[numapal].dime_ebau() == false) {

										break;

									}

									descarte_doble = false;
									descarte = false;

								}
							}

							System.out.println("\n" + "" + elemento[numapal].dime_nombre().toUpperCase()
									+ "          (Si desea salir escriba 'exit').");

							String respuesta_p = "";
							String respuesta_p1 = "";

							while (probando) {
								System.out.println("\n-Simbolo:");

								Scanner scpn = new Scanner(System.in);
								respuesta_p = scpn.nextLine();
								if (respuesta_p.equalsIgnoreCase("exit")) {
									break;
								}
								if (respuesta_p.equalsIgnoreCase("")) {

								} else {
									probando = false;
								}
							}
							if (respuesta_p.equalsIgnoreCase("exit")) {
								break;
							}
							while (probando1) {
								System.out.println("-Valencias:");

								Scanner scpn1 = new Scanner(System.in);
								respuesta_p1 = scpn1.nextLine();
								if (respuesta_p1.equalsIgnoreCase("exit")) {
									break;
								}
								if (respuesta_p1.equalsIgnoreCase("")) {

								} else {
									probando1 = false;
								}
							}

							if (respuesta_p.equalsIgnoreCase("exit")) {
								break;
							}

							if (respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())
									& respuesta_p1.equalsIgnoreCase(elemento[numapal].dime_valencias())) {

								puntos += 1;

							} else if ((respuesta_p.equalsIgnoreCase(elemento[numapal].dime_simbolo())) == false
									& (respuesta_p1.equalsIgnoreCase(elemento[numapal].dime_valencias())) == false) {

							} else {

								puntos += 0.5;

							}

							System.out.println("\nSIGUENTE     (Pulse 'Enter')");
							System.out.println("TERMINAR YA    (Escriba 'fin')");

							Scanner volver_atras1 = new Scanner(System.in);
							String backw1 = volver_atras1.nextLine();

							if (backw1.equalsIgnoreCase("fin")) {

								break;

							} else {

							}

						}

						System.out.println("\nNOTA: " + ((puntos * 10) / duracion) + "/10\n");
						System.out.println("\nVOLVER A EXAMINAR     (Pulse  'Enter')");
						System.out.println("INICIO    (Escriba 'inicio')");
						Scanner volver_atras1000 = new Scanner(System.in);
						String backw1000 = volver_atras1000.nextLine();

						if (backw1000.equalsIgnoreCase("inicio")) {

						} else {

						}

					}
				}

			} else {

				System.out.println("Valor no valido.Introduzcalo de nuevo");
				okey = false;
			}

		}

	}

}
