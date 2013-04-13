// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALVideoDeviceProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALVideoDeviceProxy(String ip, int port) {
		super("ALVideoDevice", ip, port);
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
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public int getActiveCamera( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getActiveCamera" ,vname);
	    	return  result.toInt();
    }
    /// <summary>
    /// Tells if top camera is active
    /// </summary>
    /// <returns> 0: top camera - 1: bottom camera </returns>

    public int getActiveCamera()
    {
	Variant result = call("getActiveCamera" );
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public Variant getActiveCameras( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getActiveCameras" ,vname);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public float[] getAngPosFromImgPos( float[] arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getAngPosFromImgPos" ,varg1);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public float[] getAngSizeFromImgSize( float[] arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getAngSizeFromImgSize" ,varg1);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getAngularPositionFromImagePosition( int arg1,  float[] arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getAngularPositionFromImagePosition" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getAngularSizeFromImageSize( int arg1,  float[] arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getAngularSizeFromImageSize" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
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
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns> 1(kOV7670): VGA camera - 2(kMT9M114): HD camera </returns>

    
    
    public int getCameraModel( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("getCameraModel" ,vcameraIndex);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <returns>  </returns>

    public int getCameraModelID()
    {
	Variant result = call("getCameraModelID" );
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public int getCameraParameter( String name,  int parameterId)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant result = call("getCameraParameter" ,vname, vparameterId);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Variant getCamerasParameter( String name,  int parameterId)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant result = call("getCamerasParameter" ,vname, vparameterId);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public int getColorSpace( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("getColorSpace" ,vcameraIndex);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public int getColorSpace( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getColorSpace" ,vname);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public Variant getColorSpaces( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getColorSpaces" ,vname);
	    	return  result;
    }
    /// <summary>
    /// Retrieves the latest image from the video source and returns a pointer to the locked ALImage, with data array pointing directly to raw data. There is no format conversion and no copy of the raw buffer.
    ///
    /// Warning: When image is not necessary anymore, a call to releaseDirectRawImage() is requested.
    ///
    /// Warning: When using this mode for several vision module, if they need raw data for more than 25ms check that you have strictly less modules in this mode than the amount of kernel buffers!!
    ///
    /// Warning: Release all kernel buffers before any action requesting a modification in camera running mode (e.g. resolution, switch between cameras).
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Pointer to the locked image buffer, NULL if error.
    ///
    /// Warning, image pointer is valid only for C++ dynamic library. </returns>

    
    
    public void  getDirectRawImageLocal( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getDirectRawImageLocal" ,vname);
    }
    /// <summary>
    /// Fills an ALValue with data coming directly from raw buffer (no format conversion).
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array containing image informations : 
    ///
    ///     [0] : width;
    ///
    ///     [1] : height;
    ///
    ///     [2] : number of layers;
    ///
    ///     [3] : ColorSpace;
    ///
    ///     [4] : time stamp (highest 32 bits);
    ///
    ///     [5] : time stamp (lowest 32 bits);
    ///
    ///     [6] : array of size height * width * nblayers containing image data;
    ///
    ///     [7] : cameraID;
    ///
    ///     [8] : left angle;
    ///
    ///     [9] : top angle;
    ///
    ///     [10] : right angle;
    ///
    ///     [11] : bottom angle; </returns>

    
    
    public Variant getDirectRawImageRemote( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getDirectRawImageRemote" ,vname);
	    	return  result;
    }
    /// <summary>
    /// Retrieves the latest image from the video source and returns a pointer to the locked ALImage, with data array pointing directly to raw data. There is no format conversion and no copy of the raw buffer.
    ///
    /// Warning: When image is not necessary anymore, a call to releaseDirectRawImage() is requested.
    ///
    /// Warning: When using this mode for several vision module, if they need raw data for more than 25ms check that you have strictly less modules in this mode than the amount of kernel buffers!!
    ///
    /// Warning: Release all kernel buffers before any action requesting a modification in camera running mode (e.g. resolution, switch between cameras).
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array of pointer to the locked image buffer, NULL if error.
    ///
    /// Warning, image pointer is valid only for C++ dynamic library. </returns>

    
    
    public Variant getDirectRawImagesLocal( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getDirectRawImagesLocal" ,vname);
	    	return  result;
    }
    /// <summary>
    /// Fills an ALValue with data coming directly from raw buffer (no format conversion).
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array containing image informations : 
    ///
    ///     [0] : width;
    ///
    ///     [1] : height;
    ///
    ///     [2] : number of layers;
    ///
    ///     [3] : ColorSpace;
    ///
    ///     [4] : time stamp (highest 32 bits);
    ///
    ///     [5] : time stamp (lowest 32 bits);
    ///
    ///     [6] : array of size height * width * nblayers containing image data;
    ///
    ///     [7] : cameraID;
    ///
    ///     [8] : left angle;
    ///
    ///     [9] : top angle;
    ///
    ///     [10] : right angle;
    ///
    ///     [11] : bottom angle; </returns>

    
    
    public Variant getDirectRawImagesRemote( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getDirectRawImagesRemote" ,vname);
	    	return  result;
    }
    /// <summary>
    /// called by the simulator to know expected image parameters
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns> ALValue of expected parameters, [int resolution, int framerate] </returns>

    
    
    public Variant getExpectedImageParameters( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("getExpectedImageParameters" ,vcameraIndex);
	    	return  result;
    }
    /// <summary>
    /// called by the simulator to know expected image parameters
    /// </summary>
    /// <returns> ALValue of expected parameters, [int resolution, int framerate] </returns>

    public Variant getExpectedImageParameters()
    {
	Variant result = call("getExpectedImageParameters" );
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public int getFrameRate( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("getFrameRate" ,vcameraIndex);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public int getFrameRate( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getFrameRate" ,vname);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public int getGVMColorSpace( String arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getGVMColorSpace" ,varg1);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public int getGVMFrameRate( String arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getGVMFrameRate" ,varg1);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public int getGVMResolution( String arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getGVMResolution" ,varg1);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getImageInfoFromAngularInfo( int arg1,  float[] arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getImageInfoFromAngularInfo" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <param name="arg3"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    public float[] getImageInfoFromAngularInfoWithResolution( int arg1,  float[] arg2,  int arg3)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant varg3;
	varg3 = new Variant(arg3);
	Variant result = call("getImageInfoFromAngularInfoWithResolution" ,varg1, varg2, varg3);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// Applies transformations to the last image from video source and returns a pointer to a locked ALImage.
    ///
    /// When image is not necessary anymore, a call to releaseImage() is requested.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Pointer of the locked image buffer, NULL if error.Warning, image pointer is valid only for C++ dynamic library. </returns>

    
    
    public void  getImageLocal( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getImageLocal" ,vname);
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getImagePositionFromAngularPosition( int arg1,  float[] arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getImagePositionFromAngularPosition" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// Applies transformations to the last image from video source and fills pFrameOut.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array containing image informations : 
    ///
    ///     [0] : width;
    ///
    ///     [1] : height;
    ///
    ///     [2] : number of layers;
    ///
    ///     [3] : ColorSpace;
    ///
    ///     [4] : time stamp (highest 32 bits);
    ///
    ///     [5] : time stamp (lowest 32 bits);
    ///
    ///     [6] : array of size height * width * nblayers containing image data;
    ///
    ///     [7] : cameraID;
    ///
    ///     [8] : left angle;
    ///
    ///     [9] : top angle;
    ///
    ///     [10] : right angle;
    ///
    ///     [11] : bottom angle; </returns>

    
    
    public Variant getImageRemote( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getImageRemote" ,vname);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getImageSizeFromAngularSize( int arg1,  float[] arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getImageSizeFromAngularSize" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// Applies transformations to the last image from video source and returns a pointer to a locked ALImage.
    ///
    /// When image is not necessary anymore, a call to releaseImage() is requested.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array of pointer of the locked image buffer, NULL if error.Warning, image pointer is valid only for C++ dynamic library. </returns>

    
    
    public Variant getImagesLocal( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getImagesLocal" ,vname);
	    	return  result;
    }
    /// <summary>
    /// Applies transformations to the last image from video source and fills pFrameOut.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> Array containing image informations : 
    ///
    ///     [0] : width;
    ///
    ///     [1] : height;
    ///
    ///     [2] : number of layers;
    ///
    ///     [3] : ColorSpace;
    ///
    ///     [4] : time stamp (highest 32 bits);
    ///
    ///     [5] : time stamp (lowest 32 bits);
    ///
    ///     [6] : array of size height * width * nblayers containing image data;
    ///
    ///     [7] : cameraID;
    ///
    ///     [8] : left angle;
    ///
    ///     [9] : top angle;
    ///
    ///     [10] : right angle;
    ///
    ///     [11] : bottom angle; </returns>

    
    
    public Variant getImagesRemote( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getImagesRemote" ,vname);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public float[] getImgInfoFromAngInfo( float[] arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getImgInfoFromAngInfo" ,varg1);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public float[] getImgInfoFromAngInfoWithRes( float[] arg1,  int arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("getImgInfoFromAngInfoWithRes" ,varg1, varg2);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public float[] getImgPosFromAngPos( float[] arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getImgPosFromAngPos" ,varg1);
	    	return (float[]) result.toFloatArray();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public float[] getImgSizeFromAngSize( float[] arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("getImgSizeFromAngSize" ,varg1);
	    	return (float[]) result.toFloatArray();
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
    /// 
    /// </summary>
    /// <param name="pParam"> Camera parameter requested. </param>
    /// <param name="pCameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public int getParam( int pParam,  int pCameraIndex)
    {
	Variant vpParam;
	vpParam = new Variant(pParam);
	Variant vpCameraIndex;
	vpCameraIndex = new Variant(pCameraIndex);
	Variant result = call("getParam" ,vpParam, vpCameraIndex);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="pParam"> Camera parameter requested. </param>
    /// <returns>  </returns>

    
    
    public int getParam( int pParam)
    {
	Variant vpParam;
	vpParam = new Variant(pParam);
	Variant result = call("getParam" ,vpParam);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public int getResolution( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("getResolution" ,vcameraIndex);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public int getResolution( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getResolution" ,vname);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns>  </returns>

    
    
    public Variant getResolutions( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getResolutions" ,vname);
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
    /// 
    /// </summary>
    /// <returns>  </returns>

    public int getVIMColorSpace()
    {
	Variant result = call("getVIMColorSpace" );
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <returns>  </returns>

    public int getVIMFrameRate()
    {
	Variant result = call("getVIMFrameRate" );
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <returns>  </returns>

    public int getVIMResolution()
    {
	Variant result = call("getVIMResolution" );
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public Boolean isFrameGrabberOff( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("isFrameGrabberOff" ,vcameraIndex);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Advanced method that asks if the framegrabber is off.
    /// </summary>
    /// <returns> true if off </returns>

    public int isFrameGrabberOff()
    {
	Variant result = call("isFrameGrabberOff" );
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
    /// Callback when client is disconnected
    /// </summary>
    /// <param name="eventName"> The echoed event name </param>
    /// <param name="eventContents"> The name of the client that has disconnected </param>
    /// <param name="message"> The message give when subscribing. </param>

    
    
    
    
    
    
    public void onClientDisconnected( String eventName,  Variant eventContents,  String message)
    {
	Variant veventName;
	veventName = new Variant(eventName);
	Variant veventContents;
	veventContents = new Variant(eventContents);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("onClientDisconnected" ,veventName, veventContents, vmessage);
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
    /// Allow image buffer pushing
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <param name="width"> int width of image among 1280*960, 640*480, 320*240, 240*160 </param>
    /// <param name="height"> int height of image </param>
    /// <param name="imageBuffer"> Image buffer in bitmap form </param>
    /// <returns> true if the put succeeded </returns>

    
    
    
    
    
    
    
    
    public Boolean putImage( int cameraIndex,  int width,  int height,  Variant imageBuffer)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant vwidth;
	vwidth = new Variant(width);
	Variant vheight;
	vheight = new Variant(height);
	Variant vimageBuffer;
	vimageBuffer = new Variant(imageBuffer);
	Variant result = call("putImage" ,vcameraIndex, vwidth, vheight, vimageBuffer);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Allow image buffer pushing
    /// </summary>
    /// <param name="imageBuffer"> Image buffer in bitmap form </param>
    /// <returns> true if the put succeeded </returns>

    
    
    public Boolean putImage( Variant imageBuffer)
    {
	Variant vimageBuffer;
	vimageBuffer = new Variant(imageBuffer);
	Variant result = call("putImage" ,vimageBuffer);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Background record of an .arv raw format video from the images processed by a vision module
    ///
    /// Actualy it take picture each time the vision module call getDirectRawImageRemote().
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from the V.I.M. </param>
    /// <param name="path"> path/name of the video to be recorded </param>
    /// <param name="totalNumber"> number of images to be recorded. 0xFFFFFFFF for \"unlimited\" </param>
    /// <param name="period"> one image recorded every pPeriod images </param>
    /// <returns> true if success </returns>

    
    
    
    
    
    
    
    
    public Boolean recordVideo( String id,  String path,  int totalNumber,  int period)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vpath;
	vpath = new Variant(path);
	Variant vtotalNumber;
	vtotalNumber = new Variant(totalNumber);
	Variant vperiod;
	vperiod = new Variant(period);
	Variant result = call("recordVideo" ,vid, vpath, vtotalNumber, vperiod);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Release image buffer locked by getDirectRawImageLocal().
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> true if success </returns>

    
    
    public Boolean releaseDirectRawImage( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("releaseDirectRawImage" ,vname);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Release image buffer locked by getDirectRawImagesLocal().
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> true if success </returns>

    
    
    public Variant releaseDirectRawImages( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("releaseDirectRawImages" ,vname);
	    	return  result;
    }
    /// <summary>
    /// Release image buffer locked by getImageLocal().
    ///
    /// If G.V.M. had no locked image buffer, does nothing.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> true if success </returns>

    
    
    public Boolean releaseImage( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("releaseImage" ,vname);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Release image buffer locked by getImageLocal().
    ///
    /// If G.V.M. had no locked image buffer, does nothing.
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <returns> true if success </returns>

    
    
    public Variant releaseImages( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("releaseImages" ,vname);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns>  </returns>

    
    
    public Variant resolutionToSizes( int arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("resolutionToSizes" ,varg1);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean setActiveCamera( String name,  int cameraIndex)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("setActiveCamera" ,vname, vcameraIndex);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Set the active camera
    /// </summary>
    /// <param name="activeCamera"> 0: top camera - 1: bottom camera </param>
    /// <returns>  </returns>

    
    
    public Boolean setActiveCamera( int activeCamera)
    {
	Variant vactiveCamera;
	vactiveCamera = new Variant(activeCamera);
	Variant result = call("setActiveCamera" ,vactiveCamera);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="cameraIndexes"> Cameras requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Variant setActiveCameras( String name,  Variant cameraIndexes)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcameraIndexes;
	vcameraIndexes = new Variant(cameraIndexes);
	Variant result = call("setActiveCameras" ,vname, vcameraIndexes);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <param name="value"> value requested. </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    public Boolean setCameraParameter( String name,  int parameterId,  int value)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("setCameraParameter" ,vname, vparameterId, vvalue);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean setCameraParameterToDefault( String name,  int parameterId)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant result = call("setCameraParameterToDefault" ,vname, vparameterId);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <param name="values"> values requested. </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    public Variant setCamerasParameter( String name,  int parameterId,  Variant values)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant vvalues;
	vvalues = new Variant(values);
	Variant result = call("setCamerasParameter" ,vname, vparameterId, vvalues);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="parameterId"> Camera parameter requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Variant setCamerasParameterToDefault( String name,  int parameterId)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vparameterId;
	vparameterId = new Variant(parameterId);
	Variant result = call("setCamerasParameterToDefault" ,vname, vparameterId);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="colorSpace"> Color Space requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean setColorSpace( String name,  int colorSpace)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcolorSpace;
	vcolorSpace = new Variant(colorSpace);
	Variant result = call("setColorSpace" ,vname, vcolorSpace);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="colorSpaces"> Color Spaces requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Variant setColorSpaces( String name,  Variant colorSpaces)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcolorSpaces;
	vcolorSpaces = new Variant(colorSpaces);
	Variant result = call("setColorSpaces" ,vname, vcolorSpaces);
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="frameRate"> Frame Rate requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean setFrameRate( String name,  int frameRate)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vframeRate;
	vframeRate = new Variant(frameRate);
	Variant result = call("setFrameRate" ,vname, vframeRate);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Sets the value of a specific parameter for the video source.
    /// </summary>
    /// <param name="pParam"> Camera parameter requested. </param>
    /// <param name="pNewValue"> value requested. </param>
    /// <param name="pCameraIndex"> Camera requested. </param>

    
    
    
    
    
    
    public void setParam( int pParam,  int pNewValue,  int pCameraIndex)
    {
	Variant vpParam;
	vpParam = new Variant(pParam);
	Variant vpNewValue;
	vpNewValue = new Variant(pNewValue);
	Variant vpCameraIndex;
	vpCameraIndex = new Variant(pCameraIndex);
	Variant result = call("setParam" ,vpParam, vpNewValue, vpCameraIndex);
		// no return value
    }
    /// <summary>
    /// Sets the value of a specific parameter for the video source.
    /// </summary>
    /// <param name="pParam"> Camera parameter requested. </param>
    /// <param name="pNewValue"> value requested. </param>

    
    
    
    
    public void setParam( int pParam,  int pNewValue)
    {
	Variant vpParam;
	vpParam = new Variant(pParam);
	Variant vpNewValue;
	vpNewValue = new Variant(pNewValue);
	Variant result = call("setParam" ,vpParam, vpNewValue);
		// no return value
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>

    
    
    public void setParamDefault( int arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("setParamDefault" ,varg1);
		// no return value
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="resolution"> Resolution requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean setResolution( String name,  int resolution)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant result = call("setResolution" ,vname, vresolution);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="resolutions"> Resolutions requested. </param>
    /// <returns>  </returns>

    
    
    
    
    public Variant setResolutions( String name,  Variant resolutions)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vresolutions;
	vresolutions = new Variant(resolutions);
	Variant result = call("setResolutions" ,vname, vresolutions);
	    	return  result;
    }
    /// <summary>
    /// called by the simulator to know expected image parameters
    /// </summary>
    /// <param name="width"> int width of image among 1280*960, 640*480, 320*240, 240*160 </param>
    /// <param name="height"> int height of image among 1280*960, 640*480, 320*240, 240*160 </param>
    /// <returns> true if setSize worked </returns>

    
    
    
    
    public Boolean setSimCamInputSize( int width,  int height)
    {
	Variant vwidth;
	vwidth = new Variant(width);
	Variant vheight;
	vheight = new Variant(height);
	Variant result = call("setSimCamInputSize" ,vwidth, vheight);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    public int sizesToResolution( int arg1,  int arg2)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant result = call("sizesToResolution" ,varg1, varg2);
	    	return  result.toInt();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public Boolean startFrameGrabber( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("startFrameGrabber" ,vcameraIndex);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Advanced method that opens and initialize video source device if it was not before.
    ///
    /// Note that the first module subscribing to ALVideoDevice will launch it automatically.
    /// </summary>
    /// <returns> true if success </returns>

    public Boolean startFrameGrabber()
    {
	Variant result = call("startFrameGrabber" );
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
    /// 
    /// </summary>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <returns>  </returns>

    
    
    public Boolean stopFrameGrabber( int cameraIndex)
    {
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant result = call("stopFrameGrabber" ,vcameraIndex);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Advanced method that close video source device.
    ///
    /// Note that the last module unsubscribing to ALVideoDevice will launch it automatically.
    /// </summary>
    /// <returns> true if success </returns>

    public Boolean stopFrameGrabber()
    {
	Variant result = call("stopFrameGrabber" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Stop writing the video sequence
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> true if success </returns>

    
    
    public Boolean stopVideo( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("stopVideo" ,vid);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Register to ALVideoDevice (formerly Video Input Module/V.I.M.). When a General Video Module(G.V.M.) registers to ALVideoDevice, a buffer of the requested image format is added to the buffers list.
    ///
    /// Returns the name under which the G.V.M. is registered to ALVideoDevice (useful when two G.V.M. try to register using the same name
    /// </summary>
    /// <param name="gvmName"> Name of the subscribing G.V.M. </param>
    /// <param name="resolution"> Resolution requested. { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } </param>
    /// <param name="colorSpace"> Colorspace requested. { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR } </param>
    /// <param name="fps"> Fps (frames per second) requested. { 5, 10, 15, 30 } </param>
    /// <returns> Name under which the G.V.M. is known from ALVideoDevice, 0 if failed. </returns>

    
    
    
    
    
    
    
    
    public String subscribe( String gvmName,  int resolution,  int colorSpace,  int fps)
    {
	Variant vgvmName;
	vgvmName = new Variant(gvmName);
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant vcolorSpace;
	vcolorSpace = new Variant(colorSpace);
	Variant vfps;
	vfps = new Variant(fps);
	Variant result = call("subscribe" ,vgvmName, vresolution, vcolorSpace, vfps);
	    	return  result.toString();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="cameraIndex"> Camera requested. </param>
    /// <param name="resolution"> Resolution requested.{0=kQQVGA, 1=kQVGA, 2=kVGA, 3=k4VGA} </param>
    /// <param name="colorSpace"> Colorspace requested.{0=kYuv, 9=kYUV422, 10=kYUV, 11=kRGB, 12=kHSY, 13=kBGR} </param>
    /// <param name="fps"> Fps (frames per second) requested.{5, 10, 15, 30} </param>
    /// <returns> Name under which the vision module is known from ALVideoDevice </returns>

    
    
    
    
    
    
    
    
    
    
    public String subscribeCamera( String name,  int cameraIndex,  int resolution,  int colorSpace,  int fps)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcameraIndex;
	vcameraIndex = new Variant(cameraIndex);
	Variant vresolution;
	vresolution = new Variant(resolution);
	Variant vcolorSpace;
	vcolorSpace = new Variant(colorSpace);
	Variant vfps;
	vfps = new Variant(fps);
	Variant result = call("subscribeCamera" ,vname, vcameraIndex, vresolution, vcolorSpace, vfps);
	    	return  result.toString();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="name"> Name of the subscribing vision module </param>
    /// <param name="cameraIndexes"> Cameras requested. </param>
    /// <param name="resolutions"> Resolutions requested.{0=kQQVGA, 1=kQVGA, 2=kVGA, 3=k4VGA} </param>
    /// <param name="colorSpaces"> Colorspaces requested.{0=kYuv, 9=kYUV422, 10=kYUV, 11=kRGB, 12=kHSY, 13=kBGR} </param>
    /// <param name="fps"> Fps (frames per second) requested.{5, 10, 15, 30} </param>
    /// <returns> Name under which the vision module is known from ALVideoDevice </returns>

    
    
    
    
    
    
    
    
    
    
    public String subscribeCameras( String name,  Variant cameraIndexes,  Variant resolutions,  Variant colorSpaces,  int fps)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcameraIndexes;
	vcameraIndexes = new Variant(cameraIndexes);
	Variant vresolutions;
	vresolutions = new Variant(resolutions);
	Variant vcolorSpaces;
	vcolorSpaces = new Variant(colorSpaces);
	Variant vfps;
	vfps = new Variant(fps);
	Variant result = call("subscribeCameras" ,vname, vcameraIndexes, vresolutions, vcolorSpaces, vfps);
	    	return  result.toString();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="nameId"> Name under which the vision module is known from ALVideoDevice. </param>

    
    
    public void unsubscribe( String nameId)
    {
	Variant vnameId;
	vnameId = new Variant(nameId);
	Variant result = call("unsubscribe" ,vnameId);
		// no return value
    }
    /// <summary>
    /// Used to unsubscribe all instances for a given G.V.M. (e.g. VisionModule and VisionModule_5) from ALVideoDevice.
    /// </summary>
    /// <param name="id"> Root name of the G.V.M. (e.g. with the example above this will be VisionModule). </param>

    
    
    public void unsubscribeAllInstances( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("unsubscribeAllInstances" ,vid);
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


