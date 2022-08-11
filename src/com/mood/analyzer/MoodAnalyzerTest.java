package com.mood.analyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	
	//tc_1.1
	@Test
	public void givenIAmSadMoodShouldReturnSAD() {
		MoodAnalyzer analyzer= new MoodAnalyzer();
		String msg = analyzer.analyseMood("I Am Sad Mood");
		
		assertEquals("SAD", msg);
		
	}
	//tc_1.2
		@Test
		public void givenIAmInAnyMoodShouldReturnHAPPPY() {
			MoodAnalyzer analyzer= new MoodAnalyzer();
			String msg = analyzer.analyseMood("I Am In Any Mood");
			
			assertEquals("HAPPY", msg);
			
		}
	

}
