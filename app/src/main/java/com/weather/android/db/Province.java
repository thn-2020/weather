package com.weather.android.db;
import org.litepal.crud.DataSupport;
/**
 * 用于存放省的数据信息
 */
public class Province extends DataSupport {
    /*
    provinceName:省的名字
    provinceCode:省的代号
     */
    private int id;
    private String provinceName;
    private int provinceCode;
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
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
