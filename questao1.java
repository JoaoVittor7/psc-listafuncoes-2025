package projetosjava;

import java.util.Scanner;

public class AtividadesFac {

    public static void imprimePadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.print("Insira o valor de n: ");
        int n = computador.nextInt();

        imprimePadrao(n);
        
        computador.close();
    }
}
    

