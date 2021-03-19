package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int rating;
	private String review;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Game(String name, int rating, String review) {
		super();
		this.name = name;
		this.rating = rating;
		this.review = review;
	}

	public Game(long id, String name, int rating, String review) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.review = review;
	}

	public Game(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", rating=" + rating + ", review=" + review + "]";
	}
	
}
