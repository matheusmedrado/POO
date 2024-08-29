import java.util.Scanner;

public class resolucao {

    public static boolean alteraPreco(float[] preco, int index, float porcentagem) {
        if (porcentagem > -100) {
            float fator = 1 + porcentagem / 100;
            preco[index] = preco[index] * fator;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        // Entrada de dados dos produtos
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o nome do produto " + (i + 1) + ":");
            nome[i] = scanner.next();
            System.out.println("Informe o preço do produto " + (i + 1) + ":");
            preco[i] = scanner.nextFloat();
            System.out.println("Informe a quantidade em estoque do produto " + (i + 1) + ":");
            qtdEstoque[i] = scanner.nextInt();
        }

        // Alterações de preço
        System.out.println("Aumentando o preço em 10% do produto 1 e 3");
        alteraPreco(preco, 0, 10);
        alteraPreco(preco, 2, 10);

        System.out.println("Reduzindo o preço em 5% do produto 2");
        if (!alteraPreco(preco, 1, -5)) {
            System.out.println("Erro: preço não alterado. Porcentagem inválida");
        } else {
            System.out.println("Preço alterado com sucesso");
        }

        System.out.println("Alterando o preço do produto 4");
        if (!alteraPreco(preco, 3, -110)) {
            System.out.println("Erro: preço não alterado. Porcentagem inválida");
        }

        // Exibição dos produtos cadastrados
        System.out.println("Produtos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Produto: " + nome[i]);
            System.out.println("Preço: " + preco[i]);
            System.out.println("Estoque: " + qtdEstoque[i]);
        }

        scanner.close();
    }

}
