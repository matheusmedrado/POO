public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            super.print(true);
            System.out.print("tituloTCC='" + tituloTCC + "'; ");
        } else {
            super.print(false);
            System.out.println("tituloTCC='" + tituloTCC + '\'');
        }
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    public String getNivel() {
        return "Graduacao";
    }
}
