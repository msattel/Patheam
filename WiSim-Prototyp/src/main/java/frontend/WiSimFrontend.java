package main.java.frontend;

import main.java.backend.produktion.*;

public class WiSimFrontend {

	public static void main(String[] args) {

		// Taktgeber erzeugen:
		Taktgeber myTakt = new Taktgeber();
		// Zentrallager anlegen:
		Zentrallager myLager = new Zentrallager();

		// Ein Gebäude vom Typ Steinmetz bauen:
		Gebaeude mySteinmetz = GebFactory.getGebaeude("sm", myTakt, myLager);
		System.out.println("Steinmetz gebaut, guckst du hier:\n");
		mySteinmetz.printGebaeude();

		// Ein Gebäude vom Typ Holzfäller bauen:
		Gebaeude myHolzfaeller = GebFactory.getGebaeude("hf", myTakt, myLager);
		System.out.println("Holzfaeller gebaut, guckst du hier:\n");
		myHolzfaeller.printGebaeude();

		// Lagerbestand ausgeben:
		System.out.println("Initialer Lagerbestand:\n");
		myLager.printLager();

		// Wieviele Gebäude haben den Taktgeber tatsächlich abonniert?
		System.out.println("Anzahl am Taktgeber angemeldete Gebäude: " + myTakt.countObservers() + "\n");

		// Beginne Ablauf des eigentlichen "Spiels":

		long startZeitInSec = (System.currentTimeMillis() / 1000);
		long deltaZeitInSec_alt = 0;
		long deltaZeitInSec_neu;
		while (true) {
			deltaZeitInSec_neu = ((System.currentTimeMillis() / 1000) - startZeitInSec);

			// Bei jeder vollen Sekunde wir der if Teil der Schleife erreicht:
			if (deltaZeitInSec_neu > deltaZeitInSec_alt) {
				System.out.print(deltaZeitInSec_neu + ", ");
				deltaZeitInSec_alt = deltaZeitInSec_neu;

				myTakt.sendeTaktsignal(); // jede Sekunde wird über den
											// Taktgeber (Observable) die
											// Produktion getriggert

				// tue alle 6 Sekunden etwas
				if (deltaZeitInSec_neu % 6 == 0) {
					System.out.println("\n");
					myLager.printLager();
				}

			}

		}

	}

}
