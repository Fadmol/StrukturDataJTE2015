import java.util.Date;
/**
 * Write a description of class Pemeriksaan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pemeriksaan
{
    Date tanggalPemeriksaan;
    Catatan []catatan;
    Obat [] resep;
    
     public Pemeriksaan (Date tanggalPemeriksaan, Catatan [] catatan, Obat [] resep){
     this.tanggalPemeriksaan=tanggalPemeriksaan;
     this.catatan=catatan;
     this.resep=resep;
    }
}
