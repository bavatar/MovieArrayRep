import java.util.*;
import java.util.Scanner;

public class Main {
    // Create an application which will prompt the user to enter the name of their favorite Movie.
    // Add the Movie to an array list.
    // Use a loop to continue adding movies to the array until the user presses q or Q.
    //Once the user presses Q then print the list of movies before exiting the program.
    //
    // Option 1: Print out the list of movies sorted in alphabetical order.
    // Option 2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.

    public static void main(String[] args) {
        ArrayList<String> movieArray = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        // randomly choose a word from actionItems
        Random rnd = new Random();
        String movie = "";

        while (true) {
            System.out.println("Enter another movie.");
            movie = sc.nextLine();
            movieArray.add(movie);

            System.out.println("Press (q) to quit or any other key to continue");
            String cont = sc.nextLine();
            if (cont.equalsIgnoreCase("q")) {
                break;
            }
        }
        System.out.println("Final Movie List: " + movieArray);

        // Option 1: Print out in sorted order
        //movieArray.sort(? super String);
        /* Sort statement*/
        Collections.sort(movieArray);
        System.out.println("Final Sorted Movie List: " + movieArray);

        int randomInt = rnd.nextInt(movieArray.size());
        System.out.println("You might want to watch: " + movieArray.get(randomInt));
    }
}
