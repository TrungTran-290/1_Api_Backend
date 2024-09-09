package com.example.demo.models;

public enum XepLoai {
    Gioi("gioi"), Kha("kha"), TrungBinh("trung binh"), Yeu("yeu");
    private final String xepLoai;
    XepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public String getXepLoai() {
        return xepLoai;
    }
}
