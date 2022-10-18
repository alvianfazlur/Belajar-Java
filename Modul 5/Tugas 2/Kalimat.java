public class Kalimat{
	String kalimat;
	
	public Kalimat(String Sentence){
		kalimat = Sentence;
	}
	public void Kapital(){
		String up = kalimat.toUpperCase();
		System.out.println(up);
	}
	public void kecil(){
		String down = kalimat.toLowerCase();
		System.out.println(down);
	}
	public void panjang(){
		System.out.println(kalimat.length());
	}
	public void cariIndex(){
		int index = kalimat.indexOf("PENS");
		System.out.print(index);
	}
}