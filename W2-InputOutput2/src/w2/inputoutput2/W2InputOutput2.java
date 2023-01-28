package w2.inputoutput2;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard

/** 
 * <h1> Input & Output2 </h1>
 * 
 * Program ini akan meeminta user untuk melakukan input lalu mengoutputkan hasil yang sudah berformat
 * program ini memformat agar setiap angka yang diinputkan akan menghasilkan sebuah format 3 digit angka, 
 * di mana jika kita menginputkan 1 atau 2 digit angka, maka didepan angka tersebut akan terdapat angka 0
 * 
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-28
 */

public class W2InputOutput2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        String kalimat;
        int angka;
        
        // Membuat array of string dan array of integer
        String[] arrKalimat = new String[15];
        int[] arrAngka = new int[3];

        // Membuat Scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Melakukan scanner ke array menggunakan perulangan
        for(int i = 0; i < 3; i++) {
            kalimat = keyboard.next();
            arrKalimat[i] = kalimat;
            angka = keyboard.nextInt();
            arrAngka[i] = angka;
        }
        
        // Menampilkan Output
        System.out.println("==============================");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", arrKalimat[i], arrAngka[i]); // %03d untuk membuat format integer 000, %s untuk mengoutputkan string
        }
        System.out.println("==============================");
    }

}