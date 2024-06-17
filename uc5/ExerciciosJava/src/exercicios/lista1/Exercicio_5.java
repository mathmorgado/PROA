package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = input.nextInt();

        if (idade >= 0 && idade < 16)
        {
            System.out.println("Nao eleitor!");
        }
        else if (idade >= 18 && idade <= 65 )
        {
            System.out.println("Eleitor obrigatorio!");
        }
        else if ((idade >= 16 && idade < 18) || idade > 65)
        {
            System.out.println("Eleitor facultativo!");
        }
        else {
            System.out.println("Idade invalida!");
        }
    }
}
