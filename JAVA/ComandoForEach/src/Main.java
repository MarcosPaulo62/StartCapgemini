public class Main {
    public static void main(String[] args) {
        
        int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        // varrendo o vetor sem uso do ForEach
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Nr: " + vetorNumeros[i]);
        }

        // varrendo o vetor com ForEach
        for (int listaNumeros : vetorNumeros) {
            System.out.println("Num: " + listaNumeros);
        }
        
    }
}
