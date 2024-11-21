public class Empresa {
    public static void main(String[] args) {
        Chefe[] chefes = {
                new Chefe("Carlos Silva", "01/01/1980"),
                new Chefe("Ana Costa", "15/03/1975")
        };

        Vendedor[] vendedores = {
                new Vendedor("Pedro Santos", "10/02/1985", 0.1),
                new Vendedor("Maria Lima", "22/04/1990", 0.15)
        };

        Operario[] operarios = {
                new Operario("João Oliveira", "05/05/1988", 50.0),
                new Operario("Lucia Mendes", "30/06/1992", 60.0)
        };

        Horista[] horistas = {
                new Horista("Fernanda Almeida", "12/07/1983", 20.0),
                new Horista("Ricardo Torres", "28/09/1995", 25.0)
        };

        vendedores[0].setVendas(1000);
        vendedores[1].setVendas(2000);

        operarios[0].setQuantidadeProduzida(30);
        operarios[1].setQuantidadeProduzida(40);

        horistas[0].setTotalHorasTrabalhadas(160);
        horistas[1].setTotalHorasTrabalhadas(120);

        for (Chefe chefe : chefes) {
            chefe.calcularSalario();
        }

        for (Vendedor vendedor : vendedores) {
            vendedor.calcularSalario();
        }

        for (Operario operario : operarios) {
            operario.calcularSalario();
        }

        for (Horista horista : horistas) {
            horista.calcularSalario();
        }
    }
}
