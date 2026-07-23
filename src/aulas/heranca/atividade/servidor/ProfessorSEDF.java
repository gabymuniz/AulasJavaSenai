package aulas.heranca.atividade.servidor;

public class ProfessorSEDF extends ServidorGDF {

    String disciplina;
    String regimeTrabalhista;

    public void corrigirProvas() {
        System.out.println("O professor está corrigindo as provas!");
    }

    public void baterPonto() {
        System.out.println("METODO BATER PONTO CLASSE FILHA");
    }
}
