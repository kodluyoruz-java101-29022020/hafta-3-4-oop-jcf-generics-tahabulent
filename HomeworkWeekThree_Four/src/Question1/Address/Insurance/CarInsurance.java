package Question1.Address.Insurance;

import java.sql.Date;

public class CarInsurance extends Insurance {

	public CarInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
		super(insuranceName, price, startDate, finishDate);
	}

	@Override
	public double calculate() {
		// refactor
		double price = 1;
		return price;
	}

}
