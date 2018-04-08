package org.acasado.composite;


public class CompositeAutomobileDemo {

	public static void main(String[] args) {

		// This is the main Component
		Automobile mainAutomobile = new Automobile("Model A3", "23000");


		// Let´s start adding leafs to the main Component
		AutomobileItem safetyAutomobileItem = new AutomobileItem("Safety", "4 out 5");
		mainAutomobile.add(safetyAutomobileItem);

		AutomobileItem designtyAutomobileItem = new AutomobileItem("Design", "3 out 5");
		mainAutomobile.add(designtyAutomobileItem);
		
		Automobile claimsSubAutomobile = new Automobile("Claims", "21");
		mainAutomobile.add(claimsSubAutomobile);

		AutomobileItem personalClaimsAutomobile = new AutomobileItem("Personal Claim", "1");
		mainAutomobile.add(personalClaimsAutomobile);
		
		System.out.println(mainAutomobile.toString());
	}
}
