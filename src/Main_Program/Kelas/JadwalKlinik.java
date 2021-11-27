package Main_Program.Kelas;

import Main_Program.Enum.Days;
import Main_Program.Interface.GetAllMethod;

public class JadwalKlinik implements GetAllMethod {
    /*1. set method void displayJadwalHariKerja*/
    @Override
    public void displayKlinik() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("|| HARI     ||    JAM BUKA     ||   JAM TUTUP || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("|| "+ Days.SENIN.toString() +"    ||    08.00        ||    17.00    || ");
        System.out.println("|| "+ Days.SELASA.toString() +"   ||    09.00        ||    15.00    || ");
        System.out.println("|| "+ Days.RABU.toString() +"     ||    10.00        ||    16.00    || ");
        System.out.println("|| "+ Days.KAMIS.toString() +"    ||    08.00        ||    17.00    || ");
        System.out.println("|| "+ Days.JUMAT.toString() +"    ||    08.00        ||    17.00    || ");
        System.out.println("|| "+ Days.SABTU.toString() +"    ||    LIBUR        ||    LIBUR    || ");
        System.out.println("|| "+ Days.MINGGU.toString() +"   ||    LIBUR        ||    LIBUR    || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =  ");
        System.out.println();
    }
}
