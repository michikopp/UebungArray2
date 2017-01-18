package com.sabel.uebungArray2;

public class Spieler {

	//Aufgabe 1
	private String name;
	private String position;
	private int tore;
	
	
	//Aufgabe2
	//Konstruktor
	public Spieler(String name, String position) {
		this.name = name;
		this.position = position;
		this.tore = 0;
	}

	
	//Aufgabe 3.
	//Getter und Setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getTore() {
		return tore;
	}
	
	public void torGeschossen() {
		this.tore++;
	}
	
	//Aufgabe 5
	public void druckeInfo() {
		System.out.println(toString());
//		System.out.println("Spielername: " + this.name);
//		System.out.println("Tore: " + this.tore);
//		System.out.println("Position: " + this.position);
	}
	
	public String toString() {
		return name + ", " + position + ", " + tore;
	}
	
	
	
}
