/*Implemente um programa que solicite ao usuário uma sequência de 30 números inteiros distintos. 
Exiba na saída se a sequência está em ordem crescente ou não.*/ 

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a, b, c, d, e, contador = 0, contador_cresc = 0;

        System.out.println("Insira uma sequência de 30 números");
        while(contador < 6){
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();
            int lnk = a;

            if(lnk <= a && a < b && b < c && c < d && d < e){
                contador_cresc++;
            }
            e = lnk;
            contador++;
        }

        if(contador_cresc == 6){

            System.out.println("A sequência está em ordem crescente");

        }

        else{

            System.out.println("A sequência não está em ordem crescente.");

        }

    }
}
