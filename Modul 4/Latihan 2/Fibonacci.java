import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		int bilangan [] = new int[100];
		bilangan[0]=0;
		bilangan[1]=1;
		System.out.print("Masukkan Deret Fibonacci:");
		Scanner myObj = new Scanner(System.in);
		int batas = myObj.nextInt();
		for(int i = 2;i<batas;i++){
			bilangan[i] = bilangan[i-2] + bilangan[i-1];
		}
		for(int i=0;i<batas;i++){
			System.out.print(bilangan[i] + " ");
		}
	}
}