package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Steinmetz produziert Steine. Diese werden u.A. als Ressource f�r Geb�udebau ben�tigt
 * 
 * @author mmensch
 *
 */
public class Steinmetz extends Gebaeude {

	/**
	 * Standardkonstruktor des Steinmetz
	 * 
	 * @param taktgeber
	 *            Der Steinmetz wird am �bergebenen Taktgeber (Observable)
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
		// TODO erh�he Stein im Zentrallager (evtl bool f�r �berproduktion?)
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}