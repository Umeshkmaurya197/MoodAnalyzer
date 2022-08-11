package com.mood.analyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	String massage = null;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String massage) {
		this.massage = massage;
	}

	public String analyseMood() throws Exception {
		try {
			if (massage != "" ) {
				if (massage.contains("Sad"))
					return "SAD";
			}
		} catch (Exception e) {
			throw new Exception("MoodAnalysisException ");
		}
		return "Happy";
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter mood : ");
		String msg = scanner.nextLine();
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(msg);
		String mood = moodAnalyzer.analyseMood();
		System.out.println("Current Mood is :" + mood);
		scanner.close();
	}
}