package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String situacao = (nota >= 7) ? "Aprovado" : "Recuperação";

        System.out.printf("Aluno: %s\nSituação: %s\n", nome, situacao);

        scanner.close();
    }

}
