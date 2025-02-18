package exercicios.ex002;

public class MainEx002 {
    public static void main(String[] args) {
        
        Client clientUm = new Client("João", 25, 
        new Endereco("Via Rua", "32", "Primeira Etapa", "62357-453", "Salvador"));

        System.out.println(clientUm.toString());
    }
}
