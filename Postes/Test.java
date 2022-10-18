public class Test1{
	public  static void main(String args[]){
		MesinATM.ambilUang(new KartuATM());
		MesinATM.ambilUang(new KartuSilver());
		MesinATM.ambilUang(new KartuGold());
		MesinATM.ambilUang(new KartuPlatinum());
	}
}