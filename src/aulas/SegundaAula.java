package aulas;

import java.util.Scanner;

public class SegundaAula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if(value < 10){
            System.out.println("Menor do que 10");
        }else{
            System.out.println("Maior do que 10");
        }

        switch (value){
            case 1:
                System.out.println("Escolheu 1");
                break;
            case 2:
                System.out.println("Escolheu 2");
                break;
            default:
                System.out.println("Não escolheu uma opção válida!");
        }
    }
}
