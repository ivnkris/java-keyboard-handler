package com.celestial;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Runner 
{
	private ArrayList<IElementReader> readers;
	
	public Runner( ArrayList<IElementReader> rr )
	{
		readers = rr;
	}
	
	public ArrayList<TextBlock> run()
	{
        String lineRead = "";
        boolean exitApp = false;
        ArrayList<TextBlock> lines = new ArrayList<>(10);
        int lineNo = 0;
        
		try
        {
            while(!exitApp && lineRead != null)
            {
                for (var reader: readers) {
                    lineRead = reader.readFromKeyboard(System.in);
                    if (lineRead != null) {
                        if (lineRead.equalsIgnoreCase("quit"))
                        {
                            exitApp = true;
                        	break;
                        }
                        TextBlock tb = new TextBlock(++lineNo, lineRead);
                        lines.add(tb);
                    }
                    else
                        break;
                }
            }
        }catch( NoSuchElementException e )
        {}
		return lines;
	}
}
