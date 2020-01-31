package com.juaracoding.main;

public class Student {	
	private String name;
	private int umur;
	public void isiname(String name) {
		this.name = name;
	}
	public void isiumur(int umur) {
		this.umur = umur;
	}

	public void print(String print) {
		System.out.println(print);
	}
	public String getname() {
		return name;
		
	}
	public void iname(String name) {
	}
	public int age() {
		return umur;
	}
	public void nip() {
		System.out.println("000");
	}
}

