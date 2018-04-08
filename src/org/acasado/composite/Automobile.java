package org.acasado.composite;

import java.util.Iterator;

public class Automobile extends AutomobileComponent {
	
	public Automobile(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public AutomobileComponent add(AutomobileComponent automobileComponent) {
		automobileComponents.add(automobileComponent);
		return automobileComponent;
	}
	
	@Override
	public AutomobileComponent remove(AutomobileComponent automobileComponent) {
		automobileComponents.remove(automobileComponent);
		return automobileComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		
		builder.append(print(this));
		
		Iterator<AutomobileComponent> itr = automobileComponents.iterator();
		while(itr.hasNext()) {
			AutomobileComponent automobileComponent = itr.next();
			builder.append(automobileComponent.toString());
		}
		
		return builder.toString();
	}
}
