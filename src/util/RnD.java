package util;

public class RnD {

	public static void main(String[] args) {
		String x = "royal@gmail.com";

		String alpha = "([A-Za-z])+";// + => 1 or many
		String email = "^([a-zA-Z0-9])+@([a-zA-Z])+\\.([a-zA-Z]){2,3}$";// ram@gmail.com
		System.out.println(x.matches(alpha));

		System.out.println(x.matches(email));

	}
}
