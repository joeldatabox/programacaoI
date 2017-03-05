import java.util.Scanner;
public class Conta {
	String donoDaConta;
	String numeroDaConta;
	double saldo;
	String extrato;

	public Conta(double saldoInicial){
		donoDaConta = "";
		numeroDaConta = "";
		saldo = saldoInicial;
		extrato = "";
	}

	boolean depositar(double valor){
		if(valor <= 0){
			System.out.println("valor invalido");
			extrato += "\nvalor invalido";
			return false;
		}
		saldo = saldo+valor;
		extrato += "\nvalor depositado foi de "+valor;
		return true;
		//saldo += valor;
	}

	/**
	*Este método realiza um saque 
	*@author Joel Rodrigues Moreira
	*@param sacar -> o valor que será retirado
	*/
	double sacar(double sacar){
		if(sacar <= saldo){
			saldo = saldo - sacar;
			//saldo -= sacar;
			extrato += "\nFoi sacado o valor de " + sacar;
			return sacar;
		}else{
			System.out.println("Você não possui saldo para a operação!");
			extrato += "\nVocê não tem saldo para sacar o valor de " + sacar + " o seu saldo atual é de " + saldo;
			return 0.0;
		}
	}

	String extrato(){
		String extrato = this.extrato;
		return extrato +="\nSaldo atual "+ this.saldo;
	}	
}
