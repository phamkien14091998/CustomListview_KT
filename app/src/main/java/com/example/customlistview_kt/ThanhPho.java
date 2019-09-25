package com.example.customlistview_kt;

public class ThanhPho {
    private String ten;
    private String city;
    private int so;

    public ThanhPho(String ten, String city, int so) {
        this.ten = ten;
        this.city = city;
        this.so = so;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "ThanhPho{" +
                "ten='" + ten + '\'' +
                ", city='" + city + '\'' +
                ", so=" + so +
                '}';
    }
}
