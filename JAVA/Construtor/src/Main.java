public class Main {
    public static void main(String[] args) {
        // Passando os dados através do construtor com sobrecarga
        Aluno aluno = new Aluno(8, 8, 8);

        // Calculando média
        double mediaAluno = aluno.calcularMediaAluno();

        // Definindo situação do aluno
        if(mediaAluno < 6) {
            aluno.situacaoAluno = Aluno.STATUS.REPROVADO;
        } else {
            aluno.situacaoAluno = Aluno.STATUS.APROVADO;
        }

        // Imprimindo situação do aluno
        System.out.println("A média do aluno é: " + aluno.calcularMediaAluno() + " e o aluno está " + aluno.situacaoAluno);
    }
}