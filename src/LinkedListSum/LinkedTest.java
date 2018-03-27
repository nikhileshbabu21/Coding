package LinkedListSum;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedTest {

	Linked list = new Linked();

	@Test
	void test() {

		// If list is empty then it returns false
		assertEquals(false, list.isEmpty());

		// If list is not empty then it returns true

		assertTrue(!list.isEmpty());

	}

}
