package Main_Program.Main;

import Main_Program.Driver.DataDokterDriver;
import Main_Program.Driver.DataPerawatDriver;
import Main_Program.Kelas.Fasilitas;
import Main_Program.Kelas.JadwalHariKerja;
import Main_Program.Kelas.JadwalKlinik;
import Main_Program.Kelas.SyaratMasukKlinik;

import java.util.Scanner;

public class Main {
    /*1. set main method*/
    public static void main(String[] args) {
        /*2. instansiasi kelas Scanner untuk melakukan proses memasukkan data*/
        Scanner input_pengunjung = new Scanner(System.in);
        boolean status = true;

        while(status) {
            System.out.println("=== SELAMAT DATANG DI KLINIK IT DEL ===");
            System.out.println("\n== DAFTAR MENU INFORMASI KLINIK IT DEL ==");
            System.out.println("1. Jadwal Klinik");
            System.out.println("2. Jadwal Hari Kerja");
            System.out.println("3. Data Dokter");
            System.out.println("4. Data Perawat");
            System.out.println("5. Fasilitas");
            System.out.println("6. Syarat mengunjungi klinik");
            System.out.println("7. Tata Cara Pembayaran");
            System.out.println("8. Kontak yang dihubungi");
            System.out.println("9. Tentang klinik");
            System.out.println("10. Detail pembayaran");
            System.out.println("11. Keluar");

            /*3. MEMINTA PENGUNJUNG MEMASUKKAN INPUT DATA*/
            System.out.print("\nMasukkan angka untuk melihat detail informasi : ");

            /*4. MEMBACA INPUTAN PENGUNJUNG*/
            int stored_input = input_pengunjung.nextInt();

            /*5. MENGGUNAKAN PENGKONDISIAN UNTUK MENAMPILKAN DATA BERDASARKAN INPUT PENGUNJUNG*/
            if (stored_input == 1) {
                /*6. set instansiasi kelas JadwalHariKerja*/
                JadwalKlinik jadwalKlinik = new JadwalKlinik();
                System.out.println("Pilihan Anda adalah  :"+ stored_input + ". Jadwal Klinik");
                jadwalKlinik.displayKlinik();
            } else if (stored_input == 2) {
                /*7set instansiasi kelas JadwalJamKerja*/
                JadwalHariKerja jadwalHariKerja = new JadwalHariKerja();
                System.out.println("Pilihan Anda adalah  : " + stored_input + ". Jadwal Jam Kerja");
                jadwalHariKerja.displayJadwalHariKerja();
            } else if (stored_input == 3) {
                /*8. instansiasi kelas DataDokterDriver*/
                DataDokterDriver dataDokterDriver = new DataDokterDriver();
                System.out.println("Pilihan Anda adalah  : " + stored_input + ". Data Dokter");
                dataDokterDriver.displayDataDokter();
            } else if (stored_input == 4) {
                /*9. instansiasi kelas DataPerawatDriver*/
                DataPerawatDriver dataPerawatDriver = new DataPerawatDriver();
                dataPerawatDriver.displayDataPerawat();
            } else if (stored_input == 5) {
                /*10. instansiasi kelas Fasilitas*/
                Fasilitas fasilitas = new Fasilitas();
                System.out.println("Pilihan Anda adalah  : " + stored_input + ". Fasilitas");
                System.out.println("BERIKUT FASILITAS YANG TERSEDIA DI KLINIK IT DEL : " );
                fasilitas.displayFasilitas();
            } else if(stored_input == 6) {
                SyaratMasukKlinik syaratMasukKlinik = new SyaratMasukKlinik();
                System.out.println("BERIKUT SYARAT MASUK KE KLINIK IT DEL : ");
                syaratMasukKlinik.displaySyaratMasukKlinik();
            } else if (stored_input == 11) {
                System.out.println("Apakah Anda ingin keluar dari aplikasi ?  : (yes/no)");
                String opsi = input_pengunjung.next();
                if(opsi.equals("yes")) {
                    System.out.println("===================================================");
                    System.out.println("|| TERIMAKASIH TELAH BERKUNJUNG KE APLIKASI KAMI ||");
                    System.out.println("===================================================");
                    System.out.println("Menghentikan Aplikasi");
                    System.exit(0);
                }
            }

        }
    }
}
