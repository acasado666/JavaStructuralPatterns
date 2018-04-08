package org.acasado.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AutomobileComponent {
	
	String name;
	String value;
	List<AutomobileComponent> automobileComponents = new ArrayList<>();
	
	public AutomobileComponent add(AutomobileComponent automobileComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public AutomobileComponent remove(AutomobileComponent automobileComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return value;
	}	
	
	public abstract String toString();
	
	String print(AutomobileComponent automobileComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(value);
		builder.append("\n");
		return builder.toString();
	}
}
