package DuplicateOccurance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UniqueChar("airplane"));
		System.out.println(UniqueChar("toot"));
		System.out.println(UniqueChar("llama"));
	}

	// Since I have stored repeated and non-repeated character separately,at the end
	// of iteration,
	// first element from List is our first non repeated character from String.

	public static char UniqueChar(String word) {
		Set<Character> repeating = new LinkedHashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}

		}
		try {
			return nonRepeating.get(0);
		} catch (Exception e) {
			System.out.println("null");
		}

		return 0;

	}

}
