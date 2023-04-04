/* Implemente um programa que receba da entrada dois valores inteiros a, b. Imprima na saída uma mensagem informando se a é divisível por b ou não. */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a, b;

        System.out.println("Informe um número inteiro:");
        a = leitor.nextInt();
        
         System.out.println("Informe outro número inteiro:");
        b = leitor.nextInt();


        if (a % b == 0){
            System.out.print("O número " + a + " é divisível pelo número " + b);
        }
        
        else {
            System.out.print("O número " + a + " não é divisível pelo número " + b);
        }
        
    }
}
