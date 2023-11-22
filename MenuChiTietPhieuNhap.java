package doan_oop;

import java.util.Scanner;

public class MenuChiTietPhieuNhap {
    public static void main(String[] args) {
        MenuChiTietPhieuNhap menu = new MenuChiTietPhieuNhap();
        menu.startMenuctpn();
    }

    public static void startMenuctpn() {
        DSChiTietPhieuNhap.DANHSACH9.codecung9(new Chitietphieunhap.chitiet9(1254, 125, 5, 100, 500));
        DSChiTietPhieuNhap.DANHSACH9.codecung9(new Chitietphieunhap.chitiet9(15421, 415, 3, 125, 375));
        DSChiTietPhieuNhap.DANHSACH9.codecung9(new Chitietphieunhap.chitiet9(1551, 102, 5, 50, 250));
        DSChiTietPhieuNhap.DANHSACH9.codecung9(new Chitietphieunhap.chitiet9(962, 145, 7, 200, 1400));
        DSChiTietPhieuNhap.DANHSACH9.codecung9(new Chitietphieunhap.chitiet9(159, 115, 6, 375, 2250));

        while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Thêm phiếu chi tiết ");
            System.out.println("2. Xóa phiếu nhập chi tiết");
            System.out.println("3. Tìm kiếm phiếu nhập chi tiết");
            System.out.println("4. Xuất danh sách phiếu nhập chi tiết ");
            System.out.println("5. Thống kê");
            System.out.println("7. Quay về màn hình chính ");
            System.out.println("0. Thoát");
            System.out.print("Chọn thao tác: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    DSChiTietPhieuNhap.DANHSACH9.themds(choice);
                    break;
                case 2:
                    DSChiTietPhieuNhap.DANHSACH9.xoads();
                    break;
                case 3:
                    DSChiTietPhieuNhap.DANHSACH9.timkiemds1();
                    break;
                case 4:
                    DSChiTietPhieuNhap.DANHSACH9.xuatds();
                    break;
                case 5:
                    DSChiTietPhieuNhap.DANHSACH9.thongKeNangCao();
                    break;
                case 7:
                	tong.main(null);;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
