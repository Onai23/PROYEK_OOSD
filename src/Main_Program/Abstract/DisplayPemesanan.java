package Main_Program.Abstract;

import java.util.Random;

public class DisplayPemesanan extends Pemesanan{
    /*1. set constructor*/
    public DisplayPemesanan(String nama, String alamat, String umur, String noTel, String jk) {
        /*memanggil constructor parent*/
        super(nama, alamat, umur, noTel, jk);
    }

    /*2. override method displayData()*/
    public void displayData() {
        System.out.println("======================================================================");
        System.out.println("DATA PASIEN : ");
        System.out.println("Nama            : " +nama);
        System.out.println("Alamat          : " +alamat);
        System.out.println("Umur (Tahun)    : " +umur);
        System.out.println("No Telepon      : " +noTel);
        System.out.println("Jenis Kelamin   : " +jk);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    /*3. set mehtod displayJadwalPemesanan()*/
    public void displayJadwalPemesanan() {
        /*instansiasi kelas Random*/
        Random random = new Random();
        int value;
        /*deklarasi dan inisialisasi value*/
        String[] days = {"SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", "MINGGU"};
        value = random.nextInt(7);

        if (value > 7) {
            System.out.println("MOHON MENUNGGU BEBERAPA SAAT.");
        } else {
            System.out.println("ANDA TELAH MENDAFTAR KE KLINIK IT DEL HARI "+ days[value]);
        }
        System.out.println("======================================================================");
    }
}
