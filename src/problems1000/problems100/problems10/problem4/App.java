package problems1000.problems100.problems10.problem4;

public class App {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		App a = new App();
		Integer maxPalindrome = 0;
		for (int i = 999; i > 100; i--) {
			for (int j = i; j > 100; j--) {
				if (a.isPalindrome(String.valueOf(i*j))) {
					if (i*j < maxPalindrome) {
						continue;
					} else {
						maxPalindrome = i*j;
					}
				}
			}
		}
		System.out.println(maxPalindrome);
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	public boolean isPalindrome(String text) {
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
