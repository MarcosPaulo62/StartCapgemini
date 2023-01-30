public class Main {
    public static void main(String[] args) {
        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota diária de leite de um Elefante: " + mamifero1.cotaDiariaLeite());

        Mamifero mamifero2 = new Rato();
        System.out.println("Cota diária de leite de um Elefante: " + mamifero2.cotaDiariaLeite());
    }
}
