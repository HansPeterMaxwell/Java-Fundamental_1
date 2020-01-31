package com.juaracoding.main;
import java.util.Scanner;

public class TugasLooping {
	public static void main(String[] args) {

		int angka1,angka2;
		Scanner sn = new Scanner(System.in);
		System.out.println("Masukkan Angka pertama yang anda inginkan : ");
		angka1  = sn.nextInt();
		for(int i = 0; i<angka1;i++) {
			System.out.println("Masukkan angka kedua yang anda inginkan : ");
			angka2 = sn.nextInt();
			for(int j = 0 ;j<=angka2;j++) {
				if (j%2==1) {
					System.out.print("! ");}
					else {
						System.out.print("#");
					}
				}
			System.out.println("");
			break;
			}

		} 
	}
