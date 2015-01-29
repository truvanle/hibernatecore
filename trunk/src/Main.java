import org.hibernate.Session;

import com.hibernate.configuration.HibernateUtil;
import com.hibernate.persistence.HibernatePersistence;


public class Main {

    public static void main( String[] args )
    {
    	Session test = HibernateUtil.getSessionFactory().openSession();
       // Session session = HibernatePersistence.getSessionFactory().openSession();

    }
}