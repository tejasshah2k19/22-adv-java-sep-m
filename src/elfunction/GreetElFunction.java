package elfunction;

import java.util.Date;

public class GreetElFunction {

	public static String greet() {
		Date d = new Date();

		int h = d.getHours();

		if (h >= 0 && h <= 11) {
			return "Good Morning";
		} else if (h >= 12 && h <= 17) {
			return "Good Noon";
		} else if (h >= 18 && h <= 24) {
			return "Good Evening";
		} else {
			return "Welcome";
		}
	}
}
