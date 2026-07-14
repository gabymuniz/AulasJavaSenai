package atividades.atividade1;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = leia.nextDouble();

        media = (nota1 + nota2 + nota3) /3;
        System.out.println("Média do aluno: " + media);
        if (media >=7){
            System.out.println("Aluno aprovado! ");
        } else if (media >=5 && media <7) {
            System.out.println("Em Recuperação! ");
        }else {
            System.out.println("Reprovado! ");
        }
    }
}
