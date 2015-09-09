package backend.produktion;

/**
 * Sammlung von Produktionsparametern in Form von Konstanten
 * @author Mattes
 *
 */
public class ProdParam {

	/**
	 * Anzahl der unterschiedlichen Güter. (wird u.A. für die Länge des Lager-Arrays benötigt.)
	 */
	static int NUM_DIF_GOODS = 3;
	
	//Güterarten
	static int HOLZ = 0;
	static int STEIN = 1;
	static int BRETT = 2;
	
	/**
	 * Liefert zu dem mit integer-Wert codierten Gut den zugehörigen Namen als String
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
	
	
	//**** WERTE DER GEBÄUDE ****
	
	// Werte des Holzfällers (HF):
	static long HF_MAXKAP = 500; //maximale Kapazität
	static int HF_PLATZBEDARF = 1; //Platzbedarf des Gebäudes zum Bau
	
	// Werte des Steinmetz (SM):
	static long SM_MAXKAP = 750; //maximale Kapazität
	static int SM_PLATZBEDARF = 1; //Platzbedarf des Gebäudes zum Bau
	
}
