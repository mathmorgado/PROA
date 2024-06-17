package javabasico;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fatorial = input.nextInt();
        int resultadoFatorial = fatorial;

        for(int n=fatorial; n<=1; n--) {

            System.out.println(n);
            System.out.println(resultadoFatorial);

            resultadoFatorial *= n;
        }

        System.out.print(fatorial + "! = " + resultadoFatorial);
    }
}
