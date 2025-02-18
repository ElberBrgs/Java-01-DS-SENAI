package exercicios.ex003;

public class MainEx003 {
    public static void main(String[] args) {
        
        Cliente clienteUm = new Cliente("João", 22,
            new Pet("Bob", 5, "Akita Inu"));

        System.out.println(clienteUm.toString());

    }
}
