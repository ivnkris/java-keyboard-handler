package com.celestial;

public abstract class MsgReader implements IElementReader
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
