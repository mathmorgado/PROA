package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeUsuario;
        int acumulador = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite sua idade: ");
            idadeUsuario = input.nextInt();
            acumulador += idadeUsuario;
        }

        int mediaIdades = acumulador / 20;
        System.out.println("Media das idades informadas: " + mediaIdades);
    }
}
