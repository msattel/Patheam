package backend.produktion;

import java.time.LocalDateTime;

/**
 * Die abstrakte Oberklasse für jedes konkrete Gebäude
 * @author mmensch
 *
 */
public abstract class Gebaeude {
		
	// ******** Beginn alle Attribute *********
	
	/**
	 * Name des Gebäudes
	 */
	public String gebName; 
	
	/**
	 * Die Menge an tatsächlich einlagernden Gütern. Der Index gibt die Art des
	 * Rohstoffes an und der zugehörige Wert die Anzahl
	 */
	protected long[] bestand;

	/**
	 * Maximale Kapazität an Gütern die im Gebäude lagern können. Wenn diese
	 * Menge erreicht ist soll die Produktion stillstehen.
	 */
	protected long maxKap;

	/**
	 * Die tatsächlich belegte Kapazität
	 */
	protected long belegteKap;
	
	/**
	 * Die Menge an Platzeinheiten die von diesem Gebäude belegt wird.
	 */
	protected int platzBedarf;

	/**
	 * Hier wird der Zeitpunkt gespeichert zu dem das Gebäude erbaut (das Objekt
	 * initialisiert) wurde.
	 */
	protected LocalDateTime timeBuilt;
	
	// **** Beginn aller getter- und setter-Methoden die alle Gebäude implementieren sollen ****

	/**
	 * @return Liefert den aktuellen Bestand an eingelagerten Gütern in Form
	 *         eines Arrays. <br>
	 *         bestand[i]= Anzahl des Gutes i;
	 */
	public long[] getBestand() {
		return bestand;
	}

	/**
	 * Es gibt eine maximale Kapazitaet für die produzierten Güter
	 * 
	 * @return maximale Kapazität des Gebäudes
	 */
	public long getMaxKap() {
		return maxKap;
	}
		
	/**
	 * Die tatsächlich belegte Kapazität (Gesamtsumme der im Gebäude gelagerten Güter) wird geliefert
	 */
	public long getBelegteKap(){
		return belegteKap;
	}
	
	/**
	 * Ein gebäude hat einen bestimmten Platzbedarf beim Bau, der im Land belegt
	 * wird.
	 * 
	 * @return den Wert des Platzbedarfs
	 */
	public int getPlatzbedarf() {
		return platzBedarf;
	}

	/**
	 * Jedes Gebäude hat einen Zeitstempel wann es erbaut wurde.
	 * 
	 * @return
	 */
	public LocalDateTime getTimeBuilt() {
		return timeBuilt;
	}

	/**
	 * Setzt im Array der gelagerten Güter für ein bestimmtes Gut eine neue
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

	// ***** Beginn aller sonstigen Methoden die jedes Gebäude haben soll *****
	
	/**
	 * Die Produktion des Gebäudes wird hier implementiert. Kein Rückgabewert.
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
