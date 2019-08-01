import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Test program for CinemaBooking
 * @author Kamal Aitken
 *
 */

public class CinemaBookingTest {

	public static void main(String[] args) throws FileNotFoundException {
		//creates scanner for keyboard input
		Scanner sc = new Scanner(System.in);



		//Test constructor 
		CinemaBooking Cust1 = new CinemaBooking();

		//Screen array list of the films showing 
		String[] screen;    
		screen = new  String[]{""," Goodfellas", " Avatar", " Inception", " Finding Nemo" , " Home Alone\n"};

		//Setting the cost of the ticket price, (£)5 (£)10
		Cust1.setAdultCost(10);
		Cust1.setChildCost(5);

		System.out.println("----------------------------------------------------------");
		System.out.println("*********************Welcome******************************");
		System.out.println("----------------------------------------------------------");
		System.out.println("WELCOME TO OUR CINEMA BOOKING PAGE!\nTAKE A LOOK AT WHAT IS SHOWING TODAY\n");

		//loops through each object to print out film name + aligned screen numbers
		for (int i = 1; i < 6; i++ )
			System.out.println("|screen " + i + " "+ screen[i]);

		System.out.println("----------------------------------------------------------");
		System.out.println("**********************Price*******************************");
		System.out.println("----------------------------------------------------------");
		System.out.println("Adult Ticket Price:£" + Cust1.getAdultCost());	
		System.out.println("Child Ticket Price:£" + Cust1.getChildCost());
		System.out.println("small print: 13yo and over are considered as an adult.\n");


		System.out.println("----------------------------------------------------------");
		System.out.println("*******************Your Details***************************");
		System.out.println("----------------------------------------------------------");


		System.out.println("Can I Start With Your First Name");
		//sc.nextLine() will push the scanner past the initial line and returns the forename input that was skipped
		String forename = sc.nextLine();
		Cust1.setForename(forename);
		System.out.println("Hello" + " " + Cust1.getForename());



		System.out.println("How Many Adults Will Be Attending This Screen?");
		//sc.nextLine() will push the scanner past the initial line and returns the adults attending input that was skipped
		int adult = sc.nextInt();
		Cust1.setAdult(adult);


		if ( adult == 0) {
			System.out.println("To Continue Enter How Many Adults Are Attending.");
			System.out.println("PLEASE NOTE! 'CHILDREN' Has To Be Acccompanied By Atleast 1 'ADULT'");
		} else {
			System.out.println("Adults Attending:" + Cust1.getAdult() + "\n");
			System.out.println("CHILDREN CAN ATTEND HALF PRICE!");	
			System.out.println("How Many Children Will Be Attending This Screen");
			int child = sc.nextInt();
			Cust1.setChild(child);
			System.out.println("Children Attending:" + Cust1.getChild() + "\n");

			System.out.println("-------------------------------------------------------");

			for (int i = 1; i < 6; i++ )
				System.out.println("Screen " + i + ""+ screen[i]);
			System.out.println("-------------------------------------------------------");
			System.out.println("Please Select Screen Number Between 1-5" );    		
			int i = sc.nextInt();

			/**if statement is utilised to allow user an optional choice with an else statement. 
			 * If input is greater than the value 5 then the user will be prompted with an 
			 *invalid message, allowing the user to retype a number which executes when the boolean
			 *expreession is false.
			 */

			if(i > 5) {
				System.out.println("Invalid Screen Number..Please Refresh Page And Try Again!");
			} else {


				System.out.println("-----------------------------------------------------");
				System.out.println("Just To Confirm You Have Selected Screen" + i + " To Watch " + screen[i] );
				System.out.println("'yes' or 'no' " );
				String a = sc.next();

				PrintWriter pw = new PrintWriter("BookingConfirmation.txt");

				if(a.equals("yes")){

					System.out.println("Fantastic! Your Booking Confirmation can located in the document 'BookingConfirmation.txt'");

					pw.println("----------------------------------------------------------");
					pw.println("*******************Booking Confirmation********************");
					pw.println("----------------------------------------------------------");
					pw.println(Cust1.toString() + screen[i] );
					pw.println("---------------");
					pw.println("Total Cost: £" + Cust1.getTotalPrice()); 
					pw.println("---------------\n");

					pw.flush();
					pw.close();


				} else if(a.equals("no")){

					System.out.println("Please Retype In Your Screen Number");
					int i1 = sc.nextInt();
					System.out.println("Just To Confirm Again You Have Selected Screen" + i1 + " To Watch" + screen[i1]);
					System.out.println("'yes' or 'no' " );
					String a1 = sc.next();


					if(a1.equals("yes")){

						System.out.println("Fantastic! Your Booking Confirmation can located in the document 'BookingConfirmation.txt'");

						pw.println("----------------------------------------------------------");
						pw.println("*******************Booking Confirmation********************");
						pw.println("----------------------------------------------------------");
						pw.println(Cust1.toString() + screen[i] );
						pw.println("---------------");
						pw.println("Total Cost: £" + Cust1.getTotalPrice()); 
						pw.println("---------------\n");

						pw.flush();
						pw.close();

					} else if(a.equals("no")){
						System.out.println("PLEASE REFRESH THE BOOKING PAGE AND TRY AGAIN!");


						sc.close(); //closing scanner 






					}

				}

			}




		}

	}

}


