public class Fans{
	private String name;
	public Fans(){
		name = "noname";
	}
	public Fans(String name){
		this.name = name;
	}
	public void showName(){
		System.out.print(name + " : ");
	}
	public void watchingPerformance(){
		System.out.println(this.name +" : " + "Melihat idolanya dari youtube");
	}
	public void watchingPerformance(Musician musician){
		showName();
		System.out.print("Melihat idolanya ");
		musician.perform();
		System.out.println("");
	}
}