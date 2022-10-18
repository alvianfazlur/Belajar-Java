import java.util.Scanner;
public class Cari{
	public static void main(String args[]){
		String kalimat;
		Scanner myObj = new Scanner(System.in);
		System.out.print("Masukkan Kalimat: ");
		kalimat = myObj.nextLine();
		Scanner search = new Scanner(System.in);
		System.out.print("Masukkan kata yang dicari: ");
		String kata = search.nextLine();
		int searchIndex = kalimat.indexOf(kata);
		System.out.print("Terdapat pada index ke" + " ");
		while(searchIndex >= 0){
			System.out.print(searchIndex + ", ");
			searchIndex = kalimat.indexOf(kata,searchIndex+1);	
		}
	}
}