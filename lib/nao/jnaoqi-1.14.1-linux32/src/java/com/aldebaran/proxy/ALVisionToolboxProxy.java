// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALVisionToolboxProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALVisionToolboxProxy(String ip, int port) {
		super("ALVisionToolbox", ip, port);
	}
    /// <summary>
    /// Indicates if we might be in backlighting conditions.
    /// </summary>
    /// <returns> 0: no backlight - 1: possible backlight - 2 and more: backlight identified </returns>

    public int backlighting()
    {
	Variant result = call("backlighting" );
	    	return  result.toInt();
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
    /// Prepare camera for shooting (like the auto-focus on standard and digital cameras)
    /// </summary>

    public void halfPress()
    {
	Variant result = call("halfPress" );
		// no return value
    }
    /// <summary>
    /// Tell if it is dark around.
    /// </summary>
    /// <returns> [0;4] outdoor - [5;100] indoor bright - [101;127] indoor artificial light - [128;210] indoor weak lights - [211;255] dark place </returns>

    public int isItDark()
    {
	Variant result = call("isItDark" );
	    	return  result.toInt();
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
    /// Are we currently recording a video with startVideoRecord() or startVideoRecord_adv().
    /// </summary>
    /// <returns> True/False </returns>

    public Boolean isVideoRecording()
    {
	Variant result = call("isVideoRecording" );
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
    /// Set white balance by using Nao's white hands as reference.
    /// </summary>
    /// <param name="camera"> Camera we want to set white balance to : [0] top - [1] bottom - [2] both </param>

    
    
    public void setWhiteBalance( int camera)
    {
	Variant vcamera;
	vcamera = new Variant(camera);
	Variant result = call("setWhiteBalance" ,vcamera);
		// no return value
    }
    /// <summary>
    /// Start recording a video. The .avi video is stored on the robot in the \"/home/nao/.local/share/naoqi/vision\" folder. The record should be stopped by calling stopVideoRecord(). Resolution: 320*240, MJPG format, frame rate ~10-15 fps. Please note that only one record at a time can be made.
    /// </summary>
    /// <param name="videoName"> Name of the video file to be recorded. </param>

    
    
    public void startVideoRecord( String videoName)
    {
	Variant vvideoName;
	vvideoName = new Variant(videoName);
	Variant result = call("startVideoRecord" ,vvideoName);
		// no return value
    }
    /// <summary>
    /// Start recording a video, with advanced options. Please note that only one record at a time can be made.
    /// </summary>
    /// <param name="videoName"> Name of the video file to be recorded. </param>
    /// <param name="framerate"> Record frame rate [0.1-50.0]. Warning: MJPG format requires framerate greater than 2.0. </param>
    /// <param name="format"> ARV = raw YUV422 format; IYUV = raw avi, MJPG = compressed avi. </param>
    /// <param name="resIndex"> Resolution index. 0 = 160*120, 1 = 320*240, 2 = 640*480 </param>
    /// <param name="numFrames"> Number of frames to record. If less than 0, it records until stopVideoRecord() is called. </param>

    
    
    
    
    
    
    
    
    
    
    public void startVideoRecord_adv( String videoName,  float framerate,  String format,  int resIndex,  int numFrames)
    {
	Variant vvideoName;
	vvideoName = new Variant(videoName);
	Variant vframerate;
	vframerate = new Variant(framerate);
	Variant vformat;
	vformat = new Variant(format);
	Variant vresIndex;
	vresIndex = new Variant(resIndex);
	Variant vnumFrames;
	vnumFrames = new Variant(numFrames);
	Variant result = call("startVideoRecord_adv" ,vvideoName, vframerate, vformat, vresIndex, vnumFrames);
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
    /// Stop an instance of takePictureRegularly()
    /// </summary>
    /// <param name="pathAndNameRoot"> path and name root of the file we want to stop recording </param>
    /// <param name="imageRecordFormat"> formats of the file we want to stop recording </param>

    
    
    
    
    public void stopTPR( String pathAndNameRoot,  String imageRecordFormat)
    {
	Variant vpathAndNameRoot;
	vpathAndNameRoot = new Variant(pathAndNameRoot);
	Variant vimageRecordFormat;
	vimageRecordFormat = new Variant(imageRecordFormat);
	Variant result = call("stopTPR" ,vpathAndNameRoot, vimageRecordFormat);
		// no return value
    }
    /// <summary>
    /// Stop a video record that was launched with startVideoRecord() or startVideoRecord_adv(). The function returns the number of frames that were recorded, as well as the video absolute file name.
    /// </summary>
    /// <returns> Array of two elements [numRecordedFrames, recordAbsolutePath] </returns>

    public Variant stopVideoRecord()
    {
	Variant result = call("stopVideoRecord" );
	    	return  result;
    }
    /// <summary>
    /// Shoot 3 successives pictures and place them in the \"/home/nao/recordings/cameras/\" folder. If halfPress has not been called before, it will take longer between click and shoot.
    /// </summary>

    public void takePicture()
    {
	Variant result = call("takePicture" );
		// no return value
    }
    /// <summary>
    /// Shoot regularly a picture to follow Nao's evolution in his environment
    /// </summary>
    /// <param name="secondsBetweenTwoShots"> how many seconds between two pictures? </param>
    /// <param name="pathAndNameRoot"> path and the root of the name for the picture </param>
    /// <param name="overwriteImage"> do we need to overwrite the picture, or do we add a timestamp to the name? </param>
    /// <param name="imageRecordFormat"> such as jpeg, bmp, png, etc. </param>
    /// <param name="resolution"> resolution for the image (e.g. kQQVGA, kQVGA) </param>

    
    
    
    
    
    
    
    
    
    
    public void takePictureRegularly( float secondsBetweenTwoShots,  String pathAndNameRoot,  Boolean overwriteImage,  String imageRecordFormat,  int resolution)
    {
	Variant vsecondsBetweenTwoShots;
	vsecondsBetweenTwoShots = new Variant(secondsBetweenTwoShots);
	Variant vpathAndNameRoot;
	vpathAndNameRoot = new Variant(pathAndNameRoot);
	Variant voverwriteImage;
	voverwriteImage = new Variant(overwriteImage);
	Variant vimageRecordFormat;
	vimageRecordFormat = new Variant(imageRecordFormat);
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant result = call("takePictureRegularly" ,vsecondsBetweenTwoShots, vpathAndNameRoot, voverwriteImage, vimageRecordFormat, vresolution);
		// no return value
    }
    /// <summary>
    /// Shoot a specific number of successives pictures and place them in the \"/home/nao/recordings/cameras/\" folder. If halfPress has not been called before, it will take longer between click and shoot.
    /// </summary>
    /// <param name="numberOfPictures"> how many pictures you want to take </param>

    
    
    public void takePictures( int numberOfPictures)
    {
	Variant vnumberOfPictures;
	vnumberOfPictures = new Variant(numberOfPictures);
	Variant result = call("takePictures" ,vnumberOfPictures);
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


