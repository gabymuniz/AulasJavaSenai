package atividades.atividade1;

import java.util.Scanner;

public class DetetiveNumeros {
    public static void main(String[] args) {
        int number;

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um número");
        number = leia.nextInt();

        if(number % 2 == 0 && number < 0){
            System.out.println("O número " + number + " é par.");
            System.out.println("O número " + number + " é negativo");
        } else if (number % 2 ==0 && number > 0) {

            System.out.println("O número " + number + " é par.");
            System.out.println("O número " + number + " é positivo");
        } else if (number % 2 !=0 && number < 0) {

            System.out.println("O número " + number + " é ímpar.");
            System.out.println("O número " + number + " é negativo");
        } else if (number % 2 !=0 && number > 0) {

            System.out.println("O número " + number + " é ímpar.");
            System.out.println("O número " + number + " é positivo");
        }else {
            System.out.println("O número é ZERO!");
        }
    }
}
