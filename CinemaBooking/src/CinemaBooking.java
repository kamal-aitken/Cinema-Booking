/**
 * A CinemaBooking class will consist of the user’s forename, how many child and adults will be attending 
 * along with their separate cost and what screen will they be watching. There is also a formula to 
 * allow the user to retrieve the total cost of the tickets.
 * 
 * @author Kamal Aitken
 */



public class CinemaBooking {

	//Fields

	private String forename;
	private int adult;
	private int child; 
	private int adultCost;
	private int childCost;

	//Constructor

	/**
	 * This is the CinemaBooking default constructor which is initialises the value whether it is a string
	 * @param 
	 *  
	 */


	public CinemaBooking() {

		this.forename = "";
		this.adult = 0;
		this.child = 0;
		this.adultCost = 0;
		this.childCost = 0;
	}

	/** Initialises a newly created CinemaBooking object with a custom value.
	 *
	 *@param will provide the expected initial value of the booking.
	 */ 

	public CinemaBooking (String forename, int adult, int child, int adultCost, int childCost) {

		this.forename = forename;
		this.adult = adult;
		this.child = child;
		this.adultCost = adultCost;
		this.childCost = childCost;	
	}

	//Method

	/** Public method to get the users 'forename' variable
	 * @return
	 */

	public String getForename() {
		return forename;
	}

	/** Public method to get the users 'forename' variable
	 * 
	 */

	public void setForename(String forename) {
		this.forename = forename;
	}
	/** Public method to get the amount of adults attending the cinema
	 * 
	 */

	public void setAdult (int adult) {
		this.adult = adult;
	}
	/** Public method to set the amount of adults attending the cinema
	 * @return
	 * 
	 */

	public int getAdult() {
		return adult;
	}

	/** Public method to get the amount of children attending the cinema
	 * 
	 */
	public void setChild (int child) {
		this.child = child;
	}
	/** Public method to get the amount of children attending the cinema
	 * @return
	 */

	public int getChild() {
		return child;
	}

	/** Public method to get the cost of adults ticket
	 * 
	 */

	public void setAdultCost (int adultCost) {
		this.adultCost = adultCost;
	}

	/** Public method to get the cost of adult ticket
	 * @return
	 */
	public int getAdultCost() {
		return adultCost;
	}
	/** Public method to set the child ticket cost
	 * 
	 */

	public void setChildCost (int childCost) {
		this.childCost = childCost;
	}

	/** Public method to get the cost of child ticket
	 * @return
	 */
	public int getChildCost() {
		return childCost; 
	}

	/** Public method to get the total cost of adult ticket
	 * @return
	 */

	public int getAdultTotalPrice() {
		return adult * adultCost;
	}	

	/** Public method to get the total cost of child ticket
	 * @return
	 */

	public int getChildTotalPrice() {
		return child * childCost;
	}

	/** Public method to get the total cost of adult and child ticket together using an equation
	 * @return
	 */
	public int getTotalPrice() {
		return adult * adultCost + child * childCost;
	}	


	/** Returns a textual representation of the CinemaBooking.
	 * 
	 * @return a textual representation of the CinemaBooking.
	 */

	@Override
	public String toString() {
		return "THIS IS YOUR BOOKING CONFIRMATION! SEE YOU SOON" + " " + forename.toUpperCase() + "!!" + " \n Adult Attending x" + adult + 
				"\n Children Attending x" + child + "\n Adult Cost= £" + getAdultTotalPrice() + "\n Child Cost= £"
				+ getChildTotalPrice() + "\n Watching=";
	}






}
