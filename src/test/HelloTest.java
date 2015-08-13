package test;

import static org.junit.Assert.*;
import logic.Hello;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testGreetingMessage() {
		assertEquals("Hello Github", Hello.greetingMessage());
	}

}
