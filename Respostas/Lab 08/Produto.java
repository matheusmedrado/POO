public class Produto implements Classificavel {

    private String codigo;

    public Produto(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo)
    {
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        int numComp = this.codigo.compareTo(compara.codigo);
        return numComp < 0;
    }

}
