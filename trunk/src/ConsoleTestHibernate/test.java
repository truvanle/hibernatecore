package ConsoleTestHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import bussiness.entity.Custommers;
import bussiness.entity.DetailInvoices;
import bussiness.entity.Invoices;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Invoices";
		Query query = session.createQuery(hql);
		
		List<Invoices> entities = query.list();
		
		for(Invoices o : entities){
			System.out.println(" >> ID: " + o.getId());
			System.out.println(" >> Customer ID: " + o.getCustommers().getFullName());
		 
			System.out.println();
		}
		
		session.close();
	}

}
