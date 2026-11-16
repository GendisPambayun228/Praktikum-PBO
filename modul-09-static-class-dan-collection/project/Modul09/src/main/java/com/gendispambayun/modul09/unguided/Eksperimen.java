package com.gendispambayun.modul09.unguided;

public class Eksperimen implements Comparable<Eksperimen> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;
    private static int jumlahEksperimen = 0;

    // Constructor
    public Eksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    // Getter
    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Static Method untuk mengambil jumlah eksperimen
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }

    @Override
    public int compareTo(Eksperimen o) {
        // Mengurutkan berdasarkan akurasi dari yang tertinggi ke terendah (Descending)
        return Double.compare(o.akurasi, this.akurasi);
    }
}
