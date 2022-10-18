public class Line{
	public Point firstPoint;
	public Point secondPoint;
	public double length;

	public Line(Point firstPoint,Point secondPoint){
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}
	public double getLength(){
		length = Math.sqrt(
			 Math.pow((secondPoint.coordinateX - firstPoint.coordinateX),2) +
			 Math.pow((secondPoint.coordinateY - firstPoint.coordinateY),2) +
			 Math.pow((secondPoint.coordinateZ - firstPoint.coordinateZ),2)
			);
		return length;
	}
}