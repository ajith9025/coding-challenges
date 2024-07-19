package com.chainsys.day8;

import java.util.Scanner;

public class LongestPrefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return findLongestCommonPrefix(strs);
				}
			}
		}

		return prefix;
	}

	public static String findLongestCommonPrefix(String[] strs) {
		String longestPrefix = "";
		for (int i = 0; i < strs.length; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				String prefix = strs[i];
				while (strs[j].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);
					if (prefix.isEmpty()) {
						break;
					}
				}
				if (prefix.length() > longestPrefix.length()) {
					longestPrefix = prefix;
				}
			}
		}
		return longestPrefix;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int n = sc.nextInt();
		String[] strings = new String[n];

		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			strings[i] = sc.next();
		}

		System.out.println("The Longest common prefix: " + longestCommonPrefix(strings));
		sc.close();
	}
}
