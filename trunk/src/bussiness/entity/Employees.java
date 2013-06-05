package bussiness.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@TableGenerator(name="dsfs")
@Table(name="employees")
public class Employees {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="lastName")
	String lastName; 
	
	@Column(name="firstName")
	String firstName; 
	
	@Column(name="gender")
	boolean gender; 
	
	@Temporal(TemporalType.DATE)
	@Column(name="birthday")
	Date birthday; 
	
	@Column(name="address")
	String address; 
	
	@Column(name="telephone")
	String telephone;
	
	
}
