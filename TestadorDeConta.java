
public class testadorDeConta {

	public static void main(String[] args) {
		Conta contaDaShiina = new Conta();
		contaDaShiina.saldo += 500;
		Conta contaDaDenise = new Conta();
		
		
		System.out.println("Isso é o saldo de Shiina antes " + contaDaShiina.saldo);
		System.out.println("Isso é o saldo da Denise antes " + contaDaDenise.saldo);
		
		contaDaShiina.transfere(240, contaDaDenise);
		
		System.out.println("Isso é o saldo de Shiina depois da operação " + contaDaShiina.saldo);
		System.out.println("Isso é o saldo da Denise depoiis " + contaDaDenise.saldo);
	}

}
