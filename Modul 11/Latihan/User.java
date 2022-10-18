public class User{
	private String id;
	private String phone;
	private String username;
	private String password;
	
	public User(){}
	public User(String username,String password){
		this.username = username;
		this.password = password;
	}
	public boolean login(String username,String password){
		if(username == this.username && password == this.password){
			return true;
		}
		else
			return false;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
}