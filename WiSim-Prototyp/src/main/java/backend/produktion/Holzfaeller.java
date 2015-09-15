package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Holzfäller produziert Baumstämme. Diese werden u.A. als Input für das
 * Sägewerk benötigt.
 * 
 * @author mmensch
 *
 */
public class Holzfaeller extends Gebaeude {

	/**
	 * Standardkonstruktor des Holzfällers
	 * 
	 * @param taktgeber
	 *            Der Holzfäller wird am übergebenen Taktgeber (Observable)
	 *            angemeldet.
	 */
	public Holzfaeller(Taktgeber taktgeber, Zentrallager lager) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = ProdParam.HF_NAME;
		platzBedarf = ProdParam.HF_PLATZBEDARF;
		// Zeitstempel einholen:
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Holzfällers wird hier angestossen.
	 */
	public void produziere() {
		
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}
