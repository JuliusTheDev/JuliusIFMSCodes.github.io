/* Implemente um programa que solicite ao usuário um número positivo n. Exiba na saída:

a) Os n primeiros pares (considere o zero como primeiro número par) e
b) A soma dos ímpares de 1 até o último número par exibido. */

import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n, par = 0, soma = 1, contador = 0, contador2 = 0;

        System.out.println("Informe um número inteiro positivo:");
        n = input.nextInt();

        System.out.printf("Os %d primeiros pares são:\n", n);

        while(contador < n){

            System.out.print(par + " ");
            par = par + 2;
            contador++;
        }

        contador = 0;
        

        while(contador < n){

            if(contador % 2 != 0){
                soma = soma + 2;
            }

            
            contador++;
        }

        System.out.print("\nA soma dos ímpares de 1 até o último número par exibido: " + soma);


    }
}
