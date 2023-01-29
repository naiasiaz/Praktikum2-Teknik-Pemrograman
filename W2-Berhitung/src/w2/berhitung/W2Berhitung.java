package w2.berhitung;

import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard

/** 
 * <h1> Berhitung </h1>
 * 
 * Program ini meminta user untuk menginputkan angka dan jenis operasi, lalu program akan mnjalankan perintah yang diinputkan
 * user untuk perhitungan matematika seperti pertambahan, pengurangan, perkalian, pembagian, serta modulus atau hasil bagi
 * 
 * @author Naia Siti Az-zahra
 * @version 2.0
 * @since 2023-01-28
 */

public class W2Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int angka1, angka2, hasil;
        char operator;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // Algoritma
        angka1 = keyboard.nextInt();
        operator = keyboard.next().charAt(0);
        angka2 = keyboard.nextInt();
        
        if((angka1 >= 1 && angka1 <= 1000) && (angka2 >= 1 && angka2 <= 1000)) {
            switch (operator) {
                case '+' -> { // Jika operator "+" maka akan dilakukan pertambahan angka1 + angka2
                    hasil = angka1 + angka2;
                    System.out.println(hasil);
                }
                case '-' -> { // Jika operator "-" maka akan dilakukan pengurangan angka1 - angka2
                    hasil = angka1 - angka2;
                    System.out.println(hasil);
                }
                case '*' -> { // Jika operator "*" maka akan dilakukan perkalian angka1 * angka2
                    hasil = angka1 * angka2;
                    System.out.println(hasil);
                }
                case '/' -> { // Jika operator "/" maka akan dilakukan pembagian angka1 / angka2
                    if (angka1 % angka2 == 0) {
                        hasil = angka1 / angka2;
                        System.out.println(hasil);
                    } else {
                        System.out.println("angka1 tidak habis dibagi angka2.");
                    }
                }
                case '%' -> { // Jika operator "%" maka akan dilakukan hasil bagi angka1 % angka2
                    hasil = angka1 % angka2;
                    System.out.println(hasil);
                }
                default -> {
                    System.out.println("Terdapat kesalahan!");
                }
            }
        } else {
            System.out.println("Input tidak valid!");
        }
    }
    
}