public class Main {
    public static void main(String[] args) {
        // IF
        int num1 = 10, num2 = 30;
        if (num1 < num2){
            System.out.println("If normal - Número 1 é menor que número 2");
        }

        if (num1 > num2){
            System.out.println("If com else - Número 1 é maior que número 2");
        } else {
            System.out.println("If com else - Número 1 é menor que número 2");
        }

        // Condição composta - situação num1 < num2
        if (num1 > num2){
            System.out.println("If com else if 1 - Número 1 é maior que número 2");
        } else if (num1 < num2){
            System.out.println("If com else if 1 - Número 1 é menor que número 2");
        } else {
            System.out.println("If com else if 1 - Número 1 é igual a número 2");
        }

        // Condição composta - situação num1 == num2
        num1 = num2;
        if (num1 > num2){
            System.out.println("If com else if 2 - Número 1 é maior que número 2");
        } else if (num1 < num2){
            System.out.println("If com else if 2 - Número 1 é menor que número 2");
        } else {
            System.out.println("If com else if 2 - Número 1 é igual a número 2");
        }

        // Comando condicional SWITCH
        char opcao = '3';
        switch (opcao){
            case '1': {
                System.out.println("Chame programa de Inclusão");
                break;
            }
            case '2': {
                System.out.println("Chame programa de Alteração");
                break;
            }
            case '3': {
                System.out.println("Chame programa de Exclusão");
                break;
            }
            case '4': {
                System.out.println("Chame programa de Consulta");
                break;
            }
            default: {
                throw new IllegalArgumentException("Opção Inválida: " + opcao + " Redigite");
            }
        }
    }
}