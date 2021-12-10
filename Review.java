package gamebook;

public class Review {

	private String text;
	// stars
	private int score;
	// like or not
	private boolean status;
	
	public Review(String text, int score, boolean status) {
		this.setScore(score);
		this.setText(text);
		this.setStatus(status);
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void makeLike()
	{
		this.setStatus(true);
	}
	
	public void makeDislike()
	{
		this.setStatus(false);
	}
	
}
