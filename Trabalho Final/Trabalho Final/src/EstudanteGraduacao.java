public class EstudanteGraduacao extends Estudante {
    private String estagioSupervisionado;

    public EstudanteGraduacao(String cpf, String nome, String dataNascimento, double cra, String estagioSupervisionado) {
        super(cpf, nome, dataNascimento, cra);
        this.estagioSupervisionado = estagioSupervisionado;
    }

    public String getEstagioSupervisionado() {
        return estagioSupervisionado;
    }

    public void setEstagioSupervisionado(String estagioSupervisionado) {
        this.estagioSupervisionado = estagioSupervisionado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estágio Supervisionado: " + estagioSupervisionado;
    }
}
