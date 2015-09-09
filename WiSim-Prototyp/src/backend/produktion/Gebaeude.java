package backend.produktion;

import java.time.LocalDateTime;

/**
 * Die abstrakte Oberklasse f�r jedes konkrete Geb�ude
 * @author mmensch
 *
 */
public abstract class Gebaeude {
		
	// ******** Beginn alle Attribute *********
	
	/**
	 * Name des Geb�udes
	 */
	public String gebName; 
	
	/**
	 * Die Menge an tats�chlich einlagernden G�tern. Der Index gibt die Art des
	 * Rohstoffes an und der zugeh�rige Wert die Anzahl
	 */
	protected long[] bestand;

	/**
	 * Maximale Kapazit�t an G�tern die im Geb�ude lagern k�nnen. Wenn diese
	 * Menge erreicht ist soll die Produktion stillstehen.
	 */
	protected long maxKap;

	/**
	 * Die tats�chlich belegte Kapazit�t
	 */
	protected long belegteKap;
	
	/**
	 * Die Menge an Platzeinheiten die von diesem Geb�ude belegt wird.
	 */
	protected int platzBedarf;

	/**
	 * Hier wird der Zeitpunkt gespeichert zu dem das Geb�ude erbaut (das Objekt
	 * initialisiert) wurde.
	 */
	protected LocalDateTime timeBuilt;
	
	// **** Beginn aller getter- und setter-Methoden die alle Geb�ude implementieren sollen ****

	/**
	 * @return Liefert den aktuellen Bestand an eingelagerten G�tern in Form
	 *         eines Arrays. <br>
	 *         bestand[i]= Anzahl des Gutes i;
	 */
	public long[] getBestand() {
		return bestand;
	}

	/**
	 * Es gibt eine maximale Kapazitaet f�r die produzierten G�ter
	 * 
	 * @return maximale Kapazit�t des Geb�udes
	 */
	public long getMaxKap() {
		return maxKap;
	}
		
	/**
	 * Die tats�chlich belegte Kapazit�t (Gesamtsumme der im Geb�ude gelagerten G�ter) wird geliefert
	 */
	public long getBelegteKap(){
		return belegteKap;
	}
	
	/**
	 * Ein geb�ude hat einen bestimmten Platzbedarf beim Bau, der im Land belegt
	 * wird.
	 * 
	 * @return den Wert des Platzbedarfs
	 */
	public int getPlatzbedarf() {
		return platzBedarf;
	}

	/**
	 * Jedes Geb�ude hat einen Zeitstempel wann es erbaut wurde.
	 * 
	 * @return
	 */
	public LocalDateTime getTimeBuilt() {
		return timeBuilt;
	}

	/**
	 * Setzt im Array der gelagerten G�ter f�r ein bestimmtes Gut eine neue
	 * Anzahl
	 * 
	 * @param GueterArt
	 *            Welches Gut? (Index des Array)
	 * @param Anzahl
	 *            Neue Anzahl (zweiter Wert in Tabelle)
	 */
	
	public void setBestand(long[] neuesBestandArray){
		bestand = neuesBestandArray;
	}
	
	abstract void setBestand(int GueterArt, long Anzahl);

	// ***** Beginn aller sonstigen Methoden die jedes Geb�ude haben soll *****
	
	/**
	 * Die Produktion des Geb�udes wird hier implementiert. Kein R�ckgabewert.
	 * Wirkt sich auf den Bestand aus.
	 */
	public abstract void produziere();
	
	protected void aktualisiereBelegteKap (){
		belegteKap = 0;
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			belegteKap = belegteKap+bestand[i];
		}
	}
	
	public String toString(){
		String result = "*** Begin "+gebName+" (Hashcode: "+this.getClass().hashCode()+") ***\n";		
		result = result+(" max.Kapazitaet: "+maxKap+
				"\n belegte Kapazitaet: "+belegteKap+
				"\n Platzbedarf: "+platzBedarf+
				"\n Erbaut: "+timeBuilt+
				"\n lokal gelagert: ");
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) { 
			result=result+(" "+ProdParam.getGoodName(i)+": "+bestand[i]+", ");
		}
		result = result + "\n*** End "+gebName+" (Hashcode: "+this.getClass().hashCode()+") ***\n";
		
		return result;
	}
	

	
}
