package ci;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void test01() {
		assertEquals("Hello Jack!", new Customer().sayHello());
	}

	@Test
	public void test02() {
		assertEquals("Hello Jack!", new Customer().sayHello());
	}
	
	@Test
	public void test03() {
		assertEquals("Hello Jack!", new Customer().sayHello());
	}
}
