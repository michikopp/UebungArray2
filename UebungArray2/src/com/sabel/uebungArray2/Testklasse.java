package com.sabel.uebungArray2;

public class Testklasse {

	public static void main(String[] args) {
		Spieler spieler0 = new Spieler("Neuer","Tor");
		String info = spieler0.toString();
		spieler0.druckeInfo();
		spieler0.torGeschossen();
		spieler0.druckeInfo();
		
		Mannschaft mannschaft = new Mannschaft("FC Bayern");
		
		Spieler ausgewechselterSpieler = mannschaft.aufstellen(spieler0, 0);
		if (ausgewechselterSpieler != null) {
			System.out.println("Ausgewechselter Spieler: " + ausgewechselterSpieler);
		} else {
			System.out.println("Kein Spieler ausgewechselt!");
		}
		
		Spieler spieler1 = new Spieler ("Ulreich", "Tore");
		ausgewechselterSpieler = mannschaft.aufstellen(spieler1, 0);
		if (ausgewechselterSpieler != null) {
			System.out.println("Ausgewechselter Spieler: " + ausgewechselterSpieler);
		} else {
			System.out.println("Kein Spieler ausgewechselt!");
		}
		
		mannschaft.ausgabeMannschaft();
		
		Spieler spieler10 = new Spieler("Müller","Stürmer");
		mannschaft.aufstellen(spieler10, 10);
		for (int i = 0; i < 12;i++) {
			spieler10.torGeschossen();
		}
		
		Spieler spieler9 = new Spieler("Lewandowski","Stürmer");
		mannschaft.aufstellen(spieler9, 9);
		for (int i = 0; i < 15;i++) {
			spieler9.torGeschossen();
		}
		mannschaft.aufstellen(spieler0, 0);
		mannschaft.ausgabeMannschaft();
		System.out.println(mannschaft.anzahlTore());
		
		Spieler koenig = mannschaft.gibTorschuetzenkoenig();
		if(koenig != null) {
			System.out.println("König: " + koenig);
		} else {
			System.out.println("Es gibt keinen König");
		}
		
		Mannschaft mannschaft2 = new Mannschaft("Herta BSC");
		Spielplan spielplan = new Spielplan();
		spielplan.anmelden(mannschaft);
		spielplan.anmelden(mannschaft2);
		spielplan.anmelden(new Mannschaft("BVB"));
		
	}

}
