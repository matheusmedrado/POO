public class EstudantePosGraduacao extends Estudante {
    private String temaPesquisa;

    public EstudantePosGraduacao(String cpf, String nome, String dataNascimento, double cra, String temaPesquisa) {
        super(cpf, nome, dataNascimento, cra);
        this.temaPesquisa = temaPesquisa;
    }

    public String getTemaPesquisa() {
        return temaPesquisa;
    }

    public void setTemaPesquisa(String temaPesquisa) {
        this.temaPesquisa = temaPesquisa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tema de Pesquisa: " + temaPesquisa;
    }
}

