import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("------------------ MENU --------------------");
			System.out.println("Vui long chon chuc nang!");
			System.out.println("1. Them sinh vien vao danh sach.\n"
					+ "2. In danh sach sinh vien ra man hinh.\n"
					+ "3. Kiem tra danh sach co rong hay khong.\n"
					+ "4. Lay ra so luong sinh vien trong danh sach.\n"
					+ "5. Lam rong danh sach sinh vien.\n"
					+ "6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
					+ "7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
					+ "8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n"
					+ "9. Xuat ra danh sach sinh vien co diem tu cao den thap.\n"
					+ "0. Thoat khoi chuong trinh");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("Nhap ma sinh vien: ");
				int MaSinhVien = sc.nextInt();
				System.out.println("Nhap ho va ten: ");
				String HoVaTen = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int NamSinh = sc.nextInt();
				System.out.println("Nhap diem TB: ");
				float DiemTB = sc.nextFloat();
				SinhVien sv = new SinhVien(MaSinhVien, HoVaTen, NamSinh, DiemTB);
				dssv.ThemSV(sv);
			}else if(luaChon == 2) {
				System.out.println("----------------Danh sach sinh vien----------------");
				dssv.InRaSV();
			}else if(luaChon == 3) {
				System.out.println("Danh sach co rong khong " +dssv.KTraDSRong());
			}else if(luaChon == 4) {
				System.out.println("So luong sinh vien la: " +dssv.SoLuongSV());
			}else if(luaChon == 5) {
				dssv.LamRongDS();
			}else if(luaChon == 6) {
				System.out.println("Nhap ma sinh vien: ");
				int MaSinhVien = sc.nextInt();
				SinhVien sv = new SinhVien(MaSinhVien);
				System.out.println("Sinh vien co ma "+MaSinhVien+" co ton tai khong! "+dssv.KTraSinhVien(sv));
			}else if(luaChon == 7) {
				System.out.println("Nhap ma sinh vien: ");
				int MaSinhVien = sc.nextInt();
				SinhVien sv = new SinhVien(MaSinhVien);
				System.out.println("Xoa sinh vien co ma "+MaSinhVien+" ? "+dssv.XoaSinhVien(sv));
			}else if(luaChon == 8) {
				System.out.println("Nhap ten sinh vien: ");
				String HoVaTen = sc.next();
				System.out.println("Ket qua tim: ");
				dssv.timKiem(HoVaTen);
			}else if(luaChon == 9) {
				System.out.println("--Bang xep hang sinh vien--");
				dssv.SapXepSinhVienDTB();
				dssv.InRaSV();
			}
			
		} while (luaChon != 0);
	}
}
