public class Jogador {
    private String pNome;
    private int pIdade;
    private double pAltura;
    private double pPeso;

    public Jogador(String pNome, int pIdade, double pAltura, double pPeso) {
        this.pNome = pNome;
        this.pIdade = pIdade;
        this.pAltura = pAltura;
        this.pPeso = pPeso;
    }

    public String getNome() {
        return pNome;
    }

    public int getIdade() {
        return pIdade;
    }

    public double getAltura() {
        return pAltura;
    }

    public double getPeso() {
        return pPeso;
    }

    public String mostrarInformacoes() {
        return "Jogador [Nome: " + pNome +
                ", Idade: " + pIdade + " anos" +
                ", Altura: " + pAltura + " m" +
                ", Peso: " + pPeso + " kg]";
    }
}