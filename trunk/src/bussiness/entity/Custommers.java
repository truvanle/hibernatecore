package bussiness.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="custommers")
public class Custommers implements Serializable {
	private static final long serialVersionUID = 771064140313299887L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="fullName")
	private String fullName; 
	
	@Column(name="address")
	private String address; 
	
	@Column(name="telephone")
	private String telephone; 
	
	@Column(name="email")
	private String email; 
	
	@Column(name="active")
	private boolean active;
	
	@OneToMany(mappedBy="custommers")
	Collection<Invoices> invoices;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Collection<Invoices> getInvoices() {
		return invoices;
	}

	public void setInvoices(Collection<Invoices> invoices) {
		this.invoices = invoices;
	}

	@Override
	public String toString() {
		return "Custommers [id=" + id + ", fullName=" + fullName + ", address="
				+ address + ", telephone=" + telephone + ", email=" + email
				+ ", active=" + active + ", invoices=" + invoices + "]";
	}

	 
	
	
}
