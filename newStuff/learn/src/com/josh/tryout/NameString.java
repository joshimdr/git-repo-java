/**
 * 
 */
package com.josh.tryout;

/**
 * 
 * This class represents a person's name correctly. It finds and assigns the
 * firstname, lastname appropriately It does not handle the middle names right
 * now.
 * 
 * @author Munish
 *
 */
public final class NameString {

	public String firstName = null;
	public String lastName = null;
	public String firstNameORlastName = null;

	public NameString() {

	}

	public NameString(String nameString) {

		assignNameTokens(nameString);

	}

	/**
	 * this method assigns the firstname, lastname, or firstNameOrlastName based
	 * on input string (if it has "," or " ")
	 * 
	 * @param nameString
	 */
	private void assignNameTokens(String nameString) {
		String[] nameTokens = null;

		if (nameString != null && nameString.length() > 0) {
			if (nameString.contains(",")) {
				nameTokens = nameString.split(",");
				lastName = nameTokens[0].trim();
				firstName = nameTokens[1].trim();

			} else if (nameString.contains(" ")) {
				nameTokens = nameString.split(" ");

				firstName = nameTokens[0].trim();
				lastName = nameTokens[1].trim();

			} else {
				firstNameORlastName = nameString.trim();
			}

		}
	}

	public NameString(String f, String l) {
		this.firstName = f;
		this.lastName = l;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstNameORlastName=");
		builder.append(firstNameORlastName);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((firstNameORlastName == null) ? 0 : firstNameORlastName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameString other = (NameString) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (firstNameORlastName == null) {
			if (other.firstNameORlastName != null)
				return false;
		} else if (!firstNameORlastName.equals(other.firstNameORlastName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
