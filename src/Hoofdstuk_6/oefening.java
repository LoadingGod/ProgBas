package Hoofdstuk_6;

public class oefening {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("def");
		System.out.println(sb);
		System.out.println(sb2);

		sb.append("extra tekst");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		StringBuilder test = new StringBuilder(
				"Dit is   een    spatievolle    tekst   wauw.    Interessant   *   *  *   . ");

		String test1 = "Dit is   een    spatievolle    tekst   wauw.    Interessant   *   *  *   . ";

		// Verwijder spaties met replaceAll functie.
		test1 = test1.replaceAll("\\s", "");
		System.out.println(test1);

		System.out.println("\n");

		// Verwijder spaties in een StringBuilder object met for loop.
		for (int i = 0; i < test.length(); ++i) {
			if (Character.isWhitespace(test.charAt(i))) {
				test.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(test + "$$$$$");

		// --- StringBuilder Object 3 --- //
		// --- Verdubbel het aantal 't' in een string.
		StringBuilder sb3 = new StringBuilder("tttt");

		for (int i = 0; i < sb3.length(); i++) {
			if (sb3.charAt(i) == 't') {
				sb3.insert(i, 't');
				i++;
			}
		}
		System.out.println(sb3);

	}
}
