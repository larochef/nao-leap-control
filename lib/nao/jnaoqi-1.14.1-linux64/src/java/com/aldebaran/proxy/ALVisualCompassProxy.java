// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALVisualCompassProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALVisualCompassProxy(String ip, int port) {
		super("ALVisualCompass", ip, port);
	}
    /// <summary>
    /// 
    /// </summary>
    /// <param name="refresh"> True if the reference is automatically refreshed at extractor startup; false to use the manually set reference image. </param>

    
    
    public void enableReferenceRefresh( Boolean refresh)
    {
	Variant vrefresh;
	vrefresh = new Variant(refresh);
	Variant result = call("enableReferenceRefresh" ,vrefresh);
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
    /// Gets extractor active camera
    /// </summary>
    /// <returns> Id of the current active camera of the extractor </returns>

    public int getActiveCamera()
    {
	Variant result = call("getActiveCamera" );
	    	return  result.toInt();
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
    /// Returns an ALValue containing the current image used to compute the deviation.
    /// </summary>
    /// <returns> Current image (formatted as the ALValue from getImageRemote of ALVideoDevice) </returns>

    public Variant getCurrentImage()
    {
	Variant result = call("getCurrentImage" );
	    	return  result;
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
    /// Gets extractor framerate
    /// </summary>
    /// <returns> Current value of the framerate of the extractor </returns>

    public int getFrameRate()
    {
	Variant result = call("getFrameRate" );
	    	return  result.toInt();
    }
    /// <summary>
    /// Returns the reliability of the matching and the compass deviation computations.
    /// </summary>
    /// <returns> [0]: Percentage of the matched keypoints that are used to compute the deviation (significant if over 50%) 
    ///
    ///  [1]: Number of keypoints matching. </returns>

    public Variant getMatchingQuality()
    {
	Variant result = call("getMatchingQuality" );
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
    /// Returns an ALValue containing the image used as a reference.
    /// </summary>
    /// <returns> Reference image (formatted as the ALValue from getImageRemote of ALVideoDevice) </returns>

    public Variant getReferenceImage()
    {
	Variant result = call("getReferenceImage" );
	    	return  result;
    }
    /// <summary>
    /// Returns the number of reference keypoints.
    /// </summary>
    /// <returns> Number of reference keypoints. </returns>

    public int getReferenceQuality()
    {
	Variant result = call("getReferenceQuality" );
	    	return  result.toInt();
    }
    /// <summary>
    /// Gets extractor resolution
    /// </summary>
    /// <returns> Current value of the resolution of the extractor </returns>

    public int getResolution()
    {
	Variant result = call("getResolution" );
	    	return  result.toInt();
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
    /// Gets extractor pause status
    /// </summary>
    /// <returns> True if the extractor is paused, False if not </returns>

    public Boolean isPaused()
    {
	Variant result = call("isPaused" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Gets extractor running status
    /// </summary>
    /// <returns> True if the extractor is currently processing images, False if not </returns>

    public Boolean isProcessing()
    {
	Variant result = call("isProcessing" );
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
    /// Changes the pause status of the extractor
    /// </summary>
    /// <param name="paused"> New pause satus </param>

    
    
    public void pause( Boolean paused)
    {
	Variant vpaused;
	vpaused = new Variant(paused);
	Variant result = call("pause" ,vpaused);
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
    /// Sets extractor active camera
    /// </summary>
    /// <param name="cameraId"> Id of the camera that will become the active camera </param>
    /// <returns> True if the update succeeded, False if not </returns>

    
    
    public Boolean setActiveCamera( int cameraId)
    {
	Variant vcameraId;
	vcameraId = new Variant(cameraId);
	Variant result = call("setActiveCamera" ,vcameraId);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Sets extractor framerate
    /// </summary>
    /// <param name="framerate"> New framerate </param>
    /// <returns> True if the update succeeded, False if not </returns>

    
    
    public Boolean setFrameRate( int framerate)
    {
	Variant vframerate;
	vframerate = new Variant(framerate);
	Variant result = call("setFrameRate" ,vframerate);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// DEPRECATED: Sets pause and resolution
    /// </summary>
    /// <param name="paramName"> Name of the parameter to set </param>
    /// <param name="value"> New value </param>

    
    
    
    
    public void setParameter( String paramName,  Variant value)
    {
	Variant vparamName;
	vparamName = new Variant(paramName);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("setParameter" ,vparamName, vvalue);
		// no return value
    }
    /// <summary>
    /// Sets the reference image for the compass.
    /// </summary>
    /// <returns> True if the reference image has been successfully set </returns>

    public Boolean setReferenceImage()
    {
	Variant result = call("setReferenceImage" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Sets extractor resolution
    /// </summary>
    /// <param name="resolution"> New resolution </param>
    /// <returns> True if the update succeeded, False if not </returns>

    
    
    public Boolean setResolution( int resolution)
    {
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant result = call("setResolution" ,vresolution);
	    	return  result.toBoolean();
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


