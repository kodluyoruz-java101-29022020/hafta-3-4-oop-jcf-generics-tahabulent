package Question1.Address.Insurance;

import java.sql.Date;

public abstract class Insurance {

	protected String insuranceName;
	protected double price;
	protected Date startDate;
	protected Date finishDate;

	abstract double calculate(); // refactor

	public Insurance(String insuranceName, double price, Date startDate, Date finishDate) {

		this.insuranceName = insuranceName;
		this.price = price;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

}
