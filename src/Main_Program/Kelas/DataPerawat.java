package Main_Program.Kelas;

import Main_Program.Driver.DataPerawatDriver;

public class DataPerawat {
    /*1. set atribut*/
    private String nama;
    private String NIP;
    private String jenisKelamin;
    private String tanggalLahir;

    /*2. set constructor no parameter*/
    public DataPerawat() {}
    /*3. set constructor with parameter*/
    public DataPerawat(String nama, String NIP, String jenisKelamin, String tanggalLahir) {
        this.nama = nama;
        this.NIP = NIP;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
    }

    /*4. set setter dan getter*/
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

}
