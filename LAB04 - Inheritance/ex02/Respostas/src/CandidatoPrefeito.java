class CandidatoPrefeito extends Candidato {
    private String nomeVice;
    private String partidoVice;

    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, float totalBens, boolean reeleicao, String numeroPartido, String nomeVice, String partidoVice) {
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleicao, numeroPartido);
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNome do Vice-Prefeito: " + nomeVice +
                "\nPartido do Vice-Prefeito: " + partidoVice;
    }
}