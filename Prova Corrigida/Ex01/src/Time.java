public class Time {
    private  String Nome;
    private Jogador Titular1;
    private Jogador Titular2;
    private Jogador Substituto;

    public Time(String Nome, Jogador Titular1, Jogador Titular2, Jogador Substituto) {
        this.Nome = Nome;
        this.Titular1 = Titular1;
        this.Titular2 = Titular2;
        this.Substituto = Substituto;
    }

    public Time(String Nome, Jogador Titular1, Jogador Titular2) {
        this.Nome = Nome;
        this.Titular1 = Titular1;
        this.Titular2 = Titular2;
        this.Substituto = null;
    }

    public String mostrarInformacoes() {
        String info = "Time: " + Nome + "\n" +
                "Titular 1: " + Titular1.mostrarInformacoes() + "\n" +
                "Titular 2: " + Titular2.mostrarInformacoes() + "\n";

        if (Substituto != null) {
            info += "Substituto: " + Substituto.mostrarInformacoes() + "\n";
        } else {
            info += "Substituto: Não informado\n";
        }

        return info;
    }

    public double calcularIdadeMedia() {
        int totalIdade = Titular1.getIdade() + Titular2.getIdade();
        int numJogadores = 2;

        if (Substituto != null) {
            totalIdade += Substituto.getIdade();
            numJogadores++;
        }

        return (double) totalIdade / numJogadores;
    }
}