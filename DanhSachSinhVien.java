import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhsach;

	public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
		this.danhsach = danhsach;
	}

	public DanhSachSinhVien() {
		this.danhsach = new ArrayList<SinhVien>();
	}
	public void ThemSV(SinhVien sv) {
		this.danhsach.add(sv);
	}
	public void InRaSV() {
		for (SinhVien sinhVien : danhsach) {
			System.out.println(sinhVien);
		}
	}
	public boolean KTraDSRong() {
		return this.danhsach.isEmpty();
	}
	public int SoLuongSV() {
		return this.danhsach.size();
	}
	public void LamRongDS() {
		this.danhsach.removeAll(danhsach);
	}
	public boolean KTraSinhVien(SinhVien sv) {
		return this.danhsach.contains(sv);
	}
	public boolean XoaSinhVien(SinhVien sv) {
		return this.danhsach.remove(sv);
	}
	public void timKiem(String ten) {
		for (SinhVien sinhVien : danhsach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >= 0);
			System.out.println(sinhVien);
		}
	}
	public void SapXepSinhVienDTB() {
		Collections.sort(this.danhsach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getDiemTB() > o2.getDiemTB()) {
					return -1;
				}else if(o1.getDiemTB() < o2.getDiemTB()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
}
