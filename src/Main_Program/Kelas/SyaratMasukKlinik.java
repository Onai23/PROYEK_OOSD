package Main_Program.Kelas;

import Main_Program.Interface.GetAllMethod;

import java.util.ArrayList;

public class SyaratMasukKlinik implements GetAllMethod {
    public void displaySyaratMasukKlinik() {
        /*1. instansiasi kelas ArrayList*/
        ArrayList<String> syarat = new ArrayList<>();

        /*2. menambahkan data ke objek syarat*/
        syarat.add("MEMBAWA MASKER");
        syarat.add("MEMBAWA HAND SANITIZER");
        syarat.add("MEMBAWA BOTOL MINUMAN");

        int i = 0;
        while(i < syarat.size()) {
            System.out.println(i+1 +". "+ syarat.get(i));
            i++;
        }

    }
}
