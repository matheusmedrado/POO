import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        GerenciadorDeDados gerenciador = (GerenciadorDeDados) Persist.recuperar("dados.dat");
        if (gerenciador == null) {
            gerenciador = new GerenciadorDeDados();

//            EstudanteGraduacao gradAluno1 = new EstudanteGraduacao("12345678901", "João Silva", LocalDate.of(1995, 5, 15), 85.5, true);
//            EstudanteGraduacao gradAluno2 = new EstudanteGraduacao("98765432101", "Maria Santos", LocalDate.of(1998, 8, 23), 92.0, false);
//            EstudantePosGraduacao posAluno1 = new EstudantePosGraduacao("11122233344", "Pedro Oliveira", LocalDate.of(1990, 3, 10), 88.5, "Inteligência Artificial");
//            EstudantePosGraduacao posAluno2 = new EstudantePosGraduacao("44433322211", "Ana Costa", LocalDate.of(1992, 7, 20), 95.0, "Machine Learning");
//            Professor prof1 = new Professor("55566677788", "Carlos Ferreira", LocalDate.of(1980, 6, 15), LocalDate.of(2020, 1, 10), "Computação");
//            Professor prof2 = new Professor("99988877766", "Mariana Lima", LocalDate.of(1985, 4, 25), LocalDate.of(2019, 3, 20), "Matemática");
//            Disciplina disc1 = new Disciplina("COMP101", "Programação I", 60);
//            Disciplina disc2 = new Disciplina("MAT201", "Cálculo II", 90);
//            Disciplina turma1 = new Disciplina("COMP101", "Programação I", 60, 1, 2024, "Turma A");
//            Disciplina turma2 = new Disciplina("MAT201", "Cálculo II", 90, 1, 2024, "Turma B");

        }

        do {

            System.out.println("\nEscolha uma das opções:\n" +
                    "\n1- Inserir um novo Estudante " +
                    "\n2- Remover um Estudante " +
                    "\n3- Inserir um novo Professor " +
                    "\n4- Remover um Professor " +
                    "\n5- Inserir uma nova Disciplina " +
                    "\n6- Remover uma Disciplina " +
                    "\n7- Criar nova Turma " +
                    "\n8- Apagar uma Turma " +
                    "\n9- Mostrar Estudantes cadastrados" +
                    "\n10- Mostrar Professores cadastrados" +
                    "\n11- Mostrar Disciplinas cadastradas" +
                    "\n12- Mostrar Turmas cadastradas " +
                    "\n0- Sair\n");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.println("O Estudante é de graduação ou pós?" +
                                "\n" + "[0]Graduação [1]Pós-Graduação");

                        int escolhaUsuario = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Insira o nome do Estudante: ");
                        String nome = scanner.nextLine();
                        System.out.println("Insira a data de Nascimento (ANO-MES-DIA): ");
                        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());
                        System.out.println("Insira o CPF (apenas números, sem pontos ou hífen) : ");
                        String cpf = scanner.nextLine();
                        System.out.println("Insira o CRA: ");
                        double cra = scanner.nextDouble();
                        scanner.nextLine();

                        if (escolhaUsuario == 0) {
                            System.out.println("O Estudante está em estágio supervisionado?" + "\n"
                                    + "[0]Sim [1]Não");
                            int escolhaEstagio = scanner.nextInt();
                            boolean estagioSupervisionado = (escolhaEstagio == 0);

                            gerenciador.addEstudanteGrad(cpf, nome, dataNascimento, cra, estagioSupervisionado);

                            System.out.println("Estudante inserido com sucesso!");

                        } else if (escolhaUsuario == 1) {
                            System.out.println("Insira o tema de pesquisa do Estudante:");
                            String temaDePesquisa = scanner.nextLine();

                            gerenciador.addEstudantePosGrad(cpf, nome, dataNascimento, cra, temaDePesquisa);
                            System.out.println("Estudante inserido com sucesso!");
                        }
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao adicionar estudante: " + e.getMessage());
                    }

                    break;

                case 2:
                    try {
                        System.out.println("O Estudante é de graduação ou pós?" +
                                "\n" + "[0]Graduação [1]Pós-Graduação");
                        int escolhaUsuario = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Insira o nome do Estudante: ");
                        String nome = scanner.nextLine();

                        if(escolhaUsuario == 0) {
                            gerenciador.removerEstudanteGrad(nome);
                        } else if (escolhaUsuario == 1) {
                            gerenciador.removerEstudantePosGrad(nome);
                            System.out.println("Estudante removido com sucesso!");
                        }
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao remover estudante: " + e.getMessage());
                    }

                    break;

                case 3:

                    try {
                        System.out.println("Insira o nome do Professor: ");
                        String nome = scanner.nextLine();
                        System.out.println("Insira a data de Nascimento (ANO-MES-DIA): ");
                        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());
                        System.out.println("Insira o CPF (apenas números, sem pontos ou hífen): ");
                        String cpf = scanner.nextLine();
                        System.out.println("Insira o departamento do Professor: ");
                        String departamento = scanner.nextLine();
                        System.out.println("Insira a data de início de contrato (ANO-MES-DIA): ");
                        LocalDate inicioDeContrato = LocalDate.parse(scanner.nextLine());

                        gerenciador.addProfessor(cpf, nome, dataNascimento, inicioDeContrato, departamento);
                        System.out.println("Professor inserido com sucesso!");


                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao adicionar professor: " + e.getMessage());
                    }

                    break;

                case 4:

                    try {
                        System.out.println("Insira o nome do Professor a ser removido: ");
                        String nome = scanner.nextLine();

                        for(Professor professor : gerenciador.getListaDeProfessores()){
                            if(professor.getNome().equals(nome)){
                                gerenciador.removerProfessor(nome);
                                System.out.println("Professor removido com sucesso!");
                                break;
                            }
                        }
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao remover professor: " + e.getMessage());
                    }

                    break;

                case 5:
                    try {
                        System.out.println("Insira o código da Disciplina: ");
                        String codigo = scanner.nextLine();
                        System.out.println("Insira o nome da Disciplina: ");
                        String nomeDisciplina = scanner.nextLine();
                        System.out.println("Insira a carga horária da Disciplina: ");
                        int cargaHoraria = scanner.nextInt();
                        scanner.nextLine();

                        String disciplinaExiste = "não";
                        for(Disciplina disciplina : gerenciador.getListaDeDisciplinas()) {
                            if(disciplina.getCodigo().equals(codigo)) {
                                disciplinaExiste = "sim";
                                break;
                            }
                        }

                        if(disciplinaExiste.equals("sim")) {
                            System.out.println("Essa disciplina já existe!");
                        } else {
                            gerenciador.addDisciplina(codigo, nomeDisciplina, cargaHoraria);
                            System.out.println("Disciplina inserida com sucesso!");
                        }

                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao adicionar disciplina: " + e.getMessage());
                    }

                    break;

                case 6:
                    try {
                        System.out.println("Insira o código da Disciplina a ser removida: ");
                        String codigo = scanner.nextLine();

                        gerenciador.removerDisciplina(codigo);
                        System.out.println("Disciplina removida com sucesso!");
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao remover disciplina: " + e.getMessage());
                    }

                    break;

                case 7:
                    try {
                        System.out.println("Insira o nome da Turma: ");
                        String nomeTurma = scanner.nextLine();
                        System.out.println("Insira o código da Disciplina: ");
                        String codigo = scanner.nextLine();
                        System.out.println("Insira o semestre: ");
                        int semestre = scanner.nextInt();
                        System.out.println("Insira o ano: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        gerenciador.addTurma(codigo, semestre, ano, nomeTurma);
                        System.out.println("Turma criada com sucesso!");
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao criar turma: " + e.getMessage());
                    }

                    break;

                case 8:
                    try {
                        System.out.println("Insira o nome da turma a ser removida: ");
                        String nomeTurma = scanner.nextLine();

                        gerenciador.removerTurma(nomeTurma);
                    } catch (GerenciadorException e) {
                        System.out.println("Erro ao remover turma: " + e.getMessage());
                    }

                    break;

                case 9:
                    System.out.println("\nEstudantes de Graduação cadastrados:");
                    for (Estudante estudante : gerenciador.getListaDeEstudantesGrad()) {
                        System.out.println(estudante.toString());
                        System.out.println("------------------------");
                    }
                    System.out.println("\nEstudantes de Pós-Graduação cadastrados:");
                    for (Estudante estudante : gerenciador.getListaDeEstudantesPosGrad()) {
                        System.out.println(estudante.toString());
                        System.out.println("------------------------");
                    }

                    break;

                case 10:
                    System.out.println("\nProfessores cadastrados:");
                    for (Professor professor : gerenciador.getListaDeProfessores()) {
                        System.out.println(professor.toString());
                        System.out.println("------------------------");
                    }

                    break;

                case 11:
                    System.out.println("\nDisciplinas cadastradas:");
                    for (Disciplina disciplina : gerenciador.getListaDeDisciplinas()) {
                        System.out.println("Código: " + disciplina.getCodigo());
                        System.out.println("Nome: " + disciplina.getNomeDisciplina());
                        System.out.println("Carga horária: " + disciplina.getCargaHoraria());
                        System.out.println("------------------------");
                    }

                    break;

                case 12:
                    System.out.println("\nTurmas cadastradas:\n");
                    for (Disciplina turma : gerenciador.getListaDeTurma()) {
                        System.out.println("Turma: " + turma.getTurma().getNomeTurma());
                        System.out.println("Disciplina: " + turma.getNomeDisciplina());
                        System.out.println("Código: " + turma.getCodigo());
                        System.out.println("------------------------");
                    }

                    break;

                case 0:
                    if (Persist.gravar(gerenciador, "dados.dat")) {
                        System.out.println("Dados salvos com sucesso!");
                    } else {
                        System.out.println("Erro ao salvar os dados!");
                    }
                    System.out.println("PROGRAMA FINALIZADO");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (opcao != 0);

        scanner.close();
    }
}