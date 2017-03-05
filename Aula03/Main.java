import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta(0.0);
		
		System.out.println("Qual valor você deseja depositar?");
		conta.depositar(sc.nextDouble());
		System.out.println("Qual valor você deseja sacar?");
		conta.sacar(sc.nextDouble());
		System.out.println("Seu extrato de movimentação...");
		System.out.println(conta.extrato());

		/*System.out.println("O que você deseja fazer?");
		System.out.println("1 - DEPOSITAR");
		System.out.println("2 - SACAR");
		System.out.println("3 - EMITIR EXTATO");

		Scanner sc = new Scanner(System.in);

		int opcao = sc.nextInt();

		switch(opcao){
			case 1:
				System.out.println("Qual o valor será depositado?");
				double valor = sc.nextDouble();
				conta.depositar(valor);
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Opção invalida");
		}	*/
	}
}