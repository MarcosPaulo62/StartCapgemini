public class Main {
    public static void main(String[] args) {
        Fisica fis = new Fisica();
        fis.nome = "João";
        fis.cpf = "11111111111";
        fis.identidade = "1234567890";
        fis.situacaoPessoa = "A";

        Juridica jur = new Juridica();
        jur.nome = "CASAS BAHIA";
        jur.cnpj = "222222222222";
        jur.inscEstadual = "234223212";
        jur.situacaoPessoa = "I";

        System.out.println("Dados da Pessoa Física:");
        System.out.println(fis.toString());

        System.out.println("Dados da Pessoa Jurídica: ");
        System.out.println(jur.toString());
    }
}