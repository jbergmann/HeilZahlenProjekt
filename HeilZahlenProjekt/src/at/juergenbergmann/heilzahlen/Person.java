/**
 * 
 */
package at.juergenbergmann.heilzahlen;

import java.time.LocalDate;

/**
 * @author juerg
 *
 */
public class Person {
	String name;
	LocalDate datumGeburt;
	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param datumGeburt
	 */
	public Person(String name, LocalDate datumGeburt) {
		super();
		this.name = name;
		this.datumGeburt = datumGeburt;
	}
}
