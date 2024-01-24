/* Implemente um programa que receba da entrada um número inteiro y não-nulo e imprima na saída se ele é par ou ímpar e positivo ou negativo. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int y;

        System.out.println("Informe um número inteiro:");
        y = leitor.nextInt();

        if (y > 0){
            System.out.print("Esse número é positivo ");
        }

        if (y < 0){
            System.out.print("Esse número é negativo ");
        }

        if (y % 2 == 0){
            System.out.print("e par.");
        }
        
        else {
            System.out.print("e ímpar.");
        }
        
    }
}
