package backend.produktion;

/**
 * Factory Klasse zur Produktion von Geb�ude Instanzen
 * @author Mattes
 *
 */
public class GebFactory {
	
	/**
	 * Factory Methode zur Erzeugung einer Geb�udeinstanz.
	 * @param gebaeudeArt Definiert den konkreten Typ des Geb�udes<br>
	 * hf = Holzf�ller<br>
	 * sm = Steinmetz<br>
	 * @return Die Instanz des erzeugten Geb�udes wird zur�ck gegeben.<br>
	 * Ohne korrekten Paramater wird 'null' zur�ckgeliefert.
	 */
	public static Gebaeude getGebaeude(String gebaeudeArt){
	if ( gebaeudeArt.equalsIgnoreCase("hf"))
		return new Holzfaeller();
	else if (gebaeudeArt.equalsIgnoreCase("sm"))
		return new Steinmetz();
	
	return null;
	}

}
