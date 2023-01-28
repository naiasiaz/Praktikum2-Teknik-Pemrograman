package w2.bignumber;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard
import java.math.BigInteger; // Memanggil class untuk melakukan operasi matematika bertipe data Big Integer

/** 
 * <h1> Big Integer </h1>
 * 
 * Program ini menjalankan inputan dari user dengan tipe data big integer lalu melakukan operasi matematika
 * pertambahan dan pengurangan dengan tipe data Big Integer
 * 
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-28
 */

public class W2BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel Bertipe Data BigInteger
        BigInteger angka1, angka2, hasilTambah, hasilKali;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // ALgoritma
        angka1 = keyboard.nextBigInteger();
        angka2 = keyboard.nextBigInteger();
        
        // Operasi Pertambahan dan Pengurangan Angka Bertipe BigInteger
        hasilTambah = angka1.add(angka2);
        hasilKali = angka1.multiply(angka2);
        
        // Menampilkan hasil operasi tambah dan kali
        System.out.println(hasilTambah);
        System.out.println(hasilKali);
    }
    
}