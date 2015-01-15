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
@Table(name = "KHACHHANG")
public class KhachHang implements Serializable {
	private static final long serialVersionUID = -4168741285353095185L;

	@Id
	@Column(name = "MAKH", length = 4, nullable = false)
	private String maKH;

	@Column(name = "HOTEN", length = 40, nullable = false)
	private String hoTen;

	@Column(name = "DCHI", length = 50)
	private String dChi;

	@Column(name = "SODT", length = 20)
	private String soDT;

	@Column(name = "NGSINH")
	@Temporal(TemporalType.TIME)
	private Date ngaySinh;

	@Temporal(TemporalType.TIME)
	@Column(name = "NGDK")
	private Date ngayDangKy;

	@Column(name = "DOANHSO")
	private float doanhSo;

	@OneToMany(mappedBy = "khachHang")
	Collection<HoaDon> hoaDons;

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getdChi() {
		return dChi;
	}

	public void setdChi(String dChi) {
		this.dChi = dChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Date getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	public float getDoanhSo() {
		return doanhSo;
	}

	public void setDoanhSo(float doanhSo) {
		this.doanhSo = doanhSo;
	}

	public Collection<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(Collection<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}
	
	

}
