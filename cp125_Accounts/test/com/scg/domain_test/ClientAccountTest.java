package com.scg.domain_test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.scg.domain.ClientAccount;

import com.scg.util.Name;

public class ClientAccountTest {

	Name name = new Name("Coyote", "Wiley");

	LocalDate startDate = LocalDate.of(2016, 1, 1);

	@Test
	public void clientAccountConstructorTest() {
		ClientAccount clientAccount = new ClientAccount("TEST", name);
		assertEquals("TEST", clientAccount.getName());
		assertEquals(name.toString(), clientAccount.getContact().toString());
	}

	@Test
	public void getNameTest() {
		ClientAccount clientAccount = new ClientAccount("TEST", name);
		assertEquals("TEST", clientAccount.getName());
	}

	@Test
	public void getContactTest() {
		ClientAccount clientAccount = new ClientAccount("TEST", name);
		assertEquals(name.toString(), clientAccount.getContact().toString());
	}

	@Test
	public void setContactTest() {
		ClientAccount clientAccount = new ClientAccount("TEST", name);
		Name testName = new Name("Test", "Name");
		clientAccount.setContact(testName);
		assertEquals(testName.toString(), clientAccount.getContact().toString());
	}

	@Test
	public void isBillableTest() {
		ClientAccount clientAccount = new ClientAccount("TEST", name);
		assertEquals(true, clientAccount.isBillable());
	}

}
