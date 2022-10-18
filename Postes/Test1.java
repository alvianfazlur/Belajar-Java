public class Test1{
	public  static void main(String args[]){
		MesinATM mesinATM = new MesinATM();

		mesinATM.ambilUang(new KartuATM());
		mesinATM.ambilUang(new KartuSilver());
		mesinATM.ambilUang(new KartuGold());
		mesinATM.ambilUang(new KartuPlatinum());
	}
}