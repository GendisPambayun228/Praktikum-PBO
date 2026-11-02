package com.gendispambayun.modul07.guided.guided01;

public abstract class Employee { //fondasi umum yang belum memiliki peran spesifik sehingga tidak boleh diinstansiasi langsung
    private String name;
    
    //constructur
    public Employee(String name){
        this.name = name;
    }
    
    //getter
   public String getName(){
       return name;
   }
   
   //method, Sertiap pegawai pasti punya gaji, tapi rumusnya berbeda-beda
   public abstract double earnings();
}
