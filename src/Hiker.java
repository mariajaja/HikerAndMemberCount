/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class Hiker {

	public static String answer(String number) {
		String sum = null;
		Integer total = 0;
		String[] array = number.split(",");

		Integer[] c = new Integer[2];

		if (number.equals("")) {

			sum = Integer.toString(0);

		} else {

			for (String part : array) {
				Integer n = Integer.parseInt(part);
				total += n;
			}
			sum = Integer.toString(total);

		}
		return sum;
	}

}
