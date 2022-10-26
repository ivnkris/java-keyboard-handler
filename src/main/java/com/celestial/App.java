package com.celestial;

import java.util.ArrayList;

/**
* Keyboard Handler
*
*/
public class App
{
    public static void main( String[] args )
    {
        ArrayList<TextBlock> lines;
        
        CustomPrompt cp = new CustomPrompt();
        FunkyPrompt fk = new FunkyPrompt();
        ArrayList<IElementReader> readers = new ArrayList<>(2);
        readers.add(new MsgElementReader(fk));
        readers.add(new MsgLineReader(cp));
        
        Runner rnr = new Runner( readers );
        
        lines = rnr.run();
        
        for (var tb : lines)
        	System.out.println(tb);
        
        lines.forEach(tb -> {
            System.out.println(tb);
        });
    }
}