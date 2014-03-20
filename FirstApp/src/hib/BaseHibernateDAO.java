package hib;

import org.hibernate.Session;


/**
 * @author vivek.mishra
 *
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}