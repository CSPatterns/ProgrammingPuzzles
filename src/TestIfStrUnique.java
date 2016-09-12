public class TestIfStrUnique {

	public static void main(String[] args) {
		String str = "abcad";
		char temp;

		LOOP1: for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);

			LOOP2: for (int j = 0; j < str.length(); j++) {

				if (i == j) {
					continue LOOP2;
				}

				if (temp == str.charAt(j)) {
					System.out.println("String has duplicates");
					break LOOP1;
				}
			}
			System.out.println("no duplicates");
		}
	}

}
