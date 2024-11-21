class Jogador {
    private String nome;
    private int idade;
    private Time time; // Associação - Jogador tem um Time

    public Jogador(String nome, int idade, Time time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public void assinarContrato(Time time) {
        this.time = time;
    }

    public void rescindir() {
        this.time = null; // Jogador pode existir sem time
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Time getTime() {
        return time;
    }
}

class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}