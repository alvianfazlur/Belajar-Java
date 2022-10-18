public class Dosen extends User{
	private String pangkat;
	private String golongan;
	private String key="19990129";

	public Dosen(){}
	public Dosen(String username,String password){
		super(username,password);
	}
	public boolean login(String username,String password){
		if(super.login(username,password)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean login(String username,String password,String key){
		if(super.login(username,password) && key == this.key){
			return true;
		}
		else{
			return false;
		}
	}
	
}