package atividades.atividade2;

import java.util.Scanner;

public class VerificadorAcesso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = leia.nextInt();

        if(verificarMaiorIdade(idade) == true){
            System.out.println("Acesso liberado!");
        }else {
            System.out.println("Acesso negado!");
        }

    }
    public static boolean verificarMaiorIdade(int idade){
        if(idade >=18){
            return true;
        }else{
            return false;
        }
    }
}
