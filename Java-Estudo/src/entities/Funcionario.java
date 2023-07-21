package entities;

public class Funcionario {
	public String nome;
	public double grossSalary;
	public double tax;
	
	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary/100) * percentage;
	}
	public double netSalary() {
		return grossSalary - tax;
	}
	public String apresent() {
		return nome 
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
