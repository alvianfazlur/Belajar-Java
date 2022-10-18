public class BilanganGenap{
	public static void main(String args[]){
		for(int i=2;i<=20;i +=2){
			if(i==6 || i==12 || i==18) continue;
			System.out.println("" + i);
		}
	}
}