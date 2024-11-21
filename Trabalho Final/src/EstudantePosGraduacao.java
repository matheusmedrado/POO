import java.time.LocalDate;

public class EstudantePosGraduacao extends Estudante{
    private String temaDePesquisa;

    public EstudantePosGraduacao(String cpf, String nome, LocalDate dataNascimento, double cra, String temaDePesquisa) {
        super(cpf, nome, dataNascimento, cra);
        this.temaDePesquisa = temaDePesquisa;
    }

    public String getTemaDePesquisa() {
        return temaDePesquisa;
    }
    public void setTemaDePesquisa(String temaDePesquisa) {
        this.temaDePesquisa = temaDePesquisa;
    }

    @Override
    public String toString(){
        return "CPF: " + getCpf() + "\nNome: " + getNome() + "\nData de Nascimento: " + getDataNascimento()
                + "\nCRA: " + getCra() + "\nTema de Pesquisa: " + getTemaDePesquisa();
    };


    @Override
    public boolean validar() {
        if(super.validar() && getTemaDePesquisa() != null) {
            return true;
        } else {
            return false;
        }
    }
}
