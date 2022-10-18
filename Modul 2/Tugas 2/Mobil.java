public class Mobil{
	public String merk, warna, type;
	public int harga, jumlah;

	public Mobil(String A, String B, String C, int D, int E){
		merk = A;
		warna = B;
		type = C;
		harga = D;
		jumlah = E;
	}
	public void infoMobil() {
		System.out.println("Merk : " + merk + " Warna: " + warna + " Tipe : " + type + " Harga : " + harga + " Jumlah : " + jumlah);
	}
}