package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgElementReader extends ElementReader
{        
    @Override
    public String readFromKeyboard( InputStream is) 
    {
        Scanner theScanner = new Scanner(is);
        prompt("Enter a token (hit enter): ");
        return theScanner.next();
    }
}