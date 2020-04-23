package Question1.CustomerType;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import Question1.Address.IAddress;
import Question1.Enums.AuthenticationStatus;
import Question1.Exception.InvalidAuthenticationException;
import Question1.Insurance.Insurance;
import Question1.User.User;
import Question1.Manager.AdressManager;

public abstract class Account implements Comparable<Account> {

	protected User user;
	protected List<Insurance> insuranceLists;
	protected AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

	public Account() {
	}

	public Account(User user, List<Insurance> insuranceLists) {
		this.user = user;
		this.insuranceLists = insuranceLists;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsuranceLists() {
		return insuranceLists;
	}

	public void setInsuranceLists(List<Insurance> insuranceLists) {
		this.insuranceLists = insuranceLists;
	}

	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public boolean login(Account account, String email, String pass) throws InvalidAuthenticationException {
		User loggedInUser = account.getUser();
		if(loggedInUser.getEmail().equals(email) && loggedInUser.getPassword().equals(pass)){
			authenticationStatus = AuthenticationStatus.SUCCESS;
			loggedInUser.setLastLogin(new Date());
			return true;
		}else{
			throw new InvalidAuthenticationException("Giriş Yapamadınız!");
		}
	}

	public void addAddress(User user, IAddress addressType) {
		AdressManager.addAddress(user, addressType);
	}
	public void removeAddress(User user, IAddress addressType) {
		AdressManager.removeAddress(user, addressType);
	}

	public abstract void addInsurance(Account account, Insurance insurance);

	final void showUserInfo() {
		user.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Account account = (Account) o;
		return Objects.equals(user, account.user) &&
				Objects.equals(insuranceLists, account.insuranceLists) &&
				authenticationStatus == account.authenticationStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user, insuranceLists, authenticationStatus);
	}
}
