package Question1.User;

import java.util.Date;
import java.util.List;

import Question1.Address.IAddress;

public class User {

	private String name;
	private String surname;
	private String email;
	private String password;
	private String job;
	private int age;
	private List<IAddress> adress;
	private Date lastLogin;

	public User() {

	}

	public User(String name, String surname, String email, String password, String job, int age, List<IAddress> adress, Date lastLogin) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password= password;
		this.job = job;
		this.age = age;
		this.adress = adress;
		this.lastLogin = lastLogin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<IAddress> getAdress() {
		return adress;
	}

	public void setAdress(List<IAddress> adress) {
		this.adress = adress;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email=" + email + ", job=" + job + ", age=" + age
				+ ", adress=" + adress + ", lastLogin=" + lastLogin + "]";
	}

}
