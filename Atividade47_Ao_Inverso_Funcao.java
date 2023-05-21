/* Implemente um programa que receba de entrada uma
sequência de 10 números inteiros e imprima a sequência
em ordem inversa à de leitura */

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        int vetor[] = new int[10];  /* Declaração da variável */

        Scanner input = new Scanner(System.in);
        System.out.println("Insira dez valores: "); /* Inserção dos valores */
        for(int i = 0; i < 10; i++){
            vetor[i] = input.nextInt();
        }

        System.out.println("Ordem da sequência inversa:"); 
        AoInverso(vetor);                                 /* Chamado da função */
    }

    public static void AoInverso(int vetor[]){
        for(int i = 9; i >= 0; i--){       /* Função que inverte a ordem dos elementos */
            System.out.println(vetor[i] + " "); /* i = 9 pois de 0 a 9 possuem 10 valores.Enquanto i for maior ou igual a 0, o valor de i se subtrairá, pois o incremento cria essa operação */
        }
        System.out.println();
    }
}


