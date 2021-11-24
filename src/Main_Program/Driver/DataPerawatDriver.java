package Main_Program.Driver;

import Main_Program.Interface.GetAllMethod;
import Main_Program.Kelas.DataPerawat;

public class DataPerawatDriver implements GetAllMethod {
    /*1. set method*/
     public void displayDataPerawat() {
        DataPerawat dataPerawat_I = new DataPerawat("Jesika P", "250902", "Perempuan", "25-09-2002");
        DataPerawat dataPerawat_II = new DataPerawat("kalina", "250903", "Perempuan", "25-08-2002");
        DataPerawat dataPerawat_III = new DataPerawat("meri", "250904", "Perempuan", "25-07-2002");
        /*2. set instansiasi kelas DataPerawat*/

        /*3. assign value ke objek dataPerawat*/
         System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
         System.out.println("|| Nama                 ||    NID               ||   Jenis Kelamin      ||    Tanggal Lahir  || ");
         System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
         System.out.println("||"+ dataPerawat_I.getNama()+"  \t\t\t|| "+ dataPerawat_I.getNIP()+"    \t\t\t||  "+ dataPerawat_I.getJenisKelamin()+"  \t\t\t|| "+ dataPerawat_I.getTanggalLahir()+"  \t\t || ");
         System.out.println("||"+ dataPerawat_II.getNama()+" \t\t\t\t|| "+ dataPerawat_II.getNIP()+"   \t\t\t||  "+ dataPerawat_II.getJenisKelamin()+" \t\t\t|| "+ dataPerawat_II.getTanggalLahir()+"  \t\t ||");
         System.out.println("||"+ dataPerawat_III.getNama()+" \t\t\t\t\t|| "+ dataPerawat_III.getNIP()+"  \t\t\t\t||  "+ dataPerawat_III.getJenisKelamin()+" \t\t\t|| "+ dataPerawat_II.getTanggalLahir()+"  \t\t ||");
         System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
         System.out.println();

     }
}
