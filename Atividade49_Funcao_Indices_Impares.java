/* Construa um programa que receba da entrada uma
sequência de 10 números inteiros e armazene-os em um
vetor. Imprima na saída somente os elementos cujo índice
do vetor é ímpar. */

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); /*Declaração de variáveis */
        int vetor[] = new int[10];

        System.out.println("Insira dez valores: "); /*Inserção dos dados pelo usuário.*/
        for(int i = 0; i < 10; i++){
            vetor[i] = input.nextInt();
        }

        System.out.print("Os elementos cujo índice do vetor é ímpar são: \n");
        IndiceImpar(vetor);     /*Chama a função / linka a uma variável. */
    }

    public static void IndiceImpar(int vetor[]) {
        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("");

    }

}
