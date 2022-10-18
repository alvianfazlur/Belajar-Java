public class KartuATM{
	private double saldo = 5000000;

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public void ambilUang(){
		System.out.print("Rp " + saldo);
	}
}