package Main_Program.Abstract;

import Main_Program.Interface.GetMethodPemesanan;

import java.util.Random;

public class DisplayPemesanan extends Pemesanan implements GetMethodPemesanan {
    /*1. set constructor*/
    public DisplayPemesanan(String nama, String alamat, String umur, String noTel, String jk, String jadwalKedatangan) {
        /*memanggil constructor parent*/
        super(nama, alamat, umur, noTel, jk, jadwalKedatangan);
    }

    /*2. override method displayData()*/
    public void displayData() {
        System.out.println("======================================================================");
        System.out.println("DATA PASIEN : ");
        System.out.println("Nama              : " +nama);
        System.out.println("Alamat            : " +alamat);
        System.out.println("Umur (Tahun)      : " +umur);
        System.out.println("No Telepon        : " +noTel);
        System.out.println("Jenis Kelamin     : " +jk);
        System.out.println("Jadwal Kedatangan : " +jadwalKedatangan);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    /*3. set mehtod displayJadwalPemesanan()*/
    @Override
    public void displayJadwalPemesanan() {
        System.out.println("ANDA TELAH MENDAFTAR KE KLINIK IT DEL PADA " + jadwalKedatangan);
//        /*instansiasi kelas Random*/
//        Random random = new Random();
//        int value;
//        /*deklarasi dan inisialisasi value*/
//        String[] days = {"SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", "MINGGU"};
//        value = random.nextInt(7);
//
//        if (value > 7) {
//            System.out.println("MOHON MENUNGGU BEBERAPA SAAT.");
//        } else {
//            System.out.println("ANDA TELAH MENDAFTAR KE KLINIK IT DEL HARI "+ days[value]);
//        }
//        System.out.println("======================================================================");
    }
}
