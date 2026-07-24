package aulas.polimorfismo.exemplos.calculos;

public class Calculos {
    private int resultadoInteiro;
    private double resultadoQuebrado;


    public int soma(int primeiroNumero, int segundoNumero) {
        //this.resultadoInteiro = primeiroNumero+segundoNumero;
        setResultadoInteiro(primeiroNumero + segundoNumero);
        return getResultadoInteiro();
    }

    public double soma(double primeiroNumero, double segundoNumero) {
        //this.resultadoQuebrado = primeiroNumero+segundoNumero;
        setResultadoQuebrado(primeiroNumero + segundoNumero);
        return getResultadoQuebrado();
    }
    public void soma(double num1, int num2){
        //this.resultadoInteiro = primeiroNumero+segundoNumero;
        setResultadoInteiro((int)(num1 + num2));
        System.out.println(getResultadoInteiro());
    }

    public void soma(int num1, double num2){
        //this.resultadoInteiro = primeiroNumero+segundoNumero;
        setResultadoQuebrado((num1 + num2));
        System.out.println(getResultadoQuebrado());
    }


    public int getResultadoInteiro() {
        return resultadoInteiro;
    }

    public void setResultadoInteiro(int resultadoInteiro) {
        this.resultadoInteiro = resultadoInteiro;
    }

    public double getResultadoQuebrado() {
        return resultadoQuebrado;
    }

    public void setResultadoQuebrado(double resultadoQuebrado) {
        this.resultadoQuebrado = resultadoQuebrado;
    }
}
