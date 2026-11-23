package com.gendispambayun.modul10.guided.guided04;

public class DemoMultipleCatch {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 100/x;

            int[] arr = {10,11};
            y = arr[x];

            System.out.println("Tidak ada eksepsi");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception karena gabisa dibagi dgn 0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception karena indeks tidak valid");
        }
        System.out.println("Program selesai");
    }
}
