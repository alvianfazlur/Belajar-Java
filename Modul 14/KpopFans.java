public class KpopFans extends Fans{
	public KpopFans(){	}
	public KpopFans(String name){
		super(name);
	}
	public void watchingPerformance(Musician musician,String expression){
		super.showName();
		System.out.print(expression + " Melihat idolanya");
		musician.perform();
	}
}