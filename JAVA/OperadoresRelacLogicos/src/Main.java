public class Main {
    public static void main(String[] args) {
        // Operadores Relacionais
        // < > >= <= != ==

        int num1, num2;

        // Testando uma igualdade
        num1 = 10;
        num2 = 10;
        if (num1 == num2){
            System.out.println("Número 1 e número 2 são iguais");
        }

        // Testando uma desigualdade
        num1 = 35;
        num2 = 10;
        if (num1 != num2){
            System.out.println("Número 1 e número 2 são diferentes");
        }

        // Testando maior
        num1 = 10;
        num2 = 35;
        if (num1 > num2){
            System.out.println("Número 1 é maior que número 2");
        } else {
            System.out.println("Número 2 é maior que número 1");
        }

        // Testando menor
        num1 = 5;
        num2 = 10;
        if (num1 < num2){
            System.out.println("Número 1 é menor que número 2");
        }

        // Testando maior ou igual
        num1 = 10;
        num2 = 10;
        if (num1 >= num2){
            System.out.println("Número 1 é maior ou igual a número 2");
        }

        // Testando menor ou igual
        num1 = 4;
        num2 = 10;
        if (num1 <= num2){
            System.out.println("Número 1 é menor ou igual a número 2");
        }

        // Operadores lógicos
        // && = e / AND
        // || = ou / OR
        num1 = 10;
        num2 = 5;
        int num3 = 20, num4 = 5;

        if ((num1 > num3) && (num2 == num4)) {
            System.out.println("Primeira condição satisfeita");
        } else {
            System.out.println("Segunda condição satisfeita");
        }

        if ((num1 > num3) || (num2 == num4)) {
            System.out.println("Primeira condição satisfeita");
        } else {
            System.out.println("Segunda condição satisfeita");
        }
    }
}