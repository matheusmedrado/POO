public class Servico implements Classificavel{

    private Double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel o){

     Servico compara = (Servico) o;
     int numComp = this.preco.compareTo(compara.preco);
     return numComp < 0;
    }

}

