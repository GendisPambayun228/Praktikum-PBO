package main;

import model.Dataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1: Constructor tanpa parameter, lalu diisi menggunakan setter
        Dataset dataset1 = new Dataset();
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: Constructor 1 parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: Constructor lengkap
        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        // Simpan ketiganya dalam array
        Dataset[] daftarDataset = {dataset1, dataset2, dataset3};
        LaporanDataset laporan = new LaporanDataset();

        // Cetak laporannya dengan perulangan
        for (Dataset d : daftarDataset) {
            laporan.cetak(d);
        }

        // Tampilkan total dataset yang dibuat
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
