public class KartuGold extends KartuSilver{
	public void ambilUang(){
		setSaldo(50000000);
		super.ambilUang();
		System.out.print("dan setor tunai 50.000.000 per hari");
	}
}