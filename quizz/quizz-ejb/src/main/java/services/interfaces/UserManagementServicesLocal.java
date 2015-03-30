package services.interfaces;

import javax.ejb.Local;

import domain.Player;

@Local
public interface UserManagementServicesLocal {
	Player login(String login, String password);
}
