package com.juaracoding.main;

import java.util.Scanner;

public class SwitchSample {
	public static void main(String[] args) {
		Scanner masukkan = new Scanner(System.in);
		int nilai;
		System.out.println("Masukkan angka : ");
		nilai = masukkan.nextInt();
		switch(nilai) {
		case 1 :
			System.out.println("case 1 dijalankan");
			break;
		case 2 :
			System.out.println("case 2 dijalankan");
			break;
		case 3 :
			System.out.println("case 3 dijalankan");
			break;
		default:
			System.out.println("Default case dijalankan");
		}
	}

}
