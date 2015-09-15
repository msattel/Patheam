package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Steinmetz produziert Steine. Diese werden u.A. als Ressource zum Bau
 * größerer Gebäude benötigt.
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
	public Steinmetz(Taktgeber taktgeber) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = "Steinmetz";
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			bestand[i] = 0;
		}
		maxKap = ProdParam.SM_MAXKAP;
		belegteKap = 0;
		platzBedarf = ProdParam.SM_PLATZBEDARF;
		// TODO Zeitstempel einholen
		timeBuilt = LocalDateTime.now();
	}

	@Override
	void setBestand(int GueterArt, long Anzahl) {
		// TODO Auto-generated method stub
	}

	/**
	 * Die Produktion des Steinmetz wird hier angestossen.
	 */
	public void produziere() {
		bestand[ProdParam.STEIN]++;
		this.aktualisiereBelegteKap();
	}

	public void update(Observable o, Object arg) {
		this.produziere();

	}

}