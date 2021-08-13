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
public class Matriks1 {
    public static void main(String[] args) {
        /* buat matriks A dan B dengan dimensinya 5x3 */
        int matriksA[][] = {
            {3,6,9},
            {2,-1,10},
            {5,7,3},
            {9,7,8},
            {10,-4,8}
        };
        int matriksB[][] = {
            {2,3,1},
            {-7,9,4},
            {3,1,5},
            {6,5,3},
            {-2,9,4}
        };
        
        // proses penjumlahan matriks A + B
        for (int i = 0; i < 5; i++) { // loop baris
            for (int j = 0; j < 3; j++) { // loop kolom
                System.out.print(matriksA[i][j]+matriksB[i][j]+"\t");
            }
            System.out.println("");
        }
    }
 
}
