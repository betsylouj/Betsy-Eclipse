
public class Netflix {

	public static void main(String[] args) {
		// 1. Instantiate some Movie objects (at least 5).
		Movie m2 = new Movie("The Matrix", 5);
		Movie m3 = new Movie("RV", 1);
		Movie m4 = new Movie("Bend it Like Beckham", 3);
		Movie m5 = new Movie("Chicago", 4);
		Movie m1 = new Movie("Gravity", 2);
		
		// 2. Use the methods in the Movie object to print the name and rating
		// of your favorite.
		String price = m2.getTicketPrice();
		System.out.println(price);
		
		// 3. Instantiate a NetflixQueue.
		NetflixQueue nfq1 = new NetflixQueue();
		
		// 4. Add your movies to the Netflix queue.
		nfq1.addMovie(m1);
		nfq1.addMovie(m2);
		nfq1.addMovie(m3);
		nfq1.addMovie(m4);
		nfq1.addMovie(m5);

		// 5. Print all the movies in your queue.
		nfq1.printMovies();

		// 6. Use your NetflixQueue object to finish the sentence
		// "the best movie is...."
		Movie bestMovie = nfq1.getBestMovie();
		String info = bestMovie.toString();
		System.out.println("The best movie is " + info + ".");
		nfq1.printMovies();

		// 7. Use your NetflixQueue to finish the sentence
		// "the second best movie is...."
		bestMovie = nfq1.getSecondBestMovie();
		info = bestMovie.toString();
		System.out.println("The second best movie is " + info + ".");
	}



}
