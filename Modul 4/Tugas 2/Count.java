public class Count{
	public static void main(String args[]){
		int count=0;
		char [ ] matKul = {'p','e','m','r','o','g','r','a','m','a','n','b','e','r','o','r','i','e','n','t','a','s','i','o','b','y','e','k'};
		for(int i=0;i<matKul.length;i++){
			if(matKul[i] == 'a'){
				count++;
			}
		}
		System.out.print("Jumlah Huruf a = " + count);
	}
}