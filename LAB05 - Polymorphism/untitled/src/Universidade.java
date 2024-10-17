public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante[] alunos;
    private int contadorAlunos;

    public Universidade(String nome, String dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.alunos = new Estudante[100];
        this.contadorAlunos = 0;
    }

    public void adicionarAluno(Estudante aluno) {
        if (contadorAlunos < 100) {
            alunos[contadorAlunos++] = aluno;
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }

    public void mostrarContagemAlunos() {
        int contGraduacao = 0;
        int contMestrado = 0;
        int contDoutorado = 0;
        for (int i = 0; i < contadorAlunos; i++) {
            if (alunos[i].getNivel().equals("Graduacao")) {
                contGraduacao++;
            } else if (alunos[i].getNivel().equals("Mestrado")) {
                contMestrado++;
            } else if (alunos[i].getNivel().equals("Doutorado")) {
                contDoutorado++;
            }
        }
        System.out.println("Total de alunos de graduação: " + contGraduacao);
        System.out.println("Total de alunos de mestrado: " + contMestrado);
        System.out.println("Total de alunos de doutorado: " + contDoutorado);
    }

    public void mostrarInformacoesAlunos() {
        for (int i = 0; i < contadorAlunos; i++) {
            Estudante aluno = alunos[i];
            aluno.print();
            if (aluno.getNivel().equals("Doutorado")) {
                EstudanteDoutorado doutorando = (EstudanteDoutorado) aluno;
                System.out.println("Título da tese: " + doutorando.getTituloTese());
                System.out.println("Linha de pesquisa: " + doutorando.getLinhaDePesquisa());
            }
        }
    }

    public Estudante[] obterAlunosPosGraduacao() {
        Estudante[] posGraduacao = new Estudante[contadorAlunos];
        int contador = 0;
        for (int i = 0; i < contadorAlunos; i++) {
            if (alunos[i].getNivel().equals("PosGrad")) {
                posGraduacao[contador++] = alunos[i];
            }
        }
        return posGraduacao;
    }

    public void mostrarInformacoesAlunosPosGraduacao() {
        Estudante[] posGraduacao = obterAlunosPosGraduacao();
        for (Estudante aluno : posGraduacao) {
            if (aluno != null) {
                aluno.print();
            }
        }
    }
}


