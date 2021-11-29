package Main_Program.Kelas;

public class DataDokter {
    /*1. set atribut*/
    private String nama;
    private String NID;
    private String jenisKelamin;
    private String tanggalLahir;

    /*2. set constructor no parameter*/
    public DataDokter() {}
    /*3. set constructor with parameter*/
    public DataDokter(String nama, String NID, String jenisKelamin, String tanggalLahir) {
        this.nama = nama;
        this.NID = NID;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
    }
    /*4. set method setter dan getter*/

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
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
