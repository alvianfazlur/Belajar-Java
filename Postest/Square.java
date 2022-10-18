public class Square{
	public Line[] lines;
	public double area;

	public Square(Line[] lines){
		this.lines = lines;
	}
	public double getArea(){
		area = lines[0].getLength * lines[1].getLength;
		return area;
	}
}