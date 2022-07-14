public class Palindrome {
	public static void main(String[] args) {
		String palindrome = "Kajak";
//		int len = palindrome.length();
//		StringBuilder dest = new StringBuilder(len);
//		for (int i = (len - 1); i >= 0; i--) {
//			dest.append(palindrome.charAt(i));
//		}
//		System.out.println(dest.toString());


		System.out.println(isPalindrome(palindrome));
	}

	 private static boolean isPalindrome(String palindrome) {
		StringBuilder emordnilap = new StringBuilder(palindrome);
		emordnilap.reverse();
		return palindrome.equalsIgnoreCase(emordnilap.toString());
	}
}
