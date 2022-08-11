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
			if (massage != "" ) {
				if (massage.contains("Sad"))
					return "SAD";
			}
			else
				throw new Exception("MoodAnalysisException ");
		} catch (Exception e) {
			System.out.println(e);
			return "Happy";
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