package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;
        int idadeUsuario;

        String nomeMaisNovo = "";
        int idadeMaisNovo = 999;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDigite seu nome: ");
            nomeUsuario = input.nextLine();

            System.out.print("Digite sua idade: ");
            idadeUsuario = input.nextInt();

            input.nextLine();

            if (idadeUsuario < idadeMaisNovo)
            {
                nomeMaisNovo = nomeUsuario;
                idadeMaisNovo = idadeUsuario;
            }
        }

        System.out.println("\nNome do usuario mais novo: " + nomeMaisNovo);
    }
}
