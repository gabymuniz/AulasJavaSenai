package aulas.polimorfismo.exemplos.formulario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cadastro pessoa1 = new Cadastro("Gabriela", 29, "Estudante");

        Cadastro pessoa2 = new Cadastro("Geovanna", 23, "Dentista");

        System.out.println("Informe seu nome: ");
        pessoa1.setNome(leia.nextLine());

        System.out.println("Informe sua idade: ");
        pessoa1.setIdade(leia.nextInt());
        leia.nextLine();
        System.out.println("Informe seu cargo: ");
        pessoa1.setCargo(leia.nextLine());
        if (pessoa1.getNome() == "" || pessoa1.getCargo() == "" || pessoa1.getIdade() == 0) {
            System.out.println("Cadastro incompleto, deseja completar seu cadastro? 0 - não 1 - sim");
            int op = 1;
            while (op == 1) {

                System.out.println("Informe seu nome: ");
                pessoa1.setNome(leia.nextLine());

                System.out.println("Informe sua idade: ");
                pessoa1.setIdade(leia.nextInt());
                leia.nextLine();
                System.out.println("Informe seu cargo: ");
                pessoa1.setCargo(leia.nextLine());
            }
        }

        pessoa1.verificaCadastro();
        System.out.println(pessoa1);
    }
}
