package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        System.out.printf("IMC: "+ imc + "\nClassificacao: " + classificacao);

        input.close();
    }

}
