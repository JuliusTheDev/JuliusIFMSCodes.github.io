/* Implemente um programa que receba da entrada um número inteiro x e imprima na saída se ele é positivo, negativo ou nulo. */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int x;

        System.out.println("Informe um número inteiro:");
        x = leitor.nextInt();

        if (x > 0){
            System.out.print("Esse número é positivo. ");
        }

        if (x < 0){
            System.out.print("Esse número é negativo. ");
        }

        if (x == 0){
            System.out.print("Esse número é nulo-25-. ");
        }
    }
}
