public class Main {
    public static void main(String[] args) {
        // Testando Associação
        Time flamengo = new Time("Flamengo");
        Jogador gabigol = new Jogador("Gabriel Barbosa", 28, flamengo);
        gabigol.assinarContrato(flamengo);
        System.out.println("Jogador: " + gabigol.getNome() +
                " Time: " + gabigol.getTime().getNome());
        gabigol.rescindir();
        // Testando Agrega
        Anime naruto = new Anime("Naruto");
        Temporada temporada1 = new Temporada(1, 220);
        naruto.adicionarTemporada(temporada1, 0);
        System.out.println("Anime: " + naruto.getTitulo() +
                " Episódios T1: " + naruto.getTemporadas()[0].getNumeroEpisodios());
        // Testando Composição
        Flamengo mengao = new Flamengo("15/11/1895");
        // Torcida é criada junto e destruída junto com o Flamengo
        System.out.println("\nInformações do Flamengo:");
        System.out.println("Data de Fundação: " + mengao.getFundacao());
        System.out.println("Nome da Torcida: " + mengao.getTorcida().getNome());

    }
}


