package com.mood.analyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	public String analyseMood(String msg) {
		if(msg.contains("Sad")) 
			return "SAD";
		else
			return msg;
}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		System.out.print("Enter mood : ");
		String msg = scanner.nextLine();
		String mood = moodAnalyzer.analyseMood(msg);
		System.out.println("Current Mood is :" + mood);
		scanner.close();
	}

}
