package Main_Program.Driver;

import Main_Program.Enum.Gender;
import Main_Program.Kelas.DataDokter;
import Main_Program.Interface.GetAllMethod;

public class DataDokterDriver implements GetAllMethod {
    /*1. set main method*/
    @Override
    public void displayDataDokter() {
        /*2. set instansiasi kelas DataDokter*/
        DataDokter dataDokter = new DataDokter();
        dataDokter.setNama("Onai Nadapdap");
        dataDokter.setNID("11420047");
        dataDokter.setJenisKelamin("Laki-laki");
        dataDokter.setTanggalLahir("2002");
        String nama_dokter_I = dataDokter.getNama();
        String nid_dokter_I = dataDokter.getNID();
        String jk_dokter_I = dataDokter.getJenisKelamin();
        String tgl_dokter_I = dataDokter.getTanggalLahir();

        dataDokter.setNama("Wordyka Nainggolan");
        dataDokter.setNID("11420041");
        dataDokter.setJenisKelamin("Laki-laki");
        dataDokter.setTanggalLahir("2002");
        String nama_dokter_II = dataDokter.getNama();
        String nid_dokter_II = dataDokter.getNID();
        String jk_dokter_II = dataDokter.getJenisKelamin();
        String tgl_dokter_II = dataDokter.getTanggalLahir();

        dataDokter.setNama("Rizki Situmorang");
        dataDokter.setNID("1142003");
        dataDokter.setJenisKelamin(Gender.LAKI_LAKI.toString());
        dataDokter.setTanggalLahir("2002");
        String nama_dokter_III = dataDokter.getNama();
        String nid_dokter_III = dataDokter.getNID();
        String jk_dokter_III = dataDokter.getJenisKelamin();
        String tgl_dokter_III = dataDokter.getTanggalLahir();
//        System.out.println(nama_dokter_III);
//        System.out.println(nid_dokter_III);
//        System.out.println(jk_dokter_III);
//        System.out.println(tgl_dokter_III);

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|| Nama                 ||    NID               ||   Jenis Kelamin      ||    Tanggal Lahir  || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("||"+ nama_dokter_I+"  \t\t|| "+ nid_dokter_I+"    \t\t\t||  "+ jk_dokter_I+"  \t\t\t|| "+ tgl_dokter_I+"  \t\t\t || ");
        System.out.println("||"+ nama_dokter_II+"    || "+ nid_dokter_II+"   \t\t\t||  "+ jk_dokter_II+" \t\t\t|| "+ tgl_dokter_I+"  \t\t\t ||");
        System.out.println("||"+ nama_dokter_III+"      || "+ nid_dokter_III+"  \t\t\t||  "+ jk_dokter_III+" \t\t\t|| "+ tgl_dokter_I+"  \t\t\t ||");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println();


    }

}
