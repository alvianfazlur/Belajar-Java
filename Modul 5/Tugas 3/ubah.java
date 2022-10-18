import java.util.Scanner;
public class ubah{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Masukkan Kalimat: ");
		String kalimat = myObj.nextLine();
		String awal = kalimat.substring(0,1);
		String akhir = kalimat.substring(kalimat.length() - 1,kalimat.length());
		kalimat = kalimat.replace(awal,akhir);
		String changeLastChar = kalimat.substring(0,(kalimat.length()-1));
		kalimat = changeLastChar + awal;
		System.out.println(kalimat);
	}
}