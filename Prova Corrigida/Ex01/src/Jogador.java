public class Jogador {
    private String Nome;
    private int Idade;
    private double Altura;
    private double Peso;

    public Jogador(String Nome, int Idade, double Altura, double Peso) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public double getAltura() {
        return Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public String mostrarInformacoes() {
        return "Jogador [Nome: " + Nome +
                ", Idade: " + Idade + " anos" +
                ", Altura: " + Altura + " m" +
                ", Peso: " + Peso + " kg]";
    }
}