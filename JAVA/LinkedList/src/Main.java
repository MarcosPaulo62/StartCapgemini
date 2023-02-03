import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        TODOS OS COMANDOS DO ARRALIST MAIS:
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()
        */

        LinkedList<String> carros = new LinkedList<>();

        // Adicionando carros
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");

        // Incluindo Renault no ínicio
        carros.addFirst("Renault");

        // Incluindo Bugatti no fim
        carros.addLast("Bugatti");

        // Removendo primeiro elemento
        carros.removeFirst();

        // Mostrando primeiro elemento
        System.out.println( carros.getFirst() );

        // Mostando carro da posição 1
        System.out.println( carros.get(1) );

        // Removendo último elemento
        carros.removeLast();

        // Mostrando último elemento
        System.out.println( carros.getLast() );

        // Mostrando carros
        System.out.println(carros);

        // Limpando linkedlist
        carros.clear();

        // Verificando se LinkedList está vazio
        if (carros.isEmpty()) {
            System.out.println("LinkedList vazio");
        }

    }
}