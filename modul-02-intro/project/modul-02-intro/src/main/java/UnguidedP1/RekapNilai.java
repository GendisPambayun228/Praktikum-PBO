package UnguidedP1;

public class RekapNilai {
    public static void main(String[] args) {
        // Deklarasi konstanta KKM
        final double KKM = 75.0;

        // Array 1 Dimensi untuk menyimpan nama mahasiswa (Tipe data String)
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // Array 2 Dimensi Rectangular untuk menyimpan 2 nilai modul tiap mahasiswa (Tipe data double)
        double[][] nilaiModul = {
            {80.0, 85.0}, // Nilai Andi
            {70.0, 65.0}, // Nilai Budi
            {90.0, 90.0}  // Nilai Citra
        };

        // Header Program
        System.out.println("REKAP NILAI PRAKTIKUM\n");
        System.out.println("KKM: " + KKM + "\n");

        // Perulangan untuk memproses data setiap mahasiswa
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1: " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2: " + nilaiModul[i][1]);

            // Menghitung nilai rata-rata
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2.0;
            System.out.println("Rata-rata: " + rataRata);

            // Percabangan untuk menentukan status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }
            
            System.out.println("Status: " + status + "\n");
        }
    }
}