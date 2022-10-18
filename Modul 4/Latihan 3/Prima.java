import java.util.Scanner;
public class Prima{
	public static void main(String args[]){
		boolean prima = true;
		System.out.println("Masukkan Angka: ");
		Scanner myObj = new Scanner(System.in);
		int angka=myObj.nextInt();
		if(angka < 2){
			prima = false;
		}
		else{
			for(int i=2;i<angka;i++){
				if(angka%i==0){
					prima = false;
					break;
				}
			}
		}
		
		if(prima){
			System.out.println(angka + " MErupakan Bilangan Prima");
		}
		else{
			System.out.println(angka + " Bukan Bilangan Prima");
		}
	}
}