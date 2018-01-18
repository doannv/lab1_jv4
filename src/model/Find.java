package model;

public class Find {
	private int id;
	private String TenThueBao;
	private String SDT;
	private String DiaChi;
	
	public Find(int id, String tenThueBao, String sDT, String diaChi) {
		super();
		this.id = id;
		this.TenThueBao = tenThueBao;
		this.SDT = sDT;
		this.DiaChi = diaChi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenThueBao() {
		return TenThueBao;
	}
	public void setTenThueBao(String tenThueBao) {
		this.TenThueBao = tenThueBao;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		this.SDT = sDT;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	
}
