public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("Salário de " + nome + ": " + salario);
    }
}
