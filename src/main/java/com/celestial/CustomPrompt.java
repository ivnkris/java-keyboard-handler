package com.celestial;

public class CustomPrompt implements IPrompt
{
	@Override
    public void prompt( String msg )
    {
    	System.out.print( "[" + msg + "] " );
    }
}
