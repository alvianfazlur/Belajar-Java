public class Kalender{
	private int tanggal=1;
	private int bulan=1;
	private int tahun=2000;

	public Kalender(int tanggal){
		this.tanggal = tanggal;
	}
	public Kalender(int bulan, int tahun){
		this.bulan = bulan;
		this.tahun = tahun;	
	}
	public Kalender(int tanggal,int bulan, int tahun){
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}
	public int getTanggal(){
		return tanggal;
	}
	public int getBulan(){
		return bulan;
	}
	public int getTahun(){
		return tahun;
	}
	public void setTanggal(int tanggal){
		if(tanggal <= 31){
			this.tanggal = tanggal;	
		}
		else{
			System.out.println("Error");
		}
		
	}
	public void setBulan(int bulan){
		if(bulan <= 12){
			this.bulan = bulan;	
		}
		else{
			System.out.println("Error");
		}
	}
	public void setTahun(int tahun){
		this.tahun = tahun;
	}
}