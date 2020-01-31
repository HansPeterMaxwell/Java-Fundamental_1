package com.juaracoding.main;

public class RataRata {
	public static void main(String[] args) {
		//int nilai kelas[] = 10,7,6,5,3,4,5
		//hitung nilai rata rata kelas
		int ratarata[]= {10,7,6,5,3,4,5};
		int hasil = 0;
		for (int x = 0;x<ratarata.length;x++) {
			hasil = hasil+ratarata[x];
		}
		System.out.println("Jumlah total nilai : " +hasil);
		System.out.println("Jumlah Murid : " + ratarata.length);
		int avg = hasil/ratarata.length;{
			System.out.println("Hasil rata-rata : "+avg);
		}
	}
}