package atividades.atividade1;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorCompra, desconto, valorAPagar;
        System.out.println("Informe o valor da compra: ");
        valorCompra = leia.nextDouble();
        if (valorCompra < 100) {
            System.out.println("Sem desconto");
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Valor poupado: 0" );
            System.out.println("Total a pagar: " + valorCompra);
        } else if (valorCompra >= 100 && valorCompra < 300) {
            desconto = valorCompra * 0.10;
            valorAPagar = valorCompra - desconto;
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Valor poupado: " + desconto);
            System.out.println("Total a pagar: " + valorAPagar);
        } else {
            desconto = valorCompra * 0.20;
            valorAPagar = valorCompra - desconto;
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Valor poupado: " + desconto);
            System.out.println("Total a pagar: " + valorAPagar);
        }
    }
}
