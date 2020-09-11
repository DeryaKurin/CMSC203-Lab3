import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		//Open Scanner for user input
		Scanner input = new Scanner(System.in);

	    
	    char toContinue;
	    
	    do {    	
	    	//Create a movie object to store the data
	    	Movie m = new Movie();
			
			System.out.println("Enter the name of a movie");
			//Set the title of the movie by calling setTitle
			
			m.setTitle(input.nextLine());
			
	        
			System.out.println("Enter the rating of the movie");
			//Set the rating of the movie by calling setRating
			m.setRating(input.nextLine());
		
			
			System.out.println("Enter the number of tickets sold for this movie");
			//Set the sold tickets of the movie by calling setSoldTickets
			m.setSoldTickets(input.nextInt());
			
			
			//Call toString method to get the data field of the movie 
		    System.out.println(m.toString());
		    
		    System.out.println("Do you want to enter another? (y or n)");
		    String userResponse = input.next();
		    toContinue = userResponse.charAt(0);
		    
		    input.nextLine();
		    
	    } while(toContinue == 'y');
	    
	    System.out.println("Goodbye");
	    System.out.println("Programmer: Derya Ozdemir Kurin\n"
	    		+ "Assignment: Lab 3 - Driver Data Element");
	    
	    
	    //Close the Scanner instance
	    input.close();

	}

}
