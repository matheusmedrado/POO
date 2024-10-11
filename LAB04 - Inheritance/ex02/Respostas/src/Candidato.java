class Candidato {
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String genero;
    protected float totalBens;
    protected boolean reeleicao;
    protected String numeroPartido;

    public Candidato(String nomeCompleto, String dataNascimento, String genero, float totalBens, boolean reeleicao, String numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCompleto +
                "\nData de Nascimento: " + dataNascimento +
                "\nGênero: " + genero +
                "\nTotal de Bens: R$ " + totalBens +
                "\nReeleição: " + (reeleicao ? "Sim" : "Não") +
                "\nNúmero do Partido: " + numeroPartido;
    }
}


