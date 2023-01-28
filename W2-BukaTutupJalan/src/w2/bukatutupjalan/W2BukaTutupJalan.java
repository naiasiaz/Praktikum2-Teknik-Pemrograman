package w2.bukatutupjalan;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard

/** 
 * <h1> Buka Tutup Jalan </h1>
 * 
 * Program ini meminta user untuk menginputkan 4 plat nomor dan menggabungkannya lalu dikurangkan dengan 999999, 
 * jika hasil bagi 5 adalah 0 maka program akan menampilkan "berhenti" jika tidak akan menampilkan "jalan"
 * 
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-28
 */

public class W2BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        String plat1, plat2, plat3, plat4, platGabungan;
        long hasil;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // Algoritma
        plat1 = keyboard.next();
        plat2 = keyboard.next();
        plat3 = keyboard.next();
        plat4 = keyboard.next();
        
        platGabungan = plat1 + plat2 + plat3 + plat4;
        
        // Mengkonversi String ke long, lalu dikurang 999999
        hasil = Long.parseLong(platGabungan) - 999999;
        hasil = hasil % 5;
        
        if (hasil == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
    
}