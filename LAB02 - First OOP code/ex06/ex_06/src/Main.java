public class Main {
    public static void main(String[] args) {

        Candidato[] candidato = new Candidato[5];
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
        candidato[3] = new Candidato(
                "MARIA APARECIDA SANTOS",
                "22/05/1980",
                "Feminino",
                50000.0f,
                true);
        candidato[4] = new Candidato(
                "ANA PAULA OLIVEIRA",
                "10/10/1985",
                "Feminino",
                30000.0f,
                false);


        //for (int i = 0; i < candidato.length; i++){
        //    candidato[i].imprimir();
        //};

        for (Candidato candidato_i : candidato) {
            candidato_i.imprimir();
        }

        Candidato[] lista_candidatos = {candidato[0], candidato[1], candidato[2], candidato[3], candidato[4]};

        Eleicao eleicao = new Eleicao(
                "Joaquim Pires",
                14376,
                lista_candidatos,
                "15/11/2024");

        eleicao.imprimir_eleicao();
        eleicao.imprimir_percentual_bens();
    }
}





//Candidatos a vereador do munícipio de Joaquim Pires - PI
//Codigo: 2205409
//Matricula: 12311BB054