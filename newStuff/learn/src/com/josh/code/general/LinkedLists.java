/**
 * 
 */
package com.josh.code.general;

import java.util.LinkedList;

/**
 * @author munish
 *
 */
public class LinkedLists {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Object obj = new Object();

		LinkedList<Animal> ll = new LinkedList<Animal>();

		Animal a = new Animal("munish Cat 1", Animal.Type.cat);
		Animal a1 = new Animal("munish Cat 2", Animal.Type.cat);
		Animal a2 = new Animal("munish Cat 3", Animal.Type.cat);

		Animal a3 = new Animal("munish Dog 1", Animal.Type.dog);
		Animal a4 = new Animal("munish Dog 2", Animal.Type.dog);

		ll.add(a);
		ll.add(a1);
		ll.add(a2);
		ll.add(a3);
		ll.add(a4);

		System.out.println(ll);

		// Animal a5 = new Animal("munish Dog 1", Animal.Type.dog);

		System.out.println(ll.removeFirstOccurrence(new Animal("munish Dog 1", Animal.Type.dog)));

		System.out.println(ll);

		// System.out.println(ll.removeFirstOccurrence("dog"));
		// System.out.println(ll.removeFirstOccurrence("dog"));
		// System.out.println(ll.removeFirstOccurrence("dog"));
		//

	}

}

class Animal {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + "]";
	}

	private Type type;
	String name;

	enum Type {
		cat, dog
	}

	public Animal(String name, Type thetype) {
		this.name = name;
		this.type = thetype;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {

			return false;
		}
		Animal other = (Animal) obj;
		if (type != other.type)
			return false;
		return true;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
