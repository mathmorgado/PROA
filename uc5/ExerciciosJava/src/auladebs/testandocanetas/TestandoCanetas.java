package auladebs.testandocanetas;

public class TestandoCanetas {
    public static void main(String[] args) {
        // Criando intância uma instância da classe caneta
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "esferografica";
        caneta1.cor = "preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 50;
        caneta1.tampada = true;

        caneta1.estadoAtual();
        caneta1.rabiscar();
        caneta1.estadoAtual();
    }
}
