
public class Car {
	
	private String regNo;
	private String model;
	private String Type;
	//private Double rentPrice;
	
	public Car (String regNo, String model, String Type) {
        super( );
        this.regNo = regNo;
		this.model = model;
		this.Type = Type;
		//this.rentPrice =rentPrice;
	}
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		this.Type = Type;
	}
//	public Double getRentPrice() {
//		return rentPrice;
//	}
//	public void setRentPrice(String model) {
//		this.rentPrice = rentPrice;
//	}
	
	public void displayCarInfo(){
		
		System.out.println();
		System.out.println("...CAR INFORMATION...");
		System.out.println();
		System.out.println("Registeration number: "+regNo);
		System.out.println("Year of Model: "+model);
		System.out.println("Type of the car: "+Type);
	//	System.out.println("Rent Price: "+rentPrice);
		System.out.println();
	}

}
