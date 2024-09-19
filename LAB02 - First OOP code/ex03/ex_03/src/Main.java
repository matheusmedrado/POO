public class Main {
    public static void main(String[] args) {

        Candidato [] candidato = new Candidato [3];
        candidato[0] = new Candidato();
        candidato[0].setNome("JOSE ROBERTO COSTA CARVALHO");
        candidato[0].setDataNascimento("29/11/1969");
        candidato[0].setGenero("Masculino");
        candidato[0].setBens(40000.0f);
        candidato[0].setReeleicao(false);
        candidato[1] = new Candidato();
        candidato[1].setNome("FRANCISCO DAS CHAGAS SOUZA");
        candidato[1].setDataNascimento("14/11/1971");
        candidato[1].setGenero("Masculino");
        candidato[1].setBens(70000.0f);
        candidato[1].setReeleicao(false);
        candidato[2] = new Candidato();
        candidato[2].setNome("REGINALDO PEREIRA DA SILVA");
        candidato[2].setDataNascimento("08/12/1975");
        candidato[2].setGenero("Masculino");
        candidato[2].setBens(20000.0f);
        candidato[2].setReeleicao(false);


        //for (int i = 0; i < candidato.length; i++){
        //    candidato[i].imprimir();
        //};

        for (Candidato candidato_i : candidato) {
            candidato_i.imprimir();
        }

    }
}

//Candidatos a vereador do munícipio de Joaquim Pires - PI
//Codigo: 2205409
//Matricula: 12311BB054


//# Ex03
//Crie no programa principal um vetor de candidatos e instancie os candidatos.
// Mostre as informações de todos os candidatos.
// Utilize laços para manipulação do vetor.
//> Verifique também como utilizar o enhanced-for em Java

