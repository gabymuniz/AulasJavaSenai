package atividades.atividade3;

import java.util.Scanner;

public class ConstrutorEscadas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a quantidade de degraus: ");
        int degraus = leia.nextInt();

        desenharEscada(degraus);
    }
    public static void desenharEscada(int degraus) {
        for (int y = 0; y < degraus; y++) {
            for (int x = 0; x <= y; x++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
