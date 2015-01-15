package com.hibernate.tutorial;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CTHD")
public class CtHd implements Serializable {
	private static final long serialVersionUID = -9157017657649426327L;
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name = "SOHD", column = @Column(name = "soHD", nullable = false)),
		@AttributeOverride(name = "MASP", column = @Column(name = "maSP", nullable = false))})
	SanPhamHoaDonPK sanPhamHoaDon;
	
	@ManyToOne()
	@JoinColumn(name = "SOHD", nullable = false, insertable = false, updatable = false)
	private HoaDon hoaDon;
	
	@ManyToOne()
	@JoinColumn(name = "MASP", nullable = false, insertable = false, updatable = false)
	private SanPham sanPham;
	
	@Column(name = "SL")
	private int sL;

	public int getsL() {
		return sL;
	}

	public void setsL(int sL) {
		this.sL = sL;
	}
}
