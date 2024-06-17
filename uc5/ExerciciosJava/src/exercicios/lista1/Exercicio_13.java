package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatuea em Celsius: ");
        float temperaturaCelsius = input.nextFloat();

        float temperaturaConvertidaParaFahrenheit = (9*temperaturaCelsius+160)/5;

        System.out.println("\nA temperatura informada em Fahreinheit é: " + temperaturaConvertidaParaFahrenheit);
    }
}
