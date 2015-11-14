import java.util.ArrayList;
import java.math.BigInteger;
/**
 * Write a description of class DaftarTransaksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaftarTransaksi
{
    public DaftarTransaksi(){
        daftar = new ArrayList<Transaksi>();
        this.saldoAkhir = new BigInteger("0");
    }
    
    public void tambah(Transaksi baru){
        daftar.add(baru);
    }
    
    public int banyakTransaksi(){
        return daftar.size();
    }
    
    public BigInteger saldoAkhir(){
        //saldoAkhir = daftar[0].add(daftar[1]).subtract(daftar[2]);
        return saldoAkhir;
    }
    
    public String saldoAkhirStr(){
        return saldoAkhir.toString();
    }
    
    public void tampilkan(){
      /*  System.out.println(daftar.size());
        
        for (saldo=0; saldo < daftar.size(); ++saldo)
        System.out.println(daftar.get(saldo).toString());
        System.out.println();
    */
    }
    
    private ArrayList<Transaksi> daftar;
    private BigInteger saldoAkhir;
    
    /*public static void main(String[] args) {
        DaftarTransaksi contoh = new DaftarTransaksi();
        contoh.tampilkan();
    }*/
}