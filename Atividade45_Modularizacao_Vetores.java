/* 1a) Implemente uma função chamada ordemCrescente que recebe de parâmetro um vetor de inteiros positivos e um inteiro n, representando a quantidade
de elementos deste vetor. A função deverá organizar seus elementos do menor para o maior elemento.

1b) Implemente uma função chamada ordemDecrescente que recebe de parâmetro um vetor de inteiros positivos e um inteiro n, representando a quantidade 
de elementos deste vetor. A função deverá organizar seus elementos do maior para o menor elemento.

1c) Implemente uma função chamada buscaElemento que recebe de parâmetro um vetor de inteiros positivos, um inteiro n – representando a quantidade de
elementos deste vetor – e um inteiro x, representando o elemento que deverá ser buscado no vetor em questão. Caso o número x esteja presente no vetor, a função deverá exibir na saída qual(is) índice(s) este elemento se encontra no vetor. Caso contrário, a função deverá exibir na saída a mensagem "Elemento não encontrado".

1d) Implemente uma função chamada menorElemento que recebe de parâmetro um vetor de inteiros positivos e um inteiro n, representando a quantidade de 
elementos deste vetor. A função deverá retornar o valor correspondente ao menor elemento do vetor em questão.

1e) Implemente uma função chamada maiorElemento que recebe de parâmetro um vetor de inteiros positivos e um inteiro n, representando a quantidade de 
elementos deste vetor. A função deverá retornar o valor correspondente ao menor elemento do vetor em questão.

1f) Implemente uma função chamada geraSequencia que recebe de parâmetro um inteiro n, representendo a quantidade de números de uma sequência. A função
deverá gerar uma sequência de n inteiros positivos compreendidos entre -25 e 50 e armazenar em um vetor. Por fim, a função deverá retornar o vetor em questão.

1g) Implemente uma função chamada removeElemento que recebe de parâmetro um vetor de inteiros positivos, um inteiro n, representando a quantidade de
elementos deste vetor e, um inteiro positivo i, representando um índice do vetor em questão. A função deverá "remover" o elemento contido no índice i antecipando uma posição de cada elemento subsequente deste vetor e retornar a quantidade de elementos do vetor atualizada, após remoção do referido elemento.

1h) Implemente uma função chamada exibeSequencia que recebe de parâmetro um vetor de inteiros positivos e um inteiro n, representando a quantidade de
elementos deste vetor. A função deverá exibir todos os elementos da sequência.

1i) Implemente um programa (main) que apresente o seguinte menu a(o) usuária(o):
Obter sequência;
Menor para maior;
Maior para menor;
Busca;
Maior;
Menor;
Exibir sequência;
Remove;
SAIR

Caso a opção (1) seja selecionada, seu programa deverá solicitar a(o) usuária(o) que informe o tamanho da sequência e, com o auxílio da função 
implementada no item 1f geraSequencia, gere uma sequência de inteiros de acordo com o tamanho informado previamente;

Caso a opção (2) seja selecionada, seu programa deverá organizar os elementos do vetor previamente informados em ordem crescente e imprimi-los na saída. Utilize as funções ordemCrescente e exibeSequencia;

Caso a opção (3) seja selecionada, seu programa deverá organizar os elementos do vetor previamente informados em ordem decrescente e imprimi-los na 
saída. Utilize as funções ordemDecrescente e exibeSequencia;

Caso a opção (4) seja selecionada, seu programa deverá solicitar a(o) usuária(o) que informe um número inteiro a ser buscado na sequência informada.
Por meio da função buscaElemento, o programa deverá informar se o número em questão está presente na sequência ou não. Caso esteja, deverá exibir ainda qual(is) índice(s) se encontra(m).

Caso a opção (5) seja selecionada, seu programa deverá identificar e exibir na saída o maior elemento da sequência previamente informada (utilize a 
função maiorElemento).

Caso a opção (6) seja selecionada, seu programa deverá identificar e exibir na saída o menor elemento da sequência previamente informada (utilize a 
função menorElemento).

Caso a opção (7) seja selecionada, seu programa deverá exibir na saída todos os elementos da sequência (utilize a função exibeSequencia).

Caso a opção (8) seja selecionada, seu programa deverá solicitar a(o) usuária(o) que informe um índice que referencia um elemento a ser removido no 
vetor. Por meio da função removeElemento, o elemento contido no índice informado pelo(a) usuário(a) deverá ser removido do vetor e os elementos subsequentes à posição removida, deverão ser deslocados para a esquerda. Além disso, o programa deverá manter atualizada a quantidade de elementos presentes na sequência após a remoção supracitada.

Caso a opção (9) seja selecionada, seu programa deverá exibir quantas vezes cada opção foi selecionada e encerrar. Vale ressaltar que, enquanto a
opção (9) não for selecionada, o programa deverá continuar executando e solicitando que o(a) usuário(a) escolha uma das opções.
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0;


        while(opcao != 9){
            System.out.println("\nEscolha a opção:");
            System.out.println("1. Obter sequência");
            System.out.println("2. Menor para maior");
            System.out.println("3. Maior para menor");
            System.out.println("4. Busca");
            System.out.println("5. Maior");
            System.out.println("6. Menor");
            System.out.println("7. Exibir sequência");
            System.out.println("8. Remove");
            System.out.println("9. SAIR");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();


             if (opcao == 1) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] sequencia = geraSequencia(n);

                System.out.println("Sequência gerada:");
                exibeSequencia(sequencia, n);
                cont1++;
            }
             else if (opcao == 2) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }
                ordemCrescente(vetor, n);
                System.out.println("\nVetor ordenado em ordem crescente:");
                exibeSequencia(vetor, n);
                cont2++;
            }

            else if (opcao == 3) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                 System.out.print("Digite o elemento " + (i + 1) + ": ");
                 vetor[i] = scanner.nextInt();
                }
                ordemDecrescente(vetor, n);
                System.out.println("\nVetor ordenado em ordem decrescente:");
                exibeSequencia(vetor, n);
                cont3++;
            }

            else if (opcao == 4) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }
                System.out.print("\nDigite o elemento a ser buscado: ");
                int elemento = scanner.nextInt();
                buscaElemento(vetor, n, elemento);
                cont4++;
            }

            else if (opcao == 6) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }
                int menor = menorElemento(vetor, n);
                System.out.println("O menor elemento do vetor é: " + menor);
                cont6++;
            }

            else if (opcao == 5) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }
                int maior = maiorElemento(vetor, n);
                System.out.println("O maior elemento do vetor é: " + maior);
                cont5++;
            }

            else if (opcao == 8) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }

                System.out.print("Digite o índice do elemento a ser removido: ");
                int indice = scanner.nextInt();

                int novoTamanho = removeElemento(vetor, n, indice);

                System.out.println("Vetor após remoção:");
                for (int i = 0; i < novoTamanho; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                cont8++;
            }

            else if (opcao == 7) {
                 System.out.print("Digite a quantidade de elementos do vetor: ");
                 int n = scanner.nextInt();
                 int[] vetor = new int[n];
                 for (int i = 0; i < n; i++) {
                    System.out.print("Digite o elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                }

                exibeSequencia(vetor, n);
                cont7++;
            }

            else if(opcao > 9){
                System.out.println("Opção inválida!");
                scanner.close();
                return;
            }

        }
        if(opcao == 9){
            System.out.println("\nAs opções foram escolhidas:");
            System.out.println("1. Obter sequência: " + cont1 + " vezes.");
            System.out.println("2. Menor para maior: " + cont2 + " vezes.");
            System.out.println("3. Maior para menor: " + cont3 + " vezes.");
            System.out.println("4. Busca: " + cont4 + " vezes.");
            System.out.println("5. Maior: " + cont5 + " vezes.");
            System.out.println("6. Menor: " + cont6 + " vezes.");
            System.out.println("7. Exibir sequência: " + cont7 + " vezes.");
            System.out.println("8. Remove: " + cont8 + " vezes.");
        }
    }

    public static int[] geraSequencia(int n) {
        int[] sequencia = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            sequencia[i] = random.nextInt(76) - 25;
        }
        return sequencia;
    }
    public static void exibeSequencia(int[] vetor, int n) {

        System.out.println("Sequência:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void ordemCrescente(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void ordemDecrescente(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void buscaElemento(int[] vetor, int n, int elemento) {
        boolean encontrado = false;
        System.out.print("O elemento está presente no(s) índice(s): ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] == elemento) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento não encontrado");
        }
    }

    public static int menorElemento(int[] vetor, int n) {
        int menor = vetor[0];
        for (int i = 1; i < n; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

        public static int maiorElemento(int[] vetor, int n) {
            int maior = vetor[0];
            for (int i = 1; i < n; i++) {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
            return maior;
        }

    public static int removeElemento(int[] vetor, int n, int indice) {
        for (int i = indice; i < n - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        return n - 1;
    }
}


