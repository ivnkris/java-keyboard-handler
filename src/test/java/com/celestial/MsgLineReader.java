package com.celestial;

import java.util.Scanner;

public class MsgLineReader {
	private final Scanner theScanner;
	
	public MsgLineReader() {
		theScanner = new Scanner(System.in);
	}
	
	private void prompt() {
		System.out.print("Enter a line of Text (hit enter):");
	}
	
	public String readFromKeyboard() {
		prompt();
		return theScanner.nextLine();
	}
}