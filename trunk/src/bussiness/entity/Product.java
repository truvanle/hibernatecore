package bussiness.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
	name = "Gen_product", 
	catalog = "product", 
	initialValue = 1, 
	pkColumnName = "primaryproduct_key", 
	pkColumnValue = "primaryproduct_value", 
	allocationSize = 100)
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = -1679482018950573015L;

	@Id
	@GeneratedValue
	@Column(name="id", nullable=true, unique=true)
	private Integer id;
	
	@Column(name="productName", length=255)
	private String productName;
	
	@Column(name="unit", length=45)
	private String unit;
	
	@Column(name="price", nullable=false)
	private BigDecimal price;
	
	@OneToMany(mappedBy="product")
	Collection<DetailInvoices> detailInvoices;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Collection<DetailInvoices> getDetailInvoices() {
		return detailInvoices;
	}

	public void setDetailInvoices(Collection<DetailInvoices> detailInvoices) {
		this.detailInvoices = detailInvoices;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", unit="
				+ unit + ", price=" + price + ", detailInvoices="
				+ detailInvoices + "]";
	}

	 
	
	
	
	
}
