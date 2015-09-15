package main.java.backend.produktion;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * Das S�gewerk produziert Bretter. Um Bretter herzustellen werden Baumst�mme ben�tigt
 * @author mmensch
 *
 */
public class Saegewerk extends Gebaeude {

	/**
	 * Standardkonstruktor des Saegewerk
	 * 
	 * @param taktgeber
	 *            Das Saegewerk wird am �bergebenen Taktgeber (Observable)
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
		// TODO erh�he Bretter im Zentrallager (evtl bool f�r �berproduktion?)
		// nur dann wenn ausreichend St�mme verf�gbar!!!!
	}

	public void update(Observable o, Object arg) {
		this.produziere();
	}

}