package doan_oop;

import java.util.Scanner;

public class MenuNhaCungCap {
    private static DSNhaCungCap dsNhaCungCap = new DSNhaCungCap();

    public static void main(String[] args) {
        MenuNhaCungCap menu = new MenuNhaCungCap();
        menu.startMenuncc();
    }

    public static void startMenuncc() {
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(123, "Phong Vũ", "Sài Gòn"));
    	
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(456, "Minh Long", "Long An"));
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(789, "FPT", "Hà Nội"));
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(112, "Phương Hằng", "Công Viên Thủy Tinh"));
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(12323, "Phong Vũ", "Sài Gòn"));
    	DSNhaCungCap.DANHSACH7.codecung(new Nhacungcap.chitiet7(113, "Phan Anh", "Hải Phòng"));

        while (true) {
            System.out.println("====Menu====");
            System.out.println("1. Them nha cung cap");
            System.out.println("2. Xoa nha cung cap");
            System.out.println("3. Tim kiem nha cung cap");
            System.out.println("4. Xuat danh sach nha cung cap");
            System.out.println("5. Thống kê "); 
            System.out.println("6. Sửa thông tin");
            System.out.println("7. Quay ve man hinh chinh ");
            System.out.println("0. Thoat");
            System.out.print("Chon thao tac: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                	DSNhaCungCap.DANHSACH7.themds(choice);
                    break;
                case 2:
                	DSNhaCungCap.DANHSACH7.xoads();
                    break;
                case 3:
                	DSNhaCungCap.DANHSACH7.timkiemds1();
                    break;
                case 4:
                	DSNhaCungCap.DANHSACH7.xuatds();
                    break;
                case 5:
                	DSNhaCungCap.DANHSACH7.thongKe();
                    break;
                case 6:
                	DSNhaCungCap.DANHSACH7.suaThongTin();
                    break;
                case 7:
                	tong.main(null);
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }
}