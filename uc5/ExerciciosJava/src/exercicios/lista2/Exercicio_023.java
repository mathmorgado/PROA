package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_023 {
    private static int getQtdDiasMes() {
        Scanner input = new Scanner(System.in);
        int qtdDias = 0;

        do {
            System.out.print("Mes: ");
            String mes = input.nextLine().toLowerCase();

            if (
                    mes.intern() == "janeiro" || mes.intern() == "marco" || mes.intern() == "maio" ||
                    mes.intern() == "julho" || mes.intern() == "agosto" ||
                    mes.intern() == "outubro" || mes.intern() == "dezembro")
            {
                qtdDias = 31;
            }
            else if (
                    mes.intern() == "abril" || mes.intern() == "julho" ||
                    mes.intern() == "setembro" || mes.intern() == "novembro"
                )
            {
                qtdDias = 30;
            }
            else if (mes.intern() == "fevereiro") {
                qtdDias = 28;
            }
            else {
                qtdDias = 0;
            }
        } while (qtdDias == 0);

        input.close();
        return qtdDias;
    }

    public static void main(String [] args) {
        int qtdDias = getQtdDiasMes();
        System.out.println("O mes escolhido tem " + qtdDias + " dias!");
    }
}
