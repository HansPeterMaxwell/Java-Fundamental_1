package com.juaracoding.main;

public class MainMain {
	public static void main(String[] args) {
		Student lari = new LariLari();
		Student student = new Student();
		LariLari murid = new LariLari();
		LariLari murid2 = new LariLari();
		murid2.isiname(("Dinda"));
		student.isiname("Budi");
		lari.isiname("Udin");
		murid.isiname("Jamal");
		System.out.println(student.getname());
		System.out.println(lari.getname());//karena pakai return maka di sout
		System.out.println(murid.getname());
		System.out.println(murid2.getname());
		student.nip();
		lari.nip();
		lari.nomorinduk();
		student.isiumur(22);
		System.out.println(student.age());
		Move m = new LariLari();
		m.kecepatan();
//		student.
	}

}
