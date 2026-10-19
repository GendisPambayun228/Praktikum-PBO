package com.gendispambayun.modul05;

import com.gendispambayun.guided.guided2.agregasi.*;
import com.gendispambayun.guided.guided3.komposisi.*;

public class Main {

    public static void main(String[] args) {
        runGuided2();
        runGuided3();
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("1031324000331", "Gendis");
        Mahasiswa m2 = new Mahasiswa("103112400149", "John");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();

    }

    public static void runGuided3() {
        Komputer pc = new Komputer("Intel Core i5", 3200, "LG 24 Inch", "Logitech", "Wireless");
        pc.displaySpecKomputer();
    }
}