package Main_Program.Kelas;

import Main_Program.Interface.GetAllMethod;

import java.util.ArrayList;

public class Fasilitas implements GetAllMethod {
    @Override
    public void displayFasilitas() {
        /*1. set instansiasi kelas ArrayList tipe Generic*/
        ArrayList<String> fasilitas = new ArrayList<>();

        /*2. menambahkan data ke objek fasilitas*/
        fasilitas.add("TEMPAT PARKIR");
        fasilitas.add("RUANG TUNGGU");
        fasilitas.add("TIMBANGAN");
        fasilitas.add("TERMOMETER");

        int i = 0;
        while (i < fasilitas.size()) {
            System.out.println(i+1 +". "+ fasilitas.get(i));
            i++;
        }
    }
}
