package exercicios.lista2;

public class Exercicio_067 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        do {
            soma += i;
            i++;
        } while (i <= 100);
        System.out.println("Soma: " + soma);
    }
}
