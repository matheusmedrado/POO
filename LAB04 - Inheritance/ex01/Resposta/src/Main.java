public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito candidatoPrefeito = new CandidatoPrefeito(
                "JOÃO DA SILVA",
                "10/03/1980",
                "Masculino",
                50000.0f,
                false,
                "123",
                "MARIA SOUZA",
                "Partido da Esperança"
        );

        CandidatoVereador candidatoVereador = new CandidatoVereador(
                "ANA CARLA",
                "22/07/1985",
                "Feminino",
                30000.0f,
                true,
                "456",
                "123",
                "Centro"
        );

        System.out.println("Dados do Candidato a Prefeito:");
        System.out.println(candidatoPrefeito);
        System.out.println("\nDados do Candidato a Vereador:");
        System.out.println(candidatoVereador);
    }
}