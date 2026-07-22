package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o nome do titular: ");
        String nomeDigitado = leia.nextLine();

        ContaBancaria minhaConta = new ContaBancaria(nomeDigitado);


        System.out.println("Número da conta: " + minhaConta.getNumeroConta());

        System.out.println("Valor do depósito: ");
        minhaConta.depositar(leia.nextDouble());

        System.out.println("Valor do saque: ");
        minhaConta.sacar(leia.nextDouble());
       leia.nextLine();

        System.out.println("Informe o nome do titular: ");
        nomeDigitado = leia.nextLine();
        ContaBancaria minhaConta1 = new ContaBancaria(nomeDigitado);

        System.out.println(minhaConta1.getNumeroConta());

        System.out.println("Valor do depoósito: ");
        minhaConta1.depositar(leia.nextDouble());

        System.out.println("Valor do saque: ");
        minhaConta1.sacar(leia.nextDouble());
    }


}
