import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o Saldo disponível: ");
        double saldo = scanner.nextDouble();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);


        System.out.println("Ola " + conta.getNomeCliente() +", Obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para o saque.");
       
        scanner.close();
    }
}
 class ContaBanco{
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo){

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public double getSaldo(){
        return saldo;
    }

}


