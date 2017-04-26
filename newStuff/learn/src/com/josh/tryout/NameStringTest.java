package com.josh.tryout;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 *
 * @author Munish
 *
 */
import org.junit.Test;

public class NameStringTest {

	@Test
	public final void testFirstNameLastName() {

		String firstNameLastName = "Munish Joshi";

		assertEquals(new NameString(firstNameLastName).firstName, "Munish");
		assertEquals(new NameString(firstNameLastName).lastName, "Joshi");
		assertNull(new NameString(firstNameLastName).firstNameORlastName);

	}

	@Test
	public final void testLastNameFirstName() {

		String lastNameFirstName = "Joshi, Munish";

		assertEquals(new NameString(lastNameFirstName).firstName, "Munish");
		assertEquals(new NameString(lastNameFirstName).lastName, "Joshi");
		assertNull(new NameString(lastNameFirstName).firstNameORlastName);

	}

	@Test
	public final void testFirstOrLast() {

		String firstOrLast = "knowsnothing";

		assertNull(new NameString(firstOrLast).firstName);
		assertNull(new NameString(firstOrLast).firstName);
		assertEquals(new NameString(firstOrLast).firstNameORlastName, "knowsnothing");

	}

	@Test
	public final void testNameAsNull() {

		String nameAsNull = null;

		assertNull(new NameString(nameAsNull).firstName);
		assertNull(new NameString(nameAsNull).firstName);
		assertNull(new NameString(nameAsNull).firstNameORlastName, (String)null);

	}

	@Test
	public final void testNameAsEmpty() {

		String nameAsEmpty = "";

		assertNull(new NameString(nameAsEmpty).firstName, (String)null);
		assertNull(new NameString(nameAsEmpty).firstName, (String)null);
		assertNull(new NameString(nameAsEmpty).firstNameORlastName, (String)null);

	}

}
