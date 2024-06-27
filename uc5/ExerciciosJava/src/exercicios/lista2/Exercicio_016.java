package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_016 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int valor = input.nextInt();

        if (valor > 0) {
            System.out.println(valor + " e positivo");
        }
        else if (valor < 0) {
            System.out.println(valor + " e negativo");
        }
        else {
            System.out.println(valor + " e = 0");
        }
        input.close();
    }
}
