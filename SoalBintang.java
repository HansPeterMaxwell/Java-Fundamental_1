package com.juaracoding.main;
import java.util.Scanner;

public class SoalBintang {
	public static void main(String[] args) {
		int angka;
		System.out.println("Tugas Bintang Nested For");
		Gambar();
		Scanner sn = new Scanner(System.in);
		System.out.println("masukkan angka yang anda mau : ");
		angka = sn.nextInt();
		for (int i = 0;i<angka;i++) {
			for (int j = 0; j<angka;j++) {
				if (j<=i) {
					System.out.print("X ");
				}
				else {
					System.out.print("");
				}}
			System.out.println("");		
		}
		}
	public static void Gambar() {
		System.out.println("......");
		nomor =  5;
		System.out.println(nomor);	
	}
	private static int nomor;
}
