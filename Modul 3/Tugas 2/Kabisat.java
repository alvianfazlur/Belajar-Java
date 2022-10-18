import java.util.Scanner;

public class Kabisat{
public static void main(String args[]){
	System.out.print("Masukkan Tahun (1900 - 2005): ");
	Scanner myObj = new Scanner(System.in);
	int tahun = myObj.nextInt();
	if(tahun > 1900 && tahun < 2005){
		if(tahun % 4 == 0){
			System.out.print(tahun + " Merupakan Tahun Kabisat");
		}
		else{
			System.out.print(tahun + " Bukan Tahun Kabisat");
		}
	}
	else{
		System.out.println("Diluar Jangkauan");
	}
}
}