import java.util.Scanner;
public class Balls {
	Scanner s = new Scanner(System.in);
	private double price, quantity;
	
	
	Balls(double Diameter, double Weigth){
		System.out.println("Enter the price : RM ");
		this.price = s.nextDouble();
		System.out.println("Enter the quantity : ");
		this.quantity = s.nextDouble();
	}
    
	public double getprice() {
		return this.price;
	}
	public double getquantity() {
		return this.quantity;
	}
	public double total() {
		return this.price * this.quantity ;
	}
	
	public String toString() {
		return "The price = RM " + this.price + "\n" + "The quantity = " + this.quantity ;
	}
}
