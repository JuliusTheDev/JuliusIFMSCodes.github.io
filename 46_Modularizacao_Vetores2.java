import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o número de casos de teste: ");
        int T = leitor.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.print("Informe a quantidade de dígitos da senha: ");
            int Q = leitor.nextInt();

            int vetor[] = new int[Q];
            System.out.println("Informe a senha: ");
            for (int j = 0; j < Q; j++) {
                vetor[j] = leitor.nextInt();
            }

            boolean possuiRepetidos = verificaNumerosRepetidos(vetor);
            boolean possuiConsecutivos = verificaConsecutivos(vetor);
            boolean penultimoDiferenteDeZero = verificaPenultimo(vetor);
            String sequenciaCodificada = codifica(vetor);

            if (!possuiRepetidos && !possuiConsecutivos && penultimoDiferenteDeZero) {
                System.out.println("Senha válida: " + sequenciaCodificada);
            } else {
                System.out.println("Senha inválida.");
            }
        }
    }

    public static boolean verificaNumerosRepetidos(int vetor[]) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean verificaConsecutivos(int vetor[]) {
        if (vetor.length < 3) {
            return false;
        }

        for (int i = 0; i < vetor.length - 2; i++) {
            if (vetor[i] == vetor[i + 1] - 1 && vetor[i + 1] == vetor[i + 2] - 1) {
                return true;
            }
        }

        return false;
    }

    public static boolean verificaPenultimo(int vetor[]) {
        if (vetor.length < 2) {
            // Verifica se o vetor possui pelo menos duas posições
            return false;
        }

        int penultimaPosicao = vetor[vetor.length - 2];
        return penultimaPosicao != 0;
    }

    public static String codifica(int[] vetor) {
        char[] simbolos = { '!', '@', '#', '$', '?', '<', '>', '*', '(', '_' };

        char[] codificada = new char[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            int num = vetor[i];
            if (num >= 0 && num <= 9) {
                codificada[i] = simbolos[num];
            } else {
                codificada[i] = Character.forDigit(num, 10);  // mantém o elemento original se estiver fora do intervalo
            }
        }

        return new String(codificada);
    }
}
