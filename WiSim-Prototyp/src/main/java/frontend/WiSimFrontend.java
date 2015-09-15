package main.java.frontend;

import main.java.backend.produktion.*;

public class WiSimFrontend {

	public static void main(String[] args) {

		// Taktgeber erzeugen:
		Taktgeber myTakt = new Taktgeber();
		// Zentrallager anlegen
		Zentrallager myLager = new Zentrallager();

		// Ein Geb�ude vom Typ Steinmetz bauen:
		Gebaeude mySteinmetz = GebFactory.getGebaeude("sm", myTakt, myLager);
		System.out.println("Steinmetz gebaut, guckst du hier:\n");
		System.out.println(mySteinmetz.toString());

		// Ein Geb�ude vom Typ Holzf�ller bauen:
		Gebaeude myHolzfaeller = GebFactory.getGebaeude("hf", myTakt, myLager);
		System.out.println("Holzfaeller gebaut, guckst du hier:\n");
		System.out.println(myHolzfaeller.toString());

		// Wieviele Geb�ude haben den Taktgeber tats�chlich abonniert?
		System.out.println("Anzahl am Taktgeber angemeldete Geb�ude: " + myTakt.countObservers() + "\n");

		for (int i = 0; i < 99; i++) {
			myTakt.sendeTaktsignal();
		}
		
		//aktueller Lagerbestand:
		System.out.println(myLager.toString());

		// for (int i=0; i<99; i++){
		// myHolzfaeller.produziere();
		// }
		// System.out.println(myHolzfaeller.toString());

	}

}
