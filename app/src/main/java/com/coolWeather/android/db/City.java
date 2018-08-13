package com.coolWeather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @Data 2018-08-10
 * @author Neo
 * @Description 数据库 城市
 */
public class City extends DataSupport {
    //城市id
    private int id;
    //城市名
    private String cityName;
    //城市代号
    private  int cityCode;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
