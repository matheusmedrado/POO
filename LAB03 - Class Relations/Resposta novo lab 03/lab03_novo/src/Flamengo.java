class Flamengo {
    private String fundacao;
    private Torcida torcida;

    public Flamengo(String fundacao) {
        this.fundacao = fundacao;
        this.torcida = new Torcida();
    }

    public String getFundacao() {
        return fundacao;
    }

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    public Torcida getTorcida() {
        return torcida;
    }
}

class Torcida {
    private String nome;

    public Torcida() {
        this.nome = "Nação Rubro-Negra";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}