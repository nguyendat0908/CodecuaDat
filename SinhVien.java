import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	private int MaSinhVien;
	private String HoVaTen;
	private int NamSinh;
	private float DiemTB;
	public SinhVien(int MaSinhVien) {
		this.MaSinhVien = MaSinhVien;
	}
	public SinhVien(int maSinhVien, String hoVaTen, int namSinh, float diemTB) {
		this.MaSinhVien = maSinhVien;
		this.HoVaTen = hoVaTen;
		this.NamSinh = namSinh;
		this.DiemTB = diemTB;
	}
	public int getMaSinhVien() {
		return MaSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.MaSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return HoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.HoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(int namSinh) {
		this.NamSinh = namSinh;
	}
	public float getDiemTB() {
		return DiemTB;
	}
	public void setDiemTB(float diemTB) {
		this.DiemTB = diemTB;
	}
	@Override
	public String toString() {
		return "MaSinhVien:" + MaSinhVien + "\nHoVaTen:" + HoVaTen + "\nNamSinh:" + NamSinh + "\nDiemTB:"
				+ DiemTB;
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.MaSinhVien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DiemTB, HoVaTen, MaSinhVien, NamSinh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return MaSinhVien == other.MaSinhVien;
	}
	
	
	
}
