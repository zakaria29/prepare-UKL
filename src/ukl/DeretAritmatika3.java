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
public class DeretAritmatika3 {
    public static void main(String[] args) {
        // Un = a + (n-1) * b
        int a = 10, b = 4;
        int u = a, s = 0;
        int kolom = 6;
        
        /** pola segitiga A kolom=6*/
        for (int i = 1; i <= kolom; i++) {
            // for(int j = 1; j <= i; j++)
            for(int j = kolom; j >= i; j--){
                System.out.print(u + "\t");
                u += b;
                s += u;
            }
            System.out.println("");
        }
        
        System.out.println("Jumlah deret aritmatika="+s);
    }
}
