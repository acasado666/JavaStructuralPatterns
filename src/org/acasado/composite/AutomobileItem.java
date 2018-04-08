package org.acasado.composite;


public class AutomobileItem extends AutomobileComponent {

	public AutomobileItem(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return print(this);
	}
}
