package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Die abstrakte Oberklasse für jedes konkrete Gebäude
 * 
 * @author mmensch
 *
 */
public abstract class Gebaeude implements Observer {

	// ******** Beginn alle Attribute *********

	/**
	 * Name des Gebäudes
	 */
	public String gebName;

	/**
	 * Die Menge an Platzeinheiten die von diesem Gebäude belegt wird.
	 */
	protected int platzBedarf;

	public Zentrallager lager;
	
	/**
	 * Hier wird der Zeitpunkt gespeichert zu dem das Gebäude erbaut (das Objekt
	 * initialisiert) wurde.
	 */
	protected LocalDateTime timeBuilt;

	// **** Beginn aller getter- und setter-Methoden die alle Gebäude
	// implementieren sollen ****

	/**
	 * Jedes Gebäude hat einen Zeitstempel wann es erbaut wurde.
	 * 
	 * @return
	 */
	public LocalDateTime getTimeBuilt() {
		return timeBuilt;
	}

	// ***** Beginn aller sonstigen Methoden die jedes Gebäude haben soll *****

	/**
	 * Die Produktion des Gebäudes wird hier implementiert. Kein Rückgabewert.
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
