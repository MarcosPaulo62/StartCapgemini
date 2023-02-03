import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();

        // Adicionando carros ao arraylist
        carros.add("RENAULT");
        carros.add("KOMBI");
        carros.add("BMW");
        carros.add("FIAT");
        carros.add("MERCEDES");

        // Substituir KOMBI por MITSUBISHI
        carros.set(1, "MITSUBISHI");

        // Remover FIAT
        carros.remove("FIAT");

        // Adicionando carro ao arraylist com JOptionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));

        // Esvaziando o arraylist
        carros.clear();

        // Verificando se o arraylist está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }

        // Verificando se o array list contem o elemento BMW
        if (carros.contains("BMW")) {
            // Substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))) {
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        } else {
            System.out.println("Não encontrei o argumento pesquisado");
        }

        // Mostrando tamanho do arraylist
        System.out.println(carros.size());

        // Mostra o array
        System.out.println(carros);

    }
}