package com.coolWeather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @Data 2018-08-10
 * @author Neo
 * @Description 数据库 城市
 */
public class Country extends DataSupport {
    //县id
    private int id;
    //县名
    private String countryName;
    //县id代号

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    private int countryCode;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
