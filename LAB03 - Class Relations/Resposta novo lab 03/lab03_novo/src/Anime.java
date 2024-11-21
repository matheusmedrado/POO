class Anime {
    private String titulo;
    private Temporada[] temporadas;

    public Anime(String titulo) {
        this.titulo = titulo;
        this.temporadas = new Temporada[10];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public void adicionarTemporada(Temporada temp, int indice) {
        if (indice >= 0 && indice < temporadas.length) {
            temporadas[indice] = temp;
        }
    }
}

class Temporada {
    private int numero;
    private int numeroEpisodios;

    public Temporada(int numero, int numeroEpisodios) {
        this.numero = numero;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }
}