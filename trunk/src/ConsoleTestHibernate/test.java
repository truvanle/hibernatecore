package ConsoleTestHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import bussiness.entity.Custommers;
import bussiness.entity.DetailInvoices;
import bussiness.entity.InvoiceDetails;
import bussiness.entity.InvoiceDetailskeys;
import bussiness.entity.Invoices;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM InvoiceDetails";
		Query query = session.createQuery(hql);
		
		List<InvoiceDetails> entities = query.list();
		
		for(InvoiceDetails o : entities){
			System.out.println(" >> Product Id: " + o.getProduct().getId());
			System.out.println(" >> Invoice ID: " + o.getInvoices().getId());
			System.out.println(" >> Quantity: " + o.getQuantity());
			System.out.println();
		}
		
		session.close();
	}

}
