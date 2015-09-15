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
	public Holzfaeller(Taktgeber taktgeber) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = "Holzfäller";
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			bestand[i] = 0;
		}
		maxKap = ProdParam.HF_MAXKAP;
		belegteKap = 0;
		platzBedarf = ProdParam.HF_PLATZBEDARF;
		// TODO Zeitstempel einholen
		timeBuilt = LocalDateTime.now();
	}

	@Override
	void setBestand(int GueterArt, long Anzahl) {
		// TODO Auto-generated method stub
	}

	/**
	 * Die Produktion des Holzfällers wird hier angestossen.
	 */
	public void produziere() {
		bestand[ProdParam.HOLZ]++;
		this.aktualisiereBelegteKap();
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}
