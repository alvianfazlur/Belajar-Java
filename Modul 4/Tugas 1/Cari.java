import java.util.Scanner;
public class Cari{
	public static void main(String args[]){
		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
					{ 622, 127, 77, 955 }};
		System.out.println("Masukkan Angka yang dicari: ");
		Scanner myObj = new Scanner(System.in);
		int angka = myObj.nextInt();
		for(int i=0;i<arrayOfInts.length;i++){
			for(int j=0;j<arrayOfInts[0].length;j++){
				if(angka == arrayOfInts[i][j]){
					System.out.println("Found " + angka + " at " + i + "," + j);
					break;
				}
			}	
		}
	}
}