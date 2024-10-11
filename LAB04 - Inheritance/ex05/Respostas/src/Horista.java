public class Horista extends Funcionario {
    private double valorPorHora;
    private int totalHorasTrabalhadas;

    public Horista(String nome, String dataNascimento, double valorPorHora) {
        super(nome, dataNascimento);
        this.valorPorHora = valorPorHora;
    }

    public void setTotalHorasTrabalhadas(int totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    @Override
    public void calcularSalario() {
        double salario = valorPorHora * totalHorasTrabalhadas;
        setSalario(salario);
        super.calcularSalario();
    }
}
