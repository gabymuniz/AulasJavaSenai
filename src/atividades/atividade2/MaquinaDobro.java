package atividades.atividade2;

import java.util.Scanner;

public class MaquinaDobro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leia.nextInt();

        System.out.println("O dobro de " + num + " é igual a " + calcularDobro(num));
    }
    public static int calcularDobro(int numero){
        int res = numero*2;
        return res;

    }
}
