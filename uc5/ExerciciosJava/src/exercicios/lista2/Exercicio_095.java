package exercicios.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.next();
        }
        Arrays.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        input.close();
    }
}
