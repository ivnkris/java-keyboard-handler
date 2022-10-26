package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgLineReader extends ElementReader
{    
    @Override
    public String readFromKeyboard( InputStream is ) 
    {
    	Scanner theScanner = new Scanner(is);
        prompt("Enter a line of text (hit enter): ");
        return theScanner.nextLine();
    }
}