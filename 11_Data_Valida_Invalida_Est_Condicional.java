/* Implemente um programa que solicite a(o) usuária(o) três números inteiros D, M e A, representando respectivamente, o dia, mês e ano de uma determinada data. 
Considerando a quantidade de dias do calendário tradicional, exiba na saída se a data informada previamente é válida ou inválida.

Por exemplo: caso a entrada seja os números inteiros 31, 04 e 2017, deverá ser exibido na saída uma mensagem indicando que a data 31/04/2017 é inválida, 
pois o mês de abril não possui 31 dias. Caso a entrada seja os números inteiros 29, 02 e 2020, deverá ser exibido na saída uma mensagem indicando que a data 
29/02/2020 é válida, pois o mês de fevereiro possui 29 dias, uma vez que, o ano 2020 é bissexto. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int dia, mes, ano;
        boolean validador;
        
        validador = false;

        System.out.print("Informe um dia: ");
        dia = leitor.nextInt();
        
        System.out.print("Informe um mês: ");
        mes = leitor.nextInt();
        
        System.out.print("Informe um ano: ");
        ano = leitor.nextInt();

        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
            if(dia <= 31){
            validador = true;
            }    
        }
        
        else if (mes==4 || mes==6 || mes==9 || mes==11){
            if(dia <= 30){
            validador = true;
            }    
        }
        
        else if (mes==2){
            if(ano % 4 == 0 && ano % 100 != 0){
                if(dia <= 29){
                    validador = true;
                }
            } 
            else if (dia <= 28){
                validador = true;
            }
        }
        
        if(validador == true){
             System.out.print("Data válida. ");
        }
        
        else{
            System.out.print("Data inválida. ");
        }
        
    }
}
