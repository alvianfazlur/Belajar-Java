public class Sup extends Base{
	public static void main(String argv[]){
		Sup s= new Sup();
		s.derived();
	}
	Sup(){
	// baris 2
	}
	public void derived(){
		Base base = new Base(1);
	}
}