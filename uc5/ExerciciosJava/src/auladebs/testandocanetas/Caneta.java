package auladebs.testandocanetas;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // void -> método sem retorno
    void destampar() {
        this.tampada = false;
    }

    void tampar() {
        this.tampada = true;
    }

    void estadoAtual() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada)
        {
            destampar();
        }

        if  (this.carga > 0)
        {
            System.out.println("Sem carga!");
        }
        // Código para rabiscar
    }

}
