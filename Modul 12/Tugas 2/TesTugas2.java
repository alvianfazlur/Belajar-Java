public class TesTugas2{
	public static void main(String args[]){
		Katak O1 = new Katak(5,"Froggy");
		O1.setGerak("Melompat");
		Kecebong O2 = new Kecebong(2,"Junior Frog",10);
		O2.setGerak("Berenang");
		System.out.println("Obyek" + "\t" + "Umur" + "\t" + "Nama" + "\t\t" + "Panjang Ekor" + "\t" + "Cara Bergerak");
		System.out.println("O1" + "\t" + O1.getUmur() + "\t" + O1.getNama() + "\t" + "\t\t" + "\t" + O1.caraBergerak());
		System.out.println("O2" + "\t" + O2.getUmur() + "\t" + O2.getNama() + "\t" + O2.getPanjangEkor() + "\t\t" + O2.caraBergerak());
	}
}