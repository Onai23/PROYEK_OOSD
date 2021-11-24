package Main_Program.Kelas;

import Main_Program.Interface.GetAllMethod;

public class JadwalKlinik implements GetAllMethod {
    /*1. set method void displayJadwalHariKerja*/
    @Override
    public void displayKlinik() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("|| HARI     ||    JAM BUKA     ||   JAM TUTUP || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("|| SENIN    ||    08.00        ||    17.00    || ");
        System.out.println("|| SELASA   ||    09.00        ||    15.00    || ");
        System.out.println("|| RABU     ||    10.00        ||    16.00    || ");
        System.out.println("|| KAMIS    ||    08.00        ||    17.00    || ");
        System.out.println("|| JUMAT    ||    08.00        ||    17.00    || ");
        System.out.println("|| SABTU    ||    LIBUR        ||    LIBUR    || ");
        System.out.println("|| MINGGU   ||    LIBUR        ||    LIBUR    || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =  ");
        System.out.println();
    }
}
