package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double tax = population*growthRate;
		tax = tax * (growthRate/2);
		return tax;
	}
	
}
