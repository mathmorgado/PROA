package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeUsuario;
        int maiorIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite sua idade: ");
            idadeUsuario = input.nextInt();

            if (idadeUsuario >= 18)
            {
                maiorIdade += 1;
            }
        }

        System.out.println("Total de maioridade: " + maiorIdade);
    }
}
