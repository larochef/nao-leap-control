// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALVideoRecorderProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALVideoRecorderProxy(String ip, int port) {
		super("ALVideoRecorder", ip, port);
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
    /// Returns current camera ID.
    /// </summary>
    /// <returns> Current camera ID. </returns>

    public int getCameraID()
    {
	Variant result = call("getCameraID" );
	    	return  result.toInt();
    }
    /// <summary>
    /// Returns current color space.
    /// </summary>
    /// <returns> Current color space. </returns>

    public int getColorSpace()
    {
	Variant result = call("getColorSpace" );
	    	return  result.toInt();
    }
    /// <summary>
    /// Returns current frame rate.
    /// </summary>
    /// <returns> Current frame rate. </returns>

    public int getFrameRate()
    {
	Variant result = call("getFrameRate" );
	    	return  result.toInt();
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
    /// Returns current resolution.
    /// </summary>
    /// <returns> Current resolution. </returns>

    public int getResolution()
    {
	Variant result = call("getResolution" );
	    	return  result.toInt();
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
    /// Returns current video format.
    /// </summary>
    /// <returns> Current video format. </returns>

    public String getVideoFormat()
    {
	Variant result = call("getVideoFormat" );
	    	return  result.toString();
    }
    /// <summary>
    /// Are we currently recording a video
    /// </summary>
    /// <returns> True/False </returns>

    public Boolean isRecording()
    {
	Variant result = call("isRecording" );
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
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>

    public Boolean ping()
    {
	Variant result = call("ping" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Sets camera ID.
    /// </summary>
    /// <param name="cameraID"> ID of the camera to use. </param>

    
    
    public void setCameraID( int cameraID)
    {
	Variant vcameraID;
	vcameraID = new Variant(cameraID);
	Variant result = call("setCameraID" ,vcameraID);
		// no return value
    }
    /// <summary>
    /// Sets color space.
    /// </summary>
    /// <param name="colorSpace"> New color space. </param>

    
    
    public void setColorSpace( int colorSpace)
    {
	Variant vcolorSpace;
	vcolorSpace = new Variant(colorSpace);
	Variant result = call("setColorSpace" ,vcolorSpace);
		// no return value
    }
    /// <summary>
    /// Sets frame rate.
    /// </summary>
    /// <param name="frameRate"> New frame rate. </param>

    
    
    public void setFrameRate( float frameRate)
    {
	Variant vframeRate;
	vframeRate = new Variant(frameRate);
	Variant result = call("setFrameRate" ,vframeRate);
		// no return value
    }
    /// <summary>
    /// Sets resolution.
    /// </summary>
    /// <param name="resolution"> New frame resolution. </param>

    
    
    public void setResolution( int resolution)
    {
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant result = call("setResolution" ,vresolution);
		// no return value
    }
    /// <summary>
    /// Sets video format.
    /// </summary>
    /// <param name="videoFormat"> New video format. </param>

    
    
    public void setVideoFormat( String videoFormat)
    {
	Variant vvideoFormat;
	vvideoFormat = new Variant(videoFormat);
	Variant result = call("setVideoFormat" ,vvideoFormat);
		// no return value
    }
    /// <summary>
    /// Starts recording a video. Please note that only one record at a time can be made.
    /// </summary>
    /// <param name="folderPath"> Folder where the video is saved. </param>
    /// <param name="fileName"> Filename used to save the video. </param>

    
    
    
    
    public void startRecording( String folderPath,  String fileName)
    {
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("startRecording" ,vfolderPath, vfileName);
		// no return value
    }
    /// <summary>
    /// Starts recording a video. Please note that only one record at a time can be made.
    /// </summary>
    /// <param name="folderPath"> Folder where the video is saved. </param>
    /// <param name="fileName"> Filename used to save the video. </param>
    /// <param name="overwrite"> If false and the filename already exists, an error is thrown. </param>

    
    
    
    
    
    
    public void startRecording( String folderPath,  String fileName,  Boolean overwrite)
    {
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant voverwrite;
	voverwrite = new Variant(overwrite);
	Variant result = call("startRecording" ,vfolderPath, vfileName, voverwrite);
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
    /// Stops a video record that was launched with startRecording(). The function returns the number of frames that were recorded, as well as the video absolute file name.
    /// </summary>
    /// <returns> Array of two elements [numRecordedFrames, recordAbsolutePath] </returns>

    public Variant stopRecording()
    {
	Variant result = call("stopRecording" );
	    	return  result;
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


