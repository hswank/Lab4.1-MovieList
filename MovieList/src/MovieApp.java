import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String isContinue = "y";

		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("This Is The End", "Comedy"));
		movieList.add(new Movie("Saw", "Horror"));
		movieList.add(new Movie("Jaws", "Thriller"));
		movieList.add(new Movie("Knocked Up", "Comedy"));
		movieList.add(new Movie("Poltergeist", "Horror"));
		movieList.add(new Movie("Jurassic Park", "Thriller"));
		movieList.add(new Movie("Pineapple Express", "Comedy"));
		movieList.add(new Movie("Carrie", "Horror"));
		movieList.add(new Movie("The Fugitive", "Thriller"));
		movieList.add(new Movie("Up In Smoke", "Comedy"));

		System.out.println("Welcome to the Movie List Application!\n\nThere are 10 movies in this list.\n");

		while (isContinue.equalsIgnoreCase("y")) {
			System.out.print("What category are you interested in?(Comedy, Horror, or Thriller) ");
			String userInput = input.next();

			if (userInput.equalsIgnoreCase("comedy") || userInput.equalsIgnoreCase("horror")
					|| userInput.equalsIgnoreCase("thriller")) {
				for (int i = 0; i < movieList.size(); i++) {
					if (movieList.get(i).getCategory().equalsIgnoreCase(userInput)) {
						System.out.println(movieList.get(i).getTitle());
					}
				}
			} else {
				System.out.println("This category is not valid");
			}
			
			isContinue = "";
			while (!isContinue.equalsIgnoreCase("y") && !isContinue.equalsIgnoreCase("n")) {
				System.out.println("Continue? (y/n): ");
				isContinue = input.next();
			}

		}
	}

}
