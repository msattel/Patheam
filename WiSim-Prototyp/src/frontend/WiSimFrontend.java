package frontend;

import backend.produktion.*;

public class WiSimFrontend {

	public static void main(String[] args) {
		
		Gebaeude mySteinmetz = GebFactory.getGebaeude("sm");
		mySteinmetz.produziere();
		
		Gebaeude myHolzfaeller = GebFactory.getGebaeude("hf");
		
		System.out.println(mySteinmetz.toString());
		System.out.println(myHolzfaeller.toString());
		
		for (int i=0; i<99; i++){
			myHolzfaeller.produziere();
		}
		System.out.println(myHolzfaeller.toString());
		
	}

}
