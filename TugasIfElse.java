package com.juaracoding.main;
import java.util.Scanner;

public class TugasIfElse {
	public static void main(String[] args) {
		Scanner masukkan = new Scanner(System.in);
		int nilai;
		System.out.println("Masukkan angka : ");
		nilai = masukkan.nextInt();
		if (nilai %2 == 1) {
			System.out.println(nilai + " adalah bilangan ganjil");
		}
		else {
			System.out.println(nilai + " adalah bilangan genap");
		}
		
	}
}
