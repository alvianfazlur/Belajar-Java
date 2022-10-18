public class Truk{
	private double muatan;
	private double muatanmaks;

	public Truk(double beratmaks){
		this.muatanmaks = beratmaks;
	}
	public double getMuatan(){
		return this.newtsToKilo(this.muatan);
	}
	public double getMuatanMaks(){
		return muatanmaks;
	}
	public boolean tambahMuatan(double berat){
		this.muatan += this.kiloToNewts(berat);
        	if (this.muatan < this.kiloToNewts(muatanmaks))
            		return true;
        	else {
           		this.muatan -= this.kiloToNewts(berat);
            		return false;
		}
        
	}
	public double newtsToKilo(double berat){
		return berat / 9.8;
	}
	public double kiloToNewts(double berat){
		return berat * 9.8;
	}
}