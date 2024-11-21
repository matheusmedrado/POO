public class Operario extends Funcionario {
    private double valorPorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, String dataNascimento, double valorPorProducao) {
        super(nome, dataNascimento);
        this.valorPorProducao = valorPorProducao;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public void calcularSalario() {
        double salario = valorPorProducao * quantidadeProduzida;
        setSalario(salario);
        super.calcularSalario();
    }
}
