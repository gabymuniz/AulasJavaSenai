package atividades.atividade1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double peso, altura, IMC;

        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble();

        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();

        IMC = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", IMC); //printf serve para formatar a saida.
        if (IMC < 18.5){
                System.out.println("Abaixo do peso.");
        }else if(IMC > 18.5 && IMC <=24.9){
            System.out.println("Peso normal.");
        } else if (IMC >=25 && IMC < 30){
            System.out.println("Sobrepeso.");
        }else{
            System.out.println("OBESIDADE.");
        }
    }
}
