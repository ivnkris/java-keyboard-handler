package com.celestial;



import java.io.InputStream;
import java.util.Scanner;



public class MsgLineReader extends ElementReader{
    private Scanner theScanner;
    
    public MsgLineReader(InputStream is) {
        theScanner = new Scanner(is);
    }
    
    @Override
    protected void prompt()
    {
        System.out.print("Enter a line of text: ");
    }
    
    @Override
    public String readFromKeyboard() {
        prompt();
        return theScanner.nextLine();
    }
}