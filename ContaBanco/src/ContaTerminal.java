import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Olá, seja Bem Vindo, é um prazer criar a sua conta em nosso banco!");
        System.out.println("");        
        

        System.out.println("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Olá " + nome + "!!! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        System.out.println(" ");


        sc.close();

    }
}
