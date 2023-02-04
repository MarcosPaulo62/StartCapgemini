import javax.swing.*;
import java.util.Scanner;

public class MainComGenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AeronavesComGenerics<String> air = new AeronavesComGenerics<>();

        System.out.println("Informe o número de aeronaves");
        int nrAeronaves = sc.nextInt();

        // Adicionando voos
        for (int i = 0; i < nrAeronaves; i++) {
            String nrVoo = JOptionPane.showInputDialog("Informe o número do voo");
            air.addVoo(nrVoo);
        }

        System.out.println("O primeiro a decolar vai ser o nr: " + air.primeiroVoo());
        air.listaVoos();
        sc.close();

    }
}
