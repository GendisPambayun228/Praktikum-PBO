package com.gendispambayun.modul07.guided.guided03;

public class Main {
    
    public static void main(String[]args){
        Payable.logTransaction("Sistem pembayaran difinalisasi.");
        
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Ram DOR 5 16GB", 2, 2000000);
        items[1] = new SalariedEmployee("Gendis", 5000000);
        
        for (Payable item : items){
            item.printReceipt();
        }
    }
}
