package projetosjava;

import java.util.Scanner;
public class AtividadesFac {

public static double adicionarImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);

        System.out.print("Insira o custo do item: ");
        double custo = computador.nextDouble();

        System.out.print("Insira a taxa de imposto em (%): ");
        double taxaImposto = computador.nextDouble();

        double custoFinal = adicionarImposto(taxaImposto, custo);

        System.out.printf("O custo final do item com imposto é: %.2f\n", custoFinal);

        computador.close();
    }
}
    

