package exercicios.lista2;

public class Exercicio_045 {
    public static void main(String[] args) {
        int i = 0, a = 0, b = 1;
        while (i < 20) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;

            i++;
        }
        System.out.println();
    }
}
