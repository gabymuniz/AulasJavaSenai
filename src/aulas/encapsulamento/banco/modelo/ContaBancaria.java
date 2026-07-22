package aulas.encapsulamento.banco.modelo;

import static java.lang.Integer.MAX_VALUE;

public class ContaBancaria {
    private static int contadorDeContas = 1000;
    //Atributos dessa classe

    private final String titular;
    private final int numeroConta;
    private double saldo;


    //Construtor dessa classe
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;

        contadorDeContas++;
        this.numeroConta = contadorDeContas;
    }

    //Métodos Getters e Setters


    public String getTitular() {
        return titular;
    }

    //public void setTitular(String titular) {
      //  this.titular = titular;
   // }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("R$" + valor + " foi depositado!");
        } else {
            System.out.println("Erro: Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Saldo em conta: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente! Saldo em conta: R$" + this.saldo);

        }
    }
}
