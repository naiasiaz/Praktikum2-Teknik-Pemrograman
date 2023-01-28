package w2.inputoutput;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard

/** 
 * <h1> Input & Output </h1>
 * 
 * Program ini adalah program memisahkan kata-perkata dari kalimat yang diinputkan. Program akan menjalankan dengan 
 * menginputkan string lalu menggunakan fungsi split() untuk memisahkan kata-perkata dan dimasukkan pada array lalu 
 * ditampilkan hasil yang sudah berupa kata per kata ke layar
 * 
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-24
 */

public class W2InputOutput {

    public static void main(String[] args) {
        // Deklarasi Variabel
        int panjang;
        String kalimat;
        
        // Menyimpan inputan dari keyboard di variable kalimat
        try ( // Membuat Scanner Baru
                Scanner keyboard = new Scanner(System.in)) {
            // Menyimpan inputan dari keyboard di variable kalimat
            kalimat = keyboard.nextLine();
            // Menutup Inputan
        }
        
        // Membuat array of string
        String[] stringArray = kalimat.split("[@ ? ! _ , . ']+");
        /*  Split() digunakan untuk memisahkan kalimat per kata sesuai dengan kata pemisah
            lalu dimasukkan ke dalam array
        */
        
        panjang = stringArray.length;
        
        // Menampilkan jumlah panjang
        System.out.println(panjang);
        
        // Menampilkan kata yang sudah terpisah di dalam array
        for(int i = 0; i < panjang; i++){
            System.out.println(stringArray[i]);
        }
    }
    
}