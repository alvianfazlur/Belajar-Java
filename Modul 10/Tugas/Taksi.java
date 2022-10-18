public class Taksi extends Mobil{
	protected int tarifAwal;
	protected int tarifPerKm;

	public void setTarifAwal(int tarif){
		tarifAwal = tarif;
	}
	public int getTarifAwal(){
		return tarifAwal;
	}
	public void setTarifPerKm(int tarif){
		tarifPerKm = tarif;
	}
	public int getTarifPerKm(){
		return tarifPerKm;
	}
}