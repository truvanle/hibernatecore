package com.hibernate.tutorial;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HOADON")
public class HoaDon implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SOHD")
	private int soHD;

	@Temporal(TemporalType.DATE)
	@Column(name = "NGHD")
	private Date ngHD;

	@ManyToOne
	@JoinColumn(name = "MAKH")
	KhachHang khachHang;

	@ManyToOne
	@JoinColumn(name = "MANV")
	NhanVien nhanVien;

	@Column(name = "TRIGIA")
	private BigDecimal trGia;

	@OneToMany(mappedBy = "hoaDon")
	Collection<CtHd> chiTietHoaDons;

	public int getSoHD() {
		return soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public Date getNgHD() {
		return ngHD;
	}

	public void setNgHD(Date ngHD) {
		this.ngHD = ngHD;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Collection<CtHd> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(Collection<CtHd> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public BigDecimal getTrGia() {
		return trGia;
	}

	public void setTrGia(BigDecimal trGia) {
		this.trGia = trGia;
	}

}
