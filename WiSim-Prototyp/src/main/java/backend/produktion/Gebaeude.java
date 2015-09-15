package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Die abstrakte Oberklasse f�r jedes konkrete Geb�ude
 * 
 * @author mmensch
 *
 */
public abstract class Gebaeude implements Observer {

	// ******** Beginn alle Attribute *********

	/**
	 * Name des Geb�udes
	 */
	public String gebName;

	/**
	 * Die Menge an Platzeinheiten die von diesem Geb�ude belegt wird.
	 */
	protected int platzBedarf;

	public Zentrallager lager;
	
	/**
	 * Hier wird der Zeitpunkt gespeichert zu dem das Geb�ude erbaut (das Objekt
	 * initialisiert) wurde.
	 */
	protected LocalDateTime timeBuilt;

	// **** Beginn aller getter- und setter-Methoden die alle Geb�ude
	// implementieren sollen ****

	/**
	 * Jedes Geb�ude hat einen Zeitstempel wann es erbaut wurde.
	 * 
	 * @return
	 */
	public LocalDateTime getTimeBuilt() {
		return timeBuilt;
	}

	// ***** Beginn aller sonstigen Methoden die jedes Geb�ude haben soll *****

	/**
	 * Die Produktion des Geb�udes wird hier implementiert. Kein R�ckgabewert.
	 * Wirkt sich auf den Bestand aus.
	 */
	public abstract void produziere();

	public String toString() {
		String result = "  *** Begin " + gebName + " (Hashcode: " + this.getClass().hashCode() + ") ***";
		result = result + "\n    --> Platzbedarf: " + platzBedarf + "\n    --> Erbaut: " + timeBuilt;
		result = result + "\n  *** End " + gebName + " (Hashcode: " + this.getClass().hashCode() + ") ***\n";
		return result;
	}

}
