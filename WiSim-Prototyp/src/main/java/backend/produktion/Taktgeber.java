package main.java.backend.produktion;

import java.util.*;

/**
 * In der Klasse Taktgeber (Observable im Sinne des Observerpattern) werden alle
 * Gebäude (Observer) angemeldet
 * 
 * @author mmensch
 */
public class Taktgeber extends Observable {

	public void befehleProduktion() {
		setChanged(); // Eine Änderung ist aufgetreten. Markiert den Taktgeber
						// als Sendebereit
		notifyObservers(); // Informiere Observer über Änderung
	}

}
