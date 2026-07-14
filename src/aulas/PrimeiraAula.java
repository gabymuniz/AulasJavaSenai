package aulas;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        String nome;
        int idade;
        //  boolean professor = false;
        //int anoNasc = 2026 - idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Informe sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Informe seu cargo: ");
        String cargo = scanner.next();

        System.out.println("informe o periodo que estuda no SENAI: ");
        String turno = scanner.next();
        System.out.println("Nome: " + nome + "\n Idade: " + idade + "\n Altura: " + altura + "\n Cargo: " + cargo + "\n Periodo: " + turno);


    }
}
