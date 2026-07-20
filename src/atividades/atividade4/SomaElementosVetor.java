package atividades.atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class SomaElementosVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leia.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            res += numeros[i];
        }

        System.out.println("Vetor preenchido: " + Arrays.toString(numeros));
        System.out.println("Soma dos numeros: " + res);
    }
}
