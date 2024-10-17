public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            super.print(true);
            System.out.print("tituloTese='" + tituloTese + "'; ");
        } else {
            super.print(false);
            System.out.println("tituloTese='" + tituloTese + '\'');
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    public String getNivel() {
        return "Doutorado"; // Retorna o tipo correto
    }
}
