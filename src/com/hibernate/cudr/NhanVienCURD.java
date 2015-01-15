package com.hibernate.cudr;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.persistence.HibernatePersistence;
import com.hibernate.tutorial.NhanVien;
import com.hibernate.utility.Constant;
import com.hibernate.utility.DateTimeUtil;

public class NhanVienCURD {
	public static void main(String[] args) {
		NhanVienCURD nhanVienCURD = new NhanVienCURD();
		nhanVienCURD.insertNhanVien();
	}
	
	public void insertNhanVien(){
		Session session = HibernatePersistence.getSessionFactory()
				.openSession();
		
		session.beginTransaction();
		
		 
		session.getTransaction().commit();
		
		HibernatePersistence.shutdown();
	}
}
