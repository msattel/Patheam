package main.java.frontend;

import main.java.backend.produktion.*;

public class WiSimFrontend {

	public static void main(String[] args) {

		// Taktgeber erzeugen:
		Taktgeber myTakt = new Taktgeber();
		// Zentrallager anlegen
		Zentrallager myLager = new Zentrallager();

		// Ein Gebäude vom Typ Steinmetz bauen:
		Gebaeude mySteinmetz = GebFactory.getGebaeude("sm", myTakt, myLager);
		System.out.println("Steinmetz gebaut, guckst du hier:\n");
		System.out.println(mySteinmetz.toString());

		// Ein Gebäude vom Typ Holzfäller bauen:
		Gebaeude myHolzfaeller = GebFactory.getGebaeude("hf", myTakt, myLager);
		System.out.println("Holzfaeller gebaut, guckst du hier:\n");
		System.out.println(myHolzfaeller.toString());

		// Wieviele Gebäude haben den Taktgeber tatsächlich abonniert?
		System.out.println("Anzahl am Taktgeber angemeldete Gebäude: " + myTakt.countObservers() + "\n");

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
