package com.celestial;

public abstract class MsgReader 
{
	protected IPrompt itsPrompt;
	
	public MsgReader( IPrompt cp )
	{
		itsPrompt = cp;
	}
	
	public void setPrompt( IPrompt cp)
	{
		itsPrompt = cp;
	}
}
