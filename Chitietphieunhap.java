package doan_oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chitietphieunhap {
    public static class chitiet9 {
        private int machitietphieunhap;
        private int masanpham;
        private int soluong;
        private float dongia;
        private float thanhtien;

        public chitiet9() {
        }

        public chitiet9(int machitietphieunhap, int masanpham, int soluong, float dongia, float thanhtien) {
            this.machitietphieunhap = machitietphieunhap;
            this.masanpham = masanpham;
            this.soluong = soluong;
            this.dongia = dongia;
            this.thanhtien = thanhtien;
        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã chi tiết phiếu nhập: ");
            machitietphieunhap = sc.nextInt();
            System.out.println("Nhập mã sản phẩm: ");
            masanpham = sc.nextInt();
            System.out.println("Nhập số lượng: ");
            soluong = sc.nextInt();
            System.out.println("Nhập Đơn giá: ");
            dongia = sc.nextFloat();
        }

        public void xuat() {
            System.out.println("*******************************");
            System.out.println("Mã chi tiết phiếu nhập: " + machitietphieunhap);
            System.out.println("Mã sản phẩm :" + masanpham);
            System.out.println("Số lượng " + soluong);
            System.out.println("Đơn giá " + dongia);
            System.out.println("Thành tiền: " + soluong * dongia);
        }

        /*public void xuat1() {
            System.out.println("Mã chi tiết phiếu nhập: " + machitietphieunhap);
        }
*/
        public int getMachitietphieunhap() {
            return machitietphieunhap;
        }

        public void setMachitietphieunhap(int machitietphieunhap) {
            this.machitietphieunhap = machitietphieunhap;
        }

        public int getMasanpham() {
            return masanpham;
        }

        public void setMasanpham(int masanpham) {
            this.masanpham = masanpham;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
        }

        public float getDongia() {
            return dongia;
        }

        public void setDongia(float dongia) {
            this.dongia = dongia;
        }

        public float getThanhtien() {
            return soluong * dongia;
        }

		
        
        
    }

}
