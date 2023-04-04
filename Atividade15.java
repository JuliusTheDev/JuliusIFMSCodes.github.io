/* Implemente um programa que solicite 3 números inteiros, representando respectivamente, o dia, mês e ano de uma determinada data. Exiba na saída a data que representa o próximo dia.

Por exemplo, caso sejam informados os valores 15, 11, 2025, representando respectivamente a data 15/11/2025, seu programa deverá exibir 16/11/2025, que é a data referente ao próximo dia.

- Considere o calendário atual como referência para a quantidade de dias de cada um dos 12 meses.

- Considere que um ano é considerado bissexto caso seja divisível por 4 e não seja um ano centenário ou caso seja divisível por 400. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int dia, mes, ano;

        System.out.print("Informe um dia: ");
        dia = leitor.nextInt();
        
        System.out.print("Informe um mês: ");
        mes = leitor.nextInt();
        
        System.out.print("Informe um ano: ");
        ano = leitor.nextInt();

        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 ){
            if(dia <= 30){
                dia++;
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);

            }  
            else if(dia == 31){
                dia = 1;
                mes++;

                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);

            }
            
            else if(dia > 31 || dia < 1){
                System.out.print("Favor inserir um valor de dia válido");
            }
        }
        
        else if (mes==4 || mes==6 || mes==9 || mes==11){
            if(dia <= 29){
                dia++;
        
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);

            }    
            else if(dia == 30){
                dia = 1;
                mes++;
                
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);

            }
            else if(dia > 30 || dia < 1){
                System.out.print("Favor inserir um valor de dia válido");
            }
        }
        
        else if (mes==2){
            if (dia <= 28 && ano % 4 != 0){
                if(dia <= 27){
                    dia++;
                    mes = 3;
                    
                    System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);
                }
                
                else if(dia == 28){
                    dia = 1;
                    mes = 3;
                    System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);
                }
                
                else if(dia > 28 || dia < 1){
                    System.out.print("Favor inserir um valor de dia válido");
                }
            }
            
            else if(ano % 4 == 0 && ano % 100 != 0){
                if(dia == 29){
                    dia = 1;
                    mes = 3;
                }
                
                else if(dia <= 28){
                    dia++;
                    mes = 2;
                }
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);
            }
            
            else if(ano % 4 != 0){
                if(dia >= 29){
                    System.out.print("Favor inserir um valor de dia válido");
                }
            }
        }
        
        else if(mes == 12){
            if(dia == 31){
                ano++;
                mes = 1;
                dia = 1;
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);
            }
            
            else if(dia < 31){
                dia++;
                System.out.printf("A data referente ao próximo dia é: %d / %d / %d ", dia, mes, ano);

            }
        }
        
        else if(mes < 1 || mes > 12){
                System.out.print("Favor inserir um valor de mês válido");
            }
            

     
        
    }
}
