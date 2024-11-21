import java.io.Serializable;

public class Turma implements Serializable {
    private int semestre;
    private int ano;
    private String nomeTurma;

    public Turma(int semestre, int ano, String nomeTurma) {
        this.semestre = semestre;
        this.ano = ano;
        this.nomeTurma = nomeTurma;
    }
    public int getSemestre(){
        return semestre;
    }
    public int getAno(){
        return ano;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public void setNomeTurma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }
    public String getNomeTurma(){
        return nomeTurma;
    }

}
