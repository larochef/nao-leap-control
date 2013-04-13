// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALSpeechRecognitionProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALSpeechRecognitionProxy(String ip, int port) {
		super("ALSpeechRecognition", ip, port);
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
    /// Returns the list of the languages installed on the system.
    /// </summary>
    /// <returns> Array of strings that contains the list of the installed languages. </returns>

    public String[] getAvailableLanguages()
    {
	Variant result = call("getAvailableLanguages" );
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
    /// Gets the current period.
    /// </summary>
    /// <returns> Refresh period (in milliseconds). </returns>

    public int getCurrentPeriod()
    {
	Variant result = call("getCurrentPeriod" );
	    	return  result.toInt();
    }
    /// <summary>
    /// Gets the current precision.
    /// </summary>
    /// <returns> Precision of the extractor. </returns>

    public float getCurrentPrecision()
    {
	Variant result = call("getCurrentPrecision" );
	    	return  result.toFloat();
    }
    /// <summary>
    /// Returns the current language used by the speech recognition system.
    /// </summary>
    /// <returns> Current language used by the speech recognition engine. </returns>

    public String getLanguage()
    {
	Variant result = call("getLanguage" );
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
    /// Gets the period for a specific subscription.
    /// </summary>
    /// <param name="name"> Name of the module which has subscribed. </param>
    /// <returns> Refresh period (in milliseconds). </returns>

    
    
    public int getMyPeriod( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getMyPeriod" ,vname);
	    	return  result.toInt();
    }
    /// <summary>
    /// Gets the precision for a specific subscription.
    /// </summary>
    /// <param name="name"> name of the module which has subscribed </param>
    /// <returns> precision of the extractor </returns>

    
    
    public float getMyPrecision( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getMyPrecision" ,vname);
	    	return  result.toFloat();
    }
    /// <summary>
    /// Get the list of values updated in ALMemory.
    /// </summary>
    /// <returns> Array of values updated by this extractor in ALMemory </returns>

    public String[] getOutputNames()
    {
	Variant result = call("getOutputNames" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets a parameter of the speech recognition engine. Note that when the ASR engine language is set to Chinese, no parameter can be retrieved
    /// </summary>
    /// <param name="paramName"> Name of the parameter. </param>
    /// <returns> Value of the parameter. </returns>

    
    
    public float getParameter( String paramName)
    {
	Variant vparamName;
	vparamName = new Variant(paramName);
	Variant result = call("getParameter" ,vparamName);
	    	return  result.toFloat();
    }
    /// <summary>
    /// This function allows you to get the phonetic transcription(s) used by the speech recognition engine when it is asked to recognize a word. Note that when the ASR engine language is set to Chinese, no phonetic transcription can be retrieved.
    /// </summary>
    /// <param name="word"> Word to phoneticize. </param>
    /// <returns> Phonetic transcription(s) of the word </returns>

    
    
    public String[] getPhoneticTranscription( String word)
    {
	Variant vword;
	vword = new Variant(word);
	Variant result = call("getPhoneticTranscription" ,vword);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets the parameters given by the module.
    /// </summary>
    /// <returns> Array of names and parameters of all subscribers. </returns>

    public Variant getSubscribersInfo()
    {
	Variant result = call("getSubscribersInfo" );
	    	return  result;
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
    /// Loads the vocabulary to recognized contained in a .lxd file. This method is not available with the ASR engine language set to Chinese. For more informations see the red documentation
    /// </summary>
    /// <param name="vocabularyFile"> Name of the lxd file containing the vocabulary </param>

    
    
    public void loadVocabulary( String vocabularyFile)
    {
	Variant vvocabularyFile;
	vvocabularyFile = new Variant(vocabularyFile);
	Variant result = call("loadVocabulary" ,vvocabularyFile);
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
    /// enable/disable the printing of some debug information
    /// </summary>
    /// <param name="nbOfChannels"> Provides the number of channels of the buffer. </param>
    /// <param name="nbOfSamplesByChannel"> Provides the number of samples by channel. </param>
    /// <param name="timestamp"> Provides the timestamp of the buffer. </param>
    /// <param name="buffer"> Provides the audio buffer as an ALValue. </param>

    
    
    
    
    
    
    
    
    public void processRemote( int nbOfChannels,  int nbOfSamplesByChannel,  Variant timestamp,  Variant buffer)
    {
	Variant vnbOfChannels;
	vnbOfChannels = new Variant(nbOfChannels);
	Variant vnbOfSamplesByChannel;
	vnbOfSamplesByChannel = new Variant(nbOfSamplesByChannel);
	Variant vtimestamp;
	vtimestamp = new Variant(timestamp);
	Variant vbuffer;
	vbuffer = new Variant(buffer);
	Variant result = call("processRemote" ,vnbOfChannels, vnbOfSamplesByChannel, vtimestamp, vbuffer);
		// no return value
    }
    /// <summary>
    /// enable/disable the printing of some debug information
    /// </summary>
    /// <param name="nbOfChannels"> Provides the number of channels of the buffer. </param>
    /// <param name="nbOfSamplesByChannel"> Provides the number of samples by channel. </param>
    /// <param name="buffer"> Provides the audio buffer as an ALValue. </param>

    
    
    
    
    
    
    public void processSoundRemote( int nbOfChannels,  int nbOfSamplesByChannel,  Variant buffer)
    {
	Variant vnbOfChannels;
	vnbOfChannels = new Variant(nbOfChannels);
	Variant vnbOfSamplesByChannel;
	vnbOfSamplesByChannel = new Variant(nbOfSamplesByChannel);
	Variant vbuffer;
	vbuffer = new Variant(buffer);
	Variant result = call("processSoundRemote" ,vnbOfChannels, vnbOfSamplesByChannel, vbuffer);
		// no return value
    }
    /// <summary>
    /// Enables or disables the playing of sounds indicating the state of the recognition engine. 
    ///
    /// If this option is enabled, a sound is played at the beginning of the recognition process (after a call to the subscribe method), and a sound is played when the user call the unsubscribe method
    /// </summary>
    /// <param name="setOrNot"> Enable (true) or disable it (false). </param>

    
    
    public void setAudioExpression( Boolean setOrNot)
    {
	Variant vsetOrNot;
	vsetOrNot = new Variant(setOrNot);
	Variant result = call("setAudioExpression" ,vsetOrNot);
		// no return value
    }
    /// <summary>
    /// enable/disable the printing of some debug information
    /// </summary>
    /// <param name="bSetOrUnset"> enable the functionnality when true. </param>

    
    
    public void setDebugMode( Boolean bSetOrUnset)
    {
	Variant vbSetOrUnset;
	vbSetOrUnset = new Variant(bSetOrUnset);
	Variant result = call("setDebugMode" ,vbSetOrUnset);
		// no return value
    }
    /// <summary>
    /// Sets the language used by the speech recognition engine.               The list of the available languages can be collected through the getAvailableLanguages method.               If you want to set a language as the default language (loading automatically at module launch), please refer to the web page of the robot.
    /// </summary>
    /// <param name="languageName"> Name of the language in English. </param>

    
    
    public void setLanguage( String languageName)
    {
	Variant vlanguageName;
	vlanguageName = new Variant(languageName);
	Variant result = call("setLanguage" ,vlanguageName);
		// no return value
    }
    /// <summary>
    /// Sets a parameter of the speech recognition engine. Note that when the ASR engine language is set to Chinese, no parameter can be set.               The parameters that can be set and the corresponding values are:               \"EarUseSpeechDetector\" - Values : 0 (No), 1 (Regular), or 2 (Cepstral) : type of speech detector used by the ASR engine - default value is 2.                \"EarSpeed\" - Values : 0 to 3 - 0 is slowest and most accurate. 3 is the fastest but may add some recognition errors, especially if you talk fast because some parts of the audio data is not processed. - default value is 2.                \"EarUseFilter\" : Values : 0 (no) or 1 (yes) - Applies a High-Pass filter on the input signal - default value is 0.
    /// </summary>
    /// <param name="paramName"> Name of the parameter. </param>
    /// <param name="paramValue"> Value of the parameter. </param>

    
    
    
    
    public void setParameter( String paramName,  float paramValue)
    {
	Variant vparamName;
	vparamName = new Variant(paramName);
	Variant vparamValue;
	vparamValue = new Variant(paramValue);
	Variant result = call("setParameter" ,vparamName, vparamValue);
		// no return value
    }
    /// <summary>
    /// Enables or disables the leds animations showing the state of the recognition engine during the recognition process.
    /// </summary>
    /// <param name="setOrNot"> Enable (true) or disable it (false). </param>

    
    
    public void setVisualExpression( Boolean setOrNot)
    {
	Variant vsetOrNot;
	vsetOrNot = new Variant(setOrNot);
	Variant result = call("setVisualExpression" ,vsetOrNot);
		// no return value
    }
    /// <summary>
    /// Sets the list of words (vocabulary) that should be recognized by the speech recognition engine.
    /// </summary>
    /// <param name="vocabulary"> List of words that should be recognized </param>
    /// <param name="enabledWordSpotting"> If disabled, the engine expects to hear one of the specified words, nothing more, nothing less. If enabled, the specified words can be pronounced in the middle of a whole speech stream, the engine will try to spot them. </param>

    
    
    
    
    public void setVocabulary( String[] vocabulary,  Boolean enabledWordSpotting)
    {
	Variant vvocabulary;
	vvocabulary = new Variant(vocabulary);
	Variant venabledWordSpotting;
	venabledWordSpotting = new Variant(enabledWordSpotting);
	Variant result = call("setVocabulary" ,vvocabulary, venabledWordSpotting);
		// no return value
    }
    /// <summary>
    /// Sets the list of words (vocabulary) that should be recognized by the speech recognition engine.
    /// </summary>
    /// <param name="vocabulary"> List of words that should be recognized </param>

    
    
    public void setWordListAsVocabulary( String[] vocabulary)
    {
	Variant vvocabulary;
	vvocabulary = new Variant(vocabulary);
	Variant result = call("setWordListAsVocabulary" ,vvocabulary);
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
    /// Subscribes to the extractor. This causes the extractor to start writing information to memory using the keys described by getOutputNames(). These can be accessed in memory using ALMemory.getData(\"keyName\"). In many cases you can avoid calling subscribe on the extractor by just calling ALMemory.subscribeToEvent() supplying a callback method. This will automatically subscribe to the extractor for you.
    /// </summary>
    /// <param name="name"> Name of the module which subscribes. </param>
    /// <param name="period"> Refresh period (in milliseconds) if relevant. </param>
    /// <param name="precision"> Precision of the extractor if relevant. </param>

    
    
    
    
    
    
    public void subscribe( String name,  int period,  float precision)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vperiod;
	vperiod = new Variant(period);
	Variant vprecision;
	vprecision = new Variant(precision);
	Variant result = call("subscribe" ,vname, vperiod, vprecision);
		// no return value
    }
    /// <summary>
    /// Subscribes to the extractor. This causes the extractor to start writing information to memory using the keys described by getOutputNames(). These can be accessed in memory using ALMemory.getData(\"keyName\"). In many cases you can avoid calling subscribe on the extractor by just calling ALMemory.subscribeToEvent() supplying a callback method. This will automatically subscribe to the extractor for you.
    /// </summary>
    /// <param name="name"> Name of the module which subscribes. </param>

    
    
    public void subscribe( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("subscribe" ,vname);
		// no return value
    }
    /// <summary>
    /// Unsubscribes from the extractor.
    /// </summary>
    /// <param name="name"> Name of the module which had subscribed. </param>

    
    
    public void unsubscribe( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("unsubscribe" ,vname);
		// no return value
    }
    /// <summary>
    /// Updates the period if relevant.
    /// </summary>
    /// <param name="name"> Name of the module which has subscribed. </param>
    /// <param name="period"> Refresh period (in milliseconds). </param>

    
    
    
    
    public void updatePeriod( String name,  int period)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vperiod;
	vperiod = new Variant(period);
	Variant result = call("updatePeriod" ,vname, vperiod);
		// no return value
    }
    /// <summary>
    /// Updates the precision if relevant.
    /// </summary>
    /// <param name="name"> Name of the module which has subscribed. </param>
    /// <param name="precision"> Precision of the extractor. </param>

    
    
    
    
    public void updatePrecision( String name,  float precision)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vprecision;
	vprecision = new Variant(precision);
	Variant result = call("updatePrecision" ,vname, vprecision);
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


