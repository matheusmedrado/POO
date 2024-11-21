public class CandidatoVereador extends Candidato {
    private String numeroTresDigitos;
    private String bairro;

    public CandidatoVereador(Candidato candidato, String numeroTresDigitos, String bairro) {
        super(candidato.getNomeCompleto(), candidato.getDataNascimento(), candidato.getGenero(), candidato.getBens(), candidato.isReeleicao(), candidato.getNumeroPartido());
        this.numeroTresDigitos = numeroTresDigitos;
        this.bairro = bairro;
    }

    public String toString() {
        return super.toString() + "\nNúmero: " + numeroTresDigitos + "\nBairro: " + bairro;
    }
}
