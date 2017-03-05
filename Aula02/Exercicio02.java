public class Exercicio02{
	public static void main(int i){
		System.out.println("Digite um número inteiro");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero >= 0){
			System.out.println("O numero " + numero + " é positivo");
		}else{
			System.out.println("O numero " + numero + " é negativo");
		}

		if(numero %2 == 0){
			System.out.println("O numero " + numero + " é par");
		}else{
			System.out.println("O numero " + numero + " é impar");
		}

		/*System.out.println("Imprimindo o conteudo de args");

		for(String a: args){
			System.out.println("VALOR DE A " + a);
		}*/
	}

	public static void main(String[]args){
		Exercicio02.main(10);
	}
}