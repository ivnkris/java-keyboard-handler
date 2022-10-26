package com.celestial;

import java.io.InputStream;

public abstract class ElementReader 
{    
    protected void prompt( String msg )
    {
    	System.out.print( msg );
    }
    
    abstract public String readFromKeyboard( InputStream is );
}