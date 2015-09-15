package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Der Holzf�ller produziert Baumst�mme. Diese werden u.A. als Input f�r das
 * S�gewerk ben�tigt.
 * 
 * @author mmensch
 *
 */
public class Holzfaeller extends Gebaeude {

	/**
	 * Standardkonstruktor des Holzf�llers
	 * 
	 * @param taktgeber
	 *            Der Holzf�ller wird am �bergebenen Taktgeber (Observable)
	 *            angemeldet.
	 */
	public Holzfaeller(Taktgeber taktgeber) {
		// Anmeldung am Taktgeber
		taktgeber.addObserver(this);
		// initialisierung der Parameter:
		gebName = "Holzf�ller";
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
	 * Die Produktion des Holzf�llers wird hier angestossen.
	 */
	public void produziere() {
		bestand[ProdParam.HOLZ]++;
		this.aktualisiereBelegteKap();
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}
