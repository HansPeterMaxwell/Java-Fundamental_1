package com.juaracoding.main;
import java.util.Scanner;

public class MenuMenu {
	public static int angka() {
		return 666;
	}
	public static void main(String[] args) {
		int nomor,jam,nomorbangku;
		String nama,pil;
//		pil = sn.
		System.out.println(angka());
		//membuat input
		Scanner sn = new Scanner(System.in);
		System.out.println("Bioskop CineMin");
		System.out.println("Film :");
		System.out.println("1. KKN Desa Korupsi");
		System.out.println("2. Jumanji Sang Penakluk Klomang");
		System.out.println("3. Kera Sakti : Ragunan Mansion");
		System.out.print("Masukkan Film yang anda inginkan  : ");
		nomor = sn.nextInt();
		if ( nomor == 1) {
			System.out.println("KKN Desa Korupsi");
			System.out.println("Pilih jam yang anda inginkan : ");
			System.out.println("1. 09:00");
			System.out.println("2. 12:00");
			System.out.println("3. 19:00");
			System.out.println("4. 21:00");
			jam = sn.nextInt();
			if (jam == 1) {
				System.out.println("KKN Desa Korupsi jam 09:00");
			}
			else if (jam == 2) {
				System.out.println("KKN Desa Korupsi jam 12:00");
			}
			else if (jam == 3) {
				System.out.println("KKN Desa Korupsi jam 19:00");
			}
			else if (jam == 4) {
				System.out.println("KKN Desa Korupsi jam 21:00");
			}
			else {
				System.out.println("Pilihan anda salah !");
			}
		}
		else if (nomor == 2) {
			System.out.println("Jumanji Sang Penakluk Semut");
			System.out.print("Pilih jam yang anda inginkan : ");
			System.out.println("1. 09:00");
			System.out.println("2. 12:00");
			System.out.println("3. 19:00");
			System.out.println("4. 21:00");
			jam = sn.nextInt();
			if (jam == 1) {
				System.out.println("Jumanji Sang Penakluk Semut jam 09:00");
			}
			else if (jam == 2) {
				System.out.println("Jumanji Sang Penakluk Semut jam 12:00");
			}
			else if (jam == 3) {
				System.out.println("Jumanji Sang Penakluk Semut jam 19:00");
			}
			else if (jam == 4) {
				System.out.println("Jumanji Sang Penakluk Semut jam 21:00");
			}
			else {
				System.out.println("Pilihan anda salah !");
			return;
			}
		}
		else if (nomor == 3) {
			System.out.println("Kera Sakti : Ragunan Citizen");
			System.out.println("Pilih jam yang anda inginkan : ");
			System.out.println("1. 09:00");
			System.out.println("2. 12:00");
			System.out.println("3. 19:00");
			System.out.println("4. 21:00");
			jam = sn.nextInt();
			if (jam == 1) {
				System.out.println("Kera Sakti : Ragunan Citizen jam 09:00");
			}
			else if (jam == 2) {
				System.out.println("Kera Sakti : Ragunan Citizen jam 12:00");
			}
			else if (jam == 3) {
				System.out.println("Kera Sakti : Ragunan Citizen jam 19:00");
			}
			else if (jam == 4) {
				System.out.println("Kera Sakti : Ragunan Citizen jam 21:00");
			}
			else {
				System.out.println("Pilihan anda salah !");
			return;
			}
		}
		else {
			System.out.println("Mohon maaf pilihan film anda tidak ada !");
			System.out.println("Terima Kasih Sudah Mengunjungi CineMin, Have a Good Day");
			return;
			}
	}
}