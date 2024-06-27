package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_002 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Raio do circulo: ");
        double raio = input.nextDouble();
        
        double area = Math.PI * (raio*raio);
        double perimetro = 2 * Math.PI * raio;

        System.out.println("Area: " + area + "\nPerimetro: " + perimetro);

        input.close();
    }
}
