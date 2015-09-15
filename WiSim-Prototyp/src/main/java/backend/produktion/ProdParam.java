package main.java.backend.produktion;

/**
 * Sammlung von Produktionsparametern in Form von Konstanten
 * 
 * @author mmensch
 *
 */
public class ProdParam {

	/**
	 * Anzahl der unterschiedlichen Güter. (wird u.A. für die Länge des
	 * Lager-Arrays benötigt.)
	 */
	static int NUM_DIF_GOODS = 3;

	// Güterarten
	static int HOLZ = 0;
	static int STEIN = 1;
	static int BRETT = 2;

	/**
	 * Liefert zu dem mit integer-Wert codierten Gut den zugehörigen Namen als
	 * String
	 * 
	 * @param i
	 * @return
	 */
	static String getGoodName(int i) {
		if (i == HOLZ)
			return "HOLZ";
		else if (i == STEIN)
			return "STEIN";
		else if (i == BRETT)
			return "BRETT";
		return "NICHTS";
	}

	// **** WERTE DER GEBÄUDE ****

	// Werte des Holzfällers (HF):
	static String HF_NAME = "Holzfäller";
	static int HF_PLATZBEDARF = 1; // Platzbedarf des Gebäudes zum Bau
	static int HF_DELAY = 1; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert

	// Werte des Steinmetz (SM):
	static String SM_NAME = "Steinmetz";
	static int SM_PLATZBEDARF = 1; // Platzbedarf des Gebäudes zum Bau
	static int SM_DELAY = 3; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert
	
	// Werte des Sägewerks (SW):
	static String SW_NAME = "Sägewerk";
	static int SW_PLATZBEDARF = 1; // Platzbedarf des Gebäudes zum Bau
	static int SW_DELAY = 3; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert

}
