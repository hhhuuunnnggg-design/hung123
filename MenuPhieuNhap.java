package doan_oop;

import java.util.Date;
import java.util.Scanner;

import doan_oop.Phieunhap.Chitiet1;


public class MenuPhieuNhap {
	private static DSPhieuNhap dsPhieuNhap= new DSPhieuNhap ();
	public static void main(String[] args) {
		MenuPhieuNhap menu =new MenuPhieuNhap();
		menu.startMenupn();
	}
	
	
	
	
	
	 public static void startMenupn() {
	        //DANHSACH1 DANHSACH1 = new DANHSACH1();
	        Date ngayNhap = new Date();			       //mã  mã nv        tổng tiền  mã nhad cung cấp
	        DSPhieuNhap.DANHSACH1.codecung1(new Chitiet1(154, 214, ngayNhap, 1245, 1254));
	        DSPhieuNhap.DANHSACH1.codecung1(new Chitiet1(12, 451, ngayNhap, 148114, 4875));
	        DSPhieuNhap.DANHSACH1.codecung1(new Chitiet1(13, 136, ngayNhap, 481154, 487));
	        DSPhieuNhap.DANHSACH1.codecung1(new Chitiet1(14, 481, ngayNhap, 94148755, 482));
	        DSPhieuNhap.DANHSACH1.codecung1(new Chitiet1(15, 481, ngayNhap, 48761514, 4985));
  
	        while (true) {
	            System.out.println("====Menu====");
	            System.out.println("1. Thêm phiếu nhập");
	            System.out.println("2. Xóa phiếu nhập");
	            System.out.println("3. Tìm kiếm phiếu nhập");// 2 cái 
	            System.out.println("4. Xuất danh sách phiếu nhập");
	            System.out.println("5. Thống kê");// 2 cái
	            System.out.println("6.Sửa thông tin ");//1 ciá
	            System.out.println("7. Quay về màn hình chính");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn thao tác: ");
	            Scanner sc = new Scanner(System.in);
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    DSPhieuNhap.DANHSACH1.themds();
	                    break;
	                case 2:
	                    DSPhieuNhap.DANHSACH1.xoads();
	                    break;
	                case 3:
	                    DSPhieuNhap.DANHSACH1.timkiemds();
	                    break;
	                case 4:
	                    DSPhieuNhap.DANHSACH1.xuatds();
	                    break;
	                case 5:
	                    DSPhieuNhap.DANHSACH1.thongKe();
	                    break;
	                case 6:
	                	DSPhieuNhap.DANHSACH1.suaThongTin();
	                	break;
	                case 7:	                   
	                    tong.main(null);
	                    break;
	                    
	                case 0:
	                    System.exit(0); // Thoát khỏi chương trình
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	                    break;
	            }
	        }
	    }
}
