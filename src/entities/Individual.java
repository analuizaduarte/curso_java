package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (anualIncome < 2000) {
			tax = anualIncome * 0.15;
		} else {
			tax = anualIncome * 0.25;
		}
		if (healthExpenditures != 0) {
			tax -= healthExpenditures * 0.5;
		}
		return tax;
	}

}
