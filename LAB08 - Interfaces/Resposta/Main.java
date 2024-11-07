public class Main {
    public static void main(String [] args)
    {

        Cliente[] cliente = new Cliente[3];
        cliente[0] = new Cliente("Tabchoury");
        cliente[1] = new Cliente("Medrado");
        cliente[2] = new Cliente("Cardozo");

        Produto[] produto = new Produto[3];
        produto[0] = new Produto("123456");
        produto[1] = new Produto("78910");
        produto[2] = new Produto("111213");


        Servico[] servico = new Servico[3];
        servico[0] = new Servico( 22.50);
        servico[1] = new Servico( 12.20);
        servico[2] = new Servico( 18.58);

        System.out.println("Pré ordenação:");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("produto " + (i+1) + ": " + produto[i].getCodigo());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("cliente " + (i+1) + ": " + cliente[i].getNome());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("servico " + (i+1) + ": " + servico[i].getPreco());
        }
        System.out.println();

        Classificador.ordena(produto);
        Classificador.ordena(cliente);
        Classificador.ordena(servico);


        System.out.println("------------------------------------------------------");

        System.out.println("Pós ordenação:");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("produto " + (i+1) + ": " + produto[i].getCodigo());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("cliente " + (i+1) + ": " + cliente[i].getNome());
        }
        System.out.println();

        for (int i = 0; i < 3; i++)
        {
            System.out.println("servico " + (i+1) + ": " + servico[i].getPreco());
        }
        System.out.println();

    }

}
