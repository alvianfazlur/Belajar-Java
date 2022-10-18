public class Rapot{
	public int nilai;
	public String nama;
	public String abjadNilai;

	public Rapot(int nilai, String nama){
		this.nilai = nilai;
		this.nama = nama;
	}
	public void konversiNilai(){
		if(nilai < 60){
			abjadNilai = "D";
		}
		else if(nilai > 60 && nilai <= 70)
			abjadNilai = "C";
		else if(nilai > 70 && nilai <= 80)
			abjadNilai = "B";
		else if(nilai > 80)
			abjadNilai = "A";
	}
}