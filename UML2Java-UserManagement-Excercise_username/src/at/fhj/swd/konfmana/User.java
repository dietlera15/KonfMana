package at.fhj.swd.konfmana;

public class User extends Entity {

	private String username;
	private String password;
	private Group group;
	
	public User(int id, String username, String password)
	{
		
	}
		
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password; //Exception einbauen
	}
	
	
	public Group getGroup(){
		return group;
	}
	
	public void setGroup(Group group){
			this.group = group;
	}
	

	public String toString(String stringConverter){
		return stringConverter;
	}
	
}
