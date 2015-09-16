package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Steinmetz produziert Steine. Diese werden u.A. als Ressource für
 * Gebäudebau benötigt
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
		counter = 0;
		gebName = ProdParam.SM_NAME;
		platzBedarf = ProdParam.SM_PLATZBEDARF;
		this.lager = lager;
		// Zeitstempel einholen:
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Steinmetz wird hier angestossen.
	 */
	public void produziere() {
		counter++;
		// TODO Modulo Operator um nur beim x-ten mal zu produzieren
		// TODO erhöhe Stein im Zentrallager (evtl bool für Überproduktion?)
		if (counter % ProdParam.SM_DELAY == 0) {
			lager.erhoeheRohstoffwert(ProdParam.STEIN, 1);
		}
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}