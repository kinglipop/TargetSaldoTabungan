/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan20.targetsaldotabungan;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program menghitung saldo tabungan
 */
public class PBO11K10118904Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000, i = 1;
        double bunga;
    
        do {
            bunga = saldo * 0.08;
            saldo = (int) (saldo + bunga);
            System.out.printf("Saldo di bulan ke-"+ i +" Rp.%,10d%n", saldo);
            i++;
        } while (saldo <= 6000000);
    }
    
}
