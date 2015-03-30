package services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.UserManagementServicesLocal;
import services.interfaces.UserManagementServicesRemote;
import domain.Player;

/**
 * Session Bean implementation class UserManagementServices
 */
@Stateless
@LocalBean
public class UserManagementServices implements UserManagementServicesRemote,
		UserManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Player login(String login, String password) {
		Player player = null;
		String jpql = "select p from Player p where p.login =:param1 and p.password =:param2 ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", password);
		try {
			player = (Player) query.getSingleResult();
		} catch (Exception e) {
			System.out.println("user not found ");
		}
		return player;
	}
}
