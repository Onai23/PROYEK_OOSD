package Main_Program.Kelas;

import Main_Program.Enum.Days;
import Main_Program.Interface.GetAllMethod;

public class JadwalHariKerja implements GetAllMethod {
    @Override
    public void displayJadwalHariKerja() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|| Nama Dokter             ||    Nama Perawat     ||   Jadwal Hari Kerja  || ");
        System.out.println("|| 1. Onai Nadapdap        ||    Jes              ||    Rabu dan Jumat    || ");
        System.out.println("|| 2. Wordyka Nainggolan   ||    Seny             ||    Senin dan Kamis   || ");
        System.out.println("|| 3. Rizki Situmorang     ||    Nesty            ||    "+ Days.SELASA.name() + "            || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = =");
        System.out.println();
    }
}
