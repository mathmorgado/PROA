package exercicios.lista2;

public class Exercicio_075 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int i = 0;
        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        } while (i < 20);

        System.out.println();
    }
}
