package com.juaracoding.main;

public class Looping {
	public static void main(String[] args) {
		System.out.println("--------------------------FOR LOOP-------------------");
		for (int i = 0; i < 10; i++){
		System.out.println("Jamil Ganteng : " + i);
		}
		System.out.println("-----------DO WHILE----------------");
		
		int umurSekarang = 50;
		int umurTua = 50;
		do {
			System.out.println("Do Jalan");
//			break
		}
		while(umurSekarang<umurTua);
		
		while(umurSekarang>umurTua){
			System.out.println("While Jalan");
		}
			
	/*System.out.println("------------WHILE----------------");
	int umurSekarang =17;
	int umurTua = 50;
	String muka = "ganteng";
	while (muka.equalsIgnoreCase("ganteng")) {
		System.out.println("Muka saya diumur : " + umurSekarang);
		umurSekarang++;
		
		if (umurSekarang>=umurTua) {
			muka = "peyot";
		}
		umurSekarang++;*/
//	}
	}
}