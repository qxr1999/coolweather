package com.coolweather.app.model;
/**
 * @author 作者 乔玺润:
 * @version 创建时间：2018-9-20 下午2:33:31
 * 类说明
 */
public class City {
private int id;
private String cityName;
private String cityCode;
private int provinceId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getCityCode() {
	return cityCode;
}
public void setCityCode(String cityCode) {
	this.cityCode = cityCode;
}
public int getProvinceId() {
	return provinceId;
}
public void setProvinceId(int provinceId) {
	this.provinceId = provinceId;
}
public City(int id, String cityName, String cityCode, int provinceId) {
	super();
	this.id = id;
	this.cityName = cityName;
	this.cityCode = cityCode;
	this.provinceId = provinceId;
}
public City() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "City [id=" + id + ", cityName=" + cityName + ", cityCode="
			+ cityCode + ", provinceId=" + provinceId + "]";
}

}
