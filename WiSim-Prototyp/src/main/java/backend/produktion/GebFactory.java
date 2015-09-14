package backend.produktion;

/**
 * Factory Klasse zur Produktion von Geb�ude Instanzen
 * 
 * @author mmensch
 *
 */
public class GebFactory {

	/**
	 * Factory Methode zur Erzeugung einer Geb�udeinstanz.
	 * 
	 * @param gebaeudeArt
	 *            Der String definiert den konkreten Typ des Geb�udes.<br>
	 *            Dabei gilt:<br>
	 *            hf = Holzf�ller<br>
	 *            sm = Steinmetz<br>
	 * @param taktgeber
	 *            An den �bergebenen Taktgeber wird das Geb�ude angemeldet
	 * 
	 * @return Die Instanz des erzeugten Geb�udes wird zur�ck gegeben.<br>
	 *         Ohne korrekten Paramater wird 'null' zur�ckgeliefert.
	 */
	public static Gebaeude getGebaeude(String gebaeudeArt, Taktgeber taktgeber) {
		if (gebaeudeArt.equalsIgnoreCase("hf"))
			return new Holzfaeller(taktgeber);
		else if (gebaeudeArt.equalsIgnoreCase("sm"))
			return new Steinmetz(taktgeber);

		return null;
	}

}
