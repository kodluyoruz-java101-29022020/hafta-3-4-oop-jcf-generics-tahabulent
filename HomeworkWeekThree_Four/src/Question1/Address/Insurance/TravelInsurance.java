package Question1.Address.Insurance;

import java.sql.Date;

public class TravelInsurance extends Insurance {

	public TravelInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
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
