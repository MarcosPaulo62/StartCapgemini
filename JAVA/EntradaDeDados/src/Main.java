import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados via JOptionPane
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));

        // Saída
        JOptionPane.showMessageDialog(null, "Idade da pessoa: " + idade + " anos");
    }
}