-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 14, 2015 at 05:55 PM
-- Server version: 5.5.37
-- PHP Version: 5.5.11-3+deb.sury.org~precise+1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `quanlybanhang`
--

-- --------------------------------------------------------

--
-- Table structure for table `CTHD`
--

CREATE TABLE IF NOT EXISTS `CTHD` (
  `MASP` varchar(255) NOT NULL,
  `SOHD` int(11) NOT NULL,
  `SL` int(11) DEFAULT NULL,
  PRIMARY KEY (`MASP`,`SOHD`),
  KEY `FK_l34rn2ymvfrmogk0vsyb5vg1i` (`SOHD`),
  KEY `FK_ccaf6v99sobhy4eeluc7ilt3u` (`MASP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CTHD`
--

INSERT INTO `CTHD` (`MASP`, `SOHD`, `SL`) VALUES
('BB01', 1002, 20),
('BB01', 1014, 50),
('BB02', 1002, 20),
('BB02', 1014, 100),
('BB02', 1015, 30),
('BB03', 1003, 10),
('BB03', 1015, 7),
('BC01', 1001, 5),
('BC02', 1001, 10),
('BC02', 1014, 80),
('BC04', 1002, 20),
('BC04', 1014, 60),
('ST01', 1001, 5),
('ST01', 1006, 30),
('ST02', 1006, 10),
('ST03', 1007, 10),
('ST04', 1008, 8),
('ST04', 1010, 50),
('ST04', 1018, 6),
('ST04', 1023, 6),
('ST05', 1009, 10),
('ST05', 1019, 1),
('ST06', 1011, 50),
('ST06', 1019, 2),
('ST07', 1010, 50),
('ST07', 1012, 5),
('ST07', 1020, 10),
('ST07', 1022, 1),
('ST08', 1001, 10),
('ST08', 1010, 100),
('ST08', 1013, 5),
('ST08', 1021, 5),
('TV01', 1004, 20),
('TV01', 1016, 5),
('TV01', 1021, 7),
('TV02', 1001, 10),
('TV02', 1004, 10),
('TV02', 1017, 1),
('TV02', 1021, 10),
('TV03', 1004, 10),
('TV03', 1010, 100),
('TV03', 1017, 1),
('TV04', 1004, 10),
('TV04', 1017, 5),
('TV05', 1005, 50),
('TV06', 1005, 50),
('TV07', 1006, 20),
('TV07', 1010, 50);

-- --------------------------------------------------------

--
-- Table structure for table `HOADON`
--

CREATE TABLE IF NOT EXISTS `HOADON` (
  `SOHD` int(11) NOT NULL AUTO_INCREMENT,
  `MAKH` varchar(4) DEFAULT NULL,
  `MANV` varchar(4) DEFAULT NULL,
  `NGHD` date DEFAULT NULL,
  `TRIGIA` decimal(19,6) DEFAULT NULL,
  PRIMARY KEY (`SOHD`),
  KEY `FK_965gg3r71v9h8q9qe6ria7qcd` (`MAKH`),
  KEY `FK_mqw4plvlwibyybmqo2rb4nek6` (`MANV`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1024 ;

--
-- Dumping data for table `HOADON`
--

INSERT INTO `HOADON` (`SOHD`, `MAKH`, `MANV`, `NGHD`, `TRIGIA`) VALUES
(1001, 'KH01', 'NV01', '2006-07-23', 320.000000),
(1002, 'KH01', 'NV02', '2006-08-12', 840.000000),
(1003, 'KH02', 'NV01', '2006-08-23', 100.000000),
(1004, 'KH02', 'NV01', '2006-09-01', 180.000000),
(1005, 'KH01', 'NV02', '2006-01-20', 3.800000),
(1006, 'KH01', 'NV03', '2006-01-16', 2.430000),
(1007, 'KH03', 'NV03', '2006-10-28', 510.000000),
(1008, 'KH01', 'NV03', '2006-10-28', 440.000000),
(1009, 'KH03', 'NV04', '2006-10-28', 200.000000),
(1010, 'KH01', 'NV01', '2006-11-01', 5.200000),
(1011, 'KH04', 'NV03', '2006-11-04', 250.000000),
(1012, 'KH05', 'NV03', '2006-11-30', 21.000000),
(1013, 'KH06', 'NV01', '2006-12-12', 5.000000),
(1014, 'KH03', 'NV02', '2006-12-31', 3.150000),
(1015, 'KH06', 'NV01', '2007-01-01', 910.000000),
(1016, 'KH07', 'NV02', '2007-01-01', 12.000000),
(1017, 'KH08', 'NV03', '2007-01-02', 35.000000),
(1018, 'KH08', 'NV03', '2007-01-13', 330.000000),
(1019, 'KH01', 'NV03', '2007-01-13', 30.000000),
(1020, 'KH09', 'NV04', '2007-01-14', 70.000000),
(1021, 'KH10', 'NV03', '2007-01-16', 67.000000),
(1022, NULL, 'NV03', '2007-01-16', 7.000000),
(1023, NULL, 'NV01', '2007-01-17', 330.000000);

-- --------------------------------------------------------

--
-- Table structure for table `KHACHHANG`
--

CREATE TABLE IF NOT EXISTS `KHACHHANG` (
  `MAKH` varchar(4) NOT NULL,
  `DCHI` varchar(50) DEFAULT NULL,
  `DOANHSO` float DEFAULT NULL,
  `HOTEN` varchar(40) NOT NULL,
  `NGDK` datetime DEFAULT NULL,
  `NGSINH` datetime DEFAULT NULL,
  `SODT` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MAKH`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `KHACHHANG`
--

INSERT INTO `KHACHHANG` (`MAKH`, `DCHI`, `DOANHSO`, `HOTEN`, `NGDK`, `NGSINH`, `SODT`) VALUES
('KH01', '731 Tran Hung Dao, Q5, TpHCM', 13060000, 'Nguyen Van A', '2006-07-22 00:00:00', '1960-10-22 00:00:00', '08823451'),
('KH02', '23/5 Nguyen Trai, Q5, TpHCM', 280000, 'Tran Ngoc Han', '2006-07-30 00:00:00', '1974-04-03 00:00:00', '0908256478'),
('KH03', '45 Nguyen Canh Chan, Q1, TpHCM', 3860000, 'Tran Ngoc Linh', '2006-08-05 00:00:00', '1980-06-12 00:00:00', '0938776266'),
('KH04', '50/34 Le Dai Hanh, Q10, TpHCM', 250000, 'Tran Minh Long', '2006-08-05 00:00:00', '1980-06-12 00:00:00', '0917325476'),
('KH05', '34 Truong Dinh, Q3, TpHCM', 21000, 'Le Nhat Minh', '2006-10-02 00:00:00', '1965-03-09 00:00:00', '08246108'),
('KH06', '227 Nguyen Van Cu, Q5, TpHCM', 915000, 'Le Hoai Thuong', '2006-11-24 00:00:00', '1981-12-31 00:00:00', '08631738'),
('KH07', '32/3 Tran Binh Trong, Q5, TpHCM', 12500, 'Nguyen Van Tam', '2006-12-01 00:00:00', '1971-04-06 00:00:00', '0916783565'),
('KH08', '45/2 An Duong Vuong, Q5, TpHCM', 365000, 'Phan Thi Thanh', '2006-12-13 00:00:00', '1971-01-10 00:00:00', '0938435756'),
('KH09', '873 Le Hong Phong, Q5, TpHCM', 70000, 'Le Ha Vinh', '2007-01-14 00:00:00', '1979-09-03 00:00:00', '08654763'),
('KH10', '34/34B Nguyen Trai, Q1, TpHCM', 67500, 'Ha Duy Lap', '2007-01-16 00:00:00', '1983-05-02 00:00:00', '08768904');

-- --------------------------------------------------------

--
-- Table structure for table `NHANVIEN`
--

CREATE TABLE IF NOT EXISTS `NHANVIEN` (
  `MANV` varchar(4) NOT NULL,
  `HOTEN` varchar(40) DEFAULT NULL,
  `NGVL` date DEFAULT NULL,
  `SODT` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MANV`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `NHANVIEN`
--

INSERT INTO `NHANVIEN` (`MANV`, `HOTEN`, `NGVL`, `SODT`) VALUES
('NV01', 'Nguyen Nhu Nhut', '2006-04-13', '0927345678'),
('NV02', 'Le Thi Phi Yen', '2006-04-21', '0987567390'),
('NV03', 'Nguyen Van B', '2006-04-27', '0997047382'),
('NV04', 'Ngo Thanh Tuan', '2006-04-24', '0913758498'),
('NV05', 'Nguyen Thi Truc Thanh', '2006-04-20', '0918590387');

-- --------------------------------------------------------

--
-- Table structure for table `SANPHAM`
--

CREATE TABLE IF NOT EXISTS `SANPHAM` (
  `MASP` varchar(4) NOT NULL,
  `DVT` varchar(20) DEFAULT NULL,
  `GIA` double DEFAULT NULL,
  `NUOCSX` varchar(40) DEFAULT NULL,
  `TENSP` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`MASP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `SANPHAM`
--

INSERT INTO `SANPHAM` (`MASP`, `DVT`, `GIA`, `NUOCSX`, `TENSP`) VALUES
('BB01', 'cay', 5, 'Viet Nam', 'But bi'),
('BB02', 'cay', 7, 'Trung Quoc', 'But bi'),
('BB03', 'hop', 100, 'Thai Lan', 'But bi'),
('BC01', 'cay', 3, 'Singapore', 'But chi'),
('BC02', 'cay', 5, 'Singapore', 'But chi'),
('BC03', 'cay', 3.5, 'Viet Nam', 'But chi'),
('BC04', 'hop', 30, 'Viet Nam', 'But chi'),
('ST01', 'quyen', 40, 'Trung Quoc', 'So tay 500 trang'),
('ST02', 'quyen', 55, 'Viet Nam', 'So tay loai 1'),
('ST03', 'quyen', 51, 'Viet Nam', 'So tay loai 2'),
('ST04', 'quyen', 55, 'Thai Lan', 'So tay'),
('ST05', 'quyen', 20, 'Thai Lan', 'So tay mong'),
('ST06', 'hop', 5, 'Viet Nam', 'Phan viet bang'),
('ST07', 'hop', 7, 'Viet Nam', 'Phan khong bui'),
('ST08', 'cai', 1, 'Viet Nam', 'Bong bang'),
('ST09', 'cay', 5, 'Viet Nam', 'But long'),
('ST10', 'cay', 7, 'Trung Quoc', 'But long'),
('TV01', 'quyen', 2.5, 'Trung Quoc', 'Tap 100 giay mong'),
('TV02', 'quyen', 4.5, 'Trung Quoc', 'Tap 200 giay mong'),
('TV03', 'quyen', 3, 'Viet Nam', 'Tap 100 giay tot'),
('TV04', 'quyen', 5.5, 'Viet Nam', 'Tap 200 giay tot'),
('TV05', 'chuc', 23, 'Viet Nam', 'Tap 100 trang'),
('TV06', 'chuc', 53, 'Viet Nam', 'Tap 200 trang'),
('TV07', 'chuc', 34, 'Trung Quoc', 'Tap 100 trang');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `CTHD`
--
ALTER TABLE `CTHD`
  ADD CONSTRAINT `FK_ccaf6v99sobhy4eeluc7ilt3u` FOREIGN KEY (`MASP`) REFERENCES `SANPHAM` (`MASP`),
  ADD CONSTRAINT `FK_l34rn2ymvfrmogk0vsyb5vg1i` FOREIGN KEY (`SOHD`) REFERENCES `HOADON` (`SOHD`);

--
-- Constraints for table `HOADON`
--
ALTER TABLE `HOADON`
  ADD CONSTRAINT `FK_965gg3r71v9h8q9qe6ria7qcd` FOREIGN KEY (`MAKH`) REFERENCES `KHACHHANG` (`MAKH`),
  ADD CONSTRAINT `FK_mqw4plvlwibyybmqo2rb4nek6` FOREIGN KEY (`MANV`) REFERENCES `NHANVIEN` (`MANV`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
