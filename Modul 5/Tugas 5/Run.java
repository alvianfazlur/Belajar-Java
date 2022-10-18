import java.util.Scanner;
public class Run{
	public static void main(String args[]){
		Scanner object = new Scanner(System.in);
		System.out.print("Masukkan Kalimat: ");
		String kalimat = object.nextLine();

		Scanner ganti = new Scanner(System.in);
		System.out.print("Masukkan Kata yang diganti: ");
		String old = ganti.nextLine();

		Scanner pengganti = new Scanner(System.in);
		System.out.print("Masukkan Kata pengganti: ");
		String baru = pengganti.nextLine();

		System.out.println(kalimat.replace(old,baru));
	}
}