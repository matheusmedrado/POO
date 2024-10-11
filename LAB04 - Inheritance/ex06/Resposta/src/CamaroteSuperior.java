public class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValor() {
        return super.getValorVIP();
    }
}
