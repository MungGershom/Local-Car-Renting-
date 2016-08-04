
public class RentingPriceOption {
	
	Double priceOption;
	Double disCount;
	String update;
	
	
	
	public RentingPriceOption (Double priceOption,Double disCount) {
        super( );
        this.priceOption = priceOption;
		this.disCount = disCount;
	}
	
	public Double getPriceOption() {
		return priceOption;
	}
	public void setPriceOption(Double priceOption) {
		this.priceOption = priceOption;
	}
	public Double getDiscount(Double disCount ) {
	    return disCount;
	}
	
	public void setDiscount(Double disCount) {
		this.disCount = ;
	}
	
	public String getUpdate(String update ) {
	    return update;
	}
	
	public void setSetupdate(String update) {
		this.update;
	}
		
	public void displayPriceOption(){
		
		System.out.println();
		System.out.println(".....PRICE OPTION.....");
		System.out.println("One Day: $120.00");
		System.out.println("One Hour: 50..00");
		System.out.println();
		System.out.println("<<<<Discount Option>>>>");
		System.out.println("If you are renting one week,you get 25% discount");
		System.out.println("If You are renting more than 5 hours, you get 25% discount");
		System.out.println();
		System.out.println(" The information updates will show up everytime.Please Check every day");
		
		
		
		
	}

}
