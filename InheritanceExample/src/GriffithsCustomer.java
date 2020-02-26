/**
 * Customer Subclass
 * @author Mark Griffiths
 * CSC251
 * 2/8/2020
 */


public class GriffithsCustomer extends GriffithsPerson {
	
	private String _customerNumber;
	private Boolean _mailingList;
	
	
	/**
	 * Default Constructor
	 */
	public GriffithsCustomer() {
		super();
		_customerNumber = "";
		_mailingList = false;
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param customerNumber
	 * @param mailingList
	 */
	public GriffithsCustomer(String name, String address, String phoneNumber, String customerNumber, Boolean mailingList) {
		super(name, address, phoneNumber);
		_customerNumber = customerNumber;
		_mailingList = mailingList;
	} // end Constructor
	
	/**
	 * Setter methods
	 */
	
	public void setCustomerNumber(String customerNumber) {
		_customerNumber = customerNumber;
	}
	
	public void setMailingList(int choice) {
		if (choice == 1){
			_mailingList = true;
		}
		else 
			_mailingList = false;
	} // end Setters
	
	/**
	 * Getter methods
	 */
	
	public String getCustomerNumber() {
		return _customerNumber;
	}
	
	public Boolean getMailingList() {
		return _mailingList;
	}
	
	public String toString() {
	String str = super.toString();
	str += "Customer Number: " + _customerNumber + "\n";
	if(_mailingList == true) {
		str+= "Mailing List: Yes\n";
	}
	else 
		str+= "Mailing List: No\n";

	return str;
	}

}
