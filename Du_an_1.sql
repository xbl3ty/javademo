CREATE DATABASE DUAN_1_NHOM5
use DUAN_1_NHOM5
GO

CREATE TABLE ChiTietChuyenXe(
	MaCTCX int  IDENTITY(1,1) PRIMARY KEY,
	Sove int not null,
	DiemDon nvarchar(200) not null,
	DiemDen nvarchar(200) not null,
	KyGui nvarchar(10) not null,
	PTThanhToan varchar(50) null,
	MaKm varchar(20)not null,
	MaND varchar(20) not null,
	MaCx varchar(20)not null,
	Gia MONEY,
	trangthai int	  
)


CREATE TABLE ChiTietNguoiDung(
	MaND varchar(20) primary key not null,
	HoTen nvarchar(50) not null,
	SDT int not null,
	Email nvarchar(50) not null,
	Ngaysinh datetime,	
	GioiTinh bit,
	Chucvu varchar(50) not null
--	CONSTRAINT lk_cx FOREIGN KEY (mand) REFERENCES chitietchuyenxe (mand)
)

CREATE TABLE NguoiDung(
	MaND varchar(20) NOT NULL,
	MatKhau varchar(50) null,
	Chucvu varchar(50),
)



CREATE TABLE KhuyenMai(
	MaKM varchar(20) not null,
	TenKM nvarchar(50) null,
	LoaiKH nvarchar(50) null,
	SoLuong int null,
	BatDau dateTIME null,
	KetThuc dateTIME null,
	PhanTRamKM int,
	hinh varchar(50),
	PRIMARY KEY(MaKM),

)

CREATE TABLE Xe(
	MaCX varchar(20)PRIMARY KEY not null,
	MaNV varchar(10) null,
	DiemDon nvarchar(50) null,
	DiemDen nvarchar(50) null,
	TrangThai bit null,
	ThoiGIanXuatPHat dateTime,
	biensoxe varchar(20),
	Gia money,
	

)
ALTER TABLE NGUOIDUNG
ADD CONSTRAINT lk_nv FOREIGN KEY (manD) REFERENCES chitietNGUOIDUNG (maND)

ALTER TABLE chitietchuyenxe
ADD CONSTRAINT lk_cx FOREIGN KEY (macx) REFERENCES xe (macx)

ALTER TABLE chitietchuyenxe
ADD CONSTRAINT lk_km FOREIGN KEY (makm) REFERENCES khuyenmai (makm)

ALTER TABLE chitietchuyenxe
ADD CONSTRAINT lk_ND FOREIGN KEY (maND) REFERENCES ChitietNguoiDung (mand)

insert into ChiTietNguoiDung values ('ND01','QUANG NHAT','0956487337','NHATDZA2GMAIL.COM','1992-19-01','0','USER')
INSERT INTO XE VALUES ('CX01','NV01','BEN XE MIEN DONG','DAK LAK','1',' 2022-10-05 19:00:00','47ND01234',200000)
INSERT INTO NguoiDung VALUES ('ND01','123','USER')
INSERT INTO KhuyenMai VALUES('KM01','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','SINH VIEN','10',' 2022-10-15 12:00:00',' 2022-10-20 12:00:00','20','IMG')

insert into ChiTietNguoiDung values ('ND02','Van Quang','0954637383','QuangA2GMAIL.COM','2002-12-12','0','USER')
INSERT INTO XE VALUES ('CX02','NV02','BEN XE MIEN DONG','DAK LAK','1',' 2022-11-19 7:00:00','47ND01290',200000)
INSERT INTO NguoiDung VALUES ('ND02','123','USER')
INSERT INTO KhuyenMai VALUES('KM02','UU DAI NGAY 10/01 ','MOI DOI TUONG','10','2022-10-10 12:00:00 ','2022-10-15 12:00:00','20','IMG')

insert into ChiTietNguoiDung values ('ND03','BInh Le','0942929833','Binh224GMAIL.COM','2001-10-1','0','USER')
INSERT INTO XE VALUES ('CX03','NV03','TP HCM','DA Lat','1','2022-11-10 14:00:00 ','50ND01234',200000)
INSERT INTO NguoiDung VALUES ('ND03','123','USER')
INSERT INTO KhuyenMai VALUES('KM03','Uu Dai Cuoi Nam ','MOI DOI TUONG','10','2022-11-29 17:00:00','2022-12-01 17:00:00 ','20','IMG')

insert into ChiTietNguoiDung values ('ND04','Dinh KHang','0987097754','khang2GMAIL.COM','2003-10-10','0','USER')
INSERT INTO XE VALUES ('CX04','NV04','TP HCM','DA Nang','1','2022-12-01 19:30:00 ','51ND01234',200000)
INSERT INTO NguoiDung VALUES ('ND04','123','USER')
INSERT INTO KhuyenMai VALUES('KM04','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-12-01 19:00:00',' 2022-12-03 19:00:00','20','IMG')

insert into ChiTietNguoiDung values ('ND05','VAn Bao','0996444533','bao2GMAIL.COM','2000-10-10','0','USER')
INSERT INTO XE VALUES ('CX05','NV05','TP HCM','HA NOi','1','2022-11-03 19:30:00 ','53ND01234',200000)
INSERT INTO NguoiDung VALUES ('ND05','123','USER')
INSERT INTO KhuyenMai VALUES('KM05','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-01 2:00:00 ','2022-11-05 23:00:00','20','IMG')

insert into ChiTietNguoiDung values ('ND06','Tran HOang','0954241769','hoang2GMAIL.COM','2002-11-10','0','USER')
INSERT INTO XE VALUES ('CX06','NV06','DA Lat','Da Nang','1','2022-11-11 20:00:00 ','47ND05634',200000)
INSERT INTO NguoiDung VALUES ('ND06','123','USER')
INSERT INTO KhuyenMai VALUES('KM06','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-10 13:00:00','2022-11-13 23:00:00 ','20','IMG')

insert into ChiTietNguoiDung values ('ND07','VAn Tai','0986546733','taiGMAIL.COM','2002-1-10','0','USER')
INSERT INTO XE VALUES ('CX07','NV07','TP HCM','Quang BInh','1','2022-11-29 20:00:00 ','31ND0024',200000)
INSERT INTO NguoiDung VALUES ('ND07','123','USER')
INSERT INTO KhuyenMai VALUES('KM07','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-20 12:00:00','2022-11-22 12:00:00 ','20','IMG')

insert into ChiTietNguoiDung values ('ND08','VAn Tuan','0986546733','tuan223GMAIL.COM','1999-10-10','0','USER')
INSERT INTO XE VALUES ('CX08','NV08','TP HCM','VUng Tau','1','2022-11-12 20:00:00 ','31ND0024',200000)
INSERT INTO NguoiDung VALUES ('ND08','123','USER')
INSERT INTO KhuyenMai VALUES('KM08','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-10 12:00:00 ','2022-11-15 20:00:00','20','IMG')

insert into ChiTietNguoiDung values ('ND09','Van Son','0986546733','son132GMAIL.COM','2004-08-10','0','USER')
INSERT INTO XE VALUES ('CX09','NV09','TP HCM','Quy NHon','1','2022-11-05 19:00:00 ','31ND0024',200000)
INSERT INTO NguoiDung VALUES ('ND09','123','USER')
INSERT INTO KhuyenMai VALUES('KM09','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-01 12:00:00 ','2022-11-05 12:00:00 ','20','IMG')

insert into ChiTietNguoiDung values ('ND010','Tuang Trinh','0986546733','2002-07-15','TRinh009GMAIL.COM','0','USER')
INSERT INTO XE VALUES ('CX010','NV010','TP HCM','Quang BInh','1','2022-12-01 14:00:00 ','31ND0024',200000)
INSERT INTO NguoiDung VALUES ('ND010','123','USER')
INSERT INTO KhuyenMai VALUES('KM010','UU DAI DANH CHO SINH VIEN DAT XE NGAY HOM NAY ','sinh vien','10','2022-11-30 19:00:00 ','2022-12-02 23:00:00 ','20','IMG')





--CHITIETCHUYENXE----
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('01','Ben Xe MIen Dong','Dak LAk','hanh ly','Momo','KM01','ND01','CX01','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('02','TP HCM','DA NANG','hanh ly','Momo','KM02','ND02','CX02','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('03','TP HCM','DA Lat','hanh ly','Banking','KM03','ND03','CX03','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('04','TP HCM','DA NANG','hanh ly','Banking','KM04','ND04','CX04','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('05','TP HCM','HA NOI','hanh ly','Banking','KM05','ND05','CX05','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('06','Da Lat','Da Nang','hanh ly','Banking','KM06','ND06','CX06','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('07','TP HCM','Quang BInh','hanh ly','Banking','KM07','ND07','CX07','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('08','TP HCM','Vung Tau','hanh ly','Banking','KM08','ND08','CX08','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('09','TP HCM','Quy Nhon','hanh ly','Banking','KM09','ND09','CX09','200000','0')
insert into ChiTietChuyenXe (SOVE,DIEMDON,DIEMDEN,KYGUI,PTTHANHTOAN,MaKM,MaND,MaCX,GIA,TRANGTHAI)values ('10','TP HCM','Phan Thiet','hanh ly','Banking','KM010','ND010','CX010','200000','0')








select*From ChiTietChuyenXe
select*From ChiTietNguoiDung
select*from xe
select*From NguoiDung
select*From KhuyenMai


