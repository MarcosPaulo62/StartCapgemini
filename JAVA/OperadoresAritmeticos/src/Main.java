public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = 30;
        num2 = 10;

        // Soma
        num3 = num1 + num2;
        System.out.println("O resultado da soma é: " + num3);

        // Subtração
        num3 = num1 - num2;
        System.out.println("O resultado da subtração é: " + num3);

        // Multiplicação
        num3 = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + num3);

        // Divisão
        num3 = num1 / num2;
        System.out.println("O resultado da divisão é: " + num3);

        System.out.println("=======================================");
        // Incrementando (somando de 1 em 1)
        num1 = 0;
        while (num1 <= 10) {
            System.out.println(num1);
            num1++;
        }

        System.out.println("=======================================");
        // Decrementando (subtraindo de 1 em 1)
        num1 = 10;
        while (num1 >= 0) {
            System.out.println(num1);
            num1--;
        }
    }
}