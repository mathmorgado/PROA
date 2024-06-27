package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_025 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Faltas: ");
        int faltas = input.nextInt();

        if (faltas > 15) {
            System.out.println("Reprovou");
        }
        else {
            int faltasRestantes = 15 - faltas;
            System.out.println("Pode faltar mais " + faltasRestantes + " vezes!");
        }

        input.close();
    }
}
