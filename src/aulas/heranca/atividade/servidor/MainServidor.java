package aulas.heranca.atividade.servidor;

public class MainServidor extends ServidorGDF {
    public static void main(String[] args) {
        ServidorGDF professor = new ProfessorSEDF();
        professor.corrigirProvas();
        professor.baterPonto();

        ServidorGDF policial = new PolicialDF();
        policial.baterPonto();
        policial.fazerRonda();
    }
}
