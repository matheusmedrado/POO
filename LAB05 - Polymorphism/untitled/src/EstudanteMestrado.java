public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            super.print(true);
            System.out.print("tipo='" + tipo + "'; tituloDissertacao='" + tituloDissertacao + "'; ");
        } else {
            super.print(false);
            System.out.println("tipo='" + tipo + '\'');
            System.out.println("tituloDissertacao='" + tituloDissertacao + '\'');
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }

    public String getNivel() {
        return "Graduacao";
    }
}
