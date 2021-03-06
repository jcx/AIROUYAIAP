package com.gaslightgames.android.airouyaiapane.extensions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

public class AIROUYAIAPANESupported implements FREFunction
{

	@Override
	public FREObject call( FREContext context, FREObject[] passedArgs )
	{
		FREObject result = null;
		
		try
		{
			result = FREObject.newObject( true );
		}
		catch( FREWrongThreadException threadException )
		{
			threadException.printStackTrace();
		}
		
		return result;
	}

}
