package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_019 {

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
        Scanner input = new Scanner(System.in);

        System.out.println("\nNota 1");
        float nota1 = getNota();

        System.out.println("\nNota 2");
        float nota2 = getNota();

        System.out.println("\nNota 3");
        float nota3 = getNota();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua media e: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
