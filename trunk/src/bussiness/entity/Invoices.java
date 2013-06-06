package bussiness.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@TableGenerator(
		name="Gen_invoice",
		catalog="invoice12",
		pkColumnName="primaryIncoiceKey",
		pkColumnValue="primaryInvoiceValue",
		initialValue=1,
		allocationSize=100)

@Table(name = "invoices")
public class Invoices implements Serializable{
	 
	private static final long serialVersionUID = 8155257777085710000L;

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="created")
	@Temporal(TemporalType.DATE)
	private Date created;
	
	@Column(name="delivery")
	@Temporal(TemporalType.DATE)
	private Date delivery;

	@ManyToOne
	@JoinColumn(name = "employeesId")
	private Employees employees;

	@ManyToOne
	@JoinColumn(name = "custommersId")
	private Custommers custommers;

	@OneToMany(mappedBy="invoices")
	Collection<DetailInvoices> detailInvoices;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDelivery() {
		return delivery;
	}

	public void setDelivery(Date delivery) {
		this.delivery = delivery;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public Custommers getCustommers() {
		return custommers;
	}

	public void setCustommers(Custommers custommers) {
		this.custommers = custommers;
	}

	public Collection<DetailInvoices> getDetailInvoices() {
		return detailInvoices;
	}

	public void setDetailInvoices(Collection<DetailInvoices> detailInvoices) {
		this.detailInvoices = detailInvoices;
	}

	@Override
	public String toString() {
		return "Invoices [id=" + id + ", created=" + created + ", delivery="
				+ delivery + ", employees=" + employees + ", custommers="
				+ custommers + ", detailInvoices=" + detailInvoices + "]";
	}

	 

	
	
}
