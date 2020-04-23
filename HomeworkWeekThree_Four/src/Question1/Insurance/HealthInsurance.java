package Question1.Insurance;

import java.sql.Date;

public class HealthInsurance extends Insurance {

	public HealthInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
		super(insuranceName, price, startDate, finishDate);

	}

	@Override
	public double calculate() {
		// refactor
		double price = 1;
		return price;
	}

}
