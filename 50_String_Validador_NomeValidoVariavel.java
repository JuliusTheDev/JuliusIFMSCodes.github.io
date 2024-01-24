/*Implemente um programa que solicite ao usuário vários nomes de variáveis e, para cada nome informado, exiba na saída se é um nome válido ou inválido, de acordo com as regras básicas de nomenclatura de 
variáveis. Obs: o programa deverá encerrar somente quando o usuário digitar a palavra "fim" ou suas demais variações em letras maiúsculas ou minúsculas.*/

import java.util.Scanner;
    public class Main2 {
        public static boolean NomeVariavel(String nome) {
            if (nome.equalsIgnoreCase("fim")) {
                return false;
                /*  O método equalsIgnoreCase também é um método nativo do Java e faz
                 parte da classe String. Ele é usado para comparar duas strings
                 ignorando diferenças de maiúsculas e minúsculas.

                A função do método equalsIgnoreCase é verificar se duas strings são
                iguais, independentemente de suas diferenças de maiúsculas e minúsculas
                . Ele retorna true se as strings forem iguais desconsiderando a
                diferença de maiúsculas e false caso contrário.

                Por exemplo, ao usar string1.equalsIgnoreCase(string2), o método
                compara string1 e string2 sem levar em consideração se as letras
                estão em maiúsculas ou minúsculas. Isso significa que, se as duas
                strings tiverem o mesmo conteúdo, mas com diferenças de maiúsculas e
                 minúsculas, o método retornará true.

                Essa funcionalidade é útil em situações em que você deseja comparar
                strings sem se preocupar com a diferença de capitalização, como ao
                verificar se uma entrada do usuário corresponde a um valor específico,
                 independentemente de como ele digitou (maiúsculas, minúsculas ou
                 combinação).
                 */
            }
            if (!Character.isJavaIdentifierStart(nome.charAt(0))) {
                return false;
            }
            for (int i = 1; i < nome.length(); i++) {
                if (!Character.isJavaIdentifierPart(nome.charAt(i))) {
                    return false;
                }
                /*Os métodos Character.isJavaIdentifierStart e Character.isJavaIdentifierPart
                são métodos nativos da classe Character do Java. Eles fazem parte da
                biblioteca padrão do Java e são utilizados para verificar se os caracteres
                são válidos para uso em identificadores Java.

                O método Character.isJavaIdentifierStart verifica se um caractere é válido
                 como início de um identificador Java, enquanto o método Character.isJavaIdentifierPart
                 verifica se um caractere é válido como parte de um identificador Java (após o
                 primeiro caractere).

                Esses métodos são amplamente utilizados para validar nomes de variáveis
                , métodos, classes e outros identificadores em programas Java.
                 */
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String nome;
            while (true) {
                System.out.print("Digite um nome de variável (ou 'fim' para encerrar): ");
                nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("fim")) {
                    System.out.println("Programa finalizado.");
                    break;
                } else if (!NomeVariavel(nome)) {
                    System.out.println("Nome inválido.");
                } else {
                    System.out.println("Nome válido.");
                    }

            }
        }


    }

