package backend.produktion;

import java.time.LocalDateTime;

/**
 * Der Steinmetz produziert Steine. Diese werden u.A. als Ressource zum Bau größerer Gebäude benötigt.
 * 
 * @author Mattes
 *
 */
public class Steinmetz extends Gebaeude {

	/**
	 * Standardkonstruktor des Holzfällers (wird durch new aufgerufen??)
	 */
	public Steinmetz() {
		// initialisierung der Parameter:
		gebName = "Steinmetz";
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) { 
			bestand[i] = 0;
		}
		maxKap = ProdParam.SM_MAXKAP;
		belegteKap = 0;
		platzBedarf = ProdParam.SM_PLATZBEDARF;
		//TODO Zeitstempel einholen
		timeBuilt = LocalDateTime.now();
	}

	/**
	 * Die Produktion des Steinmetz wird hier angestossen.
	 */
	public void produziere() {
		bestand[ProdParam.STEIN]++;
		this.aktualisiereBelegteKap();
	}

	
	@Override
	void setBestand(int GueterArt, long Anzahl) {
		// TODO Auto-generated method stub

	}

}