/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author ZAKARIA
 */
public class DeretAritmatika1 {
    public static void main(String[] args) {
        // Un = a + (n-1) * b
        int a = 10, b = 4;
        int u = a, s = 0;
        int baris = 4, kolom = 5;
        
        // buat perulangan utk baris
        for (int i = 0; i < baris; i++) {
            // buat perulangan utk kolom
            for (int j = 0; j < kolom; j++) {
                System.out.print(u + "\t");
                u += b;
                s += u;
            }
            System.out.println("");
        }
        System.out.println("Jumlah deret aritmatika="+s);
    }
}
