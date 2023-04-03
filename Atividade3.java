/* Implemente um programa que leia da entrada três números inteiros. Exiba na saída
a soma e o produto desses três números. */

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c, soma, produto;

        System.out.println("Informe três notas inteiros:");
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();

        soma = a + b + c;
        produto = a * b * c;

        System.out.println("A soma dos números informados é:" + soma);
        System.out.println("O produto dos números informados é:" + produto);
    }
}
