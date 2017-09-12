package com.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleWords {

	public static void main(String[] args) {
		final Map<Integer, Integer> wordLengths = wordLengths("run hello world");
		System.out.println(formatWordLengths(wordLengths));
	}

	// format a map with the word lengths
	public static String formatWordLengths(Map<Integer, Integer> wordLengths) {
		final int maxLength = wordLengths.keySet().stream().max(Comparator.naturalOrder()).get();
		return IntStream
				// for every length between 1 and the max found word length
				.rangeClosed(1, maxLength)
				// format the length and the number of words with this length
				.<String>mapToObj(key -> {
					return Optional.ofNullable(wordLengths.get(key)).map(nb -> format(key, nb)).orElse(format(key, 0));
				})
				// join the formatted strings together
				.collect(Collectors.joining(" "));
	}

	// format a length, number pair
	private static String format(int length, int number) {
		return String.format("%s: %s", length, number);
	}

	// calculate the different word lengths and their arity
	public static Map<Integer, Integer> wordLengths(String string) {
		return Arrays.stream(string.split(" ")).collect(Collectors.groupingBy(String::length, // group
																								// the
																								// words
																								// by
																								// length
				Collectors.reducing(0, word -> 1, Integer::sum) // count the
																// number of
																// words for
																// every length
		));
	}

}
