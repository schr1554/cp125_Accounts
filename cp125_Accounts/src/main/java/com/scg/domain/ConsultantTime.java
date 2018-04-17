package com.scg.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A consultants time, maintains date, skill, account and hours data.
 * 
 * @author chq-alexs
 *
 */
public final class ConsultantTime {

	private LocalDate date;
	private Account account;
	private Skill skillType;
	private int hours;

	/**
	 * Creates a new instance of ConsultantTime.
	 * 
	 * @param date
	 *            - The date this instance occurred.
	 * @param account
	 *            - The account to charge the hours to; either a Client or
	 *            NonBillableAccount.
	 * @param skillType
	 *            - The skill type.
	 * @param hours
	 *            - The number of hours, which must be positive.
	 * 
	 * @throws IllegalArgumentException
	 *             - if the hours are <= 0.
	 */
	public ConsultantTime(LocalDate date, Account account, Object skillType, int hours)
			throws IllegalArgumentException {
		setDate(date);
		setAccount(account);
		this.skillType = (Skill) skillType;
		setHours(hours);
		this.hours = hours;
	}

	/**
	 * Getter for property date.
	 * 
	 * @return Value of property date
	 * 
	 */
	public LocalDate getDate() {
		return this.date;

	}

	/**
	 * Setter for property date.
	 * 
	 * @param date
	 *            - New value of property date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter for property account.
	 * 
	 * @return Value of property account
	 */
	public Account getAccount() {
		return this.account;
	}

	/**
	 * Setter for property account.
	 * 
	 * @param account
	 *            - New value of property account.
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * Determines if the time is billable.
	 * 
	 * @return true if the time is billable otherwise false.
	 * 
	 */
	public boolean isBillable() {

		return this.account.isBillable();
	}

	/**
	 * Getter for property hours.
	 * 
	 * @return Value of property hours.
	 * 
	 */
	public int getHours() {
		return this.hours;
	}

	/**
	 * Setter for property hours.
	 * 
	 * @param hours
	 *            - New value of property hours must be > 0.
	 * @throws IllegalArgumentException
	 *             - if the hours are <= 0.
	 */
	public void setHours(int hours) throws IllegalArgumentException {
		if (hours < 0) {
			throw new IllegalArgumentException("Hours must be a positive integer.");
		}

		this.hours = hours;
	}

	/**
	 * Getter for property skill.
	 * 
	 * @return Value of property skill.
	 */
	public Skill getSkill() {
		return this.skillType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {

		int hashCode = 0;
		hashCode += date.hashCode();
		hashCode += account.hashCode();
		hashCode += skillType.hashCode();
		hashCode += hours;

		return hashCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {

		return (obj.hashCode() == hashCode());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		// Formate this using what is done in reportToString in TimeCard.
		return this.date.format(DateTimeFormatter.ofPattern("yyy MM dd")) + " " + this.account.getName() + " "
				+ this.skillType.toString() + " " + this.hours;
	}

}
