package com.hibernate.tutorial;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysql.jdbc.Connection;

/**
 * Model class for Product
 */
@Entity
@Table(name = "SANPHAM")
public class SanPham implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MASP", length = 4)
	private String maSp;

	@Column(name = "TENSP", length = 40)
	private String tenSp;

	@Column(name = "DVT", length = 20)
	private String dvTinh;

	@Column(name = "NUOCSX", length = 40)
	private String nuocSX;

	@Column(name = "GIA")
	private float gia;

	@OneToMany(mappedBy = "sanPham")
	Collection<CtHd> chiTietHoaDons;
	 

	public Collection<CtHd> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(Collection<CtHd> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public String getMaSp() {
		return maSp;
	}

	public void setMaSp(String maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public String getDvTinh() {
		return dvTinh;
	}

	public void setDvTinh(String dvTinh) {
		this.dvTinh = dvTinh;
	}

	public String getNuocSX() {
		return nuocSX;
	}

	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

}