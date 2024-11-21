public class Candidato {
    private String nome;
    private String dataNascimento;
    private String genero;
    private float bens;
    private boolean reeleicao;

    public void setNome(String pNome) {
        nome = pNome;
    }

    public void setDataNascimento(String pDataNascimento) {
        dataNascimento = pDataNascimento;
    }

    public void setGenero(String pGenero) {
        genero = pGenero;
    }

    public void setBens(float pBens) {
        bens = pBens;
    }

    public void setReeleicao(boolean pReeleicao) {
        reeleicao = pReeleicao;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public float getBens() {
        return bens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Bens: " + getBens());
        System.out.println("Reeleição: " + isReeleicao());
        System.out.println("\n");
    }
}



/*

Crie um novo projeto, semelhante ao exercício anterior.
Torne todas os atributos do
exercício 1 privados (processo de encapsulmento por meio do modificador de acesso 'private').

Crie métodos para alterar os valores dos atributos e para mostrar os valores dos atributos na tela.
Instancie os mesmos três candidatos (sem o uso de construtores).

*/