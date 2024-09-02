package com.chainsys.day8;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String s = sc.nextLine();
		sc.close();
		s = removeLetters(s);
		if (s.length() == 0) {
			System.out.println(0);
			return;
		}
		String[] words = s.split("[^a-zA-Z]+");
		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}
	}

	public static String removeLetters(String str) {
		int i;
		for (i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				break;
			}
		}
		return str.substring(i);
	}
}