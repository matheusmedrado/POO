import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos times deseja cadastrar? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Time[] times = new Time[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Cadastro do time " + (i + 1));

            System.out.print("Nome do time: ");
            String pNomeTime = scanner.nextLine();

            System.out.print("Nome do titular 1: ");
            String pNomeTitular1 = scanner.nextLine();
            System.out.print("Idade do titular 1: ");
            int pIdadeTitular1 = scanner.nextInt();
            System.out.print("Altura do titular 1 (em metros): ");
            double pAlturaTitular1 = scanner.nextDouble();
            System.out.print("Peso do titular 1 (em kg): ");
            double pPesoTitular1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nome do titular 2: ");
            String pNomeTitular2 = scanner.nextLine();
            System.out.print("Idade do titular 2: ");
            int pIdadeTitular2 = scanner.nextInt();
            System.out.print("Altura do titular 2 (em metros): ");
            double pAlturaTitular2 = scanner.nextDouble();
            System.out.print("Peso do titular 2 (em kg): ");
            double pPesoTitular2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Deseja cadastrar um substituto? (s/n): ");
            String pCadastrarSubstituto = scanner.nextLine();

            if (pCadastrarSubstituto.equalsIgnoreCase("s")) {
                System.out.print("Nome do substituto: ");
                String pNomeSubstituto = scanner.nextLine();
                System.out.print("Idade do substituto: ");
                int pIdadeSubstituto = scanner.nextInt();
                System.out.print("Altura do substituto (em metros): ");
                double pAlturaSubstituto = scanner.nextDouble();
                System.out.print("Peso do substituto (em kg): ");
                double pPesoSubstituto = scanner.nextDouble();
                scanner.nextLine();

                times[i] = new Time(pNomeTime,
                        new Jogador(pNomeTitular1, pIdadeTitular1, pAlturaTitular1, pPesoTitular1),
                        new Jogador(pNomeTitular2, pIdadeTitular2, pAlturaTitular2, pPesoTitular2),
                        new Jogador(pNomeSubstituto, pIdadeSubstituto, pAlturaSubstituto, pPesoSubstituto));
            } else {
                times[i] = new Time(pNomeTime,
                        new Jogador(pNomeTitular1, pIdadeTitular1, pAlturaTitular1, pPesoTitular1),
                        new Jogador(pNomeTitular2, pIdadeTitular2, pAlturaTitular2, pPesoTitular2));
            }
        }

        System.out.println("\nInformações dos times cadastrados:");
        for (Time time : times) {
            System.out.println(time.mostrarInformacoes());
        }

        Time pTimeComMaiorMedia = times[0];
        for (int i = 1; i < times.length; i++) {
            if (times[i].calcularIdadeMedia() > pTimeComMaiorMedia.calcularIdadeMedia()) {
                pTimeComMaiorMedia = times[i];
            }
        }

        System.out.println("\nTime com a maior média de idade:");
        System.out.println(pTimeComMaiorMedia.mostrarInformacoes());
        System.out.println("Média de idade: " + pTimeComMaiorMedia.calcularIdadeMedia());

        times = null;

        System.out.println("Todos os times foram removidos.");
    }
}