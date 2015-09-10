package backend.produktion;

/**
 * Factory Klasse zur Produktion von Gebäude Instanzen
 * 
 * @author mmensch
 *
 */
public class GebFactory {

	/**
	 * Factory Methode zur Erzeugung einer Gebäudeinstanz.
	 * 
	 * @param gebaeudeArt
	 *            Der String definiert den konkreten Typ des Gebäudes.<br>
	 *            Dabei gilt:<br>
	 *            hf = Holzfäller<br>
	 *            sm = Steinmetz<br>
	 * @param taktgeber
	 *            An den übergebenen Taktgeber wird das Gebäude angemeldet
	 * 
	 * @return Die Instanz des erzeugten Gebäudes wird zurück gegeben.<br>
	 *         Ohne korrekten Paramater wird 'null' zurückgeliefert.
	 */
	public static Gebaeude getGebaeude(String gebaeudeArt, Taktgeber taktgeber) {
		if (gebaeudeArt.equalsIgnoreCase("hf"))
			return new Holzfaeller(taktgeber);
		else if (gebaeudeArt.equalsIgnoreCase("sm"))
			return new Steinmetz(taktgeber);

		return null;
	}

}
