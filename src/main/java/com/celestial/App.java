package com.celestial;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
* Keyboard Handler
*
*/
public class App
{
    public static void main( String[] args )
    {
        String lineRead = "";
        boolean exitApp = false;
        ArrayList<TextBlock> lines = new ArrayList<>(10);
        int lineNo = 0;
        
        CustomPrompt cp = new CustomPrompt();
        FunkyPrompt fk = new FunkyPrompt();
        ArrayList<IElementReader> readers = new ArrayList<>(2);
        readers.add(new MsgElementReader(fk));
        readers.add(new MsgLineReader(cp));
        
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
        
        lines.forEach(tb -> {
            System.out.println(tb);
        });
    }
}