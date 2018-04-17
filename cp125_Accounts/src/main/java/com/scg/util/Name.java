package com.scg.util;

/**
 * Encapsulates the first, middle and last name of a person.
 * 
 * @author chq-alexs
 *
 */
public class Name {

	private int hash;
	private String lastName;
	private String middleName;
	private String firstName;

	/**
	 * Creates a new instance of Name
	 * 
	 */
	public Name() {

	}

	/**
	 * Construct a Name.
	 * 
	 * @param lastName
	 *            - Value for the last name.
	 * @param firstName
	 *            - Value for the first name.
	 */
	public Name(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
		setMiddleName("NMN");
	}

	/**
	 * Construct a Name.
	 * 
	 * @param lastName
	 *            - Value for the last name.
	 * @param firstName
	 *            - Value for the first name.
	 * @param middleName
	 *            - Value for the middle name.
	 */
	public Name(String lastName, String firstName, String middleName) {
		setLastName(lastName);
		setFirstName(firstName);
		setMiddleName(middleName);

		// this.hash = calcHashCode();
	}

	/**
	 * Getter for property firstName.
	 * 
	 * @return Value of property firstName.
	 * 
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Setter for property first.
	 * 
	 * @param firstName
	 *            - New value of property firstName.
	 * 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter for property lastName.
	 * 
	 * @return Value of property lastName.
	 * 
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Setter for property lastName.
	 * 
	 * @param lastName
	 *            - New value of property lastName.
	 * 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter for property middleName.
	 * 
	 * @return Value of property middleName.
	 * 
	 */
	public String getMiddleName() {
		return this.middleName;
	}

	/**
	 * Setter for property middleName.
	 * 
	 * @param middleName
	 *            - New value of property middleName.
	 * 
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	private int calcHashCode() {
		int hc = Name.class.hashCode();

		return hash;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {

		StringBuilder strb = new StringBuilder();
		strb.append(this.firstName);
		strb.append(this.middleName);
		strb.append(this.lastName);

		hash = strb.toString().hashCode();
		return hash;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {

		boolean equals = false;

		if (hashCode() == other.hashCode()) {
			equals = true;
		}

		return equals;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		// Add String builder
		/*
		 * StringBuilder name = new StringBuilder(); name.append(this.lastName);
		 * name.append(","); name.append(" "); name.append(this.middleName);
		 */
		String out = this.lastName + ", " + this.firstName + " " + this.middleName;
		return out;
		// return name.toString();

	}

}
