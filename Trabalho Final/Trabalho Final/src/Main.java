import java.util.Scanner;

public class Main {
    private Estudante[] estudantes;
    private Professor[] professores;
    private Disciplina[] disciplinas;
    private Turma[] turmas;

    private int estudanteCount;
    private int professorCount;
    private int disciplinaCount;
    private int turmaCount;

    public Main() {
        estudantes = new Estudante[10];
        professores = new Professor[10];
        disciplinas = new Disciplina[10];
        turmas = new Turma[10];

        estudanteCount = 0;
        professorCount = 0;
        disciplinaCount = 0;
        turmaCount = 0;

        popularEstudantes();
        popularProfessores();
        popularDisciplinas();
        popularTurmas();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("[1] Cadastrar Estudante");
            System.out.println("[2] Cadastrar Professor");
            System.out.println("[3] Cadastrar Disciplina");
            System.out.println("[4] Cadastrar Turma");
            System.out.println("[5] Consultar Estudantes");
            System.out.println("[6] Consultar Professores");
            System.out.println("[7] Consultar Disciplinas");
            System.out.println("[8] Consultar Turmas");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    cadastrarEstudante(scanner);
                    break;
                case 2:
                    cadastrarProfessor(scanner);
                    break;
                case 3:
                    cadastrarDisciplina(scanner);
                    break;
                case 4:
                    cadastrarTurma(scanner);
                    break;
                case 5:
                    consultarEstudantes();
                    break;
                case 6:
                    consultarProfessores();
                    break;
                case 7:
                    consultarDisciplinas();
                    break;
                case 8:
                    consultarTurmas();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void popularEstudantes() {
        estudantes[estudanteCount++] = new EstudanteGraduacao("12345678901", "Matheus Medrado Ferreira", "10/05/1996", 76.5, "Estágio I");
        estudantes[estudanteCount++] = new EstudanteGraduacao("23456789012", "Daniel Cardoso Gentil", "25/10/2003", 79.0, "Estágio II");
        estudantes[estudanteCount++] = new EstudantePosGraduacao("34567890123", "Fernando Lima", "05/05/1995", 9.5, "Pesquisa em Educação");
    }

    private void popularProfessores() {
        professores[professorCount++] = new Professor("13567289659", "Carlos Lopes", "06/06/1966", "06/06/2006", "FACOM");
        professores[professorCount++] = new Professor("13967789659", "Renato Tabchoury", "11/08/1986", "06/11/2010", "FACOM");
        professores[professorCount++] = new Professor("34578965412", "Leandro Lucio Amaral", "12/04/1996", "06/06/2014", "FAMAT");
    }

    private void popularDisciplinas() {
        disciplinas[disciplinaCount++] = new Disciplina("MAT101", "Matemática 01", 90);
        disciplinas[disciplinaCount++] = new Disciplina("FACOM101", "Programacao Procedimental", 75);
        disciplinas[disciplinaCount++] = new Disciplina("FACOM102", "Programacao Orientada a Objetos", 90);
    }

    private void popularTurmas() {
        turmas[turmaCount++] = new Turma("MAT101", "Matemática 01", 90, "1º semestre", 2024);
        turmas[turmaCount++] = new Turma("FACOM101", "Programacao Procedimental", 75, "1º semestre", 2024);
        turmas[turmaCount++] = new Turma("FACOM102", "Programacao Orientada a Objetos", 90, "3º semestre", 2024);
    }

    private void cadastrarEstudante(Scanner scanner) {
        if (estudanteCount < estudantes.length) {
            System.out.print("CPF: ");
            String cpf = scanner.next();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.next();
            System.out.print("CRA: ");
            double cra = scanner.nextDouble();
            System.out.print("Estágio Supervisionado: ");
            String estagioSupervisionado = scanner.next();
            estudantes[estudanteCount++] = new EstudanteGraduacao(cpf, nome, dataNascimento, cra, estagioSupervisionado);
            System.out.println("Estudante cadastrado!");
        } else {
            System.out.println("Limite de estudantes atingido.");
        }
    }

    private void cadastrarProfessor(Scanner scanner) {
        if (professorCount < professores.length) {
            System.out.print("CPF: ");
            String cpf = scanner.next();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.next();
            System.out.print("Início do Contrato: ");
            String inicioContrato = scanner.next();
            System.out.print("Departamento: ");
            String departamento = scanner.next();
            professores[professorCount++] = new Professor(cpf, nome, dataNascimento, inicioContrato, departamento);
            System.out.println("Professor cadastrado!");
        } else {
            System.out.println("Limite de professores atingido.");
        }
    }

    private void cadastrarDisciplina(Scanner scanner) {
        if (disciplinaCount < disciplinas.length) {
            System.out.print("Código: ");
            String codigo = scanner.next();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Carga Horária: ");
            int cargaHoraria = scanner.nextInt();
            disciplinas[disciplinaCount++] = new Disciplina(codigo, nome, cargaHoraria);
            System.out.println("Disciplina cadastrada!");
        } else {
            System.out.println("Limite de disciplinas atingido.");
        }
    }

    private void cadastrarTurma(Scanner scanner) {
        if (turmaCount < turmas.length) {
            System.out.print("Código da Disciplina: ");
            String codigo = scanner.next();
            System.out.print("Nome da Disciplina: ");
            String nome = scanner.next();
            System.out.print("Carga Horária: ");
            int cargaHoraria = scanner.nextInt();
            System.out.print("Semestre: ");
            String semestre = scanner.next();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            turmas[turmaCount++] = new Turma(codigo, nome, cargaHoraria, semestre, ano);
            System.out.println("Turma cadastrada!");
        } else {
            System.out.println("Limite de turmas atingido.");
        }
    }

    private void consultarEstudantes() {
        System.out.println("Estudantes:");
        for (int i = 0; i < estudanteCount; i++) {
            System.out.println(estudantes[i].toString());
        }
    }

    private void consultarProfessores() {
        System.out.println("Professores:");
        for (int i = 0; i < professorCount; i++) {
            System.out.println(professores[i].toString());
        }
    }

    private void consultarDisciplinas() {
        System.out.println("Disciplinas:");
        for (int i = 0; i < disciplinaCount; i++) {
            System.out.println(disciplinas[i].toString());
        }
    }

    private void consultarTurmas() {
        System.out.println("Turmas:");
        for (int i = 0; i < turmaCount; i++) {
            System.out.println(turmas[i].toString());
        }
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.exibirMenu();
    }
}
