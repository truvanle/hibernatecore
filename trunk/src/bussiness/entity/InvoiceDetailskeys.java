package bussiness.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class InvoiceDetailskeys implements Serializable {
	private static final long serialVersionUID = 9197652577705408621L;

	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="invoicesId")
	private Invoices invoices;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Invoices getInvoices() {
		return invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

	@Override
	public String toString() {
		return "InvoiceDetailskeys [product=" + product + ", invoices="
				+ invoices + "]";
	}

	
	
}
