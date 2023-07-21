package entities;

public class ContaBancaria {
	private int numConta;
	private String titularConta;
	private double valorConta;
	
	//construtores: 
	public ContaBancaria(int numConta, String titularConta, double initialDeposit) {
		this.numConta = numConta;
		this.titularConta = titularConta;
		deposito(initialDeposit);
	}
	
	public ContaBancaria(int numConta, String titularConta) {
		this.numConta = numConta;
		this.titularConta = titularConta;
	
	}
	
	//getts e setts
	public String getTitularConta() {
		return titularConta;
	}
	
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	//funções principais: 
	
	public void deposito(double valor) {
		valorConta += valor;
	}
	
	public void saque(double valor) {
		valorConta -= (valor + 5);
	}
	
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ titularConta
				+ ", Balance: $  "
				+ String.format("%.2f", valorConta);
	}
	
}
