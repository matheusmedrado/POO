public class Candidato {
    public String nomeCompleto;
    public String dataNascimento;
    public String genero;
    public double totalBens;
    public boolean candidataReeleicao;
    public int numeroPartido;
    public String cargoPretendido;

    public Candidato(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidataReeleicao, int numeroPartido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidataReeleicao = candidataReeleicao;
        this.numeroPartido = numeroPartido;
        this.cargoPretendido = cargoPretendido;
    }

    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("Total de Bens: " + totalBens);
        System.out.println("Candidata à Reeleição: " + (candidataReeleicao ? "Sim" : "Não"));
        System.out.println("Número do Partido: " + numeroPartido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println();
    }
}
