	//1. Instantiate some Movie objects (at least 5).
    //2. Use the methods in the Movie object to print the name and rating of your favorite.
    //3. Instantiate a NetflixQueue.
    //4. Add your movies to the Netflix queue.
    //5. Print all the movies in your queue.
    //6. Use your NetflixQueue object to finish the sentence "the best movie is...."
    //7. Use your NetflixQueue to finish the sentence "the second best movie is...." 

public class Netflix {
	
	Movie m2 = new Movie("The Matrix", 5);
	Movie m3 = new Movie("RV", 1);
	Movie m4 = new Movie("Bend it Like Beckham", 3);
	Movie m5 = new Movie("Chicago",4);
	Movie m1 = new Movie("Gravity", 2);
	
	Movie bestMovie;
	
	public static void main(String[] args) {
		Netflix n1 = new Netflix();
		n1.movieSorter();
		n1.netflixChooser();
	}

	public void movieSorter() {		
		int diff = m1.compareTo(m2);
		System.out.println(diff);
		if (diff < 0) {
			bestMovie = m1;
		}
		else {
			bestMovie = m2;
		}
		diff = bestMovie.compareTo(m3);
		System.out.println(diff);
		if (diff < 0) {	}
		else {
			bestMovie = m3;
		}	
		diff = bestMovie.compareTo(m4);
		System.out.println(diff);
		if (diff < 0) {	}
		else {
			bestMovie = m4;
		}	
		diff = bestMovie.compareTo(m5);
		System.out.println(diff);
		if (diff < 0) {}
		else {
			bestMovie = m5;
		}	
		String title = bestMovie.getTitle();
		int rating = bestMovie.getRating();
		System.out.println("The best movie is "+ title+ ". It's rating is "+rating);
		
		String info = bestMovie.toString();
		System.out.println("The best move is "+info+".");
	}
	
	public void netflixChooser() {
		NetflixQueue nfq1 = new NetflixQueue();
		nfq1.addMovie(m1);
		nfq1.addMovie(m2);
		nfq1.addMovie(m3);
		nfq1.addMovie(m4);
		nfq1.addMovie(m5);
		
		nfq1.printMovies();
		
		bestMovie = nfq1.getBestMovie();
		String info = bestMovie.toString();
		System.out.println("The best movie is "+info+".");
	
		nfq1.printMovies();
		
		bestMovie = nfq1.getSecondBestMovie();
		info = bestMovie.toString();
		System.out.println("The second best movie is "+info+".");
	}
	
}
