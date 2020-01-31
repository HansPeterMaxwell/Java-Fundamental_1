package com.juaracoding.main;
import java.util.Scanner;
public class Pengkondisian {
	public static void main(String[] args) {
		Scanner masukkan = new Scanner(System.in);
		//Variable Declaration
		int angka1,angka2;
		int y = 10;
		System.out.println("Masukkan angka pertama : ");
		angka1 = masukkan.nextInt();
		System.out.println("Masukkan Angka kedua");
		angka2 = masukkan.nextInt();
		int hasil = angka1+angka2;
//		System.out.println(hasil);
		if(hasil <= y) {
			System.out.println(hasil + " Masukkan angka yang lebih besar !");
		}
		else {
			System.out.println(hasil + " Masukkan angka yang lebih kecil !");
		}
	}
	

}
