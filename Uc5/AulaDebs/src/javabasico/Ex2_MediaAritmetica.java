package javabasico;

import java.util.Scanner;

public class Ex2_MediaAritmetica {
    public static int getNota() {
        Scanner input = new Scanner(System.in);

        int nota = input.nextInt();
        while(nota > 10 || nota < 0) {
            System.out.print("Digite uma nota com valor entre 0 e 10: ");
            nota = input.nextInt();
        }

        return nota;
    }

    public static void main(String[] args) {

        System.out.print("Nota 1: ");
        int nota1 = getNota();

        System.out.print("Nota 2: ");
        int nota2 = getNota();

        System.out.print("Nota 3: ");
        int nota3 = getNota();

        System.out.print("Nota 4: ");
        int nota4 = getNota();

        int mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas foi: " + mediaNotas);
    }
}
