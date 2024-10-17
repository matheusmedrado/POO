public class Turma extends Disciplina {
    private String semestre;
    private int ano;

    public Turma(String codigo, String nome, int cargaHoraria, String semestre, int ano) {
        super(codigo, nome, cargaHoraria);
        this.semestre = semestre;
        this.ano = ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Turma: " + getNome() + ", Código: " + getCodigo() + ", Carga Horária: " + getCargaHoraria() +
                ", Semestre: " + semestre + ", Ano: " + ano;
    }
}
