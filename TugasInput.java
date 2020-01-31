package com.juaracoding.main;
import java.util.Scanner;

public class TugasInput {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Masukkan nilai ukuran kotak : ");
		String ukuran = sn.nextLine();
		
		int iUkuran = Integer.parseInt(ukuran);
		
		for(int x = 0; x<iUkuran;x++) {
			for(int y =0; y<iUkuran ;y++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
