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
	 * Die Produktion des Holzf�llers wird hier angestossen.
	 */
	public void produziere() {
		
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}
