package w2.gajiagent;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard

/** 
 * <h1> Gaji Agent </h1>
 * 
 * Program ini akan mengkalkulasi gaji yang diterima pegawai sesuai dengan item yang terjual
 * Program ini akan memeriksa jika :
 * item kurang dari 15 yaitu terjadi denda pemotongan gaji pokok sesuai dengan item yang kurang
 * item lebih dari 40 mendapatkan bonus 25%
 * item lebih dari 80 mendapatkan bonus 35%
 * item lebih dari 15 dan kurang dari 40
 * 
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-28
 */

public class W2GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int item, total_gaji;
        int gaji = 500000;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // Algoritma
        item = keyboard.nextInt();
        
        if (item < 15) { // Jika item kurang dari 15
            total_gaji = gaji - (((15 - item) * 50000) * 15/100);
            System.out.println(total_gaji);
        } else if (item >= 40 && item < 80) { // Jika item lebih dari atau sama dengan 40 dan kurang dari 80
            total_gaji = gaji + ((item * 50000) * 25/100);
            System.out.println(total_gaji);
        } else if (item > 80) { // Jika item lebih dari 80
            total_gaji = gaji + ((item * 50000) * 35/100);
            System.out.println(total_gaji);            
        } else { // Jika item lebih dari 15 dan kurang dari 40
            total_gaji = gaji + ((item * 50000) * 10/100);
            System.out.println(total_gaji);
        }
    }
    
}