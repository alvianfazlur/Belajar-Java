public class Main{
	public static void main(String args[]){
		Point titikA = new Point(0,0,0);
		Point titikB = new Point(0,0,5);
		Point titikC = new Point(0,5,5);
		Point titikD = new Point(0,5,0);
		Point titikE = new Point(5,0,0);
		Point titikF = new Point(5,0,5);
		Point titikG = new Point(5,5,5);
		Point titikH = new Point(5,5,0);
		
		Line lineAB = new Line(titikA,titikB);
		Line lineBC = new Line(titikB,titikC);
		Line lineCD = new Line(titikC,titikD);
		Line lineDA = new Line(titikD,titikA);
		Line lineEF = new Line(titikE,titikF);
		Line lineFG = new Line(titikF,titikG);
		Line lineGH = new Line(titikG,titikH);
		Line lineHE = new Line(titikH,titikE);
		Line lineAE = new Line(titikA,titikE);
		Line lineBF = new Line(titikB,titikF);
		Line lineCG = new Line(titikC,titikG);
		Line lineDH = new Line(titikD,titikH);

		Line[] garisABCD = {lineAB, lineBC, lineCD, lineDA};
		Line[] garisEFGH = {lineAB, lineBC, lineCD, lineDA};
		Line[] garisABFE = {lineAB, lineBC, lineCD, lineDA};
		Line[] garisBCGF = {lineAB, lineBC, lineCD, lineDA};
		Line[] garisCDHG = {lineAB, lineBC, lineCD, lineDA};
		Line[] garisDAEH = {lineAB, lineBC, lineCD, lineDA};

		Square kotakABCD = new Square(garisABCD);
		Square kotakEFGH = new Square(garisEFGH);
		Square kotakABFE = new Square(garisABFE);
		Square kotakBCGF = new Square(garisBCGF);
		Square kotakCDHG = new Square(garisCDHG);
		Square kotakDAEH = new Square(garisDAEH);
		
		Square[] squares = {
				kotakABCD ,
				kotakEFGH ,
				kotakABFE ,
				kotakBCGF ,
				kotakCDHG ,
				kotakDAEH 
				};
		Cube kubus = new Cube(squares);
		double volume = kubus.getVolume();
		System.out.println("Volume = "+ volume); 
		
		
	}
}