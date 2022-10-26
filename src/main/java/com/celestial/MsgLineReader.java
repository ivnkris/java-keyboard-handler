package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgLineReader extends MsgReader implements IElementReader
{    
	public MsgLineReader( CustomPrompt cp )
	{
		super( cp );
	}
	
    @Override
    public String readFromKeyboard( InputStream is ) 
    {
    	Scanner theScanner = new Scanner(is);
        itsPrompt.prompt("Enter a line of text (hit enter): ");
        return theScanner.nextLine();
    }
}