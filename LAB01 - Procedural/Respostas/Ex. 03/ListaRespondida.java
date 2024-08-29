import java.util.Scanner;

public class ListaRespondida {

    public static void main(String[] args) {
        // Call your methods here for testing
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
    }

    public static void ex01() {
        Scanner sc = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        sc.close(); // Close the Scanner object
    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é:");
        for (int i = 5; i >= 0; i--) {
            System.out.printf("%d ", vet[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de números pares >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            int num = sc.nextInt();
            while (num % 2 != 0) {
                System.out.println("Erro: Valor inválido");
                System.out.printf("Entre com o número %d:\n", i + 1);
                num = sc.nextInt();
            }
            vet[i] = num;
        }

        System.out.println("Os números pares digitados foram:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor;
        double media = 0;

        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
            media += vet[i];
        }

        maior = menor = vet[0];
        for (int i = 1; i < 5; i++) {
            if (vet[i] > maior)
                maior = vet[i];
            if (vet[i] < menor)
                menor = vet[i];
        }

        media /= 5;

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }
        System.out.printf("\nO maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A média é: %.2f\n", media);

        sc.close(); // Close the Scanner object
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, posMaior = 0, posMenor = 0;
        double media = 0;

        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
            media += vet[i];
        }

        maior = menor = vet[0];
        for (int i = 1; i < 5; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posMaior = i;
            }
            if (vet[i] < menor) {
                menor = vet[i];
                posMenor = i;
            }
        }

        media /= 5;

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }
        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n", maior, posMaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, posMenor);
        System.out.printf("A média é: %.2f\n", media);

        sc.close(); // Close the Scanner object
    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int maiorNota = 0;

        System.out.println("<< Normalizando as notas >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d:\n", i + 1);
            notas[i] = sc.nextInt();
            if (notas[i] > maiorNota)
                maiorNota = notas[i];
        }

        System.out.println("Notas normalizadas");
        for (int i = 0; i < 5; i++) {
            int notaNormalizada = (notas[i] * 100) / maiorNota;
            System.out.printf("A nota do aluno %d é %d\n", i + 1, notaNormalizada);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        double media = 0;
        double desvioPadrao = 0;

        System.out.println("<< Média e desvio-padrão >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            valores[i] = sc.nextInt();
            media += valores[i];
        }

        media /= 5;

        for (int i = 0; i < 5; i++) {
            desvioPadrao += Math.pow(valores[i] - media, 2);
        }

        desvioPadrao = Math.sqrt(desvioPadrao / 5);

        System.out.printf("A média é: %.2f\n", media);
        System.out.printf("O desvio-padrão é: %.2f\n", desvioPadrao);

        sc.close(); // Close the Scanner object
    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
            System.out.println("Entre com o número de alunos:");
            n = sc.nextInt();
            if (n > 100) {
                System.out.println("Erro! O número máximo de alunos permitido é 100.");
            }
        } while (n > 100);

        int[] notas = new int[n];
        double media = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d:\n", i + 1);
            notas[i] = sc.nextInt();
            media += notas[i];
        }

        media /= n;

        System.out.println("Relatório de Notas");
        for (int i = 0; i < n; i++) {
            System.out.printf("A nota do aluno %d é: %d\n", i, notas[i]);
        }
        System.out.printf("A média da turma é: %.2f\n", media);

        sc.close(); // Close the Scanner object
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        System.out.println("<< Subtração de vetores >>");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d de A:\n", i + 1);
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d de B:\n", i + 1);
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("O vetor C, definido como C = A - B é:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", C[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int countV1 = 0, countV2 = 0;

        System.out.println("<< Pares e Ímpares >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d:\n", i + 1);
            v[i] = sc.nextInt();
            if (v[i] % 2 == 0) {
                v2[countV2++] = v[i];
            } else {
                v1[countV1++] = v[i];
            }
        }

        System.out.println("Ímpares:");
        for (int i = 0; i < countV1; i++) {
            System.out.printf("%d ", v1[i]);
        }

        System.out.println("\nPares:");
        for (int i = 0; i < countV2; i++) {
            System.out.printf("%d ", v2[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int[] bolas = new int[4];
        String[] cores = { "Verde", "Azul", "Amarela", "Vermelha" };
        int totalBolas = 0;
        double[] probabilidades = new double[4];

        System.out.println("<< Probabilidades >>");

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a quantidade de bolinhas %s:\n", cores[i]);
            bolas[i] = sc.nextInt();
            totalBolas += bolas[i];
        }

        for (int i = 0; i < 4; i++) {
            probabilidades[i] = (bolas[i] / (double) totalBolas) * 100;
        }

        System.out.println("Probabilidades:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s: %.2f%%\n", cores[i], probabilidades[i]);
        }

        int maxIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (probabilidades[i] > probabilidades[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.printf("<< Maior probabilidade: %s >>\n", cores[maxIndex]);

        sc.close(); // Close the Scanner object
    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        System.out.println("<< Zerando negativos >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            v[i] = sc.nextInt();
            if (v[i] < 0) {
                v[i] = 0;
            }
        }

        System.out.println("Zerando os negativos, obtém-se:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", v[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("<< Universidade X >>");
            System.out.println("Quantos alunos serão cadastrados:");
            n = sc.nextInt();
            if (n > 10000) {
                System.out.println("Erro! O número máximo de alunos permitido é 10000.");
            }
        } while (n > 10000);

        int[] matriculas = new int[n];
        char[] classes = new char[n];
        double[] cras = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Entre com o número do aluno %d:\n", i + 1);
            matriculas[i] = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno %d (A, B, C, D ou E):\n", i + 1);
            classes[i] = sc.next().charAt(0);
            System.out.printf("Entre com o CRA do aluno %d:\n", i + 1);
            cras[i] = sc.nextDouble();
        }

        System.out.println("==== Alunos Cadastrados ====");
        for (int i = 0; i < n; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", matriculas[i], classes[i], cras[i]);
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        boolean[] repetidos = new boolean[8];

        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            v[i] = sc.nextInt();
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (v[i] == v[j] && !repetidos[j]) {
                    repetidos[j] = true;
                    System.out.printf("%d ", v[i]);
                    break;
                }
            }
        }

        sc.close(); // Close the Scanner object
    }

    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        int[] contagem = new int[8];

        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (v[i] == v[j]) {
                    contagem[i]++;
                }
            }
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < 8; i++) {
            if (contagem[i] > 0) {
                System.out.printf("%d aparece %d vezes\n", v[i], contagem[i] + 1);
            }
        }

        sc.close(); // Close the Scanner object
    }
}