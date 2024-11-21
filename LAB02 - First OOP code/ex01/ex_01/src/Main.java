public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato(
                "JOSE ROBERTO COSTA CARVALHO ",
                "29/11/1969",
                "Masculino",
                40000.0f,
                false
        );

        Candidato candidato2 = new Candidato(
                "FRANCISCO DAS CHAGAS SOUZA ",
                "14/11/1971",
                "Masculino",
                70000.0f,
                false
        );

        Candidato candidato3 = new Candidato(
                "REGINALDO PEREIRA DA SILVA",
                "08/12/1975",
                "Feminino",
                20000.0f,
                false
        );

        candidato1.imprimir_candidato();
        candidato2.imprimir_candidato();
        candidato3.imprimir_candidato();

    }


}


