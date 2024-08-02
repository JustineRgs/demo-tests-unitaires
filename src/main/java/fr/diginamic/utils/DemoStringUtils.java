package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

	public class DemoStringUtils {

	@Test
	public void testLevenshteinDistance_SimpleCases() {
		assertEquals(1, StringUtils.levenshteinDistance("Chine", "Chien"));
		assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
		assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
		assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
		assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));
	}

	@Test
	public void testLevenshteinDistance_EmptyStrings() {
		assertEquals(0, StringUtils.levenshteinDistance("", ""));
		assertEquals(1, StringUtils.levenshteinDistance("", "a"));
		assertEquals(1, StringUtils.levenshteinDistance("a", ""));
	}

	@Test
	public void testLevenshteinDistance_SameStrings() {
		assertEquals(0, StringUtils.levenshteinDistance("hello", "hello"));
	}

	@Test
	public void testLevenshteinDistance_DifferentLengths() {
		assertEquals(3, StringUtils.levenshteinDistance("kitten", "sitting"));
	}

	@Test
	public void testLevenshteinDistance_SingleCharacter() {
		assertEquals(1, StringUtils.levenshteinDistance("a", "b"));
		assertEquals(1, StringUtils.levenshteinDistance("a", ""));
		assertEquals(1, StringUtils.levenshteinDistance("", "a"));
	}
}
