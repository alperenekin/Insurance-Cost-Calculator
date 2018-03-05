package development;


public class Vehicle {
	private String owner;
	private String brand;
	private int producedyear;
	private double horsepower;
	private double accidentpenalty;
	private VehicleType type;
	
	public Vehicle(String owner, String brand, int producedyear, double horsepower, double accidentpenalty, VehicleType type) {
		if(owner==null) 
		{
			owner="NO NAME GIVEN";
		}
		this.owner = owner;
		if(brand==null) 
		{
			brand="NO BRAND GIVEN";
		}
		this.brand = brand;
		if (producedyear<=0) 
		{
			producedyear=2017;
		}
		this.producedyear = producedyear;
		if(horsepower<=0) 
		{
			horsepower=0;
		}
		this.horsepower = horsepower;
		if(accidentpenalty<0) {
			accidentpenalty=1;
		}
		this.accidentpenalty = accidentpenalty;
		if(type==null) 
		{
			type=VehicleType.CAR;
		}
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public String getBrand() {
		return brand;
	}
	public int getProducedYear() {
		return producedyear;
	}
	public double getHorsePower() {
		return horsepower;
	}
	
	public double getAccidentpenalty(){
		return accidentpenalty;
	}
	public VehicleType getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", brand=" + brand + ", producedyear=" + producedyear + ", housepower=" + horsepower
				+ ", accidentpenalty=" + accidentpenalty + ", type=" + type + "]";
	}
}
