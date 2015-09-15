package main.java.backend.produktion;

import java.util.*;

/**
 * In der Klasse Taktgeber (Observable im Sinne des Observerpattern) werden alle
 * Geb�ude (Observer) angemeldet
 * 
 * @author mmensch
 */
public class Taktgeber extends Observable {

	public void befehleProduktion() {
		setChanged(); // Eine �nderung ist aufgetreten. Markiert den Taktgeber
						// als Sendebereit
		notifyObservers(); // Informiere Observer �ber �nderung
	}

}
