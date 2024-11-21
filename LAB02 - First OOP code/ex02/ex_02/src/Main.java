public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato();
        candidato1.setNome("JOSE ROBERTO COSTA CARVALHO");
        candidato1.setDataNascimento("29/11/1969");
        candidato1.setGenero("Masculino");
        candidato1.setBens(40000.0f);
        candidato1.setReeleicao(false);

        Candidato candidato2 = new Candidato();
        candidato2.setNome("FRANCISCO DAS CHAGAS SOUZA");
        candidato2.setDataNascimento("14/11/1971");
        candidato2.setGenero("Masculino");
        candidato2.setBens(70000.0f);
        candidato2.setReeleicao(false);

        Candidato candidato3 = new Candidato();
        candidato3.setNome("REGINALDO PEREIRA DA SILVA");
        candidato3.setDataNascimento("08/12/1975");
        candidato3.setGenero("Masculino");
        candidato3.setBens(20000.0f);
        candidato3.setReeleicao(false);

        candidato1.imprimir();
        candidato2.imprimir();
        candidato3.imprimir();

    }
}

//Candidatos a vereador do munícipio de Joaquim Pires - PI
//Codigo: 2205409
//Matricula: 12311BB054

