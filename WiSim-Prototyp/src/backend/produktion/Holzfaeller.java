package backend.produktion;

import java.time.LocalDateTime;

/**
 * Der Holzf�ller produziert Baumst�mme. Diese werden u.A. als Input f�r das
 * S�gewerk ben�tigt.
 * 
 * @author Mattes
 *
 */
public class Holzfaeller extends Gebaeude {

	/**
	 * Standardkonstruktor des Holzf�llers (wird durch new aufgerufen??)
	 */
	public Holzfaeller() {
		// initialisierung der Parameter:
		gebName ="Holzf�ller";
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) { 
			bestand[i] = 0;
		}
		maxKap = ProdParam.HF_MAXKAP;
		belegteKap = 0;
		platzBedarf = ProdParam.HF_PLATZBEDARF;
		//TODO Zeitstempel einholen
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Holzf�llers wird hier angestossen.
	 */
	public void produziere() {
		bestand[ProdParam.HOLZ]++;
		this.aktualisiereBelegteKap();
	}

	
	
	@Override
	void setBestand(int GueterArt, long Anzahl) {
		// TODO Auto-generated method stub

	}

}
