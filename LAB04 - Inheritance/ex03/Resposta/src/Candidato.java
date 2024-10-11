public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private float bens;
    private boolean reeleicao;
    private String numeroPartido;

    public Candidato(String nomeCompleto, String dataNascimento, String genero, float bens, boolean reeleicao, String numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numeroPartido = numeroPartido;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public float getBens() {
        return bens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public String getNumeroPartido() {
        return numeroPartido;
    }

    public String toString() {
        return "Nome: " + nomeCompleto + "\nData de Nascimento: " + dataNascimento + "\nGênero: " + genero +
                "\nBens: " + bens + "\nReeleição: " + reeleicao + "\nNúmero do Partido: " + numeroPartido;
    }
}
