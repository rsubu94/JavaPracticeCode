package com.practice.polymorphism;


class Movie { 
	
	private String movieName;

	public Movie(String movieName) {
		super();
		this.movieName = movieName;
	}
	
	public String Plot() {
		return "No plot here";
	}
	
	public String getMovieName() {
		return this.movieName;
	}
}


class Jaws extends Movie{
	
	public Jaws() {
		super("Kaws");
	}
	
	public String Plot() {
		return "A Shark eats lots of people";
	}
}

class Got extends Movie{
	
	public Got() {
		super("GOT");
	}
	
	public String Plot() {
		return "Kings and White Walkers";
	}
}

class Guest extends Movie{
	
	public Guest() {
		super("Guest");
	}
	//No plot Method - Nor overridden
	
}



public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<20;i++) {
			Movie movie =returnMovieName();
			System.out.println(movie.Plot()+"..............."+movie.getMovieName());
		}
		

	}
	public static Movie returnMovieName() {
		
		int randomNumber = (int) (Math.random() * 3)+1;
		
		System.out.println("Random Number has been generated "+randomNumber);
//		Movie movie = null;
		switch(randomNumber) {
		case 1 :
			return new Jaws();
		case 2 :
			return new Got();
		case 3:
			return new Guest();
		default :
			
		}
		return null;
	}
}
