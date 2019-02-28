package operacoes;

public class Conta {

	private int numeroConta;
	private String titularConta;
	private double saldoConta;

	public Conta(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	public Conta(int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta += depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void realizarDeposito(double valorDeposito) {
		this.saldoConta += valorDeposito;
	}

	public void realizarSaque(double valorSaque) {
		this.saldoConta -= (valorSaque + 5);
	}
	
	public String toString()
	{
		return "Dados da Conta: \n"
			  +"Número da Conta: "
			  + numeroConta
			  + ", Titular da Conta: "
			  + titularConta
			  + ", Saldo: R$"
			  + String.format("%.2f",saldoConta)
			  +"\n";
		
	}
}
