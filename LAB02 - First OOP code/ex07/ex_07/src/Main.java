public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto("Arroz", 20.00f, 10);
        produtos[1] = new Produto("Feijão", 15.50f, 5);
        produtos[2] = new Produto("Macarrão", 5.75f, 20);
        produtos[3] = new Produto("Açúcar", 4.00f, 15);
        produtos[4] = new Produto("Sal", 2.50f, 30);

        System.out.println("Produtos antes da ordenação:");
        exibirProdutos(produtos);

        insertionSort(produtos);

        System.out.println("\nProdutos após a ordenação:");
        exibirProdutos(produtos);
    }

    public static void exibirProdutos(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto.detalhes());
        }
    }

    public static void insertionSort(Produto[] produtos) {
        for (int i = 1; i < produtos.length; i++) {
            Produto key = produtos[i];
            int j = i - 1;

            while (j >= 0 && produtos[j].getNome().compareTo(key.getNome()) > 0) {
                produtos[j + 1] = produtos[j];
                j--;
            }
            produtos[j + 1] = key;
        }
    }
}