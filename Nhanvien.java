package doan_oop;

import java.util.Scanner;

public class Nhanvien {
	   public class chitiet8{
		   private int manhanvien;
		   private String honhanvien;
		   private String tennhanvien;
		   private float luongnhanvien;
		
		   public chitiet8() {   
		   }
		   
		   public  chitiet8(int manhanvien,String honhanvien,String tennhanvien,float luongnhanvien) {
			   this.manhanvien=manhanvien;
			   this.honhanvien=honhanvien;
			   this.tennhanvien=tennhanvien;
			   this.luongnhanvien=luongnhanvien;
		   }
		   public void nhap() {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Nhập mã nhân viên");
			   manhanvien=sc.nextInt();
			   sc.nextLine();
			   System.out.println("Nhập Họ nhân viên");
			   honhanvien=sc.nextLine();
			   System.out.println("Nhập Tên nhân viên");
			   tennhanvien=sc.nextLine();
			   System.out.println("Nhập lương nhân viên");
			   luongnhanvien=sc.nextInt();
	 
		   }
		   
		   public void xuat() {
			   System.out.println("***************");
			   System.out.println("Mã nhân viên "+ manhanvien);
			   System.out.println("Họ nhân viên "+honhanvien);
			   System.out.println("Tên nhân viên"+tennhanvien);
			   System.out.println("Lương nhân viên "+luongnhanvien);
			
		   }

		public int getManhanvien() {
			return manhanvien;
		}

		public void setManhanvien(int manhanvien) {
			this.manhanvien = manhanvien;
		}

		public String getHonhanvien() {
			return honhanvien;
		}

		public void setHonhanvien(String honhanvien) {
			this.honhanvien = honhanvien;
		}

		public String getTennhanvien() {
			return tennhanvien;
		}

		public void setTennhanvien(String tennhanvien) {
			this.tennhanvien = tennhanvien;
		}

		public float getLuongnhanvien() {
			return luongnhanvien;
		}

		public void setLuongnhanvien(float luongnhanvien) {
			this.luongnhanvien = luongnhanvien;
		}
		   
	   }
}