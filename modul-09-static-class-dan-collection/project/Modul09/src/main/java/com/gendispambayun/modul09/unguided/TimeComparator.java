package com.gendispambayun.modul09.unguided;

import java.util.Comparator;

public class TimeComparator implements Comparator<Eksperimen> {
    @Override
    public int compare(Eksperimen e1, Eksperimen e2) {
        // Mengurutkan berdasarkan waktu training dari yang tercepat ke terlama (Ascending)
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}
