package com.mood.analyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	String massage = null;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String massage) {
		this.massage = massage;
	}

	public String analyseMood() {
		if (massage.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter mood : ");
			String msg = scanner.nextLine();
			if (msg != "" || msg.equalsIgnoreCase("Happy") || msg.equals("Sad")) {
				MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
				String mood = moodAnalyzer.analyseMood();
				System.out.println("Current Mood is :" + mood);
			} else {
				extracted();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		scanner.close();
	}

	private static void extracted() {
		throw new NullPointerException();
	}
}
