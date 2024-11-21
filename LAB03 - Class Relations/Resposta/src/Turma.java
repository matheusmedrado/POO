public class Turma {
    private String codigo;
    private Aluno[] alunos;

    public Turma(String codigo, Aluno[] alunos) {
        this.codigo = codigo;
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
