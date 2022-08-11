package com.mood.analyzer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	//repeat tc_1.1
	@Test
	public void givenIAmSadMoodShouldReturnSAD() {
		String msg ="I Am Sad Mood";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();
		
		assertEquals("SAD", massage);
		
	}

	//repeat tc_1.2
	@Test
	public void givenIAmInAnyMoodShouldReturnHAPPPY() throws Exception {
		String msg ="I Am Happy Mood";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();

		assertEquals("Happy", massage);

	}
	
	//tc2.1
	@Test
	public void givenNullMoodShouldReturnHappy() throws Exception {
		Scanner scanner = new Scanner(System.in);
		String msg ="null";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();

		assertEquals("Happy", massage);

	}
	//tc_3.1
	@Test
	public void givenNullMoodShouldThrowMoodAnalysisException() throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		String msg =scanner.nextLine();
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();
		System.out.println(massage);
		assertEquals("MoodAnalysisException", massage);

	}
}
