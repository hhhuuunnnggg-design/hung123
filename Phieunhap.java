	package doan_oop;
	
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;
	import doan_oop.Chitietphieunhap.chitiet9;
	import doan_oop.DSChiTietPhieuNhap.DANHSACH9 ;
	
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
	           // System.out.println("Nhập tổng tiền: ");
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
	
	        /*public float getTongtien1() {
	            chitiet9 chitiet = new chitiet9();
	            return chitiet.getThanhtien();
	        }
	        */
	        public void xuat11() {
	            System.out.println("*********************");
	            System.out.println("Mã phiếu nhập là: " + maphieunhap);
	            System.out.println("Mã nhân viên là: " + manhanvien);
	            System.out.println("Thời gian: " + ngaynhap);
	            
	            
	            System.out.println("Tổng tiền: " + getTongtien());
	            System.out.println("Mã nhà cung cấp: " + manhacungcap);
	        }
	
	      /*  public void xuat() {
	            System.out.println("*********************");
	            System.out.println("Mã phiếu nhập là: " + maphieunhap);
	            System.out.println("Mã nhân viên là: " + manhanvien);
	            System.out.println("Thời gian: " + ngaynhap);
	            
	            float sum = 0; // Tạo biến sum để tính tổng thành tiền

	            // Kiểm tra điều kiện
	            if (chitiet9.getMachitietphieunhap() == maphieunhap ) {
	                System.out.println("Mã chi tiết phiếu nhập: " + chitiet9.getMachitietphieunhap());
	                
	                float thanhtien = chitiet9.getThanhtien();
	                System.out.println("Thành tiền 11111 : " + thanhtien);
	                sum += thanhtien; // Cộng vào tổng
	            } else {
	                
	                System.out.println("Thành tiền 22222 : " + getTongtien());
	                sum += getTongtien(); 
	            }

	            System.out.println("Mã nhà cung cấp: " + manhacungcap);


	            System.out.println("Tổng thành tiền 33333: " + sum);
	        }
*/
	        public void xuat() {
	            System.out.println("*********************");
	            System.out.println("Mã phiếu nhập là: " + maphieunhap);
	            System.out.println("Mã nhân viên là: " + manhanvien);
	            System.out.println("Thời gian: " + ngaynhap);
	            
	            float sum = 0; // Tạo biến sum để tính tổng thành tiền

	            // Kiểm tra điều kiện
	            if (chitiet9.getMachitietphieunhap() == maphieunhap || DANHSACH9.maCTPNMap.containsKey(maphieunhap)) {
	                // Lấy chi tiết từ danh sách theo mã phiếu nhập
	                chitiet9 chiTietPhieuNhap = DANHSACH9.maCTPNMap.get(maphieunhap);

	                // Kiểm tra xem chi tiết có tồn tại không
	                if (chiTietPhieuNhap != null) {
	                    System.out.println("Mã chi tiết phiếu nhập: " + chitiet9.getMachitietphieunhap());

	                    float thanhtien = chitiet9.getThanhtien();
	                    System.out.println("Thành tiền: " + thanhtien);
	                    sum += thanhtien; // Cộng vào tổng
	                } else {
	                    System.out.println("Không có thông tin chi tiết cho mã phiếu nhập " + maphieunhap);
	                }
	            } else {
	                System.out.println("Thành tiền: " + getTongtien());
	                sum += getTongtien(); 
	            }

	            System.out.println("Mã nhà cung cấp: " + manhacungcap);
	            System.out.println("Tổng thành tiền: " + sum);
	        }
	        
	        public void xuat1() {
	            System.out.println("Mã phiếu nhập là: " + maphieunhap);
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
