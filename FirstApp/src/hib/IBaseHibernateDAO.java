package hib;

import org.hibernate.Session;


/**
 * @author vivek.mishra
 *
 */
public interface IBaseHibernateDAO {
	public Session getSession();
}