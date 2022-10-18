public class MesinATM{
	private String id;

	public MesinATM(){}
	public void ambilUang(KartuATM card){
		System.out.print("Anda dapat mengambil uang hingga ");
		card.ambilUang();
		System.out.println("");
	}
}