import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Exibir as mensagens para o nosso usuário e coletar os dados
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Consumir o \n restante da entrada anterior
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        double saldo = 0.0;
        boolean entradaValida = false;

        // Loop para garantir que o saldo seja inserido corretamente
        while (!entradaValida) {
            System.out.println("Por favor, digite o saldo:");
            try {
                saldo = scanner.nextDouble();
                entradaValida = true;  // Entrada válida, sai do loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de usar um número decimal válido (por exemplo: 237,48).");
                scanner.next(); // Limpar a entrada inválida
            }
        }

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner
        scanner.close();
    }
}
