/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
/* Soal 4 - Gaji Agent */
/* 05 September 2024 */

import java.util.Scanner;

public class Soal4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penjualan: ");
        int jumlahPenjualan = scan.nextInt();
        
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        double gajiAkhir = gajiPokok;
        
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        
        if (jumlahPenjualan > 80) {
            gajiAkhir = gajiAkhir + (0.35 * totalPenjualan);
        } else if (jumlahPenjualan >= 40) {
            gajiAkhir = gajiAkhir + (0.25 * totalPenjualan);
        } else if (jumlahPenjualan < 15) {
            int kekurangan = 15 - jumlahPenjualan;
            gajiAkhir = gajiAkhir - (0.15 * (kekurangan * hargaPerItem));
        } else {
            gajiAkhir = gajiAkhir + (0.10 * totalPenjualan);
        }
        
        System.out.println((int)gajiAkhir);
        
        scan.close();
    }
}