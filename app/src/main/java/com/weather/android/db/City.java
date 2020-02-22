package com.weather.android.db;
import org.litepal.crud.DataSupport;
/**
 * 用于存放市的数据信息
 */
public class City extends DataSupport {
    /*
    cityName:市的名字
    cityCode：市的代号
    provinceId：当前市所属省的id值
     */
    private int id;
    private String cityName;
    private int cityCode;
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
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
