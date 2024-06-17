package javabasico;

import java.util.Scanner;

public class Ex1_Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número que deseja ver a tabuada: ");
        int NumeroTabuada = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(NumeroTabuada + " x " + i + " = " + (NumeroTabuada * i));
        }
    }
}
