package atividades.atividade6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FluxoRemocaoDeDadosFEFO {
    static class Produto {

        String nome;
        LocalDate vencimento;

        public Produto(String nome, LocalDate vencimento){
            this.nome = nome;
            this.vencimento = vencimento;
        }
        @Override
        public String toString(){
            return nome + " - Vence em: " + vencimento;
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome dO produto (ou 'fim' para encerrar): ");
            String nome = leia.nextLine();

            if (nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.println("Digite a data do vencimento (AAA-MM-DD): ");
            LocalDate vencimento = LocalDate.parse(leia.nextLine());

            produtos.add(new Produto(nome, vencimento));
        }

        System.out.println("\nLista de produtos: ");
        System.out.println(produtos);

        //Ordenar pela data de vencimento
        produtos.sort(Comparator.comparing(p -> p.vencimento));
        System.out.println("/nRemovendo produtos com método FEFO: ");

        while (!produtos.isEmpty()){
            Produto removida = produtos.remove(0);
            System.out.println("Removida: " + removida);
        }
        leia.close();
    }

}
