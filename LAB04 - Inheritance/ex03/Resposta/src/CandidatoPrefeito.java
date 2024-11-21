public class CandidatoPrefeito extends Candidato {
    private String viceNome;
    private String vicePartido;

    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, float bens, boolean reeleicao, String numeroPartido, String viceNome, String vicePartido) {
        super(nomeCompleto, dataNascimento, genero, bens, reeleicao, numeroPartido);
        this.viceNome = viceNome;
        this.vicePartido = vicePartido;
    }

    public String toString() {
        return super.toString() + "\nVice Nome: " + viceNome + "\nVice Partido: " + vicePartido;
    }
}
