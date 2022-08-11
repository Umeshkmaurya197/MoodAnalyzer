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
	public void givenIAmInAnyMoodShouldReturnHAPPPY() {
		String msg ="I Am Happy Mood";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();

		assertEquals("Happy", massage);

	}
	
	//tc2.1
	@Test
	public void givenNullMoodShouldReturnHappy() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter mood : ");
		String msg ="null";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();

		assertEquals("Happy", massage);

	}

}
