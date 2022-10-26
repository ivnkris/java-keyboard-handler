package com.celestial;

public class FunkyPrompt implements IPrompt
{
	@Override
    public void prompt( String msg )
    {
    	System.out.print( "><" + msg + ">< " );
    }
}
