package Question1.Main;

import Question1.Manager.AccountManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Email : ");
		String email = scanner.nextLine();
		System.out.print("Password : ");
		String password = scanner.nextLine();

		accountManager.loginSystem(email, password);

	}

}
