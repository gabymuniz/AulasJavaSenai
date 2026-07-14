package atividades.atividade2;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leia.nextLine();
        imprimirSaudacao(nome);
    }
    public static void imprimirSaudacao(String nome){

        System.out.println("Olá, " + nome + "! Bem-vindo(a) à nossa aula de métodos!");

    }
}
