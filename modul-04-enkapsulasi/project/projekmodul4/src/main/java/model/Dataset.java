package model;

public class Dataset {

    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Konstanta batas persentase missing value
    public static final double BATAS_MISSING = 5.0;

    // Variabel milik class (static) untuk menghitung total objek Dataset
    private static int totalDataset = 0;

    // Constructor 1: Tanpa parameter
    public Dataset() {
        totalDataset++;
    }

    // Constructor 2: Hanya parameter nama
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    // Constructor 3: Lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        this.jumlahBaris = jumlahBaris;
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        this.jumlahKolom = jumlahKolom;
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        this.jumlahMissing = jumlahMissing;
    }

    // Method untuk mengambil nilai totalDataset tanpa membuat objek (static method)
    public static int getTotalDataset() {
        return totalDataset;
    }

    // Method menghitung persentase missing value
    public double getPersentaseMissing() {
        int totalSel = jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0.0;
        }
        return ((double) jumlahMissing / totalSel) * 100.0;
    }

    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}
