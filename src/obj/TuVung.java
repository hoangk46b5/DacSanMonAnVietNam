package obj;

public class TuVung {
	private String tu;
	private String loaiTu;
	private String nghiaTu;

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public String getLoaiTu() {
		return loaiTu;
	}

	public void setLoaiTu(String loaiTu) {
		this.loaiTu = loaiTu;
	}

	public String getNghiaTu() {
		return nghiaTu;
	}

	public void setNghiaTu(String nghiaTu) {
		this.nghiaTu = nghiaTu;
	}

	@Override
	public String toString() {
		return tu + loaiTu + nghiaTu;
	}

	public TuVung() {
	}

	public TuVung(String tu, String loaiTu, String nghiaTu) {
		this.tu = tu;
		this.loaiTu = loaiTu;
		this.nghiaTu = nghiaTu;
	}

}
