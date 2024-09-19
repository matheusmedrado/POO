public class Candidato {
    String nome;
    String dataNascimento;
    String genero;
    float bens;
    boolean reeleicao;

    public Candidato(String pNome, String pDataNascimento, String pGenero, float pBens, boolean pReeleicao){
        nome = pNome;
        dataNascimento = pDataNascimento;
        genero = pGenero;
        bens = pBens;
        reeleicao = pReeleicao;

    };

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Genero: " + genero);
        System.out.println("Bens: " + bens);
        System.out.println("reeleicao: " + reeleicao);
        System.out.println("\n");
    }

    public void imprimir_nome(){
        System.out.println(nome);
    }


}

class Eleicao {
    public String municipio;
    public int votantes;
    Candidato[] candidatos;
    public String data;

    public Eleicao(String pMunicipio, int pVotantes, Candidato[] pCandidatos, String pData) {
        municipio = pMunicipio;
        votantes = pVotantes;
        candidatos = pCandidatos;
        data = pData;
    }

    public void imprimir_eleicao() {
        System.out.println("Município: " + municipio);
        System.out.println("Número de Votantes: " + votantes);
        System.out.println("Data: " + data);
        System.out.println("Candidatos:");
        for (Candidato candidato : candidatos) {
            candidato.imprimir_nome();
        }
        System.out.println("\n");
    }
}




/*

Crie uma nova classe chamada Eleição (Eleicao - evitar acentuação e cedilha), que é composta pelo nome do município,
o número de votantes, os candidatos, e outras informações que julgar pertinente.
Instancie duas Eleições (busque por outro município).
Inicialize os dados dos objetos por meio dos construtores.
na tela todos os dados cadastrados.



*/