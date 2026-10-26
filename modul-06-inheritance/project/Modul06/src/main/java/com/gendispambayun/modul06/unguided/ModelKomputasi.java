package com.gendispambayun.modul06.unguided;

public class ModelKomputasi {
    private String namaModel;
    private int jumlahDataLatih;

    public ModelKomputasi(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getJumlahDataLatih() {
        return jumlahDataLatih;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + namaModel + " | Data latih: " + jumlahDataLatih);
    }

    public double hitungBiaya() {
        return jumlahDataLatih * 2;
    }

    public double hitungBiaya(int epoch) {
        return jumlahDataLatih * epoch;
    }
}
