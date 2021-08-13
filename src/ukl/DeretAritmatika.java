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
public class DeretAritmatika {
    public static void main(String[] args) {
        // Un = a + (n-1) * b
        int a = 10, b = 4;
        // suku ke 13 sampai suku ke 25
        int awal = 13, akhir = 25;
        int u, s = 0;
        for(int i = awal; i<= akhir; i++){
            u = a + (i-1) * b;
            System.out.println("Suku ke-"+i+" = " +u);
            s += u;
        }
        System.out.println("Jumlah deret aritmatika="+s);
    }
}
