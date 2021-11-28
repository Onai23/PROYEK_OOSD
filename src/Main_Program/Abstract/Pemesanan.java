package Main_Program.Abstract;

public abstract class Pemesanan {
    String nama;
    String alamat;
    String umur;
    String noTel;
    String jk;

    /*1. set constructor with parameter*/
    public Pemesanan(String nama, String alamat, String umur, String noTel, String jk) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.noTel = noTel;
        this.jk = jk;
    }
    /*2. set method dengan access modifier abstract*/
    abstract void displayData();
}
