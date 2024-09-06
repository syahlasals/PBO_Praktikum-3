/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
/* Soal 1 - Input & Output */
/* 05 September 2024 */

import java.util.Scanner;

public class Soal1 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan teks: ");
        String inputTeks = scan.nextLine();

        String[] tokenArray = inputTeks.split("[\\s!,?._'@]+");

        int jumlahToken = 0;
        for (String token : tokenArray) {
            if (!token.isEmpty()) {
                jumlahToken++;
            }
        }

        System.out.println("Jumlah Token: "+jumlahToken);

        System.out.println("Token yang ditemukan: ");
        for (String token : tokenArray) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}