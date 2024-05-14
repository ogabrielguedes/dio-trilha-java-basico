import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        String ag;
        String clientName;
        float balance;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número ");

        number = scan.nextInt();

        System.out.println("Por favor digite o nome do cliente");

        clientName = scan.next();

        System.out.println("Por favor digite o numero da agencia");

        ag = scan.next();

        System.out.println("Por favor digite o saldo");

        balance = scan.nextFloat();

        ContaTerminal NovaConta = new ContaTerminal(number,ag,clientName,balance);

        System.out.println(NovaConta.toString());
        
    }
    
}
