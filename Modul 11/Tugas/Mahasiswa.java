public class Mahasiswa extends User{
	private Dosen dosenWali;
	private String kelas;
	
	public Mahasiswa(){
		super("fadilah","123456");
	}
	public Mahasiswa(String username,String password){
		super(username,password);
	}
	public boolean login(String username,String password){
		if(super.login(username,password)){
			return true;
		}
		else
			return false;
	}
}