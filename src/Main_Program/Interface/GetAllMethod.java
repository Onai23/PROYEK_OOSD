package Main_Program.Interface;

public interface GetAllMethod {
    // default method
    default void displayKlinik() {
        System.out.println("This method displayJadwalHariKerja()");
    }
    default void displayJadwalHariKerja() {
        System.out.println("This method displayJadwalJamKerja()");
    }

    default void displayDataDokter() {
        System.out.println("This method displayDataDokter()");
    }
    default void displayDataPerawat() {
        System.out.println("This method displayDataPerawat()");
    }
    default void displayFasilitas() {
        System.out.println("This method displayFasilitas()");
    }
    default void displaySyaratMasukKlinik() {
        System.out.println("This method displaySyaratMasukKlinik()");
    }

}
