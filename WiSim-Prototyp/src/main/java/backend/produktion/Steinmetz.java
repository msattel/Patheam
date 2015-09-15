package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Steinmetz produziert Steine. Diese werden u.A. als Ressource für Gebäudebau benötigt
 * 
 * @author mmensch
 *
 */
public class Steinmetz extends Gebaeude {

	/**
	 * Standardkonstruktor des Steinmetz
	 * 
	 * @param taktgeber
	 *            Der Steinmetz wird am übergebenen Taktgeber (Observable)
	 *            angemeldet.
	 */
	public Steinmetz(Taktgeber taktgeber, Zentrallager lager) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = ProdParam.SM_NAME;
		platzBedarf = ProdParam.SM_PLATZBEDARF;
		// Zeitstempel einholen:
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Steinmetz wird hier angestossen.
	 */
	public void produziere() {
		// TODO erhöhe Stein im Zentrallager (evtl bool für Überproduktion?)
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}