package bussiness.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custommers")
public class Custommers implements Serializable {
	private static final long serialVersionUID = 771064140313299887L;

	@Id
	@GeneratedValue
	int id;
	
	@Column(name="fullName")
	String fullName; 
	
	@Column(name="address")
	String address; 
	
	@Column(name="telephone")
	String telephone; 
	
	@Column(name="email")
	String email; 
	
	@Column(name="active")
	boolean active;

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
	
	
}
