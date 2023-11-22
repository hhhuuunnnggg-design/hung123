package doan_oop;



//----------------------



import java.util.Scanner;

import doan_oop.DSChiTietPhieuNhap.DANHSACH9;
import doan_oop.DSNhaCungCap.DANHSACH7;
import doan_oop.DSPhieuNhap.DANHSACH1;

public  class tong {
	public static void main(String[] args) {
		cocc cc;//= new cocc();
		cocc .haha();
		
	}

//Nguyễn đình hùng 3122410136
	
}
class  cocc{
	public static  void haha() {
		DANHSACH1 ncc ;//= new DANHSACH();
		DANHSACH7 pn;// = new DANHSACH1();
		DANHSACH9 ctpn;// = new DANHSACH2();
		System.out.println("**************************");
		System.out.println("*    MÀN HÌNH CHÍNH      *");
		System.out.println("* 1. nhà cung cấp         *");
		System.out.println("* 2. Phiếu nhập          *");
		System.out.println("* 3. Chi tiết phiếu nhập *");
		System.out.println("*************************");
		
		Scanner sc = new Scanner(System.in);
		int chose=sc.nextInt();
		switch (chose) {
			case 1: 
				 MenuNhaCungCap.startMenuncc();
				break;
			case 2:
				MenuPhieuNhap.startMenupn();
				break;
			case 3:
				MenuChiTietPhieuNhap.startMenuctpn();
				break;
			case 0:
                System.exit(0); // Thoát khỏi chương trình
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
                //break;
		} 
	}

	
}