public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito prefeito = new CandidatoPrefeito("Carlos Silva", "15/05/1980", "Masculino", 80000.0f, false, "12", "Ana Maria", "12");
        CandidatoVereador vereador = new CandidatoVereador(prefeito, "123", "Centro");

        System.out.println("Candidato a Prefeito:");
        System.out.println(prefeito.toString());
        System.out.println("\nCandidato a Vereador:");
        System.out.println(vereador.toString());
    }
}
