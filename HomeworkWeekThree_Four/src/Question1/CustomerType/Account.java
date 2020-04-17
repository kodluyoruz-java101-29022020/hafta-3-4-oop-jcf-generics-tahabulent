package Question1.CustomerType;

import java.util.List;

import Question1.Address.Enums.AuthenticationStatus;
import Question1.Address.Insurance.Insurance;
import Question1.User.User;

public abstract class Account {

	User user1;
	List<Insurance> insuranceLists;
	AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

	public void Login() {

	}

	abstract String getAccountInfo();

	final void showUserInfo() {
		user1.toString();
	}
}
