package com.juaracoding.main;

public class BintangBintang {
	public static void main(String[] args) {
		System.out.println("---------- SOAL 1---------");
		Bintang();
		nama();
		for( int i = 0; i < 6 ; i++) {
			for (int j = 0; j < 9; j++) {
				if (j > i && j< 8-i) {
					System.out.print(" ");
				}
				else {
				System.out.print("*");
			}
		}System.out.println("");
	}

}
	public static void Bintang() {
		System.out.println("---------- SOAL 2---------");
		for(int i = 0 ; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ( (j == 4 && i== 5) || (j == 5 && i == 4)||( j == 5 && i == 5)||(j == 4 && i == 4)||(j ==0 || i ==0)||(j == 9 || i == 9)) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println(" ");
		}
	}
	public static void nama() {
		System.out.println("---------- SOAL 3---------");
		for (int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10; j ++) {
				if ((j == 0 && i == 4)||(j == 1 && i == 4)||(j == 2 && i == 4)||(j == 3 && i == 4)||(j == 4 && i == 4)||(j == 5 && i == 4)||(j == 6 && i == 4)||(j == 7 && i == 4)||(j == 8 && i == 4)||(j == 9 && i == 4)||(j == 0 && i == 8)||(j == 0 && i == 7)||(j == 0 && i == 6)||(j == 0 && i == 5)||(j == 0 && i == 4)||(j == 0 && i == 3)||(j == 0 && i == 2)||(j == 0 && i == 1)||(j == 0 && i == 0)||(j == 8 && i == 0)||(j == 7 && i == 0)){
					System.out.print(" * ");
				}
					else {
						System.out.print("  ");
					}
				}
			System.out.println(" ");
			}
		}
	}
