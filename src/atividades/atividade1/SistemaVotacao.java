package atividades.atividade1;

import java.util.Scanner;

public class SistemaVotacao {

    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        idade= leia.nextInt();

        if(idade < 16){
            System.out.println("Não pode votar!");
        } else if (idade >=18 && idade <=70) {
            System.out.println("Voto obrigatório!");
        }else{
            System.out.println("Voto facultativo!");
        }
    }


}
