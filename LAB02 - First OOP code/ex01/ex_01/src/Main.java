public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato(
                "Maria Silva",
                "15/03/1975",
                "Feminino",
                250000.00,
                true,
                12,
                "Vereadora"
        );

        Candidato candidato2 = new Candidato(
                "João Souza",
                "22/07/1980",
                "Masculino",
                150000.00,
                false,
                34,
                "Prefeito"
        );

        Candidato candidato3 = new Candidato(
                "Ana Pereira",
                "30/11/1985",
                "Feminino",
                300000.00,
                true,
                56,
                "Vice-Prefeita"
        );

        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
    }
}
