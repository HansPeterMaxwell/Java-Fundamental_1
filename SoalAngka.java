package com.juaracoding.main;

public class SoalAngka {

	private static int nilai = 0;
	private static int nilai2 = 1;
	private static String nilai3 = "2";
	private static String nilai4 = "3";
	
//	public static void main(String[]args) {
//		nilai = nilai + nilai2;put 
//		int a = Integer.parseInt(nilai3);
//		int b = Integer.parseInt(nilai4);
//		int hasil = nilai + a + b;
//		System.out.println("Hasil : " +hasil);
//	}
	public static void main(String[]args) {
		String a = String.valueOf(nilai);
		System.out.println("String pertama : " + a);
		System.out.println("------------------------");
		String b = String.valueOf(nilai2);
		System.out.println("String kedua : " + b);
		System.out.println("------------------------");
		int c = Integer.parseInt(nilai3)+Integer.parseInt(nilai4);
		System.out.println("Jumlah : " + c);
		System.out.println("------------------------");
		String hasil = a+b+String.valueOf(c);
		System.out.println("Hasil : " + hasil);
	}
}
