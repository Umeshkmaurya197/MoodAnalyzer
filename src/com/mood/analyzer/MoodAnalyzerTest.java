package com.mood.analyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	// Repeat tc_1.1
	@Test
	public void givenIAmSadMoodShouldReturnSAD() {
		String msg ="I Am Sad Mood";
		MoodAnalyzer analyzer= new MoodAnalyzer(msg);
		String massage = analyzer.analyseMood();
		
		assertEquals("SAD", massage);
		
	}
    
}
