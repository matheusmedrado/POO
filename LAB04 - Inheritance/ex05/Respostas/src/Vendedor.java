public class Vendedor extends Funcionario {
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double comissao) {
        super(nome, dataNascimento);
        this.comissao = comissao;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public void calcularSalario() {
        double salario = (comissao * vendas);
        setSalario(salario);
        super.calcularSalario();
    }
}
