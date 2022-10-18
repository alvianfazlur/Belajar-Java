public class Kecebong extends Katak{
	private double panjangEkor;

	public Kecebong(int umur, String nama, double ekor){
		super(umur,nama);
		this.panjangEkor = ekor;
	}
	public double getPanjangEkor(){
		return panjangEkor;
	}
}