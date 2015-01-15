package com.hibernate.tutorial;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MANV", length = 4)
	private String maNV;

	@Column(name = "HOTEN", length = 40)
	private String hoTen;

	@Column(name = "SODT", length = 20)
	private String soDT;

	@OneToMany(mappedBy = "nhanVien")
	Collection<HoaDon> hoaDons;

	@Column(name = "NGVL")
	@Temporal(TemporalType.DATE)
	private Date ngVL;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public Date getNgVL() {
		return ngVL;
	}

	public void setNgVL(Date ngVL) {
		this.ngVL = ngVL;
	}

	public Collection<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(Collection<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

}
