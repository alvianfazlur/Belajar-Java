public class Customer{
	public int customerID;
	public String customerName;
	public String customerAddress;

	public Customer(int ID, String name, String Address){
		this.customerID = ID;
		this.customerName = name;
		this.customerAddress = Address;
	}
	public String getName(){
		return customerName;
	}
	public void setAddress(String address){
		this.customerAddress = address;
	}
	public int updateID(int newId){
		customerID = newId;
		return customerID;
	}
}