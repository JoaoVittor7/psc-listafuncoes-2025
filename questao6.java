package projetosjava;

import java.util.Scanner;
public class AtividadesFac {

 public static int converterHora(int hora24, char[] ampm) {
        int hora12;

        if (hora24 == 0){  
            hora12 = 12;
            ampm[0] = 'A'; 
        }
             else if (hora24 == 12) {  
            hora12 = 12;
            ampm[0] = 'P';
        } else if (hora24 > 12) {
            hora12 = hora24 - 12;
            ampm[0] = 'P';
        } else {
            hora12 = hora24;
            ampm[0] = 'A';
        }
        return hora12;
    }

    public static void exibirHora(int hora12, int minuto, char ampm) {
        System.out.printf("Hora convertida: %d:%02d %s.M.\n", hora12, minuto, ampm);
    }

    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Por favor insira a hora (0-23): ");
            int hora = computador.nextInt();

            System.out.print("Por favor insira os minutos (0-59): ");
            int minuto = computador.nextInt();

            char[] ampm = new char[1];  

            int hora12 = converterHora(hora, ampm);

            exibirHora(hora12, minuto, ampm[0]);

            System.out.print("Deseja continuar? (s/n): ");
            repetir = computador.next();

        } while (repetir == 's');

        computador.close();
    }
}
    

