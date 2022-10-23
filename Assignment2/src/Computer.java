

public class Computer {
	
	protected String brand;
	protected String model;
	protected long SN;
	protected double price;
	private static int counter = 0;
	
	public Computer(String brand, String model, long SN, double price) {
		this.brand = brand;
		this.model = model;
		this.SN = SN;
		this.price = price;
		counter++;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getSN() {
		return SN;
	}

	public void setSN(long sN) {
		SN = sN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0) {
			System.out.println("Invalid Price!");
		}else {
			this.price = price;
		}
		
	}
	
	public String toString() {
		return "This computer is " + brand + ", and its model is " + model + ", and its SN is " + SN + ", and its price is " + price + ".";
	}
	
	
	public boolean equals(Object obj) {
		
		if (obj == null || this == null || !(obj instanceof Computer)) {
			
			return false;
		} else {
			
			Computer c = (Computer) obj;
			return this.brand == c.brand && this.model == c.model && this.SN == c.SN && this.price == c.price;
		}
		
	}
	
	
	 
	
	public static int findNumberOfCreatedComputers() {
		
		return counter;
	}
	
	
	
	
	
	
	
	
}
