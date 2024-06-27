package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.next();

        System.out.print("Digite o turno (M/V): ");
        char turno = input.next().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " + nome);
        }
        else if (turno == 'V') {
            System.out.println("Boa tarde, " + nome);
        }
        else {
            System.out.println("Turno inválido " + nome);
        }

        input.close();
    }

}
