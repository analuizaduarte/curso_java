package entities;

public class OutsourcedEmployee extends Employee{
	
	private double additionalCharge;
	
	OutsourcedEmployee(){
	
	}

	public OutsourcedEmployee(String name, Integer hour, double valuePerHour, double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalChargeString() {
		return additionalCharge;
	}

	@Override
	public double payment() {
		return (hour*valuePerHour)+1.1*additionalCharge;
	}
	
}
