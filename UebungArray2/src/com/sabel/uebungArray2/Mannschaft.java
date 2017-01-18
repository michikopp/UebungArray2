package com.sabel.uebungArray2;

public class Mannschaft {
	private String teamname;
	private Spieler[] aufstellung;

	// Aufgabe 7
	// Konstruktor
	public Mannschaft() {
		aufstellung = new Spieler[11];
	}

	public Mannschaft(String teamname) {
		this(); // immer als erste Anweisung im Konstruktor
		this.teamname = teamname;

	}

	// Aufgabe 8
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	// Aufgabe 9
	public Spieler aufstellen(Spieler spieler, int position) {

		if (position >= aufstellung.length || position < 0) {
			System.out.println("Position ungültig");
			return null;
		}
		Spieler auswechselspieler = aufstellung[position];
		aufstellung[position] = spieler;
		return auswechselspieler;

	}

	// Aufgabe 10
	public void ausgabeMannschaft() {
		System.out.println(this.teamname);
		for (int i = 0; i < aufstellung.length; i++) {
			if (aufstellung[i] != null) {
				System.out.print((i+1) + "  " +  aufstellung[i].getName());
				System.out.println();
			}
		}
	}

	// Aufgabe 11
	public int anzahlTore() {
		int anzahlTore = 0;
		for (Spieler spieler : aufstellung) {
			if (spieler != null) {
			anzahlTore += spieler.getTore();
			}
		}
		return anzahlTore;
	}

	public Spieler gibTorschuetzenkoenig() {
		Spieler torschuetzenkoenig = null;
		Spieler spieler = null;
		int tore = 0;
		for (int i = 0; i < aufstellung.length; i++) {
			spieler = aufstellung[i];
			if (spieler != null) {
				if (spieler.getTore() > tore) {
					torschuetzenkoenig = spieler;
					tore = spieler.getTore();
				}
			}
			
		}
		return torschuetzenkoenig;
	}
	
	

}
