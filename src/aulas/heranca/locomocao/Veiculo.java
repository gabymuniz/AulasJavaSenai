package aulas.heranca.locomocao;

/**
 * HERANÇA
 */
public class Veiculo {
    String marca;
    String placa;
    int anoFaricacao;
    String nomeVeiculo;

    public void ligar(){
        System.out.println("O seu veículo "+nomeVeiculo+" está sendo ligado...");
    }
}