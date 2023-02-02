import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Declarando o array de países
        String[] paises = new String[4];

        // Declarando o array de números
        int[] numeros = new int[10];

//        // Abastecendo o array de países
//        for (int i = 0; i < paises.length; i++) {
//            paises[i] = JOptionPane.showInputDialog("Informe um país");
//        }
//
//        // Imprimindo itens do array de países
//        for (String listaPaises : paises) {
//            System.out.println(listaPaises);
//        }

        // Abastecendo o array de números
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        }

        // Imprimindo itens do array de números
        for (int listaNumeros: numeros) {
            System.out.println(listaNumeros);
        }

        // Alterando valor de um elemento do array
        int novoValor = 11;
        numeros[8] = novoValor + 4;

        // Imprimindo itens do array de números depois da alteração
        for (int listaNumeros: numeros) {
            System.out.println(listaNumeros);
        }

    }
}