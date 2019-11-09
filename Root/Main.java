package root;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import gestaoEmprestimo.RepositorioEmprestimo;
import gestaoEmprestimo.RepositorioEmprestimoLista;
import gestaoPessoas.Atendente;
import gestaoPessoas.RepositorioPessoas;
import gestaoPessoas.RepositorioPessoasLista;
import gestaoPessoas.Usuario;
import gestaoProdutos.Jornal;
import gestaoProdutos.Livro;
import gestaoProdutos.RepositorioProdutos;
import gestaoProdutos.RepositorioProdutosLista;
import gestaoProdutos.Revista;
import gestaoEmprestimo.Devolucao;
import gestaoEmprestimo.Emprestimo;
import gestaoEmprestimo.EmprestimoJornal;
import gestaoEmprestimo.EmprestimoLivro;
import gestaoEmprestimo.EmprestimoRevista;
import gestaoEmprestimo.RepositorioDevolucao;
import gestaoEmprestimo.RepositorioDevolucaoLista;

public class Main {

	public static void main(String[] args) {

		/* Repositorios */
		RepositorioProdutos repLivros = new RepositorioProdutosLista();
		RepositorioProdutos repRevistas = new RepositorioProdutosLista();
		RepositorioProdutos repJornais = new RepositorioProdutosLista();
		RepositorioPessoas repUsuario = new RepositorioPessoasLista();
		RepositorioEmprestimo repEmprestimo = new RepositorioEmprestimoLista();
		RepositorioDevolucao repDevolucao = new RepositorioDevolucaoLista();

		/* Banco */
		Livro l = new Livro();
		l.setCodigo(1);
		l.setTitulo("Portugues");
		repLivros.inserir(l);

		Revista r = new Revista();
		r.setCodigo(2);
		r.setNomeRevista("Veja");
		repRevistas.inserir(r);

		Jornal j = new Jornal();
		j.setCodigo(3);
		j.setNomeJornal("DiarioPE");
		repJornais.inserir(j);

		Usuario u = new Usuario();
		u.setMatricula("123");
		u.setNome("Carlos");
		repUsuario.inserir(u);

		/* Variaveis */
		String login;
		String opInicial;
		String opRegistrar;
		String opRemover;
		String opListar;
		String opEmprestimo;
		String rCodigoU;
		String empMat;
		int rCodigo;
		int empL;
		int empR;
		int empJ;
		Emprestimo e;
		Devolucao d;
		Calendar cal = Calendar.getInstance();
//		Livro l = null;---------|
//		Revista r = null;-------|---> Se n tiver um banco iniciar a variaveis
//		Jornal j = null;--------|
//		Usuario u = null;-------|

		/* Criacao do atendente */
		Atendente at = new Atendente();
		at.setNome("Atendente");
		at.setSenha("123");

		Scanner scanner = new Scanner(System.in);

		/* Condicoes (do / While) */
		int cond = 0;
		int cond2 = 0;
		int cond3 = 0;

		/* Inicio */
		do {
			System.out.println("*** Versao Final ***\n\n");
			System.out.println(" --------Escolha a Funcao:--------  ");
			System.out.println(" 1 - Fazer Login");
			System.out.println(" 0 - Finalizar Programa!");
			System.out.println("-----------------------------------");
			String f = scanner.next();

			/* Login */
			if (f.equals("1")) {
				System.out.println("Login: " + at.getNome());
				System.out.println("Digite a senha: ");
				login = scanner.next();

				/* Inserir Senha */
				if (login.equals(at.getSenha())) {
					System.out.println("Login efetuado com sucesso!");

					do {
						System.out.println("\nSelecione: " + "\n1. Registrar " + "\n2. Remover " + "\n3. Listar "
								+ "\n4. Emprestimo " + "\n5. Devolucao " + "\n0. Sair");
						opInicial = scanner.next();
						switch (opInicial) {

						/* Registrar */
						case "1":
							do {
								System.out.println(
										"\nRegistrar: \n1. Livro \n2. Revista \n" + "3. Jornal \n4. Usuario \n0. Sair");
								opRegistrar = scanner.next();
								switch (opRegistrar) {

								/* Registrar Livro */
								case "1":
									l = new Livro();
									System.out.println("Registrar Livro: ");
									System.out.println("\nCodigo: ");
									l.setCodigo(scanner.nextInt());
									System.out.println("\nTitulo: ");
									l.setTitulo(scanner.next());
									System.out.println("\nNome do Autor: ");
									l.setNomeAutor(scanner.next());
									System.out.println("\nAno Publicacao: ");
									l.setAnoPublicacao(scanner.nextInt());
									System.out.println("\nVolume: ");
									l.setVolume(scanner.next());
									System.out.println("\nNumero de Paginas: ");
									l.setNumeroPaginas(scanner.nextInt());
									System.out.println("\nCodigo do Autor: ");
									l.setCodigoAutor(scanner.nextInt());
									System.out.println("\nEditora: ");
									l.setEditora(scanner.next());
									System.out.println("\nISNB: ");
									l.setIsbn(scanner.next());
									System.out.println("\nEdicao: ");
									l.setEdicao(scanner.nextInt());
									repLivros.inserir(l);
									cond3 = 1;
									break;

								/* Registrar Revista */
								case "2":
									r = new Revista();
									System.out.println("Registrar Revista: ");
									System.out.println("\nCodigo: ");
									r.setCodigo(scanner.nextInt());
									System.out.println("\nNome da Revista: ");
									r.setNomeRevista(scanner.next());
									System.out.println("\nEdicao: ");
									r.setEdicao(scanner.nextInt());
									System.out.println("\nAno Publicacao: ");
									r.setAnoPublicacao(scanner.nextInt());
									System.out.println("\nNumero de Paginas: ");
									r.setNumeroPaginas(scanner.nextInt());
									repRevistas.inserir(r);
									cond3 = 1;
									break;

								/* Registrar Jornal */
								case "3":
									j = new Jornal();
									System.out.println("Registrar Jornal: ");
									System.out.println("\nCodigo: ");
									j.setCodigo(scanner.nextInt());
									System.out.println("\nNome do Jornal: ");
									j.setNomeJornal(scanner.next());
									System.out.println("\nAno Publicacao: ");
									j.setAnoPublicacao(scanner.nextInt());
									System.out.println("\nNumero de Paginas: ");
									j.setNumeroPaginas(scanner.nextInt());
									repJornais.inserir(j);
									cond3 = 1;
									break;

								/* Registrar Usuario */
								case "4":
									u = new Usuario();
									System.out.println("Registrar Usuario: ");
									System.out.println("\nMatricula: ");
									u.setMatricula(scanner.next());
									System.out.println("\nNome: ");
									u.setNome(scanner.next());
									System.out.println("\nTelefone: ");
									u.setFone(scanner.next());
									System.out.println("\nCurso: ");
									u.setCurso(scanner.next());
									System.out.println("\nCPF: ");
									u.setCpf(scanner.next());
									System.out.println("\nEndereco: ");
									u.setEndereco(scanner.next());
									System.out.println("\nCEP: ");
									u.setCep(scanner.next());
									System.out.println("\nEmail: ");
									u.setEmail(scanner.next());
									repUsuario.inserir(u);
									cond3 = 1;
									break;

								/* Sair */
								case "0":
									System.out.println("Saindo do menu Registar...");
									cond3 = 0;
									break;

								/* Erro */
								default:
									System.out.println("Opcao incorreta!");
									cond3 = 1;
									break;
								}
							} while (cond3 != 0);
							cond2 = 1;
							break;

						/* Remover */
						case "2":
							do {
								System.out.println(
										"\nRemover: \n1. Livro \n2. Revista \n" + "3. Jornal \n4. Usuario\n0. Sair");
								opRemover = scanner.next();
								switch (opRemover) {
								case "1":
									/* Remover Livro */
									System.out.println("\nDigite o codigo do livro: ");
									rCodigo = scanner.nextInt();
									if (repLivros.procurarL(rCodigo) == null) {
										System.out.println("Codigo do livro inexistente!");
									} else {
										repLivros.removerL(rCodigo);
										System.out.println("Livro Removido!");
									}
									cond3 = 1;
									break;

								/* Remover Revista */
								case "2":
									System.out.println("\nDigite o codigo da revista: ");
									rCodigo = scanner.nextInt();
									if (repRevistas.procurarR(rCodigo) == null) {
										System.out.println("Codigo da revista inexistente!");
									} else {
										repRevistas.removerR(rCodigo);
										System.out.println("Revista Removida!");
									}
									cond3 = 1;
									break;

								/* Remover Jornal */
								case "3":
									System.out.println("\nDigite o codigo do jornal: ");
									rCodigo = scanner.nextInt();
									if (repJornais.procurarJ(rCodigo) == null) {
										System.out.println("Codigo do jornal inexistente!");
									} else {
										repJornais.removerJ(rCodigo);
										System.out.println("Jornal Removido!");
									}
									cond3 = 1;
									break;

								/* Remover Usuario */
								case "4":
									System.out.println("\nDigite a matricula do usuario: ");
									rCodigoU = scanner.next();
									if (repUsuario.procurarU(rCodigoU) == null) {
										System.out.println("Matricula do usuario inexistente!");
									} else {
										repUsuario.removerU(rCodigoU);
										System.out.println("Usuario Removido");
									}
									cond3 = 1;
									break;

								/* Sair */
								case "0":
									System.out.println("Saindo do menu Remover...");
									cond3 = 0;
									break;

								/* Erro */
								default:
									System.out.println("Opcao incorreta!");
									cond3 = 1;
									break;

								}
							} while (cond3 != 0);
							cond2 = 1;
							break;

						/* Listar */
						case "3":
							do {
								System.out.println("\nListar: \n1. Livro \n2. Revista \n3. Jornal \n"
										+ "4. Usuario \n5. Emprestimos\n6. Devolucao \n0. Sair");
								opListar = scanner.next();
								switch (opListar) {

								/* Listar Livro */
								case "1":
									System.out.println(repLivros.listarLivro());
									cond3 = 1;
									break;

								/* Listar Revista */
								case "2":
									System.out.println(repRevistas.listarRevista());
									cond3 = 1;
									break;

								/* Listar Jornal */
								case "3":
									System.out.println(repJornais.listarJornal());
									cond3 = 1;
									break;

								/* Listar Usuario */
								case "4":
									System.out.println(repUsuario.listarUsuarios());
									cond3 = 1;
									break;

								/* Listar Emprestimo */
								case "5":
									System.out.println(repEmprestimo.listarEmprestimo());
									cond3 = 1;
									break;

								/* Listar Devolucao */
								case "6":
									System.out.println(repDevolucao.listarDevolucao());
									cond3 = 1;
									break;

								/* Sair */
								case "0":
									System.out.println("Saindo do menu Listar...");
									cond3 = 0;
									break;

								/* Erro */
								default:
									System.out.println("Opcao incorreta!");
									cond3 = 1;
									break;
								}
							} while (cond3 != 0);
							cond2 = 1;
							break;

						/* Emprestimo */
						case "4":
							do {

								System.out.println("\nEmprestimo: \n1. Livro \n2. Revista \n3. Jornal\n0. Sair ");
								opEmprestimo = scanner.next();
								switch (opEmprestimo) {

								/* Emprestar Livro */
								case "1":
									e = new EmprestimoLivro();
									System.out.println("\nDigite a matricula do usuario: ");
									empMat = scanner.next();
									Usuario g = repUsuario.procurarU(empMat);

									if (g == null) {
										System.out.println("Codigo do usuario inexistente!");

									} else {
										System.out.println("Usuario selecionado.\n");
										e.setUsuario(g);
										System.out.println("- Livro -");
										System.out.println("Digite o codigo do livro: ");
										empL = scanner.nextInt();
										Livro l1 = repLivros.procurarL(empL);

										if (l1 == null) {
											System.out.println("Codigo do Livro inexistente!");

										} else {
											System.out.println("Livro selecionado.\n");
											e.setLivro(l1);
											int codE = (repEmprestimo.listarEmprestimo().size() + 1);
											e.setId(codE);

											try {
												System.out.println("Digite a data de emprestimo: ");
												System.out.println("No formato Dia/Mes/Ano");
												String dataRecebida = scanner.next();
												DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
												e.setDataEmprestimo(df.parse(dataRecebida));
											} catch (Exception ex) {
												ex.printStackTrace();
											}
											repEmprestimo.inserir(e);
										}
									}
									cond3 = 1;
									break;

								/* Emprestar Revista */
								case "2":

									e = new EmprestimoRevista();
									System.out.println("\nDigite a matricula do usuario: ");
									empMat = scanner.next();
									Usuario g2 = repUsuario.procurarU(empMat);

									if (g2 == null) {
										System.out.println("Codigo do usuario inexistente!");

									} else {
										System.out.println("Usuario selecionado.\n");
										e.setUsuario(g2);
										System.out.println("- Revista -");
										System.out.println("Digite o codigo da revista: ");
										empR = scanner.nextInt();
										Revista r1 = repRevistas.procurarR(empR);

										if (r1 == null) {
											System.out.println("Codigo da revista inexistente!");

										} else {
											System.out.println("Revista selecionado.\n");
											e.setRevista(r1);
											int codE = (repEmprestimo.listarEmprestimo().size() + 1);
											e.setId(codE);
											try {
												System.out.println("Digite a data de emprestimo: ");
												System.out.println("No formato Dia/Mes/Ano");
												String dataRecebida = scanner.next();
												DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
												e.setDataEmprestimo(df.parse(dataRecebida));
											} catch (Exception ex) {
												ex.printStackTrace();
											}
											repEmprestimo.inserir(e);
										}
									}
									cond3 = 1;
									break;

								/* Emprestar Jornal */
								case "3":
									e = new EmprestimoJornal();
									System.out.println("\nDigite a matricula do usuario: ");
									empMat = scanner.next();
									Usuario g3 = repUsuario.procurarU(empMat);

									if (g3 == null) {
										System.out.println("Codigo do usuario inexistente!");

									} else {
										System.out.println("Usuario selecionado.\n");
										e.setUsuario(g3);
										System.out.println("- Jornal -");
										System.out.println("Digite o codigo do jornal: ");
										empJ = scanner.nextInt();
										Jornal j1 = repJornais.procurarJ(empJ);

										if (j1 == null) {
											System.out.println("Codigo do jornal inexistente!");

										} else {
											System.out.println("Jornal selecionado.\n");
											e.setJornal(j1);
											int codE = (repEmprestimo.listarEmprestimo().size() + 1);
											e.setId(codE);
											try {
												System.out.println("Digite a data de emprestimo: ");
												System.out.println("No formato Dia/Mes/Ano");
												String dataRecebida = scanner.next();
												DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
												e.setDataEmprestimo(df.parse(dataRecebida));
											} catch (Exception ex) {
												ex.printStackTrace();
											}
											repEmprestimo.inserir(e);
										}
									}
									cond3 = 1;
									break;

								/* Sair */
								case "0":
									System.out.println("Saindo do menu Emprestimo...");
									cond3 = 0;
									break;

								/* Erro */
								default:
									System.out.println("Opcao incorreta!");
									cond3 = 1;
									break;
								}
							} while (cond3 != 0);
							cond2 = 1;
							break;

						/* Devolucao */
						case "5":
							d = new Devolucao();
							System.out.println(repEmprestimo.listarEmprestimo());

							System.out.println("Digite o numero do emprestimo: ");
							int nDev = scanner.nextInt();
							Emprestimo e1 = repEmprestimo.procurarE(nDev);
							if (e1 == null) {
								System.out.println("Numero do emprestimo inexistente!");
							} else {
								System.out.println("Numero do emprestimo selecionado!");
								d.setEmprestimo(e1);
								try {
									System.out.println("Digite a data de devolucao: ");
									System.out.println("No formato Dia/Mes/Ano");
									String dataDevolucao = scanner.next();
									DateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
									d.setDevolucao(dd.parse(dataDevolucao));
								} catch (Exception ex) {
									ex.printStackTrace();
								}
								repEmprestimo.removerE(nDev);
								System.out.println("Emprestimo Removido!");

								cal.setTime(e1.getDataEmprestimo());
								Date primeiraDataDate = cal.getTime();
								cal.setTime(d.getDevolucao());
								Date segundaData = cal.getTime();
								// Transformacao em dias
								long diff = segundaData.getTime() - primeiraDataDate.getTime();
								double dias = diff / 1000 / 60 / 60 / 24;
								if (dias > 2) {
									// Multa de R$1,50 por dia de atraso
									Double multa = ((1.5 * dias) - 3);
									d.setMulta(multa);
									System.out.println("Multa por " + (int) (dias - 2) + " de atraso: R$" + d.getMulta());
								} else {
									d.setMulta(0);
									System.out.println("Sem multa!");
								}
								repDevolucao.inserirD(d);

							}
							cond2 = 1;
							break;

						/* Sair */
						case "0":
							System.out.println("Saindo do menu principal...\n");
							cond2 = 0;
							break;

						/* Erro */
						default:
							System.out.println("Opcao incorreta!");
							cond2 = 1;
							break;
						}
					} while (cond2 != 0);
				} else {
					System.out.println("Senha incorreta\n");
				}
				cond = 1;

				/* Finalizar programa */
			} else if (f.equals("0")) {
				System.out.println("Programa Finalizado!\n");
				System.out.println("*** Carlos Pereira e Wilson Vieira - Biblioteca ***");
				cond = 0;

				/* Erro */
			} else {
				System.out.println("Opcao incorreta!");
				cond = 1;
			}

		} while (cond != 0);
		scanner.close();
	}

}
