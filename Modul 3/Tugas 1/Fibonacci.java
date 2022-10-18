import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		int awal = 1;
		int bil1 = 0;
		int bil2 = 1;
		int hasil;
		System.out.print("Masukkan Deret Fibonacci:");
		Scanner myObj = new Scanner(System.in);
		int batas = myObj.nextInt();
		System.out.print("" + awal);
		for(int i = 0;i<batas;i++){
			hasil = bil1 + bil2;
			System.out.print("  " + hasil);
			bil1 = bil2;
			bil2 = hasil;
	
		}
		
	}
}