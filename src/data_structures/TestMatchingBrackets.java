package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> brackets = new Stack<Character>();

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				brackets.push('{');
			} else if (b.charAt(i) == '}') {
				if (brackets.size() == 0) {
					return false;
				} else {
					brackets.pop();
				}
			}
		}
		if (brackets.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

}

// 1. Iterate through String to find if it has matching bracket.
// 2. Check if it equals to I