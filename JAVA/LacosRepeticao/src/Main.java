public class Main {
    public static void main(String[] args) {
        // Comando WHILE - laço pré-testado
        System.out.println("Comando WHILE");
        int qtdVezes = 1;
        while (qtdVezes <= 10){
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++;
        }
        System.out.println("Fora do laço, número de execuções: " + (qtdVezes - 1));

        // Comando DO WHILE - laço pós-testado
        // É executado pelo menos uma vez
        System.out.println("Comando DO WHILE");
        qtdVezes = 11;
        do {
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++;
        } while (qtdVezes <= 10);
        System.out.println("Fora do laço, número de execuções: " + (qtdVezes - 1));

        // Comando FOR
        System.out.println("Comando FOR");
        int qtdVezes1;
        for (qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++){
            System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
        }
        System.out.println("Fora do laço, número de execuções: " + (qtdVezes1 - 1));

        // Forçando parada do laço
        for (int qtdVezes2 = 1; qtdVezes2 <= 10; qtdVezes2++){
            System.out.println("Estou fazendo a " + qtdVezes2 + "ª vez");
            if (qtdVezes2 == 5){
                System.out.println("Parando...");
                break;
            }
        }

        qtdVezes = 1;
        while (qtdVezes <= 10){
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            if (qtdVezes == 5){
                System.out.println("Parando...");
                break;
            }
            qtdVezes++;
        }
    }
}