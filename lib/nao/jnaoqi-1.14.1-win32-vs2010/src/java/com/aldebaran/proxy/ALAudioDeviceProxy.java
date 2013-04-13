// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALAudioDeviceProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALAudioDeviceProxy(String ip, int port) {
		super("ALAudioDevice", ip, port);
	}
    /// <summary>
    /// Closes the audio device for capture. You can call this method if you want to have access to the alsa input buffers in another program than naoqi while naoqi is running (with arecord for example)
    /// </summary>

    public void closeAudioInputs()
    {
	Variant result = call("closeAudioInputs" );
		// no return value
    }
    /// <summary>
    /// Closes the audio device for playback. close the audio device for capture. You can call this method if you want to send sound to alsa in another program than naoqi while naoqi is running (with aplay for example)
    /// </summary>

    public void closeAudioOutputs()
    {
	Variant result = call("closeAudioOutputs" );
		// no return value
    }
    /// <summary>
    /// Disables the computation of the energy of each microphone signal
    /// </summary>

    public void disableEnergyComputation()
    {
	Variant result = call("disableEnergyComputation" );
		// no return value
    }
    /// <summary>
    /// Enables the computation of the energy of each microphone signal
    /// </summary>

    public void enableEnergyComputation()
    {
	Variant result = call("enableEnergyComputation" );
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
    /// Flush the audio device for playback. close the audio device for capture. You can call this method if you want to send sound to alsa in another program than naoqi while naoqi is running (with aplay for example)
    /// </summary>

    public void flushAudioOutputs()
    {
	Variant result = call("flushAudioOutputs" );
		// no return value
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
    /// Returns the energy of the front microphone signal
    /// </summary>
    /// <returns> energy of the front microphone signal </returns>

    public float getFrontMicEnergy()
    {
	Variant result = call("getFrontMicEnergy" );
	    	return  result.toFloat();
    }
    /// <summary>
    /// Returns the energy of the left microphone signal
    /// </summary>
    /// <returns> energy of the left microphone signal </returns>

    public float getLeftMicEnergy()
    {
	Variant result = call("getLeftMicEnergy" );
	    	return  result.toFloat();
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
    /// Gets the output sound level of the system.
    /// </summary>
    /// <returns> outputVolume of the system </returns>

    public int getOutputVolume()
    {
	Variant result = call("getOutputVolume" );
	    	return  result.toInt();
    }
    /// <summary>
    /// This method returns the specified internal parameter ('outputSampleRate' or 'inputBufferSize'). The value -1 is returned if the specified parameter is not valid.
    /// </summary>
    /// <param name="pParamName"> Name of the parameter to get ('outputSampleRate' or 'inputBufferSize'). </param>
    /// <returns> value of the specified parameter </returns>

    
    
    public int getParameter( String pParamName)
    {
	Variant vpParamName;
	vpParamName = new Variant(pParamName);
	Variant result = call("getParameter" ,vpParamName);
	    	return  result.toInt();
    }
    /// <summary>
    /// Returns the energy of the rear microphone signal
    /// </summary>
    /// <returns> energy of the rear microphone signal </returns>

    public float getRearMicEnergy()
    {
	Variant result = call("getRearMicEnergy" );
	    	return  result.toFloat();
    }
    /// <summary>
    /// Returns the energy of the right microphone signal
    /// </summary>
    /// <returns> energy of the right microphone signal </returns>

    public float getRightMicEnergy()
    {
	Variant result = call("getRightMicEnergy" );
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
    /// check if loudspeakers are muted
    /// </summary>
    /// <returns> 1 if true / 0 otherwise </returns>

    public Boolean isAudioOutMuted()
    {
	Variant result = call("isAudioOutMuted" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Allows to know if audio inputs are closed or not
    /// </summary>
    /// <returns> True if audio inputs are closed / False otherwise </returns>

    public Boolean isInputClosed()
    {
	Variant result = call("isInputClosed" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Allows to know if audio ouputs are closed or not
    /// </summary>
    /// <returns> True if audio outputs are closed / False otherwise </returns>

    public Boolean isOutputClosed()
    {
	Variant result = call("isOutputClosed" );
	    	return  result.toBoolean();
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
    /// mute the loudspeakers
    /// </summary>
    /// <param name="arg1"> arg </param>

    
    
    public void muteAudioOut( Boolean arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("muteAudioOut" ,varg1);
		// no return value
    }
    /// <summary>
    /// Opens the audio device for capture. If you closed the audio inputs with the closeAudioInputs method, you must call this method to be able to access to the sound data of the nao's microphones.
    /// </summary>

    public void openAudioInputs()
    {
	Variant result = call("openAudioInputs" );
		// no return value
    }
    /// <summary>
    /// Opens the audio device for playback. If you closed the audio outputs with the closeAudioOutputs method, you must call this method to ear or send sound onto the nao's loudspeakers.
    /// </summary>

    public void openAudioOutputs()
    {
	Variant result = call("openAudioOutputs" );
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
    /// Play a sine wave which specified caracteristics.
    /// </summary>
    /// <param name="frequence"> Frequence in Hertz </param>
    /// <param name="gain"> Volume Gain between 0 and 100 </param>
    /// <param name="pan"> Stereo Pan set to either {-1,0,+1} </param>
    /// <param name="duration"> Duration of the sine wave in seconds </param>

    
    
    
    
    
    
    
    
    public void playSine( int frequence,  int gain,  int pan,  float duration)
    {
	Variant vfrequence;
	vfrequence = new Variant(frequence);
	Variant vgain;
	vgain = new Variant(gain);
	Variant vpan;
	vpan = new Variant(pan);
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("playSine" ,vfrequence, vgain, vpan, vduration);
		// no return value
    }
    /// <summary>
    /// reset ALSA driver. Use this method only when no audio module is subscribed to ALAudioDevice
    /// </summary>

    public void resetAudio()
    {
	Variant result = call("resetAudio" );
		// no return value
    }
    /// <summary>
    /// This function allows a local module to send sound onto the nao's loudpseakers
    ///
    /// You must pass to this function a pointer to the stereo buffer to send, and the number of frames per channel. The buffer must contain 16bits stereo interleaved samples, and the number of frames does not exceed 16384
    /// </summary>
    /// <param name="nbOfFrames"> Number of 16 bits samples per channel to send. </param>
    /// <param name="pBuffer"> Buffer to send </param>
    /// <returns> True if the operation is successfull - False otherwise </returns>

    
    
    
    
    public Boolean sendLocalBufferToOutput( int nbOfFrames,  int pBuffer)
    {
	Variant vnbOfFrames;
	vnbOfFrames = new Variant(nbOfFrames);
	Variant vpBuffer;
	vpBuffer = new Variant(pBuffer);
	Variant result = call("sendLocalBufferToOutput" ,vnbOfFrames, vpBuffer);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// This function allows a remote module to send sound onto the nao's loudpseakers
    ///
    /// You must pass to this function the stereo buffer you want to send as an ALValue converted to binary, and the number of frames per channel. The number of frames does not exceed 16384. For more information please see the red documentation
    /// </summary>
    /// <param name="nbOfFrames"> Number of 16 bits samples per channel to send. </param>
    /// <param name="pBuffer"> Buffer to send </param>
    /// <returns> True if the operation is successfull - False otherwise </returns>

    
    
    
    
    public Boolean sendRemoteBufferToOutput( int nbOfFrames,  Variant pBuffer)
    {
	Variant vnbOfFrames;
	vnbOfFrames = new Variant(nbOfFrames);
	Variant vpBuffer;
	vpBuffer = new Variant(pBuffer);
	Variant result = call("sendRemoteBufferToOutput" ,vnbOfFrames, vpBuffer);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Set AudioDevice Client preferences
    /// </summary>
    /// <param name="name"> name of the client </param>
    /// <param name="sampleRate"> sample rate of the microphones data sent to the process function - must be 16000 or 48000 </param>
    /// <param name="channelsConfiguration"> An int (defined in ALSoundExtractor) indicating which microphones data will be send to the process function. ALLCHANNELS, LEFTCHANNEL, RIGHTCHANNEL, FRONTCHANNEL, REARCHANNEL are the configuration currently supported. </param>
    /// <param name="deinterleaved"> indicates if the microphones data sent to the process function are interleaved or not - 0 : interleaved - 1 : deinterleaved </param>

    
    
    
    
    
    
    
    
    public void setClientPreferences( String name,  int sampleRate,  int channelsConfiguration,  int deinterleaved)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vsampleRate;
	vsampleRate = new Variant(sampleRate);
	Variant vchannelsConfiguration;
	vchannelsConfiguration = new Variant(channelsConfiguration);
	Variant vdeinterleaved;
	vdeinterleaved = new Variant(deinterleaved);
	Variant result = call("setClientPreferences" ,vname, vsampleRate, vchannelsConfiguration, vdeinterleaved);
		// no return value
    }
    /// <summary>
    /// Set AudioDevice Client preferences. This function is deprecated, the use of the alternate 4 arguments setClientPreferences() is now prefered.
    /// </summary>
    /// <param name="name"> name of the client </param>
    /// <param name="sampleRate"> sample rate of the microphones data sent to the processSound or processSoundRemote functions - must be 16000 or 48000 </param>
    /// <param name="channelsVector"> ALValue containing a vector of int indicating which microphones data will be send to the processSound or processSoundRemote functions </param>
    /// <param name="deinterleaved"> indicates if the microphones data sent to the processSound or processSoundRemote functions are interleaved or not - 0 : interleaved - 1 : deinterleaved </param>
    /// <param name="timeStamp"> parameter indicating if audio timestamps are sent to the processSound or processSoundRemote functions - 0 : no - 1 : yes </param>

    
    
    
    
    
    
    
    
    
    
    public void setClientPreferences( String name,  int sampleRate,  Variant channelsVector,  int deinterleaved,  int timeStamp)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vsampleRate;
	vsampleRate = new Variant(sampleRate);
	Variant vchannelsVector;
	vchannelsVector = new Variant(channelsVector);
	Variant vdeinterleaved;
	vdeinterleaved = new Variant(deinterleaved);
	Variant vtimeStamp;
	vtimeStamp = new Variant(timeStamp);
	Variant result = call("setClientPreferences" ,vname, vsampleRate, vchannelsVector, vdeinterleaved, vtimeStamp);
		// no return value
    }
    /// <summary>
    /// This method allows to send sound samples contained in a sound file at the input of ALAudioDevice, instead of the nao's microphones sound data. The sound file must be a .wav file containing 16bits / 4 channels / interleaved samples. Once the file has been read, microphones sound data will again taken as input
    /// </summary>
    /// <param name="pFileName"> Name of the input file. </param>

    
    
    public void setFileAsInput( String pFileName)
    {
	Variant vpFileName;
	vpFileName = new Variant(pFileName);
	Variant result = call("setFileAsInput" ,vpFileName);
		// no return value
    }
    /// <summary>
    /// Sets the output sound level of the system.
    /// </summary>
    /// <param name="volume"> Volume [0-100]. </param>

    
    
    public void setOutputVolume( int volume)
    {
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant result = call("setOutputVolume" ,vvolume);
		// no return value
    }
    /// <summary>
    /// This method sets the specified internal parameter ('outputSampleRate' or 'inputBufferSize')
    ///
    /// inputBufferSize can bet set to 8192 or 16384. Warning: when speech recognition is running, a buffer size of 8192 is used. Don't change it during the recognition process.
    ///
    /// outputSampleRate can bet set to 16000 Hz, 22050 Hz, 44100 Hz or 48000 Hz. Warning: if speech synthesis is running, a sample rate of 16000 Hz or 22050 Hz is used (depending of the language). Don't change it during the synthesis process
    /// </summary>
    /// <param name="pParamName"> Name of the parameter to set ('outputSampleRate' or 'inputBufferSize'). </param>
    /// <param name="pParamValue"> The value to which the specified parameter should be set. </param>

    
    
    
    
    public void setParameter( String pParamName,  int pParamValue)
    {
	Variant vpParamName;
	vpParamName = new Variant(pParamName);
	Variant vpParamValue;
	vpParamValue = new Variant(pParamValue);
	Variant result = call("setParameter" ,vpParamName, vpParamValue);
		// no return value
    }
    /// <summary>
    /// This method allows to record the signal collected on the nao's microphones. You can choose to record only the front microphone in a ogg file, or the 4 microphones in a wav file. In this last case the format of the file is 4 channels, 16 bits little endian, 48 KHz
    /// </summary>
    /// <param name="pFileName"> Name of the file where to record the sound. </param>

    
    
    public void startMicrophonesRecording( String pFileName)
    {
	Variant vpFileName;
	vpFileName = new Variant(pFileName);
	Variant result = call("startMicrophonesRecording" ,vpFileName);
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
    /// This method calls a procedure to stop and clear the audio output buffers.
    /// </summary>

    public void stopAudioOut()
    {
	Variant result = call("stopAudioOut" );
		// no return value
    }
    /// <summary>
    /// This method stops the recording of the sound collected by the microphones.
    /// </summary>

    public void stopMicrophonesRecording()
    {
	Variant result = call("stopMicrophonesRecording" );
		// no return value
    }
    /// <summary>
    /// This function allows a module to subscribe to the ALAudioDevice module.For more informations see the audio part of the red documentation
    /// </summary>
    /// <param name="pModule"> Name of the module </param>

    
    
    public void subscribe( String pModule)
    {
	Variant vpModule;
	vpModule = new Variant(pModule);
	Variant result = call("subscribe" ,vpModule);
		// no return value
    }
    /// <summary>
    /// This function allows a remote module to subscribe to the ALAudioDevice module.
    ///
    /// Once your remote module is subscribed, the function 'processSoundRemote' of your module (you need to declare one) will be automatically and regularly called with raw data from microphones as inputs.
    ///
    /// This function must be declared as follow : processSoundRemote( const int &#38; pNbOfInputChannels, const int &#38; pNbrSamples, const ALValue &#38; pDataInterleaved).
    ///
    /// When she will be called, the received pDataInterleaved buffer will contain pNbrSamples 16 bits interleaved samples, ordered as follows : s1m1,s1m2,s1m3,s1m4,s2m1,s2m2, ... where simj is the sample number i of microphone j.
    ///
    /// The indices of microphones are the followings : 1 : left microphone / 2 : right microphone / 3 : front microphone / 4 : rear microphone.
    ///
    /// For more informations see the audio part of the red documentation
    /// </summary>
    /// <param name="pModule"> Name of the remote module </param>
    /// <returns> True if module has subscribed successfully - False otherwise </returns>

    
    
    public Boolean subscribeRemoteModule( String pModule)
    {
	Variant vpModule;
	vpModule = new Variant(pModule);
	Variant result = call("subscribeRemoteModule" ,vpModule);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// This function unsubscribes a remote module (identified by its name) from the ALAudioDevice module
    /// </summary>
    /// <param name="pModule"> Name of the remote module to unsuscribe from ALAudioDevice </param>
    /// <returns> True if module has been unsubscribed successfully - False otherwise </returns>

    
    
    public Boolean unSubscribeRemoteModule( String pModule)
    {
	Variant vpModule;
	vpModule = new Variant(pModule);
	Variant result = call("unSubscribeRemoteModule" ,vpModule);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// This function allows a module to subscribe to the ALAudioDevice module.For more informations see the audio part of the red documentation
    /// </summary>
    /// <param name="pModule"> Name of the module </param>

    
    
    public void unsubscribe( String pModule)
    {
	Variant vpModule;
	vpModule = new Variant(pModule);
	Variant result = call("unsubscribe" ,vpModule);
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


