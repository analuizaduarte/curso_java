package entities;

public class Company extends TaxPayer {

	private int nEmployees;

	public Company() {

	}

	public Company(String name, double anualIncome, int nEmployees) {
		super(name, anualIncome);
		this.nEmployees = nEmployees;
	}

	public int getnEmployees() {
		return nEmployees;
	}

	public void setnEmployees(int nEmployees) {
		this.nEmployees = nEmployees;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (nEmployees >= 10) {
			tax = anualIncome * 0.14;
		} else {
			tax = anualIncome * 0.16;
		}
		return tax;
	}

}
