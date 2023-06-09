package com.masterclass.classesAndObjects;

public class Address {
    private String line1;
    private String line2;
    private String district;
    private String city;
    private String country;
    private String zipcode;

    public Address() {
    }

    public Address(String line1, String line2, String district, String city, String country, String zipcode) {
        this.line1 = line1;
        this.line2 = line2;
        this.district = district;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "com.masterclass.classesAndObjects.Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
