package frontend;

import backend.produktion.*;

public class WiSimFrontend {

	public static void main(String[] args) {

		// Taktgeber erzeugen:
		Taktgeber myTakt = new Taktgeber();

		// Ein Geb�ude vom Typ Steinmetz bauen:
		Gebaeude mySteinmetz = GebFactory.getGebaeude("sm", myTakt);
		System.out.println("Steinmetz gebaut, guckst du hier:\n");
		System.out.println(mySteinmetz.toString());

		// Ein Geb�ude vom Typ Holzf�ller bauen:
		Gebaeude myHolzfaeller = GebFactory.getGebaeude("hf", myTakt);
		System.out.println("Holzfaeller gebaut, guckst du hier:\n");
		System.out.println(myHolzfaeller.toString());

		// Wieviele Geb�ude haben den Taktgeber tats�chlich abonniert?
		System.out.println("Anzahl am Taktgeber angemeldete Geb�ude: " + myTakt.countObservers() + "\n");

		for (int i = 0; i < 99; i++) {
			myTakt.befehleProduktion();
		}

		System.out.println(myHolzfaeller.toString());

		// for (int i=0; i<99; i++){
		// myHolzfaeller.produziere();
		// }
		// System.out.println(myHolzfaeller.toString());

	}

}
