package gamebook;

import java.util.ArrayList;
import java.util.Hashtable;

public class Game {
	
	private int publishYear;
	private String info;
	private int score;
	private String type;
	private Hashtable<User,Review> reviews;
	
	private static ArrayList<Game> list = new ArrayList<Game>();
	
	public Game(int publishYear, String info, int score, String type) {
		
		this.publishYear = publishYear;
		this.info = info;
		this.score = score;
		this.type = type;
		this.reviews = new Hashtable<>();
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setReviews()
	{
		this.reviews = new Hashtable<User,Review>();
	}
	
	public Hashtable<User,Review> getReviews()
	{
		return this.reviews;
	}
	
	public static void viewListOfGames()	// ?
	{
		// ????
		// shows the main page (?)
	}
	
	public static int addGame(Game g)
	{
		if(Game.list.contains(g))
			return -1;
		
		Game.list.add(g);
		return 0;
		
	}
	
	public void addReview(User u, Review r)
	{
		this.reviews.put(u, r);
	}

}
