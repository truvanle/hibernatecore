package bussiness.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@TableGenerator(
		name="GEND_employees",
		catalog="employees",
		initialValue=1,
		pkColumnName="primaryKey",
		pkColumnValue="primaryValue",
		allocationSize=100
		)
@Table(name="employees")
public class Employees implements Serializable {

	private static final long serialVersionUID = 7648517829942744032L;

	@Id
	@Column(name="id",unique=true)
	private int id;
	
	@Column(name="lastName",length=50, nullable=true)
	private String lastName; 
	
	@Column(name="firstName" , length=50, nullable=true)
	private String firstName; 
	
	@Column(name="gender", unique=true, nullable=true)
	boolean gender; 
	
	@Temporal(TemporalType.DATE)
	@Column(name="birthday", nullable=true)
	private Date birthday; 
	
	@Column(name="address",length=255, nullable=true)
	private String address; 
	
	@Column(name="telephone", length=10, nullable=true,unique=true)
	private String telephone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	
	
}
