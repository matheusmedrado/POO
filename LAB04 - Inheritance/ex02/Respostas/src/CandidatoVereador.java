class CandidatoVereador extends Candidato {
    private String numeroVereador;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, float totalBens, boolean reeleicao, String numeroPartido, String numeroVereador, String bairro) {
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleicao, numeroPartido);
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero do Vereador: " + numeroVereador +
                "\nBairro: " + bairro;
    }
}