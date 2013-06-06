package bussiness.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="invoiceDetails")
@IdClass(InvoiceDetailskeys.class)
 
public class InvoiceDetails {
	
	InvoiceDetails(){
		
	}
	@Id private Product product;
	@Id private Invoices invoices;
	
	@Column(name="quantity")
	private Integer quantity;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "InvoiceDetails [product=" + product + ", invoices=" + invoices
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
