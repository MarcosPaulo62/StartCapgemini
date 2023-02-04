public class Main {
    public static void main(String[] args) {
        // Um tipo primitivo não pode ser transformado em objeto sem usar
        // as classes Wrapper
        // Autoboxing - exemplos

        Boolean bolWrapped = true;
        System.out.println(bolWrapped.getClass());

        Character chWrapped = 'a';
        System.out.println(chWrapped.getClass());

        Byte byteWrapped = 1;
        System.out.println(byteWrapped.getClass());

        Short shortWrapped = 'B';
        System.out.println(shortWrapped.getClass());

        Integer intWrapped = 543;
        System.out.println(intWrapped.getClass());

        Long longWrapped = 3452132432L;
        System.out.println(longWrapped.getClass());

        Float floatWrapped = 3.231431f;
        System.out.println(floatWrapped.getClass());

        Double doubleWrapped = 3.231431;
        System.out.println(doubleWrapped.getClass());

        int numero = Integer.parseInt("1");
        numero += 9;
        System.out.println(numero);
    }
}
