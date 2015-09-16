package main.java.backend.produktion;

/**
 * Sammlung von Produktionsparametern in Form von Konstanten
 * 
 * @author mmensch
 *
 */
public class ProdParam {

	/**
	 * Anzahl der unterschiedlichen G�ter. (wird u.A. f�r die L�nge des
	 * Lager-Arrays ben�tigt.)
	 */
	static int NUM_DIF_GOODS = 3;

	// G�terarten
	static int HOLZ = 0;
	static int STEIN = 1;
	static int BRETT = 2;

	/**
	 * Liefert zu dem mit integer-Wert codierten Gut den zugeh�rigen Namen als
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

	// **** WERTE DER GEB�UDE ****

	// Werte des Holzf�llers (HF):
	static String HF_NAME = "Holzfaeller";
	static int HF_PLATZBEDARF = 1; // Platzbedarf des Geb�udes zum Bau
	static int HF_DELAY = 1; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert

	// Werte des Steinmetz (SM):
	static String SM_NAME = "Steinmetz";
	static int SM_PLATZBEDARF = 1; // Platzbedarf des Geb�udes zum Bau
	static int SM_DELAY = 3; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert
	
	// Werte des S�gewerks (SW):
	static String SW_NAME = "Saegewerk";
	static int SW_PLATZBEDARF = 1; // Platzbedarf des Geb�udes zum Bau
	static int SW_DELAY = 3; // Nur bei jedem (DELAY-ten)-mal des Taktes wird produziert

}
