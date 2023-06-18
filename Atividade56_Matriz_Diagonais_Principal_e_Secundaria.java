/*  Dada uma matriz quadrada A, dizemos que diagonal principal éa diagonal que une o canto superior esquerdo ao
canto inferior direito da matriz. E, diagonal secundaria é a diagonal que une o canto superior direito ao canto
inferior esquerdo da matriz. Implemente um programa que solicite ao usuário uma matriz quadrada de inteiros A(n×n),
com 1 ≤ n ≤ 150 e exiba os elementos da diagonal principal e secundaria de A. Por exemplo: Para n = 4 e dada a
seguinte matriz


1 4 −5 2
2 0 8 3
5 5 6 15
7 3 4 10


Os elementos da diagonal principal são: 1, 0, 6 e 10; E os elementos da diagonal
secundária são: 2, 8, 5 e  7 */


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Insira o tamanho da matriz quadrada:");
        n = scanner.nextInt();

        int[][] A = new int[n][n];

        leMatriz(n, A);
        exibeDiagonais(A);
    }

    public static void leMatriz(int n, int[][] A) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os elementos da matriz A(" + n + " x " + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
    }

    public static void exibeDiagonais(int[][] A) {
        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i][i] + " ");
        }
        System.out.println();

        System.out.print("Elementos da diagonal secundária: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i][A.length - 1 - i] + " ");
        }
        System.out.println();
    }
}
