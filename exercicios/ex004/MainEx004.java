package exercicios.ex004;

public class MainEx004 {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario("1", "João", "Rua Via", "7112345678", "joaozinho@email.com",
            new ContaBancaria("Banco do Brasil", "1", "50", "Corrente", 5000, 2000));

        System.out.println(funcionarioUm.toString());
    }
}
