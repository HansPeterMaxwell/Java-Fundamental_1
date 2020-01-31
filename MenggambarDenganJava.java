package com.juaracoding.main;

public class MenggambarDenganJava {
	public static void main(String[] args) {
		System.out.println("Menggambar dengan Java");
		System.out.println("Ujian Fundamental Java");
		System.out.println("31-01-2020");
		System.out.println("");
		Kotak();
		Segitiga();
		SegitigaTerbalik();
		SelangSeling();
		KotakPola();
		AxisTengah();
		
	}
	public static void Kotak() {
		System.out.println("Soal Bintang Kotak");
		System.out.println("==================");
		for (int i = 0; i<3; i++) {
			for( int j = 0 ; j < 5 ; j++) {
				System.out.print(" * ");
			}System.out.println(" ");
		}System.out.println(" ");
	}
	public static void Segitiga() {
//		System.out.println("");
		System.out.println("Soal Bintang Segitiga");
		System.out.println("==================");
		for (int i = 0;i<6;i++) {
			for (int j = 0; j<i;j++) {
				if (j<=i){
					System.out.print(" * ");
					}
				else{
					System.out.print("");
					}
				}
			System.out.println("");		
			}
		}
	public static void SegitigaTerbalik() {
		System.out.println("Segitiga Terbalik");
		System.out.println("==================");
		for (int i=0;i<=5;i++){
			for(int j=4;j>=i;j--){	     
				System.out.print(" * ");
				}
			System.out.println();
			}
		}
	public static void SelangSeling() {
		System.out.println("Selang Seling");
		System.out.println("==================");
		for (int i = 0 ; i <=5 ; i++) {
			for(int j = 4 ; j >= i ; j-- ) {
				if((j%2 == 1 && i %2 == 0)||(j%2 == 0 && i%2 == 1)) {
					System.out.print(" ! ");
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
	}
	public static void KotakPola() {
		System.out.println("Kotak Pola");
		System.out.println("==================");
		for ( int i = 0 ; i <5 ; i++) {
			for (int j = 0; j<5 ;j++ ) {
				if((i%2==0 && j==2)|| (i%2 == 1 && j ==1)){
					System.out.print(" ! ");
				}
				else {
					System.out.print(" * ");
				}
			}System.out.println(" ");
		}
		
	}
	public static void AxisTengah() {
		System.out.println("Axis Tengah");
		System.out.println("==================");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		for(int i = 0 ; i < 10; i++) {
			for(int j = 0 ; j < 10; j++) {
				if((j ==6 && i == 0)||(j ==6 && i == 1)||(j ==6 && i == 2)||(j ==6 && i == 3)||(j ==6 && i == 4)||(j ==6 && i == 5)||(j ==6 && i == 6)||(j ==6 && i == 7)||(j ==6 && i == 8)||(j ==6 && i == 9)){
					System.out.print(" * ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
