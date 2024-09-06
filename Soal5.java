/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
/* Soal 5 - Buka tutup jalan*/
/* 05 September 2024 */

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan plat: ");
        String plat1 = scan.next();
        String plat2 = scan.next();
        String plat3 = scan.next();
        String plat4 = scan.next();
        
        String gabunganPlat = plat1 + plat2 + plat3 + plat4;
        
        long gabunganAngka = Long.parseLong(gabunganPlat);
        
        if ((gabunganAngka - 999999) % 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
        
        scan.close();
    }
}