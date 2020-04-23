package Question1.Insurance;

import java.sql.Date;

public class ResidenceInsurance extends Insurance {

	public ResidenceInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
		super(insuranceName, price, startDate, finishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// refactor
		double price = 1;
		return price;
	}

}
