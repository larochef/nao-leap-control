// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALSoundDetectionProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALSoundDetectionProxy(String ip, int port) {
		super("ALSoundDetection", ip, port);
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
    /// DEPRECATED - Get description of events
    /// </summary>
    /// <param name="type"> Name of detector. For now only one detector is available : \"soundDetection/SoundDetector\". </param>
    /// <param name="nameDesc"> Name of the description : 'default' if not defined </param>
    /// <returns> Return description for all detections </returns>

    
    
    
    
    public Variant getDescription( String type,  String nameDesc)
    {
	Variant vtype;
	vtype = new Variant(type);
	Variant vnameDesc;
	vnameDesc = new Variant(nameDesc);
	Variant result = call("getDescription" ,vtype, vnameDesc);
	    	return  result;
    }
    /// <summary>
    /// DEPRECATED - Get index of events detected
    /// </summary>
    /// <param name="type"> Name of detector. For now only one detector is available : \"soundDetection/SoundDetector\". </param>
    /// <returns> Return index of all detections of the current audio buffer </returns>

    
    
    public Variant getEvents( String type)
    {
	Variant vtype;
	vtype = new Variant(type);
	Variant result = call("getEvents" ,vtype);
	    	return  result;
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
    /// Set detection parameters
    /// </summary>
    /// <param name="paraDetect"> Name of the parameter. Please refer to the example below for the available parameters. </param>
    /// <param name="param"> Value of the parameter. </param>

    
    
    
    
    public void setParameter( String paraDetect,  float param)
    {
	Variant vparaDetect;
	vparaDetect = new Variant(paraDetect);
	Variant vparam;
	vparam = new Variant(param);
	Variant result = call("setParameter" ,vparaDetect, vparam);
		// no return value
    }
    /// <summary>
    /// DEPRECATED - Set detection parameters
    /// </summary>
    /// <param name="type"> Name of detector. For now only one detector is available : \"soundDetection/SoundDetector\". </param>
    /// <param name="paraDetect"> Name of the parameter. Please refer to the example below for the available parameters. </param>
    /// <param name="param"> Value of the parameter. </param>

    
    
    
    
    
    
    public void setParameter( String type,  String paraDetect,  float param)
    {
	Variant vtype;
	vtype = new Variant(type);
	Variant vparaDetect;
	vparaDetect = new Variant(paraDetect);
	Variant vparam;
	vparam = new Variant(param);
	Variant result = call("setParameter" ,vtype, vparaDetect, vparam);
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


