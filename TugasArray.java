package com.juaracoding.main;

import java.util.Arrays;
import java.util.Collections;
public class TugasArray {
	public static void main(String[] args) {
		int nilai[] = {10,8,6,7,4,3,4,5};
		for(int x =0;x<nilai.length;x++) {
			for(int i = 0; i<x+1;i++) {
				System.out.print(nilai[i]);
				}
			System.out.println("");
			}
		System.out.println("--------------------");
		Integer nilai_kelas[]= {10,8,6,7,4,3,4,5,13};
		int penampung = 0;
		
		for (int x = 0;x<nilai_kelas.length;x++) {
			penampung = penampung+nilai_kelas[x];
		}
//		System.out.println(penampung/nilai_kelas.length);
		int dummy = 0;
		for(int x = 0; x < nilai_kelas.length;x++) {
			for ( int y = 0; y < x;y++) {
				if (dummy == nilai_kelas.length -1) {
					break;
				}
				System.out.print(" "+nilai_kelas[dummy]);
				dummy++;
			}
			System.out.println();
		}
		int nilai_teratas = Collections.max(Arrays.asList(nilai_kelas));
		int nilai_terbawah = Collections.min(Arrays.asList(nilai_kelas));
		
		System.out.println("Nilai teratas : " + nilai_teratas);
		System.out.println("Nilai terbawah : " + nilai_terbawah);
		}
}

