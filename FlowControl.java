package com.juaracoding.main;

public class FlowControl {
	private static int nilai1 = 10;
	private static int nilai2 = 10;
	private static int nilai3 = 50;
	private static int nilai4 = 10;
	public static void main(String[] args) {
		int hasil = nilai1+nilai2+nilai3+nilai4;
		System.out.println(hasil);
		System.out.println("-----------------------------------");
		if (hasil <= 50) {
			System.out.println("Betul");}
		if (hasil>=50 && hasil<=80) {
			System.out.println("Hampir Betul");
		}
		else {
			System.out.println("Salah");
		}
		System.out.println("-----------------------------------");
		boolean isMarried = true;
		int jmlAnak = 3;
		boolean isTaken = false;
		
		if (isMarried) {
			if(jmlAnak <=2) {
				System.out.println("Buat anak lagi !");
			}
			else {
				System.out.println("Cukup, Indonesia sudah mulai padat penduduknya");
			}
		}
		else if (isTaken) {
			System.out.println("Cepat Menikah");
		}
		else {
			System.out.println("Cari Jodoh");
		}
	
	}

}
