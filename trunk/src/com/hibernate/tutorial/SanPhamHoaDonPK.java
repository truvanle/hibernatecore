package com.hibernate.tutorial;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SanPhamHoaDonPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "SOHD", nullable = false)
	private int soHD;

	@Column(name = "MASP", nullable = false)
	private String maSP;

	public int getSoHD() {
		return soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
}
