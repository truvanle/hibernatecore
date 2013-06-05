package ConsoleTestHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import bussiness.entity.Custommers;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Custommers";
		Query query = session.createQuery(hql);
		
		List<Custommers> entities = query.list();
		
		for(Custommers o : entities){
			System.out.println(" >> ID: " + o.getId());
			System.out.println(" >> FullName: " + o.getFullName());
			System.out.println();
		}
		
		session.close();
	}

}
