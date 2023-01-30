public class Main {
    public static void main(String[] args) {

        // Instanciando a classe (criando um objeto)
        Pessoa pessoa = new Pessoa();

        // Passando dados pro objeto
        pessoa.setNome("Marcos");
        pessoa.setIdade(19);

        // Chamando método
        System.out.println(pessoa.toString());
    }
}