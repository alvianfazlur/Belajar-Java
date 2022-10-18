import java.util.Scanner;
public class tukar{
	public static void main(String args[]){
		Scanner object1 = new Scanner(System.in);
		System.out.print("Masukkan Kalimat 1: ");
		String kal1 = object1.nextLine();
		Scanner object2 = new Scanner(System.in);
		System.out.print("Masukkan Kalimat 2: ");
		String kal2 = object2.nextLine();
		String familyname1 = kal1.substring((kal1.indexOf(" ")),kal1.length());
		String familyname2 = kal2.substring((kal2.indexOf(" ")),kal2.length());
		System.out.println(kal1.replace(familyname1,familyname2));
		System.out.println(kal2.replace(familyname2,familyname1));
	}
}