package main.java.backend.produktion;

public class Zentrallager {

	/**
	 * Die Menge an tatsächlich einlagernden Gütern. Der Index gibt die Art des
	 * Rohstoffes an und der zugehörige Wert die Anzahl
	 */
	private long[] bestand;

	/**
	 * @return Liefert den aktuellen Bestand an eingelagerten Gütern in Form
	 *         eines Arrays. <br>
	 *         bestand[i]= Anzahl des Gutes i;
	 */
	public long[] getBestand() {
		return bestand;
	}

	/**
	 * Standardkonstruktor für das Zentrallager. Legt das nötige Array an und
	 * initialisiert es mit 0 für jeden Rohstoff
	 */
	public Zentrallager() {
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			bestand[i] = 0;
		}
	}
	
	/**
	 * erhöht den Rohstoff i um den Wert x.
	 * Eine erfolgreiche Erhöhung liefert true zurück
	 * Ist die maximale Kapazitaet erreicht wird nicht erhöht und false zurückgeliefert.
	 * 
	 * @param i Index für den Rohstoff gem ProdParam
	 * @param x Wert um den der Rohstoff erhöht wird
	 */
	public boolean erhöheRohstoffwert(int i, int x){
		//TODO Fallunterscheidung ob Rohstoffkapazität erreicht einführen
		bestand[i]=bestand[i]+x;
		return true;
	}

	public String toString() {
		String result = "  *** Begin LAGERBESTAND (Zentrallager) ***\n      ";
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			result = result +ProdParam.getGoodName(i)+": "+bestand[i]+", ";
		}
		result = result + "\n  *** End LAGERBESTAND (Zentrallager) ***\n";
		return result;
	}

}
