package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = input.next().charAt(0);

        if ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60)) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
        input.close();
    }

}
