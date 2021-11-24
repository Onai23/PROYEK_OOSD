package Main_Program.Kelas;

import Main_Program.Interface.GetAllMethod;

import java.util.ArrayList;

public class TataCaraPembayaran implements GetAllMethod {
    public void displayTataCaraPembayaran() {
        /*1. instansiasi kelas ArrayList*/
        ArrayList<String> tataCara = new ArrayList<>();

        /*2. assign value ke objek tataCara*/
        tataCara.add("PEMBAYARAN DILAKUKAN DI TEMPAT.");

        int i = 0;
        System.out.println(tataCara.get(i));
    }
}
