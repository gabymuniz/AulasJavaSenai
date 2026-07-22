package atividades.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class FluxoRemocaoDeDadosFIFO {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("Digite uma tarefa para adicionar à lista: ");
            String tarefa = leia.nextLine();

            if (tarefa.equalsIgnoreCase("fim")) {
                break;
            }
            tarefas.add(tarefa);
        }
        System.out.println("****** Lista de tarefas ******");
        System.out.println(tarefas);

        System.out.println("Removendo tarefas FIFO: ");

        while (!tarefas.isEmpty()){
            String removida = tarefas.remove(0);
            System.out.println("Removendo: " + removida);
        }
    }
}
