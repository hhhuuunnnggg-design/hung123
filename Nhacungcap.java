package doan_oop;

import java.util.Scanner;

public class Nhacungcap {
    public static class chitiet7 {
        protected int manhacungcap;
        protected String tennhacungcap;
        protected String diachi;

        public chitiet7() {
        }

        public chitiet7(int manhacungcap, String tennhacungcap, String diachi) {
            this.manhacungcap = manhacungcap;
            this.tennhacungcap = tennhacungcap;
            this.diachi = diachi;
        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhà cung cấp: ");
            manhacungcap = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập tên nhà cung cấp: ");
            tennhacungcap = sc.nextLine();
            System.out.print("Nhập địa chỉ: ");
            diachi = sc.nextLine();
        }

        public void xuat() {
            System.out.println("********************************");
            System.out.println("Mã nhà cung cấp: " + manhacungcap);
            System.out.println("Tên nhà cung cấp: " + tennhacungcap);
            System.out.println("Địa chỉ nhà cung cấp: " + diachi);
        }

        public void xuat1() {
            System.out.println("Tên nhà cung cấp: " + tennhacungcap);
        }

        public int getManhacungcap() {
            return manhacungcap;
        }

        public void setManhacungcap(int manhacungcap) {
            this.manhacungcap = manhacungcap;
        }

        public String getTennhacungcap() {
            return tennhacungcap;
        }

        public void setTennhacungcap(String tennhacungcap) {
            this.tennhacungcap = tennhacungcap;
        }

        public String getDiachi() {
            return diachi;
        }

        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }
    }
}