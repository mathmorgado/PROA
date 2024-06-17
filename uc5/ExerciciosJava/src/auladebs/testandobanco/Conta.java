package auladebs.testandobanco;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    private int numero_conta;
    private String titular_conta;
    private double saldo;

    private Scanner input = new Scanner(System.in);

    // Método Construtor
    public Conta(String nome_titular, double saldo_inicial) {
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        this.numero_conta = gerador_numero.nextInt(1000);
    }

    private void verSaldo() {
        System.out.println("\nSaldo atual: R$" + this.saldo);
    }

    private void Saque(double valor_saque) {
        if (valor_saque <= 0) {
            System.out.println("Error: Valor de saque invalido. Por favor informe um valor maior que 0!");
            return;
        }

        if (this.saldo >= valor_saque) {
            this.saldo -= valor_saque;
            System.out.println("Seu saldo atual: R$" + this.saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    private void Deposito(double valor_deposito) {
        if (valor_deposito <= 0) {
            System.out.println("Error: Valor de deposito invalido. Por favor informe um valor maior que 0!");
            return;
        }

        this.saldo += valor_deposito;
        System.out.println("\nSaldo atual: R$" + this.saldo);
    }

    private void Exibir_menu() {
        System.out.print("\nBem vindo ao banco X!\nAcoes disponiveis:\n1- Ver saldo\n2- Sacar\n3- Depositar\n4- Finalizar\nAcao desejada: ");
    }

    private void Executar_funcao(int funcao) {
        double valorUsuario;

        switch (funcao)
        {
            case 1:
                verSaldo();
                break;
            case 2:
                System.out.print("\nValor do saque: ");
                valorUsuario = input.nextDouble();
                Saque(valorUsuario);
                break;
            case 3:
                System.out.print("\nValor do deposito: ");
                valorUsuario = input.nextDouble();
                Deposito(valorUsuario);
                break;
            case 4:
                System.out.println("\nSistema Finalizado!");
                break;
            default:
                System.out.println("\nOpcao invalida!");
        }
        Iniciar();
    }

    public void Iniciar() {
        int opcao;
        do {
            Exibir_menu();
            opcao = input.nextInt();
            Executar_funcao(opcao);
        } while (opcao != 4);
    }

}
