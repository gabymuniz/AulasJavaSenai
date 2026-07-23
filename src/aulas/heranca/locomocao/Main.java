package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new MotoACombustao();

        carro.nomeVeiculo = "Celtinha";
        carro.ligar();
        carro.ligarArCondicionado();

        moto.cor = "Preto";
        moto.puxarPezinho();

    }
}