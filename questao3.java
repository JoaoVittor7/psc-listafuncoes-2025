package projetosjava;

import java.util.Scanner;
public class AtividadesFac {

public static int somaTres(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = computador.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = computador.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = computador.nextInt();

        int resultado = somaTres(num1, num2, num3);

        System.out.println("A soma dos três números é: " + resultado);

        computador.close();
    }
}
    

