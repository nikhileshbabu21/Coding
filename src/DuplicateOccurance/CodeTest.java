package DuplicateOccurance;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeTest {

	Coding c = new Coding();

	@Test
	void testMain() {
		assertEquals('i', c.UniqueChar("airplane"));// first duplicate occurrence "i"
		assertEquals('m', c.UniqueChar("llama")); // first duplicate occurrence "m"
		assertEquals(0, c.UniqueChar("toot")); // if the output is null
	}

}
