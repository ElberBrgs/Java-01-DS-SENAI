package exercicios.ex001;

public class MainEx001 {
    public static void main(String[] args) {
        Veiculo veiculoUm = new Veiculo();

        veiculoUm.setPlaca("AAA-1234");
        veiculoUm.setCor("Preto");
        veiculoUm.setNumeroPassageiros(5);
        veiculoUm.setCapTanque(100);
        veiculoUm.setVelMax(220);
        veiculoUm.setConsumoMedio(11);

        System.out.println(veiculoUm.toString());

        Cliente clienteUm = new Cliente();

        clienteUm.setNome("João");
        clienteUm.setIdade(25);
        clienteUm.setCpf("123.456.789-00");
        clienteUm.setEndereco("Via Rua Alameda");
        clienteUm.setTelefone("(71)9 1234-5678");

        System.out.println(clienteUm.toString());

    }
}
