package com.gendispambayun.modul06.unguided;

public class ModelRegresi extends ModelKomputasi {

    private int jumlahFitur;

    public ModelRegresi(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    @Override
    public double hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public double hitungBiaya(int epoch, int ukuranBatch) {
        return (double) (getJumlahDataLatih() * epoch) / ukuranBatch;
    }
}
