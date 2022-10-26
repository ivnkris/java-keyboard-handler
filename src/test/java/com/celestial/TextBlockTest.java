package com.celestial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextBlockTest {

	@Test
	void verify_format_string() {
		// arrange
		int blockNo = 1;
		String data = "Hello world";
		TextBlock cut = new TextBlock(blockNo, data);
		String expectedResult = Integer.toString(blockNo) + ": " + data;
		
		// act
		String result = cut.toString();
		
		// assert
		assertEquals(expectedResult, result);
	}

}
