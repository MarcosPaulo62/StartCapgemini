import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aeronaves air = new Aeronaves();
        System.out.println("Informe o número de aeronaves");
        int nrAeronaves = sc.nextInt();

        // Adicionando voos
        for (int i = 0; i < nrAeronaves; i++) {
            int nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }

        System.out.println("O primeiro a decolar vai ser o nr: " + air.primeiroVoo());
        air.listaVoos();
        sc.close();

    }
}