package atividades.atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class AnalisadorTemperaturas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] temperatura = new double[6];
        int i = 0;
        System.out.println("Informe a "+ (i+1) + "ª temperatura: ");
        temperatura[i] = leia.nextDouble();

        double maior = temperatura[0];
        double menor = temperatura[0];
        for(i=1; i < temperatura.length; i++){
            System.out.println("Informe a "+ (i+1) +"ª temperatura: ");
            temperatura[i] = leia.nextDouble();

            if(temperatura[i] > maior){
                maior = temperatura[i];
            }
            if(temperatura[i] < menor){
                menor = temperatura[i];
            }
        }


        System.out.println(Arrays.toString(temperatura));
        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Menor temperatura: " + menor + "°C");
    }
}
