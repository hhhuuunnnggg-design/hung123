package doan_oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import doan.DANHSACH9;
import doan_oop.Chitietphieunhap.chitiet9;


public class DSChiTietPhieuNhap {


public static class DANHSACH9 {
    private static int n;
     static chitiet9[] ct9;
    private static int max = 50;

    private static int tongSoLuong;
    private static float tongThanhTien;
    static Map<Integer, chitiet9> maCTPNMap;

    static {
        n = 0;
        ct9 = new chitiet9[max];
        maCTPNMap = new HashMap<>();
    }

    public static void codecung9(chitiet9 ct9) {
        if (n < max) {
            if (!kiemTraTrungMa(ct9.getMachitietphieunhap())) {
                DANHSACH9.ct9[n] = ct9;
                n++;

                tongSoLuong += ct9.getSoluong();
                tongThanhTien += ct9.getThanhtien();

                maCTPNMap.put(ct9.getMachitietphieunhap(), ct9);
                System.out.println("Đã thêm thành công");
            } else {
                System.out.println("Mã chi tiết phiếu nhập đã tồn tại. Không thể thêm mới.");
            }
        } else {
            System.out.println("Danh sách đã đầy");
        }
    }

    public static void suaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã NCC bạn muốn sửa thông tin");
        int maPN = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (ct9[i] != null && ct9[i].getMachitietphieunhap() == maPN) {
                System.out.println("Nhập thông tin mới cho nhà cung cấp:");
                ct9[i].nhap(); // Sử dụng phương thức nhap() của ct1[i] để nhập thông tin mới
                System.out.println("Thông tin đã được cập nhật.");
                return;
            }
        }
        
        System.out.println("Không tìm thấy nhà cung cấp có mã " + maPN);
    }
    
    
    public static void thongKeNangCao() {
        System.out.println("Tổng số lượng: " + tongSoLuong);
        System.out.println("Tổng thành tiền: " + tongThanhTien);
    }

    public static void xuatds() {
        if (n == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        for (int i = 0; i < n; i++) {
            ct9[i].xuat();
        }
    }
    private static boolean kiemTraTrungMa(int ma) {
        for (int i = 0; i < n; i++) {
            if (ct9[i].getMachitietphieunhap() == ma) {
                return true;
            }
        }
        return false;
    }

    public static void themds(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        chitiet9 newct2 = new chitiet9();
        newct2.nhap();

        // Kiểm tra nếu danh sách đã đầy
        if (n == max) {
            System.out.println("Danh sách đã đầy, không thể thêm mới.");
            return;
        }

        // Thêm chi tiết phiếu nhập mà không kiểm tra mã trùng
        ct9[n] = newct2;
        n++;
        tongSoLuong += newct2.getSoluong();
        tongThanhTien += newct2.getThanhtien();

        System.out.println("Đã thêm thành công");
    }

    public static void xoads() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Nhập mã cần xóa");
        int cc = sc.nextInt();
        boolean kt1 = false;
        for (int i = 0; i < n; i++) {
            if (ct9[i].getMachitietphieunhap() == cc) {
                for (int j = i; j < n; j++) {
                    ct9[j] = ct9[j + 1];
                }
                n--;
                kt1 = true;
                System.out.println("Mã chi tiết  phiếu nhập đã được xóa");
                break;
            }
        }
        if (!kt1) {
            System.out.println("Không tìm thấy mã phiếu nhập");
        }
    }

    public static void timkiemds1() {
        boolean tiepTuc = true;

        while (tiepTuc) {
            System.out.println("1.Tìm kiếm theo mã ");
            System.out.println("2.Tìm kiếm theo số lượng");
            System.out.println("3. Quay lại menu chính ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==================================");
                    System.out.print("Nhập mã chi tiết phiếu nhập cần tìm kiếm: ");
                    int ma = sc.nextInt();
                    boolean thayma = false;

                    for (int i = 0; i < n; i++) {
                        if (ct9[i].getMachitietphieunhap() == ma) {
                            System.out.println("Đã tìm thấy:");
                            thayma = true;
                            ct9[i].xuat();
                            break;
                        }
                    }

                    if (!thayma) {
                        System.out.println("Không tìm thấy mã chi tiết phiếu nhập");
                    }
                    break;

                case 2:
                    System.out.print("Nhập giá trị số lượng cần tìm kiếm: ");
                    int soLuongCanTim = sc.nextInt();
                    boolean coChiTiet = false;

                    System.out.println("Các chi tiết phiếu nhập có số lượng lớn hơn " + soLuongCanTim + ":");

                    for (int j = 0; j < n; j++) {
                        if (ct9[j].getSoluong() > soLuongCanTim) {
                            ct9[j].xuat();
                            coChiTiet = true;
                        }
                    }

                    if (!coChiTiet) {
                        System.out.println("Không có số lượng lớn hơn " + soLuongCanTim);
                    }
                    break;

                case 3:
                    //tiepTuc = false; // Đặt biến để thoát khỏi vòng lặp
                    MenuChiTietPhieuNhap.startMenuctpn();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }


}

}