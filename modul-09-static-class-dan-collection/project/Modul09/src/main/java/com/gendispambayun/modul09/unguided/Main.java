package com.gendispambayun.modul09.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Menyimpan data ke dalam List menggunakan generics
        List<Eksperimen> listModel = new ArrayList<>();

        listModel.add(new Eksperimen("Logistic Regression", 0.82, 12));
        listModel.add(new Eksperimen("Random Forest", 0.91, 45));
        listModel.add(new Eksperimen("SVM", 0.87, 60));
        listModel.add(new Eksperimen("KNN", 0.79, 5));
        listModel.add(new Eksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen yang tercatat menggunakan static method
        System.out.println("Jumlah eksperimen: " + Eksperimen.getJumlahEksperimen());
        System.out.println();

        // 2. Daftar model diurutkan berdasarkan akurasi tertinggi (Comparable)
        Collections.sort(listModel);
        System.out.println("Sorted by akurasi");
        listModel.forEach(System.out::println);
        System.out.println();

        // 3. Daftar model diurutkan berdasarkan waktu training tercepat (Comparator)
        Collections.sort(listModel, new TimeComparator());
        System.out.println("Sorted by waktu training");
        listModel.forEach(System.out::println);
        System.out.println();

        // 4. Daftar model dengan akurasi minimal 0.85 (filtering dengan lambda)
        System.out.println("Model dengan akurasi minimal 0.85");
        List<Eksperimen> filteredList = listModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
        System.out.println();

        // 5. Pencarian model dengan nama "KNN" menggunakan lambda
        System.out.println("Pencarian model KNN");
        Eksperimen searchResult = listModel.stream()
                .filter(m -> m.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(searchResult);
    }
}
