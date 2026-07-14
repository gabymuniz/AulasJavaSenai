package atividades.atividade2;

import java.util.Scanner;

public class CalculadoraMetodosEncadeados {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = leia.nextInt();

        System.out.println("Informe outro numero: ");
        int y = leia.nextInt();

        imprimirResultado(subtrairNumero(x,y));
    }

    public static int subtrairNumero(int x, int y){

        return x-y;
    }

    public static void imprimirResultado(int resultado){
        System.out.println("O resultado da operação é: " + resultado);
    }
}
