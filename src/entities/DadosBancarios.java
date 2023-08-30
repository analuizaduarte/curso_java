package entities;

public class DadosBancarios {
	private String name;
	private int conta;
	private double saldo;

	public DadosBancarios(String name, int conta, double saldo) {
		this.name = name;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public DadosBancarios(String name, int conta) {
		this.name = name;
		this.conta = conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConta() {
		return conta;
	}

	public double getValorInicial() {
		return saldo;
	}

	public void setValorInicial(double saldo) {
		this.saldo = saldo;
	}

	public double deposito(double deposito) {
		return this.saldo += deposito;
	}
	
	public double saque(double saque) {
		return this.saldo -= saque + 5; 
	}
	
	public String toString() {
		return "Account "
			   +conta
			   +", Holder: "
			   +name
			   +", Balance: $"
			   +String.format("%.2f",saldo);
	}
}
