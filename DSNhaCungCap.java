
package doan_oop;

import java.util.Scanner;

public class DSNhaCungCap {
    public static class DANHSACH7 {
        protected static int n;
        protected static Nhacungcap.chitiet7[] ct7;
        protected static int max = 50;

        static {
            n = 0; 
            ct7 = new Nhacungcap.chitiet7[max];
        }

        public static void nhapds() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong nha cung cap: ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                ct7[i] = new Nhacungcap.chitiet7();
                ct7[i].nhap();
            }
        }

        public static void codecung(Nhacungcap.chitiet7 ct) {
            boolean kt = kiemTraTrungMa(ct.getManhacungcap());
            if (!kt) {
                if (n < max) {
                    DANHSACH7.ct7[n] = ct;
                    n++;
                    System.out.println("Đã thêm thành công!");
                } else {
                    System.out.println("Danh sách đã đầy");
                }
            } else {
                System.out.println("Mã nhà cung cấp đã tồn tại!");
            }
        }

        public static void xuatds() {
            for (int i = 0; i < n; i++) {
                ct7[i].xuat();
            }
        }

        public static void xuatds1() {
            for (int i = 0; i < n; i++) {
                ct7[i].xuat1();
            }
        }

        public static void themds(int manhacungcap) {
            System.out.println("===================================");
            System.out.println("Nhap thong tin nha cung cap: ");
            Nhacungcap.chitiet7 newct = new Nhacungcap.chitiet7();
            newct.nhap();
            newct.setManhacungcap(manhacungcap);
            codecung(newct);
        }

        public static void xoads() {
            System.out.println("----------------------");
            System.out.println("1. Xóa theo mã");
            System.out.println("2. Xóa theo tên");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=================================");
                    System.out.print("Nhap Ma so Nha cung cap can xoa: ");
                    Scanner sc1 = new Scanner(System.in);
                    int cc = sc1.nextInt();
                    boolean datimthay = false;
                    for (int i = 0; i < n; i++) {
                        if (ct7[i].getManhacungcap() == cc) {
                            for (int j = i; j < n; j++) {
                                ct7[j] = ct7[j + 1];
                            }
                            n--;
                            datimthay = true;
                            System.out.println("Ma nha cung cap da duoc xoa");
                            break;
                        }
                    }
                    if (!datimthay) {
                        System.out.println("Khong tim thay ma nha cung cap");
                    }
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.print("Nhap Ten Nha cung cap can xoa: ");
                    Scanner sc2 = new Scanner(System.in);
                    String tenNCC = sc2.nextLine();
                    boolean datimthay2 = false;
                    for (int i = 0; i < n; i++) {
                        if (ct7[i].getTennhacungcap().equalsIgnoreCase(tenNCC)) {
                            for (int j = i; j < n; j++) {
                                ct7[j] = ct7[j + 1];
                            }
                            n--;
                            datimthay2 = true;
                            System.out.println("Nha cung cap " + tenNCC + " da duoc xoa");
                            break;
                        }
                    }
                    if (!datimthay2) {
                        System.out.println("Khong tim thay ten nha cung cap");
                    }
                    break;
            }
        }

        public static void timkiemds1() {
            boolean tiptuc = true;
            while (tiptuc) {
                System.out.println("**********************************");
                System.out.println("1. Tìm kiếm theo mã nhà cung cấp");
                System.out.println("2. Tìm kiếm theo tên nhà cung cấp");
                System.out.println("3. Quay về Menu");
                Scanner sc = new Scanner(System.in);
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("Nhập mã cần tìm!");
                        int ma = sc.nextInt();
                        boolean timma = false;
                        for (int i = 0; i < n; i++) {
                            if (ct7[i].getManhacungcap() == ma) {
                                System.out.println("Đã tìm thấy");
                                timma = true;
                                ct7[i].xuat();
                            }
                        }
                        if (!timma) {
                            System.out.println("Không tìm thấy mã nhà cung cấp");
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Nhập tên cần tìm kiếm");
                        String ten = sc.nextLine();
                        boolean timten = false;
                        for (int i = 0; i < n; i++) {
                            if (ct7[i].getTennhacungcap().equalsIgnoreCase(ten)) {
                                System.out.println("Đã tìm thấy");
                                timten = true;
                                ct7[i].xuat();
                                break;
                            }
                        }
                        if (!timten) {
                            System.out.println("Không tìm thấy tên!");
                        }
                        break;
                    case 3:
                        MenuNhaCungCap.startMenuncc();
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                        break;
                }
            }
        }

        public static void suaThongTin() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã NCC bạn muốn sửa thông tin");
            int maNCC = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (ct7[i].getManhacungcap() == maNCC) {
                    System.out.println("Nhập thông tin mới cho nhà cung cấp:");
                    ct7[i].nhap();
                    System.out.println("Thông tin đã được cập nhật.");
                    return;
                }
            }
            System.out.println("Không tìm thấy nhà cung cấp có mã " + maNCC);
        }

        public static void thongKe() {
            System.out.println("===================================");
            System.out.println("1. Thống kê theo địa chỉ");
            System.out.println("2. Thống kê theo tên");
            System.out.println("3. Quay về Menu");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    thongKeDiaChi();
                    break;
                case 2:
                    thongKeTen();
                    break;
                case 3:
                    MenuNhaCungCap.startMenuncc();
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }

        public static void thongKeDiaChi() {
            System.out.println("===================================");
            System.out.println("Thống kê số lượng nhà cung cấp theo địa chỉ:");
            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (ct7[i].getDiachi().equalsIgnoreCase(ct7[j].getDiachi())) {
                        count++;
                        ct7[j].setDiachi(""); 
                    }
                }
                if (!ct7[i].getDiachi().equals("")) {
                    System.out.println("Địa chỉ: " + ct7[i].getDiachi() + ", Số lượng: " + count);
                }
            }
        }

        public static void thongKeTen() {
            System.out.println("===================================");
            System.out.println("Thống kê số lượng nhà cung cấp theo tên:");
            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (ct7[i].getTennhacungcap().equalsIgnoreCase(ct7[j].getTennhacungcap())) {
                        count++;
                        ct7[j].setTennhacungcap(""); 
                    }
                }
                if (!ct7[i].getTennhacungcap().equals("")) {
                    System.out.println("Tên: " + ct7[i].getTennhacungcap() + ", Số lượng: " + count);
                }
            }
        }

        public static boolean kiemTraTrungMa(int ma) {
            for (int i = 0; i < n; i++) {
                if (ct7[i].getManhacungcap() == ma) {
                    return true;
                }
            }
            return false;
        }
    }
}
