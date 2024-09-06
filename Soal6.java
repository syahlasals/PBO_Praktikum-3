/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
/* Soal 6 - Big Number*/
/* 05 September 2024 */

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Angka 1: ");
        String a = scan.nextLine();
        System.out.print("Angka 2: ");
        String b = scan.nextLine();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger penjumlahan = bigA.add(bigB);
        BigInteger perkalian = bigA.multiply(bigB);

        System.out.println("Jumlah: "+penjumlahan);
        System.out.println("Kali: "+perkalian);

        scan.close();
    }
}