package javabasico;

import java.util.Scanner;

public class Ex3_ParImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int par = 0;
        int impar = 0;

        for(int n=1; n<=10; n++) {
            System.out.print(n + "- numero: ");
            int num = input.nextInt();

            if(num % 2 == 0) {
                System.out.println(num + "é PAR! \n");
                par++;
            }
            else {
                System.out.println(num + "é ÍMPAR! \n");
                impar++;
            }
        }

        System.out.println("Números pares: " + par + "\nNumeros ímpares: " + impar);
    }
}
