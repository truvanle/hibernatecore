package ConsoleTestHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import bussiness.entity.Custommers;
import bussiness.entity.Employees;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Employees";
		Query query = session.createQuery(hql);
		
		List<Employees> entities = query.list();
		
		for(Employees o : entities){
			System.out.println(" >> ID: " + o.getId());
			System.out.println(" >> FullName: " + o.getFirstName());
			System.out.println(" >> Gender: " + o.isGender());
			System.out.println();
		}
		
		session.close();
	}

}
