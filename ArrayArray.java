package com.juaracoding.main;

public class ArrayArray {
	public static void main(String[] args) {
		System.out.println("Contoh dengan input manual");
		int nilai [] = new int[8];
		int dummy[] = new int[5];
		dummy = nilai.clone();
		
		nilai[0] = 10;
		nilai[1]=11;
		nilai[2]=12;
		nilai[3]=13;
		nilai[4]=14;
		nilai[5]=15;
		nilai[6]=16;
		nilai[7]=17;
		for (int x = 0; x<nilai.length;x++) {
			System.out.println(nilai[x]);
		}
		//apabila ada array index out of bound execptions, ada yang error.
		System.out.println("----------- CONTOH 2 -----------------");
		System.out.println("Secara implisit dengan langsung sekaligus");
		int nilai2[]= {1,2,3,4,5};
		for (int x = 0;x<nilai2.length;x++) {
			System.out.println(nilai2[x]);
		}
	}

}
