import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class GuestListTest {

	// AAA discount??? test to save ur life
	// Arrange, Act, Asserts

	@Test
	public void testGetCount1() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		// act
		int actual = guestList.getCount();

		// assert
		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCount2() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);

		// act
		int actual = guestList.getCount();

		// assert
		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCount3() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("Pops", -13, true);

		// act
		int actual = guestList.getCount();

		// assert
		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCount4() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 14, false);

		// act
		int actual = guestList.getCount();

		// assert
		int expected = 2;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCount5() {
		// arrange
		GuestList guestList = new GuestList();

		// act
		int actual = guestList.getCount();

		// assert
		int expected = 0;
		assertEquals(expected, actual);

	}

	@Test
	public void testMemberCount1() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		// act
		int actual = guestList.getMemberCount();

		// assert
		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testMemberCount2() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 107, false);

		// act
		int actual = guestList.getMemberCount();

		// assert
		int expected = 0;
		assertEquals(expected, actual);

	}

	@Test
	public void testMemberCount3() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 74, false);

		// act
		int actual = guestList.getMemberCount();

		// assert
		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetSum1() {
		// arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 18, true);

		// act
		int actual = guestList.getSum();

		// assert
		int expected = 18;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetSum2() {
		GuestList guestList = new GuestList();
		guestList.add("David", 18, true);
		guestList.add("Tim", 20, false);

		int actual = guestList.getSum();

		int expected = 38;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSum3() {
		GuestList guestList = new GuestList();
		guestList.add("David", 18, true);
		guestList.add("Tim", 20, false);
		guestList.add("Mariah", 0, true);

		int actual = guestList.getSum();

		int expected = 38;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSum4() {
		GuestList guestList = new GuestList();

		int actual = guestList.getSum();

		int expected = 0;
		assertEquals(expected, actual);
	}
}
