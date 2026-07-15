package atividades.atividade3;

import java.util.Scanner;

public class CofreDigital {
    public static void main(String[] args) {
        abrirCofre();
    }
    public static void abrirCofre() {
        Scanner leia = new Scanner(System.in);
        int numTentativas = 5;
        int codigoCorreto = 9999;
        boolean cofreAberto = false;

        while (!cofreAberto && numTentativas > 0) {
            System.out.println("Informe o código de 4 digitos para abrir o cofre: ");
            int codigoUsuario = leia.nextInt();

            if (codigoUsuario == codigoCorreto) {
                System.out.println("Cofre aberto!");
                cofreAberto = true;
            } else {
                numTentativas--;
                System.out.println("Codigo Errado! Restam " + numTentativas + " tentativas");
                if (numTentativas == 0) {
                    System.out.println("COFRE BLOQUEADO!");
                }
            }
        }
        leia.close();
    }
}
