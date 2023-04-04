/* Implemente um programa que solicite a(o) usuária(o) um inteiro entre 1–31 correspondente a um dia do mês de janeiro. Caso seja um dia válido, 
ou seja, entre 1 e 31, exiba na saída quantos dias faltam para o fim do mês. Caso contrário, exiba na saída "Entrada incorreta". */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int dia, fim_mes;

        System.out.println("Informe um dia do mês de janeiro:");
        dia = leitor.nextInt();

        if (dia >= 0 && dia < 32){
            fim_mes = 31 - dia;
            System.out.print("Faltam " + fim_mes + " dias para o fim do mês de janeiro.");
        }
        
        else {
            System.out.print("Entrada incorreta.");
        }
        
    }
}
