package projetosjava;

import java.util.Scanner;
public class AtividadesFac {

public static char analisaNum(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = computador.nextInt();

        char resultado = analisaNum(num);

        System.out.println("Resultado: " + resultado);

        computador.close();
    }
}
    

