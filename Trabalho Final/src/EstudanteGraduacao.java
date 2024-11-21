import java.time.LocalDate;

public class EstudanteGraduacao extends Estudante{
    private boolean estagioSupervisionado;

    public EstudanteGraduacao(String cpf, String nome, LocalDate dataNascimento, double cra, boolean estagioSupervisionado) {
        super(cpf, nome, dataNascimento, cra);
        this.estagioSupervisionado = estagioSupervisionado;
    }
    public boolean getEstagioSupervisionado() {
        return estagioSupervisionado;
    }
    public void setEstagioSupervisionado(boolean estagioSupervisionado) {
        this.estagioSupervisionado = estagioSupervisionado;
    }

    public String toString(){
        return "CPF: " + getCpf() + "\nNome: " + getNome() + "\nData de Nascimento: " + getDataNascimento()
                + "\nCRA: " + getCra() + "\nEstágio Supervisionado: " + getEstagioSupervisionado();
    };

    public boolean validar() {
        return super.validar() && (estagioSupervisionado == true || estagioSupervisionado == false);
    }

}
