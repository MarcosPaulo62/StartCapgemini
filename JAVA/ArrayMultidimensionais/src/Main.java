import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       /*
        * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas
        * para cada aluno,  calcular a média dos alunos e exibir em tela.
        * Ao final mostrar a média da turma.
        * Ao lado da média o aluno deve seguir a seguinte regra de negócio.
        * Se média >= 7,5             Aluno Aprovado
        * Se média >= 5,5 e 7,5       Aluno em Recuperação
        * Se média < 5,5              Aluno Reprovado
       */

        //Vetor de alunos
        String[] alunos = {"JOÃO", "JOSÉ", "MARIA"};

        // Matriz de notas
        float [][] notas = new float[3][4];

        // para controlar o somatório das notas de cada aluno
        // para calcular a média do aluno
        float somaNotas, mediaAluno;

        // Para armazenar o status do aluno e usar para imprimir o boletim depois
        String statusAluno;

        // Informar as notas dos alunos
        // Laço externo para associar a nota
        for (int i = 0; i < 3; i++) {
//            System.out.println("Aluno: " + alunos[i]);

            somaNotas = 0;
            mediaAluno = 0;

            // Laço interno para informar as notas de cada aluno
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota n° " + (j + 1) + " do aluno " + alunos[i]));
                somaNotas += notas[i][j];
            }

            // Calculando média do aluno
            mediaAluno = somaNotas / 4;

            if ( mediaAluno < 5.5) {
                statusAluno = "REPROVADO";
            } else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
                statusAluno = "EM RECUPERAÇÃO";
            } else {
                statusAluno = "APROVADO";
            }

            // Impressão do boletim
            System.out.println("\n************ BOLETIM ************");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            for (int k = 0; k < 4; k++) {
                System.out.println((k+1) + " - " + notas[i][k]);
            }
            System.out.println("Média: " + mediaAluno + " - " + statusAluno);
        }

    }
}