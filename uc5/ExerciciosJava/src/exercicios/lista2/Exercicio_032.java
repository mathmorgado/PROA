package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = input.nextDouble();

        String conceito;
        if (nota >= 9.0) {
            conceito = "A";
        }
        else if (nota >= 7.5) {
            conceito = "B";
        }
        else if (nota >= 6.0) {
            conceito = "C";
        }
        else if (nota >= 4.0) {
            conceito = "D";
        }
        else {
            conceito = "E";
        }

        System.out.printf("Nota: %.1f\nConceito: %s\n", nota, conceito);
        input.close();
    }

}
