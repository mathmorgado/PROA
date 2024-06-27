package exercicios.lista2;

public class Exercicio_060 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}
