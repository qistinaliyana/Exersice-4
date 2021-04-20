
public class Bowling extends Balls {
private double discount;
	
    public Bowling(double p, double q, double d) {
		super(p,q);
		discount = discount;
	}
     public double getdiscount() {
    	 return this.discount;
    }
    public double discounttotal() {
    	return super.getprice() * ((getprice() - discount)/100) ;
    }
}
