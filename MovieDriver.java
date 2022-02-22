import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	
	try (Scanner input = new Scanner(System.in)) {
		Movie movie = new Movie(); //create movie object
		
		String answer;
		do
		{	
			System.out.println("Enter the name of a movie");
			String nameOfMovie = input.nextLine();
			movie.setTitle(nameOfMovie);
			System.out.println("Enter the rating of the movie");
			String movieRating = input.nextLine();
			movie.setRating(movieRating);
			System.out.println("Enter the number of the tickets sold for this movie");
			int ticketsSold = input.nextInt();
			movie.setSoldTickets(ticketsSold);		
			System.out.println(movie.toString()); //print output 
			input.nextLine();
			System.out.println("Do you want to enter another movie? (yes or no)");
			answer = input.nextLine();
			if (answer.equals("no"))
			{
				System.out.println("Goodbye");
			}
		} while (answer.equals("yes"));
	}
	

	}

}
