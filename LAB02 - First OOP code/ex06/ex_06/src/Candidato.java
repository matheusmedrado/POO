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

    public void imprimir_percentual_bens() {
        float totalBens = 0;
        for (Candidato candidato : candidatos) {
            totalBens += candidato.bens;
        }

        for (Candidato candidato : candidatos) {
            float percentual = (candidato.bens / totalBens) * 100;
            System.out.println("Nome: " + candidato.nome + " - Percentual de Bens: " + percentual + "%");
        }
    }
}





/*

Refaça o código do exercício anterior para que a Eleição em uma determinada cidade tenha 05 candidatos.
*Após instanciar a eleição*, faça uma busca do candidato que possui o maior valor de bens.
Mostre as informações desse candidato, indicando qual o percentual de bens ele possui
em relação a todos os outros candidatos que estão concorrendo na eleição.

*/

