// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALTextToSpeechProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALTextToSpeechProxy(String ip, int port) {
		super("ALTextToSpeech", ip, port);
	}
    /// <summary>
    /// Disables the notifications puted in ALMemory during the synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
    /// </summary>

    public void disableNotifications()
    {
	Variant result = call("disableNotifications" );
		// no return value
    }
    /// <summary>
    /// Enables the notifications puted in ALMemory during the synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
    /// </summary>

    public void enableNotifications()
    {
	Variant result = call("enableNotifications" );
		// no return value
    }
    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>

    public void exit()
    {
	Variant result = call("exit" );
		// no return value
    }
    /// <summary>
    /// Outputs the languages installed on the system.
    /// </summary>
    /// <returns> Array of std::string that contains the languages installed on the system. </returns>

    public String[] getAvailableLanguages()
    {
	Variant result = call("getAvailableLanguages" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Outputs the available voices. The returned list contains the voice IDs.
    /// </summary>
    /// <returns> Array of std::string containing the voices installed on the system. </returns>

    public String[] getAvailableVoices()
    {
	Variant result = call("getAvailableVoices" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>

    public String getBrokerName()
    {
	Variant result = call("getBrokerName" );
	    	return  result.toString();
    }
    /// <summary>
    /// Returns the language currently used by the text-to-speech engine.
    /// </summary>
    /// <returns> Language of the current voice. </returns>

    public String getLanguage()
    {
	Variant result = call("getLanguage" );
	    	return  result.toString();
    }
    /// <summary>
    /// Returns the encoding that should be used with the specified language.
    /// </summary>
    /// <param name="pLanguage"> Language name (as a std::string). Must belong to the languages available in TTS. </param>
    /// <returns> Encoding of the specified language. </returns>



    public String getLanguageEncoding( String pLanguage)
    {
	Variant vpLanguage;
	vpLanguage = new Variant(pLanguage);
	Variant result = call("getLanguageEncoding" ,vpLanguage);
	    	return  result.toString();
    }
    /// <summary>
    /// Retrieves a method's description.
    /// </summary>
    /// <param name="methodName"> The name of the method. </param>
    /// <returns> A structure containing the method's description. </returns>



    public Variant getMethodHelp( String methodName)
    {
	Variant vmethodName;
	vmethodName = new Variant(methodName);
	Variant result = call("getMethodHelp" ,vmethodName);
	    	return  result;
    }
    /// <summary>
    /// Retrieves the module's method list.
    /// </summary>
    /// <returns> An array of method names. </returns>

    public String[] getMethodList()
    {
	Variant result = call("getMethodList" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Retrieves the module's description.
    /// </summary>
    /// <returns> A structure describing the module. </returns>

    public Variant getModuleHelp()
    {
	Variant result = call("getModuleHelp" );
	    	return  result;
    }
    /// <summary>
    /// Returns the value of one of the voice parameters. The available parameters are: \"pitchShift\", \"doubleVoice\",\"doubleVoiceLevel\" and \"doubleVoiceTimeShift\"
    /// </summary>
    /// <param name="pParameterName"> Name of the parameter. </param>
    /// <returns> Value of the specified parameter </returns>



    public float getParameter( String pParameterName)
    {
	Variant vpParameterName;
	vpParameterName = new Variant(pParameterName);
	Variant result = call("getParameter" ,vpParameterName);
	    	return  result.toFloat();
    }
    /// <summary>
    /// Gets the method usage string. This summarises how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>



    public String getUsage( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getUsage" ,vname);
	    	return  result.toString();
    }
    /// <summary>
    /// Returns the voice currently used by the text-to-speech engine.
    /// </summary>
    /// <returns> Name of the current voice </returns>

    public String getVoice()
    {
	Variant result = call("getVoice" );
	    	return  result.toString();
    }
    /// <summary>
    /// Fetches the current volume the text to speech.
    /// </summary>
    /// <returns> Volume (integer between 0 and 100). </returns>

    public float getVolume()
    {
	Variant result = call("getVolume" );
	    	return  result.toFloat();
    }
    /// <summary>
    /// Returns true if the method is currently running.
    /// </summary>
    /// <param name="id"> The ID of the method that was returned when calling the method using 'post' </param>
    /// <returns> True if the method is currently running </returns>



    public Boolean isRunning( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("isRunning" ,vid);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Loads a set of voice parameters defined in a xml file contained in the preferences folder.The name of the xml file must begin with ALTextToSpeech_Voice_
    /// </summary>
    /// <param name="pPreferenceName"> Name of the voice preference. </param>



    public void loadVoicePreference( String pPreferenceName)
    {
	Variant vpPreferenceName;
	vpPreferenceName = new Variant(pPreferenceName);
	Variant result = call("loadVoicePreference" ,vpPreferenceName);
		// no return value
    }
    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>

    public Boolean ping()
    {
	Variant result = call("ping" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Performs the text-to-speech operations : it takes a std::string as input and outputs a sound in both speakers. It logs an error if the std::string is empty. String encoding must be UTF8.
    /// </summary>
    /// <param name="stringToSay"> Text to say, encoded in UTF-8. </param>



    public void say( String StringToSay)
    {
	Variant vstringToSay;
	vstringToSay = new Variant(StringToSay);
	Variant result = call("say" ,vstringToSay);
		// no return value
    }
    /// <summary>
    /// Performs the text-to-speech operations: it takes a std::string as input and outputs the corresponding audio signal in the specified file.
    /// </summary>
    /// <param name="pStringToSay"> Text to say, encoded in UTF-8. </param>
    /// <param name="pFileName"> RAW file where to store the generated signal. The signal is encoded with a sample rate of 22050Hz, format S16_LE, 2 channels. </param>





    public void sayToFile( String pStringToSay,  String pFileName)
    {
	Variant vpStringToSay;
	vpStringToSay = new Variant(pStringToSay);
	Variant vpFileName;
	vpFileName = new Variant(pFileName);
	Variant result = call("sayToFile" ,vpStringToSay, vpFileName);
		// no return value
    }
    /// <summary>
    /// This method performs the text-to-speech operations: it takes a std::string, outputs the synthesis resulting audio signal in a file, and then plays the audio file. The file is deleted afterwards. It is useful when you want to perform a short synthesis, when few CPU is available. Do not use it if you want a low-latency synthesis or to synthesize a long std::string.
    /// </summary>
    /// <param name="pStringToSay"> Text to say, encoded in UTF-8. </param>



    public void sayToFileAndPlay( String pStringToSay)
    {
	Variant vpStringToSay;
	vpStringToSay = new Variant(pStringToSay);
	Variant result = call("sayToFileAndPlay" ,vpStringToSay);
		// no return value
    }
    /// <summary>
    /// Changes the language used by the Text-to-Speech engine. It automatically changes the voice used since each of them is related to a unique language. If you want that change to take effect automatically after reboot of your robot, refer to the robot web page (setting page).
    /// </summary>
    /// <param name="pLanguage"> Language name. Must belong to the languages available in TTS (can be obtained with the getAvailableLanguages method).  It should be an identifier std::string. </param>



    public void setLanguage( String pLanguage)
    {
	Variant vpLanguage;
	vpLanguage = new Variant(pLanguage);
	Variant result = call("setLanguage" ,vpLanguage);
		// no return value
    }
    /// <summary>
    /// Changes the parameters of the voice. The available parameters are:
    ///
    ///  	 pitchShift: applies a pitch shifting to the voice. The value indicates the ratio between the new fundamental frequencies and the old ones (examples: 2.0: an octave above, 1.5: a quint above). Correct range is (1.0 -- 4), or 0 to disable effect.
    ///
    ///  	 doubleVoice: adds a second voice to the first one. The value indicates the ratio between the second voice fundamental frequency and the first one. Correct range is (1.0 -- 4), or 0 to disable effect
    ///
    ///  	 doubleVoiceLevel: the corresponding value is the level of the double voice (1.0: equal to the main voice one). Correct range is (0 -- 4).
    ///
    ///  	 doubleVoiceTimeShift: the corresponding value is the delay between the double voice and the main one. Correct range is (0 -- 0.5)
    ///
    ///  If the effect value is not available, the effect parameter remains unchanged.
    /// </summary>
    /// <param name="pEffectName"> Name of the parameter. </param>
    /// <param name="pEffectValue"> Value of the parameter. </param>





    public void setParameter( String pEffectName,  float pEffectValue)
    {
	Variant vpEffectName;
	vpEffectName = new Variant(pEffectName);
	Variant vpEffectValue;
	vpEffectValue = new Variant(pEffectValue);
	Variant result = call("setParameter" ,vpEffectName, vpEffectValue);
		// no return value
    }
    /// <summary>
    /// Changes the voice used by the text-to-speech engine. The voice identifier must belong to the installed voices, that can be listed using the 'getAvailableVoices' method. If the voice is not available, it remains unchanged. No exception is thrown in this case. For the time being, only two voices are available by default : Kenny22Enhanced (English voice) and Julie22Enhanced (French voice)
    /// </summary>
    /// <param name="pVoiceID"> The voice (as a std::string). </param>



    public void setVoice( String pVoiceID)
    {
	Variant vpVoiceID;
	vpVoiceID = new Variant(pVoiceID);
	Variant result = call("setVoice" ,vpVoiceID);
		// no return value
    }
    /// <summary>
    /// Sets the volume of text-to-speech output.
    /// </summary>
    /// <param name="volume"> Volume (between 0.0 and 1.0). </param>



    public void setVolume( float volume)
    {
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant result = call("setVolume" ,vvolume);
		// no return value
    }
    /// <summary>
    /// returns true if the method is currently running
    /// </summary>
    /// <param name="id"> the ID of the method to wait for </param>



    public void stop( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("stop" ,vid);
		// no return value
    }
    /// <summary>
    /// This method stops the current and all the pending tasks immediately.
    /// </summary>

    public void stopAll()
    {
	Variant result = call("stopAll" );
		// no return value
    }
    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>

    public String version()
    {
	Variant result = call("version" );
	    	return  result.toString();
    }
    /// <summary>
    /// Wait for the end of a long running method that was called using 'post'
    /// </summary>
    /// <param name="id"> The ID of the method that was returned when calling the method using 'post' </param>
    /// <param name="timeoutPeriod"> The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero. </param>
    /// <returns> True if the timeout period terminated. False if the method returned. </returns>





    public Boolean wait( int id,  int timeoutPeriod)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vtimeoutPeriod;
	vtimeoutPeriod = new Variant(timeoutPeriod);
	Variant result = call("wait" ,vid, vtimeoutPeriod);
	    	return  result.toBoolean();
    }
}


