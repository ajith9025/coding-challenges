package com.chainsys.day8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicatesWords {

	public static void main(String[] args) {

		String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the name:");
      
		int numSentences = Integer.parseInt(sc.nextLine());

		while (numSentences-- > 0) {
			String input = sc.nextLine();

			Matcher m = p.matcher(input);

			while (m.find()) {
				input = input.replaceAll(m.group(0), m.group(1));
			}

			System.out.println(input);
		}

		sc.close();
	}
}
