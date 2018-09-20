package com.coolweather.app.model;
/**
 * @author 作者 乔玺润:
 * @version 创建时间：2018-9-20 下午2:34:37
 * 类说明
 */
public class County {
private int id;
private String countyName;
private String countyCode;
private int cityId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountyName() {
	return countyName;
}
public void setCountyName(String countyName) {
	this.countyName = countyName;
}
public String getCountyCode() {
	return countyCode;
}
public void setCountyCode(String countyCode) {
	this.countyCode = countyCode;
}
public int getCityId() {
	return cityId;
}
public void setCityId(int cityId) {
	this.cityId = cityId;
}
public County(int id, String countyName, String countyCode, int cityId) {
	super();
	this.id = id;
	this.countyName = countyName;
	this.countyCode = countyCode;
	this.cityId = cityId;
}
public County() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "County [id=" + id + ", countyName=" + countyName + ", countyCode="
			+ countyCode + ", cityId=" + cityId + "]";
}

}
