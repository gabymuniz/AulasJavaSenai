package atividades.atividade3;

import java.util.Scanner;

public class SistemaCorrigido {
   /* public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
         int idade = nextLine(); Faltou usar a classe Scanner e também o tipo "nextLine()" está errado, pois estamos tentando
        ler uma váriavel do tipo inteiro e não uma String.
        int idade = entrada.nextInt();
    }*/
   public static void main(String[] args) {
      // int 1valor= 10; // UMA VARIAVEL NÃO PODE COMEÇAR COM UM NUMERO.
      // int contador = 5// ESTAVA FALTANDO UM PONTO E VIRGULA NO FINAL.

       int valor1 = 10;
       int contador = 5;

       exibirMensagens("Bem-vindo ao sistema", valor1); // precisamos de dois parametros aqui
       while(contador > 0 ){

           System.out.println("Iniciando em: " + contador);
       contador--; // um decremento para que o while possa parar.
       }
   }

   public static void exibirMensagens(String texto, int repeticoes){ // precisamos da palavra static
       for(int i = 0; i < repeticoes; i++){
           System.out.println(texto);
       }
   }
}
