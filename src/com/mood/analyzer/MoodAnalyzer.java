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
		try {
			if (massage != "" || massage.equalsIgnoreCase("Happy") || massage.equals("Sad")) {
				if (massage.contains("Sad"))
					return "SAD";
			}
			else
				throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "Happy";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter mood : ");
		String msg = scanner.nextLine();
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
		String mood = moodAnalyzer.analyseMood();
		System.out.println("Current Mood is :" + mood);
		scanner.close();
	}
}