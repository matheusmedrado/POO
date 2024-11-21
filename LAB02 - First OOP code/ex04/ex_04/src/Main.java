public class Main {
    public static void main(String[] args) {

        Candidato [] candidato = new Candidato [3];
        candidato[0] = new Candidato(
                "JOSE ROBERTO COSTA CARVALHO",
                "29/11/1969",
                "Masculino",
                40000.0f,
                false);
        candidato[1] = new Candidato(
                "FRANCISCO DAS CHAGAS SOUZA",
                "14/11/1971",
                "Masculino",
                70000.0f,
                false);
        candidato[2] = new Candidato(
                "REGINALDO PEREIRA DA SILVA",
                "08/12/1975",
                "Masculino",
                20000.0f,
                false);


        //for (int i = 0; i < candidato.length; i++){
        //    candidato[i].imprimir();
        //};

        for (Candidato candidato_i : candidato) {
            candidato_i.imprimir();
        }

    }
}

//Refaça o exercício 02 utilizando construtores para inicialização dos atributos dos objetos criados.

//Candidatos a vereador do munícipio de Joaquim Pires - PI
//Codigo: 2205409
//Matricula: 12311BB054