/**
 * Preferred Customer Subclass
 * @author Mark Griffiths
 * CSC251
 * 2/8/2020
 */


public class GriffithsPreferredCustomer extends GriffithsCustomer {
	
	private double _amtPurchases;
	private double _discount;
	
	/**
	 * Default Constructor
	 */
	public GriffithsPreferredCustomer() {
		super();
		_amtPurchases = 0;
		_discount = 0;
	}
	
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param customerNumber
	 * @param mailingList
	 * @param numPurchases
	 * @param discount
	 */
	public GriffithsPreferredCustomer(String name, String address, String phoneNumber, String customerNumber, Boolean mailingList, int numPurchases, double discount) {
		super(name, address, phoneNumber, customerNumber, mailingList);
		_amtPurchases = numPurchases;
		_discount = discount;
	} // end Constructor

	
	
	/**
	 * Setter methods
	 * @param numPurchases
	 */
	public void setPurchases(double amtPurchases) {
		_amtPurchases = amtPurchases;
	}
	
	public void setDiscount(double discount) {
		_discount = discount;
	}

	
	/**
	 * Getter methods
	 * @return
	 */
	public double getPurchases() {
		return _amtPurchases;
	}
	
	public double getDiscount() {
		return _discount;
	}
	
	public void determineDiscount() {
		if(_amtPurchases >= 1500) {
			_discount = .09;
		}
		else if(_amtPurchases >= 1001) {
			_discount = .07;
		}
		else if(_amtPurchases >= 501) {
			_discount = .06;
		}
		else
			_discount = .05;
	}
	
	public String toString() {
		determineDiscount();
		String str = super.toString();
		str += "Amount of Purchases: " + String.format("$%.2f", _amtPurchases) + "\n";
		str += "Discount Level: " + _discount + "\n";
		str += "Calculated Amount: " + String.format("$%.2f", (_amtPurchases - (_amtPurchases*_discount))) + "\n";
		
		return str;
		
	}

}




