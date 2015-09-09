package backend.produktion;

/**
 * Sammlung von Produktionsparametern in Form von Konstanten
 * @author Mattes
 *
 */
public class ProdParam {

	/**
	 * Anzahl der unterschiedlichen G�ter. (wird u.A. f�r die L�nge des Lager-Arrays ben�tigt.)
	 */
	static int NUM_DIF_GOODS = 3;
	
	//G�terarten
	static int HOLZ = 0;
	static int STEIN = 1;
	static int BRETT = 2;
	
	/**
	 * Liefert zu dem mit integer-Wert codierten Gut den zugeh�rigen Namen als String
	 * @param i
	 * @return
	 */
	static String getGoodName (int i){
		if (i==HOLZ)
			return "HOLZ";
		else if (i==STEIN)
			return "STEIN";
		else if (i==BRETT)
			return "BRETT";
		return "NICHTS";
	}
	
	
	//**** WERTE DER GEB�UDE ****
	
	// Werte des Holzf�llers (HF):
	static long HF_MAXKAP = 500; //maximale Kapazit�t
	static int HF_PLATZBEDARF = 1; //Platzbedarf des Geb�udes zum Bau
	
	// Werte des Steinmetz (SM):
	static long SM_MAXKAP = 750; //maximale Kapazit�t
	static int SM_PLATZBEDARF = 1; //Platzbedarf des Geb�udes zum Bau
	
}
