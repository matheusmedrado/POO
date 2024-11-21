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

    public void imprimir_candidato(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Genero: " + genero);
        System.out.println("Bens: " + bens);
        System.out.println("reeleicao: " + reeleicao);
        System.out.println("\n");
    }

}

//Candidatos a vereador do munícipio de Joaquim Pires - PI
//Codigo: 2205409
//Matricula: 12311BB054
