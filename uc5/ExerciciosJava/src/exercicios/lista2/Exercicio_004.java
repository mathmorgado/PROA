package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_004 {

    public static float getNota() {
        Scanner input = new Scanner(System.in);
        float nota;

        do
        {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = input.nextFloat();
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public static void main(String [] args) {

        System.out.println("\nNota 1");
        float nota1 = getNota();

        System.out.println("\nNota 2");
        float nota2 = getNota();

        System.out.println("\nNota 3");
        float nota3 = getNota();

        float peso1 = 2;
        float peso2 = 3;
        float peso3 = 5;
        float pesosTotal = peso1 + peso2 + peso3;

        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / pesosTotal;

        System.out.println("Sua media ponderada e: " + media);
    }
}
