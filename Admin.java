package gamebook;

import java.time.LocalDate;
import java.util.Hashtable;

public class Admin extends Person{

	private String username;
	
	private static Hashtable<Game,Admin> creationList = new Hashtable<>();
	
	public Admin(String username, String name, String surname, String email, LocalDate dateOfBirth, String nationality, String password) {
		super(name, surname, email, dateOfBirth, nationality, password);
		// TODO Auto-generated constructor stub
		this.setUsername(username);
	}
	
	public Admin(String username, String name, String surname, String email, LocalDate dateOfBirth, String password) {
		super(name, surname, email, dateOfBirth, password);
		// TODO Auto-generated constructor stub
		this.setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void moderate(Review r, Game g)	// (?)
	{
		// remove review r from game g
	}

	public int createGame(int year, String info, String type)
	{
		Game e = new Game(year, info, 0, type);
		if(Game.addGame(e)==0)
		{
			creationList.put(e, this);
			return 0;
		}
		else
			return -1;
	}
}
