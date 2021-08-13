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
public class Matriks2 {
    public static void main(String[] args) {
        /** 
         * matriksA -> 2x4 
         * matriksB -> 4x1
         * result -> 2x1
         */
        int matriksA[][] = {
            {3,6,1,8},
            {4,1,1,7}
        };
        
        int matriksB[][] = {
            {2},
            {5},
            {7},
            {4}
        };
        
        int result[][] = new int[2][1];
        
        // proses perkalian
        // batas loop pertama adalah 
        // jml baris matriksA
        for (int i = 0; i < 2; i++) {
            // batas loop kedua adalah
            // jml kolom matriksB
            for (int j = 0; j < 1; j++) {
                // batas loop ketiga adalah
                // jml kolom matriksA
                for (int k = 0; k < 4; k++) {
                    // isi matriks hasil
                    result[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        
        // menampilkan isi matriks result (2x1)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
