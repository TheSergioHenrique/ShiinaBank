public class Conta {
	double saldo =0 ;
	int agencia=42 ;
	int numero=0 ;
	String titular;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else{
			System.out.println("O saldo na conta é insuficiente para esta transação!");
			return false;
		}
	}
}
