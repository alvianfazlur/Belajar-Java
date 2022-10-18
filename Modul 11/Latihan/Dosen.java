public class Dosen extends User{
	private String pangkat;
	private String golongan;
	private String key;

	public Dosen(){}
	public Dosen(String username,String password){
		super(username,password);
	}
	public void setKey(String key){
		this.key = key;
	}
	public boolean login(String username,String password){
		if(username == getUsername() && password == getPassword()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean login(String username,String password,String key){
		if(username == getUsername() && password == getPassword() && key == this.key){
			return true;
		}
		else{
			return false;
		}
	}
	
}