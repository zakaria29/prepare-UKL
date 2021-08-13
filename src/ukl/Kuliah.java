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
public class Kuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan id mahasiswa:");
        int id = input.nextInt();
        System.out.println("Masukkan jumlah pendapatan:");
        long gaji = input.nextLong();
        System.out.println("Masukkan jumlah bulan utk SPP: ");
        int jumlahBulan = input.nextInt();
        
        /* define data */
        String nama[] = {"Mira","Nina","Oemar","Pena"};
        String jalur[] = {"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
        String alamat[] = {"Sawaojajar","Kedungkandang",
        "Ijen","Dinoyo"};
        
        // menghitung nominal pembayaran
        long DSP = getDSP(jalur[id-1], gaji);
        long SPP = getSPP(jalur[id-1], gaji, jumlahBulan);
        long total = DSP + SPP;
        
        // print out
        System.out.println("--------------------------------------");
        System.out.println("Nama \t : " + nama[id-1]);
        System.out.println("Alamat \t : " + alamat[id-1]);
        System.out.println("Jalur Masuk \t : " + jalur[id-1]);
        System.out.println("Nominal \t : Rp " + total);
    }
    
    public static long getDSP(String jalur, long pendapatan){
        long sbmptn[] = {5000000,15000000,30000000};
        long snmptn[] = {7000000,17000000,35000000};
        long mandiri[] = {10000000,25000000,50000000};
        
        int index = 0;
        if(pendapatan < 2000000){
            index = 0;
        }
        else if(pendapatan >= 2000000 && pendapatan <= 10000000){
            index = 1;
        }
        else {
            index = 2;
        }
        
        // seleksi jalur masuk
        if(jalur.equals("SBMPTN")){
            return sbmptn[index];
        }
        else if (jalur.equals("SNMPTN")){
            return snmptn[index];
        }
        else {
            return mandiri[index];
        }
    }
    
    public static long getSPP(
            String jalur, long pendapatan, int jumlahBulan){
        long sbmptn[] = {500000,1000000,2000000};
        long snmptn[] = {500000,1000000,2000000};
        long mandiri[] = {1000000,2000000,3000000};
        
        int index = 0;
        if(pendapatan < 2000000){
            index = 0;
        }
        else if(pendapatan >= 2000000 && pendapatan <= 10000000){
            index = 1;
        }
        else {
            index = 2;
        }
        
        // seleksi jalur masuk
        if(jalur.equals("SBMPTN")){
            return sbmptn[index] * jumlahBulan;
        }
        else if (jalur.equals("SNMPTN")){
            return snmptn[index] * jumlahBulan;
        }
        else {
            return mandiri[index] * jumlahBulan;
        }
    }
}
