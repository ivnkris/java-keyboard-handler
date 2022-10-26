package com.celestial;

public abstract class MsgReader 
{
	protected CustomPrompt itsPrompt;
	
	public MsgReader( CustomPrompt cp )
	{
		itsPrompt = cp;
	}
	
	public void setPrompt( CustomPrompt cp)
	{
		itsPrompt = cp;
	}
}
