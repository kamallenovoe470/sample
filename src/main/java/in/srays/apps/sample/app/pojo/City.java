/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.srays.apps.sample.app.pojo;

/**
 *
 * @author kamal
 */
public class City {

    private int cityCode;
    private String cityName;
    private int cityPincode;

    public City(int cityCode, String cityName, int cityPincode) {
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.cityPincode = cityPincode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPincode() {
        return cityPincode;
    }

    public void setCityPincode(int cityPincode) {
        this.cityPincode = cityPincode;
    }

}
