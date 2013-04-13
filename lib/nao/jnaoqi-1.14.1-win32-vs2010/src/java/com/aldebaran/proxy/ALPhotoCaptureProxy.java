// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALPhotoCaptureProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALPhotoCaptureProxy(String ip, int port) {
		super("ALPhotoCapture", ip, port);
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
    /// Returns current delay between captures.
    /// </summary>
    /// <returns> Current delay (in ms) between two pictures. </returns>

    public int getCaptureInterval()
    {
	Variant result = call("getCaptureInterval" );
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
    /// Returns current picture format.
    /// </summary>
    /// <returns> Current picture format. </returns>

    public String getPictureFormat()
    {
	Variant result = call("getPictureFormat" );
	    	return  result.toString();
    }
    /// <summary>
    /// Returns current resolution.
    /// </summary>
    /// <returns> Current frame resolution. </returns>

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
    /// Sets delay between two captures.
    /// </summary>
    /// <param name="captureInterval"> New delay (in ms) between two pictures. </param>

    
    
    public void setCaptureInterval( int captureInterval)
    {
	Variant vcaptureInterval;
	vcaptureInterval = new Variant(captureInterval);
	Variant result = call("setCaptureInterval" ,vcaptureInterval);
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
    /// Sets picture extension.
    /// </summary>
    /// <param name="pictureFormat"> New extension used to save pictures. </param>

    
    
    public void setPictureFormat( String pictureFormat)
    {
	Variant vpictureFormat;
	vpictureFormat = new Variant(pictureFormat);
	Variant result = call("setPictureFormat" ,vpictureFormat);
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
    /// Takes one picture.
    /// </summary>
    /// <param name="folderPath"> Folder where the picture is saved. </param>
    /// <param name="fileName"> Filename used to save the picture. </param>
    /// <returns> Full file name of the picture saved on the disk: [filename] </returns>

    
    
    
    
    public Variant takePicture( String folderPath,  String fileName)
    {
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("takePicture" ,vfolderPath, vfileName);
	    	return  result;
    }
    /// <summary>
    /// Takes one picture.
    /// </summary>
    /// <param name="folderPath"> Folder where the picture is saved. </param>
    /// <param name="fileName"> Filename used to save the picture. </param>
    /// <param name="overwrite"> If false and the filename already exists, an error is thrown. </param>
    /// <returns> Full file name of the picture saved on the disk: [filename] </returns>

    
    
    
    
    
    
    public Variant takePicture( String folderPath,  String fileName,  Boolean overwrite)
    {
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant voverwrite;
	voverwrite = new Variant(overwrite);
	Variant result = call("takePicture" ,vfolderPath, vfileName, voverwrite);
	    	return  result;
    }
    /// <summary>
    /// Takes several pictures as quickly as possible
    /// </summary>
    /// <param name="numberOfPictures"> Number of pictures to take </param>
    /// <param name="folderPath"> Folder where the pictures are saved. </param>
    /// <param name="fileName"> Filename used to save the pictures. </param>
    /// <returns> List of all saved files: [[filename1, filename2...]] </returns>

    
    
    
    
    
    
    public Variant takePictures( int numberOfPictures,  String folderPath,  String fileName)
    {
	Variant vnumberOfPictures;
	vnumberOfPictures = new Variant(numberOfPictures);
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("takePictures" ,vnumberOfPictures, vfolderPath, vfileName);
	    	return  result;
    }
    /// <summary>
    /// Takes several pictures as quickly as possible
    /// </summary>
    /// <param name="numberOfPictures"> Number of pictures to take </param>
    /// <param name="folderPath"> Folder where the pictures are saved. </param>
    /// <param name="fileName"> Filename used to save the pictures. </param>
    /// <param name="overwrite"> If false and the filename already exists, an error is thrown. </param>
    /// <returns> List of all saved files: [[filename1, filename2...]] </returns>

    
    
    
    
    
    
    
    
    public Variant takePictures( int numberOfPictures,  String folderPath,  String fileName,  Boolean overwrite)
    {
	Variant vnumberOfPictures;
	vnumberOfPictures = new Variant(numberOfPictures);
	Variant vfolderPath;
	vfolderPath = new Variant(folderPath);
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant voverwrite;
	voverwrite = new Variant(overwrite);
	Variant result = call("takePictures" ,vnumberOfPictures, vfolderPath, vfileName, voverwrite);
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


