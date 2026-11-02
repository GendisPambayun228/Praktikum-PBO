package com.gendispambayun.modul07.guided.guided01;

public class Main {
    
    public static void main(String[]args){
        SalariedEmployee salaried = new SalariedEmployee("Gendis", 5000000);
        System.out.println("Nama: "+salaried.getName());
        System.out.println("Gaji: Rp "+ salaried.earnings());
    }
}
