package com.juaracoding.main;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas28012020 {
	public static void main(String[] args) {
		int nilai_kelas[]= {10,8,6,7,13,3,4,5,22,100};
		int penampung1 = 0;
		for(int x = 0; x < nilai_kelas.length;x++) {
//			System.out.println(nilai_kelas[x]);
			Arrays.sort(nilai_kelas);
			System.out.println("urutan : " + nilai_kelas[x]);
			penampung1 = nilai_kelas[x];
	}
		System.out.println("Angka terbesar : " +penampung1);
}
}
