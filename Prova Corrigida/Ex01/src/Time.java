public class Time {
    private final String pNome;
    private final Jogador pTitular1;
    private final Jogador pTitular2;
    private final Jogador pSubstituto;

    public Time(String pNome, Jogador pTitular1, Jogador pTitular2, Jogador pSubstituto) {
        this.pNome = pNome;
        this.pTitular1 = pTitular1;
        this.pTitular2 = pTitular2;
        this.pSubstituto = pSubstituto;
    }

    public Time(String pNome, Jogador pTitular1, Jogador pTitular2) {
        this(pNome, pTitular1, pTitular2, null);
    }

    public String mostrarInformacoes() {
        String info = "Time: " + pNome + "\n" +
                "Titular 1: " + pTitular1.mostrarInformacoes() + "\n" +
                "Titular 2: " + pTitular2.mostrarInformacoes() + "\n";

        if (pSubstituto != null) {
            info += "Substituto: " + pSubstituto.mostrarInformacoes() + "\n";
        } else {
            info += "Substituto: Não informado\n";
        }

        return info;
    }

    public double calcularIdadeMedia() {
        int totalIdade = pTitular1.getIdade() + pTitular2.getIdade();
        int numJogadores = 2;

        if (pSubstituto != null) {
            totalIdade += pSubstituto.getIdade();
            numJogadores++;
        }

        return (double) totalIdade / numJogadores;
    }
}