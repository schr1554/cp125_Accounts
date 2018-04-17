package com.scg.util;

/**
 * A simple mailing address. Does no validity checking for things like valid
 * states or postal codes. Instances of this class are immutable.
 * 
 * @author chq-alexs
 *
 */
public final class Address {

	private final String streetNumber;
	private final String city;
	private final StateCode state;
	private final String postalCode;

	/**
	 * Construct an Address.
	 * 
	 * @param streetNumber
	 *            - the street number.
	 * @param city
	 *            - the city.
	 * @param state
	 *            - the state.
	 * @param postalCode
	 *            - the postal code.
	 */
	public Address(String streetNumber, String city, StateCode state, String postalCode) {
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;

	}

	/**
	 * Get the street number number for this address.
	 * 
	 * @return the street number.
	 * 
	 */
	public String getStreetNumber() {
		return this.streetNumber;

	}

	/**
	 * Gets the city for this address.
	 * 
	 * @return the city.
	 */
	public String getCity() {
		return this.city;

	}

	/**
	 * Get the state for this address.
	 * 
	 * @return the state.
	 */
	public StateCode getState() {

		return this.state;

	}

	/**
	 * Gets the postal code for this address.
	 * 
	 * @return the postal code.
	 */
	public String getPostalCode() {
		return this.postalCode;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {

		int addressHash = this.city.hashCode();
		addressHash += this.postalCode.hashCode();
		addressHash += this.state.hashCode();
		addressHash += this.streetNumber.hashCode();

		return addressHash;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Address otherAddress) {

		int otherAddressHash = otherAddress.city.hashCode();
		otherAddressHash += otherAddress.postalCode.hashCode();
		otherAddressHash += otherAddress.state.hashCode();
		otherAddressHash += otherAddress.streetNumber.hashCode();

		boolean equals = (otherAddressHash == hashCode());

		return equals;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		StringBuilder addressString = new StringBuilder();
		addressString.append(getStreetNumber() + "\n");
		addressString.append(getCity() + ", " + getState().name() + " " + getPostalCode());

		return addressString.toString();

	}

}
