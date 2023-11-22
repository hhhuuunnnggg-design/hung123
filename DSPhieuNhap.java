package doan_oop;

//import java.util.Date;
import java.util.Scanner;

//import doan.DANHSACH9;
//import doan.chitiet1;
import doan_oop.Phieunhap.Chitiet1;
//import doan_oop.Chitietphieunhap.chitiet9;

import doan_oop.DSChiTietPhieuNhap.DANHSACH9;
import doan_oop.DSNhaCungCap.DANHSACH7;

public class DSPhieuNhap {
    public static class DANHSACH1 {
        private static int n;
        private static Chitiet1[] ct1;
        private static int max = 50;

        static {
            n = 0;
            ct1 = new Chitiet1[max];
        }

       /* public static void codecung2(Chitiet1 ct1) {
            boolean ktma = false;

            for (int i = 0; i < n; i++) {
                if (DANHSACH1.ct1[i] != null && DANHSACH1.ct1[i].getMaphieunhap() == ct1.getMaphieunhap()) {
                    ktma = true;
                    break;
                }
            }

            if (!ktma) {
                if (n < max) {
                    DANHSACH1.ct1[n] = ct1;
                    n++;
                    System.out.println("Đã thêm thành công");
                } else {
                    System.out.println("Danh sách đã đầy");
                }
            } else {
                System.out.println("Mã phiếu nhập đã tồn tại");
            }
        }
        */
        public static void suaThongTin() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã NCC bạn muốn sửa thông tin");
            int maPN = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (ct1[i] != null && ct1[i].getMaphieunhap() == maPN) {
                    System.out.println("Nhập thông tin mới cho nhà cung cấp:");
                    ct1[i].nhap(); // Sử dụng phương thức nhap() của ct1[i] để nhập thông tin mới
                    System.out.println("Thông tin đã được cập nhật.");
                    return;
                }
            }
            
            System.out.println("Không tìm thấy nhà cung cấp có mã " + maPN);
        }
        
        public static void codecung1(Chitiet1 ct1) {
            boolean daCoMaTrung = false;

            for (int i = 0; i < n; i++) {
                if (DANHSACH1.ct1[i]  != null && DANHSACH1.ct1[i].getMaphieunhap() == ct1.getMaphieunhap()) {
                    daCoMaTrung = true;
                    break;
                }
            }

            if (!daCoMaTrung) {
                if (n < max) {
                	DANHSACH1.ct1[n] = ct1;
                    n++;
                    System.out.println("Đã thêm thành công");
                } else {
                    System.out.println("Danh sách đã đầy");
                }
            } else {
                System.out.println("Mã phiếu nhập đã tồn tại");
            }
        }


        public static void xuatds() {
            for (int i = 0; i < n; i++) {
                ct1[i].xuat();
            }
        }
        
        public static boolean kiemTraTrungMa(int ma) {
            for (int i = 0; i < n; i++) {
                if (ct1[i].getMaphieunhap() == ma) {
                    return true;
                }
            }
            return false;
        }
/*
        public static void themds1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("=========================");
            Phieunhap.Chitiet1 newct1 = new Phieunhap.Chitiet1();
            newct1.nhap();

            // DANHSACH9.themds(newct1.getMaphieunhap()); // Đoạn này có thể cần sửa lại

            boolean kt = false;

            for (int i = 0; i < n; i++) {
                if (ct1[i].getMaphieunhap() == newct1.getMaphieunhap()) {
                    kt = true;
                    break;
                }
            }

            if (!kt) {
                ct1[n] = newct1;
                n++;
                System.out.println("Đã thêm thành công");
            } else {
                System.out.println("Mã phiếu nhập đã tồn tại");
            }
        }
        
        public static void themds() {
            System.out.println("===================================");
            System.out.println("Nhap thong tin nha cung cap: ");
            Nhacungcap.chitiet7 newct = new Nhacungcap.chitiet7();
            newct.nhap();
            newct.setManhacungcap(max);
            codecung1(newct);
        }
        */
        /*public static void themds111() {
            System.out.println("===================================");
            System.out.println("Nhap thong tin nha cung cap: ");
            Chitiet1 newct = new Chitiet1();
            newct.nhap();
            newct.setManhacungcap(max);
            codecung1(newct);
        }
*/
        public static void themds() {
            Scanner sc = new Scanner(System.in);
            System.out.println("=========================");
            Chitiet1 newct = new Chitiet1();
            newct.nhap();

            DANHSACH9.themds(newct.getMaphieunhap());
            //DANHSACH7.themds(newct.getMaphieunhap());
            
            boolean kt = false;

            for (int i = 0; i < n; i++) {
                if (ct1[i].getMaphieunhap() == newct.getMaphieunhap()) {
                    kt = true;
                    break;
                }
            }
            if (kt == false) {
                ct1[n] = newct;
                n++;
                System.out.println("Đã thêm thành công");
            } else {
                System.out.println("Mã phiếu nhập đã tồn tại");
            }
        }
        
        public static void xoads() {
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================");
            System.out.println("Nhập mã cần xóa");
            int cc = sc.nextInt();
            boolean kt1 = false;

            for (int i = 0; i < n; i++) {
                if (ct1[i].getMaphieunhap() == cc) {
                    for (int j = i; j < n-1; j++) {
                        ct1[j] = ct1[j + 1];
                    }
                    n--;
                    kt1 = true;
                    System.out.println("Mã phiếu nhập đã được xóa");
                    break;
                }
            }

            if (!kt1) {
                System.out.println("Không tìm thấy mã phiếu nhập");
            }
        }
        public static void timKiemTheoMaNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
            int maNV = sc.nextInt();
            boolean thayMaNV = false;
            for (int i = 0; i < n; i++) {
                if (ct1[i] != null && ct1[i].getManhanvien() == maNV) {
                    System.out.println("Đã tìm thấy:");
                    ct1[i].xuat();
                    thayMaNV = true;
                    break;
                }
            }

            if (!thayMaNV) {
                System.out.println("Không tìm thấy mã nhân viên");
            }
        }
        public static void timkiemtheoma() {
            System.out.println("==================================");
            System.out.print("Nhập mã phiếu nhập cần tìm kiếm: ");
            Scanner sc = new Scanner(System.in);
            int ma = sc.nextInt();
            boolean thayma = false;

            for (int i = 0; i < n; i++) {
                if (ct1[i].getMaphieunhap() == ma) {
                    System.out.println("Đã tìm thấy:");
                    thayma = true;
                    ct1[i].xuat();
                    break;
                }
            }

            if (!thayma) {
                System.out.println("Không tìm thấy mã nha cung cap");
            }
        }
        public static void timkiemds() {
        	System.out.println("---------------------");
        	System.out.println("1.Tìm kiếm theo mã Phiếu nhập");
        	System.out.println("2. Tìm kiếm theo mã nhân viên ");
        	Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1: 
				timkiemtheoma();
				break;
			case 2:
				timKiemTheoMaNhanVien();
				break;
            }
        }
        
        
        
        
        public static void thongKeTongTien() {
            float tongTien = 0;

            for (int i = 0; i < n; i++) {
                if (ct1[i] != null) {
                    tongTien += ct1[i].getTongtien();
                }
            }

            System.out.println("Tổng tiền của tất cả các phiếu nhập: " + tongTien);
        }

        public static void thongKeTheoNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên cần thống kê: ");
            int maNV = sc.nextInt();
            float tongTienNV = 0;

            for (int i = 0; i < n; i++) {
                if (ct1[i] != null && ct1[i].getManhanvien() == maNV) {
                    tongTienNV += ct1[i].getTongtien();
                }
            }

            System.out.println("Tổng tiền của nhân viên có mã " + maNV + ": " + tongTienNV);
        }
        public static void thongKe() {
            System.out.println("===================================");
            System.out.println("1.Thống kê theo tổng tiền");
            System.out.println("2.Thống kê theo nhân viên");
            Scanner sc=new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
			case 1: 
				thongKeTongTien();
				break;
			case 2:
				thongKeTheoNhanVien();
				break;
            }
            

            System.out.println("===================================");
        }

		

        

    }   
}
