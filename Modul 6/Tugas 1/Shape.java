public class Shape{
	public double length;
	public double width;
	public double height;
	public double volume;

	public Shape(double length,double width,double height){
		this.length = length;
		this.width = width;
		this.height =height;
	}
	public double compareTo(Shape shape){
		return volume - shape.calculateVolume();	
	}
	public double calculateVolume(){
		volume = length*width*height;
		return volume;
		
	}
	public void cetak(){
		System.out.println("Panjangxlebarxtinggi="+length+"x"+width+"x"+height);
		System.out.println("Volume=" + calculateVolume());
	}
}