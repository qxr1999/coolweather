package com.coolweather.app.model;
/**
 * @author ���� ������:
 * @version ����ʱ�䣺2018-9-20 ����2:31:10
 * ��˵��
 */
public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	public Province(int id, String provinceName, String provinceCode) {
		super();
		this.id = id;
		this.provinceName = provinceName;
		this.provinceCode = provinceCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", provinceName=" + provinceName
				+ ", provinceCode=" + provinceCode + "]";
	}
	
}
