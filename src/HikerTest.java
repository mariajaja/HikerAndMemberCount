import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HikerTest {

	@Test
	public void testAdd1() {

		String expected = "0";
		String actual = Hiker.answer("");
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd2() {

		String expected = "1";
		String actual = Hiker.answer("1");
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd3() {

		String expected = "3";
		String actual = Hiker.answer("1,2");
		assertEquals(expected, actual);
	}
}