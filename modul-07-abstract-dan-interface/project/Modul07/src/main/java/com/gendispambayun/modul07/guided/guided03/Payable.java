package com.gendispambayun.modul07.guided.guided03;

public interface Payable {
    double getPaymentAmount();
    
    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp " + getPaymentAmount());
    }
    
    //fungsi utilitas
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG]" + message);
    }
}
