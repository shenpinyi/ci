package ci;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void test() {
		assertEquals("Hello Jack!", new Customer().sayHello());
	}

}
