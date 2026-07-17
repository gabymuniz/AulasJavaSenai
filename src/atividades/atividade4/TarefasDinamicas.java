package atividades.atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefasDinamicas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("Digite uma tarefa para adicionar à lista: ");
            String tarefa = leia.nextLine();

            if(tarefa.equalsIgnoreCase("fim")) {
                break;
            }
            tarefas.add(tarefa);
        }
        System.out.println(tarefas);
    }
}
