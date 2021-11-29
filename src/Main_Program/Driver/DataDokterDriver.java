package Main_Program.Driver;

import Main_Program.Enum.Gender;
import Main_Program.Kelas.DataDokter;
import Main_Program.Interface.GetAllMethod;

public class DataDokterDriver implements GetAllMethod {
    /*1. set main method*/
    @Override
    public void displayDataDokter() {
        /*2. set instansiasi kelas DataDokter*/
        DataDokter dataDokter = new DataDokter("Onai Nadapdap", "11420047", "Laki-laki", "2002");
        DataDokter dataDokterI = new DataDokter("Evan Hutagaol", "1141902", "Laki-laki", "2001");
        DataDokter dataDokterII = new DataDokter("Wordyka Nainggolan", "11420041", "Laki-laki", "2002");
//        dataDokter.setNama("Onai Nadapdap");
//        dataDokter.setNID("11420047");
//        dataDokter.setJenisKelamin("Laki-laki");
//        dataDokter.setTanggalLahir("2002");
//        String nama_dokter_I = dataDokter.getNama();
//        String nid_dokter_I = dataDokter.getNID();
//        String jk_dokter_I = dataDokter.getJenisKelamin();
//        String tgl_dokter_I = dataDokter.getTanggalLahir();
//
//        dataDokter.setNama("Wordyka Nainggolan");
//        dataDokter.setNID("11420041");
//        dataDokter.setJenisKelamin("Laki-laki");
//        dataDokter.setTanggalLahir("2002");
//        String nama_dokter_II = dataDokter.getNama();
//        String nid_dokter_II = dataDokter.getNID();
//        String jk_dokter_II = dataDokter.getJenisKelamin();
//        String tgl_dokter_II = dataDokter.getTanggalLahir();
//
//        dataDokter.setNama("Rizki Situmorang");
//        dataDokter.setNID("1142003");
//        dataDokter.setJenisKelamin(Gender.LAKI_LAKI.toString());
//        dataDokter.setTanggalLahir("2002");
//        String nama_dokter_III = dataDokter.getNama();
//        String nid_dokter_III = dataDokter.getNID();
//        String jk_dokter_III = dataDokter.getJenisKelamin();
//        String tgl_dokter_III = dataDokter.getTanggalLahir();
//        System.out.println(nama_dokter_III);
//        System.out.println(nid_dokter_III);
//        System.out.println(jk_dokter_III);
//        System.out.println(tgl_dokter_III);

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|| Nama                 ||    NID               ||   Jenis Kelamin      ||    Tanggal Lahir  || ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("||"+ dataDokter.getNama()+"  \t\t|| "+ dataDokter.getNID()+"    \t\t\t||  "+ dataDokter.getJenisKelamin()+"  \t\t\t|| "+ dataDokter.getTanggalLahir()+"  \t\t\t || ");
        System.out.println("||"+ dataDokterI.getNama()+"    || "+ dataDokterI.getNID()+"   \t\t\t||  "+ dataDokterI.getJenisKelamin()+" \t\t\t|| "+ dataDokterI.getTanggalLahir()+"  \t\t\t ||");
        System.out.println("||"+ dataDokterII.getNama()+"      || "+ dataDokterI.getNID()+"  \t\t\t||  "+ dataDokterI.getJenisKelamin()+" \t\t\t|| "+ dataDokterI.getTanggalLahir()+"  \t\t\t ||");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println();


    }

}
