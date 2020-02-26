/**
 * Person Super Class
 * @author Mark Griffiths
 * CSC251
 * 2/8/2020
 */


public class GriffithsPerson {
	private String _name;
	private String _address;
	private String _phoneNumber;
	
	
	/**
	 * Default Constructor
	 */
	public GriffithsPerson() {
		_name = "";
		_address = "";
		_phoneNumber = "";
	}
	
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public GriffithsPerson(String name, String address, String phoneNumber) {
		_name = name;
		_address = address;
		_phoneNumber = phoneNumber;
	} // end constructor
	
	
	/**
	 * Setter methods
	 * @param name
	 */
	public void setName(String name) {
		_name = name;
	}
	
	public void setAddress(String address) {
		_address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	} // end setters
	
	
	/**
	 * Getter methods
	 * @return
	 */
	public String getName() {
		return _name;
	}
	
	public String getAddress() {
		return _address;
	}
	
	public String getPhoneNumber() {
		return _phoneNumber;
	} // end getters
	
	/**
	 * ToString method
	 */
	public String toString() {
		String str = "";
		str += "Customer Name: " + _name + "\n";
		str += "Address: " + _address + "\n";
		str += "Phone Number: " + _phoneNumber + "\n";
		return str; 
	}
	
	
} // end Person class
