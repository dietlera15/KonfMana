package at.fhj.swd.konfmana;


import java.util.ArrayList;
import java.util.List;

public class Group extends Entity {

	
	private String name;

	private List<User> users = new ArrayList<User>();

	public Group(int i, String string)
	{
		
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addUser(User username){
		users.add(username);
	}

	public List<User> getUsers(){
		return users;
	}	
}
