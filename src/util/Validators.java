package util;

public class Validators {

	public static boolean isEmail(String email) {

		// XXXX@XXX.XXX
		// @gmail.com
		// tej@s@gmail.com
		// royal@gmail.com
		// royal@g.com
		int at = email.indexOf("@");// 3
		int endAt = email.lastIndexOf("@");// 5
		int dot = email.indexOf(".");// 11
		if (at == 0) {
			return false;
		} else if (at != endAt) {
			return false;
		} else if (dot - at <= 2) { // 11-5 => 6 [5]
			return false;
		}
		return true; // valid
	}
}
