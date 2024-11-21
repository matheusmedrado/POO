class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private float totalBens;
    private boolean reeleicao;
    private String numeroPartido;

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

class CandidatoPrefeito extends Candidato {
    private String nomeVice;
    private String partidoVice;

    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, float totalBens, boolean reeleicao, String numeroPartido, String nomeVice, String partidoVice) {
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleicao, numeroPartido);
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNome do Vice-Prefeito: " + nomeVice +
                "\nPartido do Vice-Prefeito: " + partidoVice;
    }
}

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
