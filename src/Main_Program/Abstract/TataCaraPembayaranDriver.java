package Main_Program.Abstract;

import java.util.ArrayList;

public class TataCaraPembayaranDriver extends TataCaraPembayaran{
    @Override
    public void displayTataCaraPembayaran() {
        /*1. instansiasi kelas ArrayList*/
        ArrayList<String> tataCara = new ArrayList<>();

        /*2. assign value ke objek tataCara*/
        tataCara.add("PEMBAYARAN DILAKUKAN DI TEMPAT.");
        tataCara.add("PEMBAYARAN DILAKUKAN MELALUI BANK.");

        int i = 0;
        System.out.println(tataCara.get(i));
    }
}
