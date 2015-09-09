package backend.produktion;

/**
 * Factory Klasse zur Produktion von Gebäude Instanzen
 * @author Mattes
 *
 */
public class GebFactory {
	
	/**
	 * Factory Methode zur Erzeugung einer Gebäudeinstanz.
	 * @param gebaeudeArt Definiert den konkreten Typ des Gebäudes<br>
	 * hf = Holzfäller<br>
	 * sm = Steinmetz<br>
	 * @return Die Instanz des erzeugten Gebäudes wird zurück gegeben.<br>
	 * Ohne korrekten Paramater wird 'null' zurückgeliefert.
	 */
	public static Gebaeude getGebaeude(String gebaeudeArt){
	if ( gebaeudeArt.equalsIgnoreCase("hf"))
		return new Holzfaeller();
	else if (gebaeudeArt.equalsIgnoreCase("sm"))
		return new Steinmetz();
	
	return null;
	}

}
