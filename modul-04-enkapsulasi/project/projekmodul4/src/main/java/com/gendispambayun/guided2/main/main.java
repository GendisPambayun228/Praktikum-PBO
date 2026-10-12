
package com.gendispambayun.guided2.main;
import com.gendispambayun.guided2.hargatoken.HargaToken;
import com.gendispambayun.guided2.hargapulsa.HargaPulsa;

public class main {

    public static void main(String[] args) {
        HargaToken objectToken = new HargaToken();
        objectToken.info();
        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}
