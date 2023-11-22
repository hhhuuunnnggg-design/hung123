package doan_oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import doan_oop.Chitietphieunhap.chitiet9;


public class DSChiTietPhieuNhap {


public static class DANHSACH9 {
    private static int n;
    private static chitiet9[] ct9;
    private static int max = 50;

    private static int tongSoLuong;
    private static float tongThanhTien;
    private static Map<Integer, chitiet9> maCTPNMap;

    static {
        n = 0;
        ct9 = new chitiet9[max];
        maCTPNMap = new HashMap<>();
    }

    public static void codecung9(chitiet9 ct2) {
        if (n < max) {
            if (!kiemTraTrungMa(ct2.getMachitietphieunhap())) {
                DANHSACH9.ct9[n] = ct2;
                n++;

                tongSoLuong += ct2.getSoluong();
                tongThanhTien += ct2.getThanhtien();

                maCTPNMap.put(ct2.getMachitietphieunhap(), ct2);
                System.out.println("Đã thêm thành công");
            } else {
                System.out.println("Mã chi tiết phiếu nhập đã tồn tại. Không thể thêm mới.");
            }
        } else {
            System.out.println("Danh sách đã đầy");
        }
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

    /*public static void themds(int maphieunhap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        chitiet9 newct2 = new chitiet9();
        newct2.nhap();
        boolean kt = false;

        for (int i = 0; i < n; i++) {
            if (ct9[i].getMachitietphieunhap() == newct2.getMachitietphieunhap()) {
                kt = true;
                break;
            }
        }
        if (!kt) {
            ct9[n] = newct2;
            n++;
            tongSoLuong += newct2.getSoluong();
            tongThanhTien += newct2.getThanhtien();

            System.out.println("Đã thêm thành công");
        } else {
            System.out.println("Mã phiếu nhập đã tồn tại");
        }
    }
*/
    
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


    /*public static void tongtien1() {
        float tongtien = 0;
        for (int i = 0; i < n; i++) {
            tongtien += ct9[i].getThanhtien();
        }
        System.out.println(tongtien);
    }
    */
}

}
