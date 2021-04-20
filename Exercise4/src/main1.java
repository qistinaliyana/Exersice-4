
public class main1 {

	public static void main(String[] args) {
		Balls objBalls = new Balls(20,2);	
		System.out.println(objBalls);
		System.out.println("The total price : RM " + objBalls.total());
		System.out.println();
		
		Golf objGolf = new Golf (16, 3, 10);
		System.out.println(objGolf);
		System.out.println("The total price : RM " + objGolf.total());
		System.out.println("The discount : RM " + objGolf.discounttotal());
		System.out.println();
		
		Bowling objBowling = new Bowling (50, 1, 5);
		System.out.println(objBowling);
		System.out.println("The total price : RM " + objBowling.total());
		System.out.println("The discount : RM " + objBowling.discounttotal());
		}
	}
