package gamebook;

import java.time.LocalDate;
import java.util.ArrayList;

public class User extends Person{
	
	private String username;
	private ArrayList<User> follower;
	private ArrayList<User> following;
	private ArrayList<Review> reviews;
	
	public User(String username, String name, String surname, String email, LocalDate dateOfBirth, String password) {
		super(name, surname, email, dateOfBirth, password);
		this.setUsername(username);
		this.setReviews();
		this.setFollower();
		this.setFollowing();
	}
	
	public User(String username, String name, String surname, String email, LocalDate dateOfBirth, String nationality, String password) {
		this(username,name,surname,email,dateOfBirth,password);
		this.setNationality(nationality);
	}
		
	public int editAccount(String username)
	{
		// check if the syntax is correct
		this.setUsername(username);
		return 0;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setFollower()
	{
		this.follower = new ArrayList<User>();
	}
	
	public ArrayList<User> getFollower()
	{
		return this.follower;
	}
	
	public void setFollowing()
	{
		this.following = new ArrayList<User>();
	}
	
	public ArrayList<User> getFollowing() {
		return following;
	}
	
	public void setReviews()
	{
		this.reviews = new ArrayList<Review>();
	}

	public ArrayList<Review> getReviews() {
		return reviews;
	}

	public void Unfollow(User b)
	{		
		if(this.following.contains(b))
			this.following.remove(b);
	}
	
	public void logOut()
	{
		// logout
	}
	
	public void follow(User b)
	{
		if(!this.following.contains(b))
			this.following.add(b);
	}
	
	public Review writeReview(String text, int score, boolean status)
	{		
		Review e = new Review(text, score, status);
		this.reviews.add(e);
		return e;
	}

}
