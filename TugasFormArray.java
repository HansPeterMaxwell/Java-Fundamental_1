package com.juaracoding.main;
import java.util.Scanner;

public class TugasFormArray {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String jumlah;
		System.out.println("Masukkan Jumlah : ");
		jumlah = sn.nextLine();
		String nama[] = new String[Integer.parseInt(jumlah)];
		String alamat[] = new String[Integer.parseInt(jumlah)];
		String telepon[] = new String[Integer.parseInt(jumlah)];
		
		for (int i = 0; i<nama.length;i++) {
			System.out.println("Masukkan nama : ");
			nama[i] = sn.nextLine();
			System.out.println("-----------");
			System.out.println("Masukan alamat : ");
			alamat[i] = sn.nextLine();			
			System.out.println("-----------");
			System.out.println("Masukkan No Telepon : ");
			telepon[i] = sn.nextLine();
			System.out.println("    ");
		}
		for(int i = 0; i<nama.length;i++) {
		System.out.println("Input orang ke "+ i + " "+nama[i]);
		System.out.println("Alamat : " + alamat[i]);
		System.out.println("No. Telepon : " + telepon[i]);
		for (int k = 1;k<nama.length;k++) {
			System.out.println("----------------");
		}
	}
		
	}
}
