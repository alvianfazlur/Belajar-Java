public class Katak{
	private int umur;
	private String nama;
	private String gerak;
	public Katak(int umur, String nama){
		this.umur = umur;
		this.nama = nama;
	}
	public String caraBergerak(){
		return gerak;
	}
	public String getNama(){
		return nama;
	}
	public int getUmur(){
		return umur;
	}
	public void setGerak(String gerak){
		this.gerak = gerak;
	}
}