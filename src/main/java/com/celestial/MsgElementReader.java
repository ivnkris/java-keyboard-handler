package com.celestial;



import java.io.InputStream;
import java.util.Scanner;



public class MsgElementReader extends ElementReader{
    private Scanner theScanner;
    
    public MsgElementReader(InputStream is) {
        theScanner = new Scanner(is);
    }
    
    @Override
    protected void prompt() {
        System.out.print("Enter a token: ");
    }
    
    @Override
    public String readFromKeyboard() {
        prompt();
        return theScanner.next();
    }
}