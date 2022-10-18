public class KartuPlatinum extends KartuSilver{
	public void ambilUang(){
		setSaldo(100000000);
		super.ambilUang();
		System.out.print("dan memiliki fasilitas pinjaman");
	}
}