package Question1.Manager;

import java.util.ArrayList;
import java.util.List;

import Question1.Address.IAddress;
import Question1.User.User;

public class AdressManager {

	public static void addAddress(User user, IAddress address) {

		if (user != null && user.getAdress().isEmpty()) {

			List<IAddress> adressList = new ArrayList<IAddress>();
			adressList.add(address);
			user.setAdress(adressList);

			System.out.println("Adres Eklendi..");
		} else {
			System.out.println("Gönderdiðiniz kullanýcý boþ veya adres zaten dolu..");
		}

	}

	public static void removeAddress(User user, IAddress address) {
		if (user != null && user.getAdress().isEmpty()) {

			user.getAdress().remove(address); // refactor

		}

	}

}
