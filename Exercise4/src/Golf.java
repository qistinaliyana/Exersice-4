
public class Golf extends Balls{
	
	private double discount;
	
    public Golf(double p, double q, double d) {
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
