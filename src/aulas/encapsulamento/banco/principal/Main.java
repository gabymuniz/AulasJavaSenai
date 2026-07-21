package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Gabriela");
        Scanner leia = new Scanner(System.in);



        System.out.println("Informe o nome do titular: ");
        minhaConta.setTitular(leia.next());
       // System.out.println(minhaConta.getTitular());
        System.out.println("Número da conta: "+ minhaConta.getNumeroConta());

        System.out.println("Valor do depoósito: ");
        minhaConta.depositar(leia.nextDouble());

        System.out.println("Valor do saque: ");
        minhaConta.sacar(leia.nextDouble());
        leia.close();


        ContaBancaria minhaConta1 = new ContaBancaria("geovanna");
        System.out.println("Informe o nome do titular: ");
        minhaConta1.setTitular(leia.next());
        // System.out.println(minhaConta1.getTitular());
        System.out.println(minhaConta1.getNumeroConta());

        System.out.println("Valor do depoósito: ");
        minhaConta1.depositar(leia.nextDouble());

        System.out.println("Valor do saque: ");
        minhaConta1.sacar(leia.nextDouble());
    }


}
