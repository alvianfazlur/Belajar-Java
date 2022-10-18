import java.util.Scanner;

public class Faktorial{
	public static void main(String args[]){
		int hasil=1;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Masukkan Bilangan Faktorial:");
		int batas = myObj.nextInt();
		for(int i = 1;i<=batas;i++){
			System.out.print("" + i +"!");
			hasil *= i;
			System.out.print("    " + hasil);
			System.out.println("");
		}
	}
}