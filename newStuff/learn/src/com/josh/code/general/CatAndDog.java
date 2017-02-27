/**
 * 
 */
package com.josh.code.general;

import com.josh.code.general.Node2.ANIMAL;

/**
 * @author munish
 *
 */
public class CatAndDog {

	Node2 dogHead;
	Node2 catHead;
	Node2 tail;

	private void addDog(Node2 dogNode2) {
		dogNode2.next = null;
		if (tail != null) {
			tail.next = dogNode2;
			tail = dogNode2;
			if (dogHead == null) {
				dogHead = dogNode2;
			}
		} else {
			tail = dogNode2;
			dogHead = dogNode2;
			// catHead = null;

		}

	}

	private void addCat(Node2 catNode2) {
		catNode2.next = null;
		if (tail != null) {
			tail.next = catNode2;
			tail = catNode2;
			if (catHead == null) {
				catHead = catNode2;
			}

		} else {
			tail = catNode2;
			catHead = catNode2;
			// dogHead = null;
		}

	}

	private Node2 getFirstAvailableCat() {
		// TODO Auto-generated method stub

		Node2 firstCat = catHead;

		Node2 newCatHead = catHead.next;

			while (newCatHead!= null) {
				if (newCatHead.type.equals(ANIMAL.CAT)) {
					catHead = newCatHead;
					break;
				} else {
					newCatHead = newCatHead.next;
				}
			}
			if (newCatHead!=null && !newCatHead.type.equals(ANIMAL.CAT)) {
				System.out.println("No cats left in stock..., do you want dog instead ? ");
				return null;
			}
		return firstCat;

	}

	private Node2 getFirstAvailableDog() {
		// TODO Auto-generated method stub

		Node2 firstDog = dogHead;
		Node2 newDogHead = dogHead.next;

		
			while (newDogHead != null) {
				if (newDogHead.type.equals(ANIMAL.DOG)) {
					dogHead = newDogHead;
					break;
				} else {
					newDogHead = newDogHead.next;
				}
			}
			if (newDogHead!=null && !newDogHead.type.equals(ANIMAL.DOG)) {
				System.out.println("No dogs left in stock..., do you want cat instead ? ");
				dogHead =null;
				return null;
			}
		

		return firstDog;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatAndDog [dogHead=" + dogHead + ", catHead=" + catHead + ", tail=" + tail + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node2 cat1 = new Node2(ANIMAL.CAT, null, "Cat 1");
		Node2 cat2 = new Node2(ANIMAL.CAT, null, "Cat 2");

		Node2 dog1 = new Node2(ANIMAL.DOG, null, "Dog 1");
		Node2 dog2 = new Node2(ANIMAL.DOG, null, "Dog 2");

		Node2 cat3 = new Node2(ANIMAL.CAT, null, "Cat 3");

		Node2 dog3 = new Node2(ANIMAL.DOG, null, "Dog 3");

		CatAndDog cad = new CatAndDog();

		cad.addCat(cat1);
		cad.addCat(cat2);
		cad.addDog(dog1);
		cad.addDog(dog2);
		cad.addCat(cat3);
		cad.addDog(dog3);

		Node2 dog11 = cad.getFirstAvailableDog();

		System.out.println("The first dog out there:" + dog11);
		
		Node2 dog22 = cad.getFirstAvailableDog();

		System.out.println("The second dog out there:" + dog22);
		
			

		Node2 cat11 = cad.getFirstAvailableCat();

		System.out.println("The first Cat out there:" + cat11);


		Node2 dog33 = cad.getFirstAvailableDog();

		System.out.println("The third dog out there:" + dog33);

		


		Node2 cat22 = cad.getFirstAvailableCat();

		System.out.println("The 2nd Cat out there:" + cat22);

		Node2 dog34 = cad.getFirstAvailableDog();
		Node2 dog35 = cad.getFirstAvailableDog();
		Node2 dog36 = cad.getFirstAvailableDog();

	}

}

class Node2 {
	
	
	enum ANIMAL {CAT , DOG};
	
	String name;
	
	
	ANIMAL type;

	//String type;

	Node2 next;

	public Node2() {

	}

	public Node2(ANIMAL type, Node2 theNext, String name) {
		this.type = type;
		this.next = theNext;
		this.name = name;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node2 other = (Node2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
	
	
	
	

}