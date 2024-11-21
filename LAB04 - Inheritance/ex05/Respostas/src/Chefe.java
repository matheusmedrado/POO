public class Chefe extends Funcionario {
    private static double SALARIO_FIXO = 5000.0;

    public Chefe(String nome, String dataNascimento) {
        super(nome, dataNascimento);
        setSalario(SALARIO_FIXO);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
    }
}
