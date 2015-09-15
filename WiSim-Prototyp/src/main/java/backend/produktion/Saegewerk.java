package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Das Sägewerk produziert Bretter. Um Bretter herzustellen werden Baumstämme benötigt
 * @author mmensch
 *
 */
public class Saegewerk extends Gebaeude {

	/**
	 * Standardkonstruktor des Saegewerk
	 * 
	 * @param taktgeber
	 *            Das Saegewerk wird am übergebenen Taktgeber (Observable)
	 *            angemeldet.
	 */
	public Saegewerk(Taktgeber taktgeber, Zentrallager lager) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = ProdParam.SW_NAME;
		platzBedarf = ProdParam.SW_PLATZBEDARF;
		this.lager = lager;
		// Zeitstempel einholen:
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Saegewerk wird hier angestossen.
	 */
	public void produziere() {
		// TODO erhöhe Bretter im Zentrallager (evtl bool für Überproduktion?)
		// nur dann wenn ausreichend Stämme verfügbar!!!!
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}