public class MainCliente {
    public static void main(String[] args) {

        //Com método assessor.
        Cliente clienteUm = new Cliente();

        clienteUm.setNome("João");
        clienteUm.setEmail("jaozinho@email.com");
        clienteUm.setSenha("123");

        System.out.println("Nome: "+clienteUm.getNome());
        System.out.println("E-mail: "+clienteUm.getEmail());
        System.out.println("Senha: "+clienteUm.getSenha());

        //Com construtor.
        Cliente clienteDois = new Cliente("Maria","mariazinha@email.com","321");

        System.out.println(clienteDois.toString());


    }
}
