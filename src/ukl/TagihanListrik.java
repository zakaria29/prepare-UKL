/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author ZAKARIA
 */
public class TagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan:");
        int id = input.nextInt();
        System.out.println("Masukkan banyaknya penggunaan:");
        int kwh = input.nextInt();
        
        /* define data */
        String nama[] = {"Galuh","Indro","Jedi","Kanu"};
        int golongan[] = {1,3,2,3};
        String alamat[] = {"Sawojajar","Kedungkandang",
        "Ijen","Dinoyo"};
        
        // proses hitung tagihan
        // fungsi dg parameter(kwh,gol)
        
        // call fungsi tagihanListrik
        double tagihan = tagihanListrik(kwh,golongan[id-1]);
        
        // tampilkan  print out data
        System.out.println("--------------------------");
        System.out.println("Nama \t : " + nama[id-1]);
        System.out.println("Golongan \t : " + golongan[id-1]);
        System.out.println("Alamat \t : " + alamat[id-1]);
        System.out.println("Tagihan \t : Rp " + tagihan);
    }
    
    public static double tagihanListrik(int kwh, int golongan){
        double tarif = 0;
        if(golongan == 1){
            tarif = 1000;
        }
        else if(golongan == 2){
            tarif = 1300;
        }
        else if(golongan == 3){
            tarif = 1500;
        }
        
        double tagihan = kwh * tarif + 13000;
        if(tagihan < 50000){
            return 50000;
        }else{
            return tagihan;
        }
    }
}
