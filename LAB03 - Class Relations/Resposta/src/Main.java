public class Main {
    public static void main(String[] args) {
        // Ex01 - Associação
        Disciplina d1 = new Disciplina("Matemática");
        Disciplina d2 = new Disciplina("Física");
        Disciplina[] disciplinas = {d1, d2};
        Professor professor = new Professor("João", disciplinas);
        System.out.println(professor.getNome() + " ensina: ");
        for (Disciplina disciplina : professor.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }

        // Ex02 - Agregação
        Aluno a1 = new Aluno("Maria");
        Aluno a2 = new Aluno("José");
        Aluno[] alunos = {a1, a2};
        Turma turma = new Turma("Turma A", alunos);
        System.out.println("Turma " + turma.getCodigo() + " tem os alunos: ");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno.getNome());
        }

        // Ex03 - Composição
        Carro carro = new Carro("Toyota", "V8");
        System.out.println("Carro: " + carro.getMarca() + ", Motor: " + carro.getMotor().getModelo());
    }
}
