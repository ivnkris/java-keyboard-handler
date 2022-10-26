package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgElementReader extends MsgReader implements IElementReader
{   
	public MsgElementReader( IPrompt cp )
	{
		super( cp );
	}
	
    @Override
    public String readFromKeyboard( InputStream is) 
    {
        Scanner theScanner = new Scanner(is);
        itsPrompt.prompt("Enter a token (hit enter): ");
        return theScanner.next();
    }
}