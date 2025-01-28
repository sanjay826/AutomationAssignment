public class Assignment15_Part1 {
	public static void main(String[] args) {
		String input = "I Love Dogs";
		input = input.replace(" ", ""); // Remove spaces

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				System.out.println(input.charAt(i) + "" + input.charAt(j));
			}
		}
	}
}
