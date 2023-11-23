
package doan_oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import doan_oop.Chitietphieunhap.chitiet9;
import doan_oop.DSChiTietPhieuNhap.DANHSACH9;

public class Phieunhap {
    public static class Chitiet1 {
        private int maphieunhap;
        private int manhanvien;
        private Date ngaynhap;
        private float tongtien;
        private int manhacungcap;

        public Chitiet1() {
        }

        public Chitiet1(int maphieunhap, int manhanvien, Date ngaynhap, float tongtien, int manhacungcap) {
            this.maphieunhap = maphieunhap;
            this.manhanvien = manhanvien;
            this.ngaynhap = ngaynhap;
            this.tongtien = tongtien;
            this.manhacungcap = manhacungcap;
        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã phiếu nhập: ");
            maphieunhap = sc.nextInt();
            System.out.println("Nhập mã nhân viên: ");
            manhanvien = sc.nextInt();
            nhapNgay();
            //System.out.println("Nhập tổng tiền: ");
            //tongtien = sc.nextFloat();
            System.out.println("Nhập mã nhà cung cấp: ");
            manhacungcap = sc.nextInt();
        }

        private void nhapNgay() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập ngày nhập (định dạng dd/MM/yyyy): ");
            String ngayNhap = sc.next();
            try {
                ngaynhap = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhap);
            } catch (Exception e) {
                System.out.println("Lỗi định dạng ngày. Vui lòng sử dụng định dạng dd/MM/yyyy.");
            }
        }

      /*  public void xuat11() {
            System.out.println("*********************");
            System.out.println("Mã phiếu nhập là: " + maphieunhap);
            System.out.println("Mã nhân viên là: " + manhanvien);
            System.out.println("Thời gian: " + ngaynhap);

            float sum = 0;
            // ct tự đặt được
            for (chitiet9 ct : DANHSACH9.ct9) {
                if (ct != null && ct.getMachitietphieunhap() == maphieunhap) {
                    System.out.println("Mã chi tiết phiếu nhập: " + ct.getMachitietphieunhap());
                    float thanhtien = ct.getThanhtien();
                    System.out.println("Thành tiền: " + thanhtien);
                    sum += thanhtien;
                }
            }
            //System.out.println("Mã chi tiết phiếu nhập: " + ct.getMachitietphieunhap());
            
            System.out.println("Mã nhà cung cấp: " + manhacungcap);
            System.out.println("Tổng thành tiền: " + sum);
        }
*/
        
        
        public void xuat11() {
            System.out.println("*********************");
            System.out.println("Mã phiếu nhập là: " + maphieunhap);
            System.out.println("Mã nhân viên là: " + manhanvien);
            System.out.println("Thời gian: " + ngaynhap);

            float sum = 0;
            int maCTPhieuNhap = -1; // Giả sử giá trị mặc định nếu không có chi tiết phiếu nhập

            for (chitiet9 ct : DANHSACH9.ct9) {
                if (ct != null && ct.getMachitietphieunhap() == maphieunhap) {
                    float thanhtien = ct.getThanhtien();
                    sum += thanhtien;
                    maCTPhieuNhap = ct.getMachitietphieunhap(); // Lưu lại mã chi tiết phiếu nhập
                }
            }

            if (maCTPhieuNhap != -1) {
                System.out.println("Mã chi tiết phiếu nhập: " + maCTPhieuNhap);
            } else {
                System.out.println("Không có chi tiết phiếu nhập nào cho mã phiếu nhập này.");
            }

            // Kiểm tra xem ct có tồn tại không trước khi sử dụng
            if (DANHSACH9.ct9 != null && DANHSACH9.ct9.length > 0 && DANHSACH9.ct9[0] != null) {
                System.out.println("Mã nhà cung cấp: " + manhacungcap);
            } else {
                System.out.println("Không có chi tiết phiếu nhập nào hoặc danh sách chi tiết phiếu nhập rỗng.");
            }

            System.out.println("Tổng thành tiền: " + sum);
        }

        public int getMaphieunhap() {
            return maphieunhap;
        }

        public void setMaphieunhap(int maphieunhap) {
            this.maphieunhap = maphieunhap;
        }

        public int getManhanvien() {
            return manhanvien;
        }

        public void setManhanvien(int manhanvien) {
            this.manhanvien = manhanvien;
        }

        public Date getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(Date ngaynhap) {
            this.ngaynhap = ngaynhap;
        }

        public float getTongtien() {
            chitiet9 chitiet = new chitiet9();
            return chitiet.getThanhtien();
        }

        public void setTongtien(float tongtien) {
            this.tongtien = tongtien;
        }

        public int getManhacungcap() {
            return manhacungcap;
        }

        public void setManhacungcap(int manhacungcap) {
            this.manhacungcap = manhacungcap;
        }
    }
}