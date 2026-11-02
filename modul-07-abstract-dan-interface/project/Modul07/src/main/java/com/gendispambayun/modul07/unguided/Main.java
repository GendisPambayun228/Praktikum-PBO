package com.gendispambayun.modul07.unguided;

public class Main {

    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi (Baris di bawah ini error jika di-uncomment karena TiketBioskop bersifat abstract)
        // TiketBioskop testAbstract = new TiketBioskop("Test", 50000, 1);

        // 2. Buka Kasir
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiketReg = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiketVip = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 4. Array Polimorfik
        ItemTransaksi[] daftarBelanja = {tiketReg, tiketVip, snack};

        // 5. Pemrosesan Dinamis & Perhitungan Total
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;

        for (int i = 0; i < daftarBelanja.length; i++) {
            daftarBelanja[i].cetakRincianItem();
            grandTotal += daftarBelanja[i].getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");

        // 6. Tutup Kasir
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
