
public class CustomerInfo {
	
	private String fullName;
	private String address;
	private String dateRent;
	
	public CustomerInfo(String fullName, String address, String dateRent) {
        super( );
        this.fullName = fullName;
		this.address = address;
		this.dateRent = dateRent;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullname(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress(String address) {
	    return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getdateRent(String address) {
		return dateRent;
	}
	public void setdateRent(String address) {
		this.dateRent = dateRent;
	}
	public void displayCustomerInfo(){
		
		System.out.println("...CUSTOMER INFORMATION...");
		System.out.println("");
		System.out.println("Customer full name: "+fullName);
		System.out.println("Customer Address: "+address);
		System.out.println("Date of Renting the Car: "+dateRent);
	}

}
