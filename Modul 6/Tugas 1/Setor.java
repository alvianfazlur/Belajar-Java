public class Setor{
	public int jumlahBarang;
	public String jenisBarang;
	public String namaBarang;

	public Setor(int jumlahBarang, String jenisBarang, String namaBarang){
		this.jumlahBarang = jumlahBarang;
		this.jenisBarang = jenisBarang;
		this.namaBarang = namaBarang;
	}
	public void tambahBarang(int jumlahBarang){
		this.jumlahBarang += jumlahBarang;
	}
	public String getNamaBarang(){
		return namaBarang;
	}
	public int getHargaTotal(int hargaSatuan){
		return hargaSatuan*jumlahBarang;
	}
}