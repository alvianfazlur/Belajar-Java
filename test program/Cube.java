public class Cube{
	public Square[] squares;
	public double volume;
	
	public Cube(Square[] squares){
		this.squares = squares;
	}
	
	public double getVolume(){
		this.volume = squares[0].lines[0].getLength()*
				squares[0].lines[0].getLength()*
				squares[0].lines[0].getLength();
		return this.volume;
	}
}