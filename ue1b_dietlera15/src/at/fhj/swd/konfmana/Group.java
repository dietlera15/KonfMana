package at.fhj.swd.konfmana;

import java.util.ArrayList;

public class Group extends Entity{

	private String name;
	private ArrayList<User> userlist = new ArrayList<User>();
	
	public Group (int id, String name){
		super.setId(id);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addUser(User user) {
		userlist.add(user);
	}
	
	public ArrayList<User> getUsers() {
		return userlist;
	}
	
}
