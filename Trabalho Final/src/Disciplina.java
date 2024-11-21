import java.io.Serializable;

public class Disciplina implements Validavel, Serializable {
    private String codigo;
    private String nomeDisciplina;
    private int cargaHoraria;
    private Turma turma;

    public Disciplina(String codigo, String nomeDisciplina, int cargaHoraria, int semestre, int ano, String nomeTurma) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.turma = new Turma(semestre, ano, nomeTurma);
    }

    public Disciplina(String codigo, String nomeDisciplina, int cargaHoraria) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Turma getTurma() {
        return turma;
    }

    @Override
    public boolean validar() {
        if(codigo != null && nomeDisciplina != null && cargaHoraria > 0) {
            return true;}
        else{
            return false;
        }
    }


}
