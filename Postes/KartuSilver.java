public class KartuSilver extends KartuATM{
	public void ambilUang(){
		super.ambilUang();
		setSaldo(10000000);
		System.out.print(" per hari ");
	}
}