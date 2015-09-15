package main.java.backend.produktion;

public class Zentrallager {

	/**
	 * Die Menge an tats�chlich einlagernden G�tern. Der Index gibt die Art des
	 * Rohstoffes an und der zugeh�rige Wert die Anzahl
	 */
	private long[] bestand;

	/**
	 * @return Liefert den aktuellen Bestand an eingelagerten G�tern in Form
	 *         eines Arrays. <br>
	 *         bestand[i]= Anzahl des Gutes i;
	 */
	public long[] getBestand() {
		return bestand;
	}

	/**
	 * Standardkonstruktor f�r das Zentrallager. Legt das n�tige Array an und
	 * initialisiert es mit 0 f�r jeden Rohstoff
	 */
	public Zentrallager() {
		bestand = new long[ProdParam.NUM_DIF_GOODS];
		for (int i = 0; i < ProdParam.NUM_DIF_GOODS; i++) {
			bestand[i] = 0;
		}
	}
	
	/**
	 * erh�ht den Rohstoff i um den Wert x.
	 * Eine erfolgreiche Erh�hung liefert true zur�ck
	 * Ist die maximale Kapazitaet erreicht wird nicht erh�ht und false zur�ckgeliefert.
	 * 
	 * @param i Index f�r den Rohstoff gem ProdParam
	 * @param x Wert um den der Rohstoff erh�ht wird
	 */
	public boolean erh�heRohstoffwert(int i, int x){
		//TODO Fallunterscheidung ob Rohstoffkapazit�t erreicht einf�hren
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
