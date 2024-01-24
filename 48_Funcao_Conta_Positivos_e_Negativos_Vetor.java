/* Construa um programa que receba da entrada uma
sequência de 20 números inteiros e armazene-os em um
vetor. Imprima na saída quantos elementos são positivos e
quantos elementos são negativos */

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[20];                /* Declara o vetor com tamanho 20 */

        System.out.println("Informe 20 valores: ");
        for(int i = 0; i < 20; i++){        /* Lê os elementos inseridos pelo usuário */
            vetor[i] = input.nextInt();
        }
        System.out.print("A sequência possui ");
        int Positivos = RetornaPositivos(vetor);    /* Chama as funções e linka a uma variável criada. */
        int Negativos = RetornaNegativos(vetor);

        System.out.print(Positivos + " números positivos e ");  /* Mostra uma saída com as variáveis criadas anteriormente */
        System.out.print(Negativos + " números negativos.");
    }
    public static int RetornaPositivos(int vetor[]){
        int i, contPositivo = 0;                    /* Define o índice do vetor e declara também um contador */
        for(i = 0; i < 20; i++){                    /* Anda pelo vetor */
            if(vetor[i] >= 0){                      /* Define a condição para somar ao contador, neste caso se o elemento do vetor for maior que zero, */
                contPositivo++;                     /* soma-se ao contador positivo o valor mais um. */
            }

        }
        return contPositivo;                        /* Como a função deve retornar um número inteiro, retornamos o valor do contador de números positivos.*/
    }

    public static int RetornaNegativos(int vetor[]){ 
        int i, contNegativo = 0;                  /* Essa função segue a mesma lógica da função anterior, mudando somente a condição para adicionar ao contador */
        for(i = 0; i < 20; i++){
            if(vetor[i] < 0){
                contNegativo++;
            }

        }
        return contNegativo;
    }
}
