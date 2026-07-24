package aulas.polimorfismo.exemplos.calculos;

public class Main {
    public static void main(String[] args) {

        Calculos soma = new Calculos();

        System.out.println(soma.soma(1,1));
        System.out.println(soma.soma(3.5,1.0));
       // System.out.println(soma.soma(2,1.0));
        soma.soma(1.6,2);
        soma.soma(1.3,1);
    }
}
