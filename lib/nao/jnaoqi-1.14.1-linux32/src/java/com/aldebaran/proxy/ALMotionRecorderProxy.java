// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALMotionRecorderProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALMotionRecorderProxy(String ip, int port) {
		super("ALMotionRecorder", ip, port);
	}
    /// <summary>
    /// Called by ALMemory when subcription data is updated. INTERNAL
    /// </summary>
    /// <param name="dataName"> Name of the subscribed data. </param>
    /// <param name="data"> Value of the the subscribed data </param>
    /// <param name="message"> The message give when subscribing. </param>

    
    
    
    
    
    
    public void dataChanged( String dataName,  Variant data,  String message)
    {
	Variant vdataName;
	vdataName = new Variant(dataName);
	Variant vdata;
	vdata = new Variant(data);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("dataChanged" ,vdataName, vdata, vmessage);
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
    /// Start recording the motion in an interactive mode
    /// </summary>
    /// <param name="jointsToRecord"> Names of joints that must be recorded </param>
    /// <param name="nbPoses"> Default number of poses to record </param>
    /// <param name="extensionAllowed"> Set to true to ignore nbPoses and keep recording new poses as long as record is not manually stopped </param>
    /// <param name="mode"> Indicates which interactive mode must be used. 1 : Use right bumper to enslave and left bumper to store the pose  (deprecated); 2 : Use chest button to store the pose </param>

    
    
    
    
    
    
    
    
    public void startInteractiveRecording( String[] jointsToRecord,  int nbPoses,  Boolean extensionAllowed,  int mode)
    {
	Variant vjointsToRecord;
	vjointsToRecord = new Variant(jointsToRecord);
	Variant vnbPoses;
	vnbPoses = new Variant(nbPoses);
	Variant vextensionAllowed;
	vextensionAllowed = new Variant(extensionAllowed);
	Variant vmode;
	vmode = new Variant(mode);
	Variant result = call("startInteractiveRecording" ,vjointsToRecord, vnbPoses, vextensionAllowed, vmode);
		// no return value
    }
    /// <summary>
    /// Start recording the motion in a periodic mode
    /// </summary>
    /// <param name="jointsToRecord"> Names of joints that must be recorded </param>
    /// <param name="nbPoses"> Default number of poses to record </param>
    /// <param name="extensionAllowed"> set to true to ignore nbPoses and keep recording new poses as long as record is not manually stopped </param>
    /// <param name="timeStep"> Time in seconds to wait between two poses </param>
    /// <param name="jointsToReplay"> Names of joints that must be replayed </param>
    /// <param name="replayData"> An ALValue holding data for replayed joints. It holds two ALValues. The first one is an ALValue where each line corresponds to a joint, and column elements are times of control points The second one is also an ALValue where each line corresponds to a joint, but column elements are arrays containing [float angle, Handle1, Handle2] elements, where Handle is [int InterpolationType, float dAngle, float dTime] describing the handle offsets relative to the angle and time of the point. The first bezier param describes the handle that controls the curve preceding the point, the second describes the curve following the point. </param>

    
    
    
    
    
    
    
    
    
    
    
    
    public void startPeriodicRecording( String[] jointsToRecord,  int nbPoses,  Boolean extensionAllowed,  float timeStep,  String[] jointsToReplay,  Variant replayData)
    {
	Variant vjointsToRecord;
	vjointsToRecord = new Variant(jointsToRecord);
	Variant vnbPoses;
	vnbPoses = new Variant(nbPoses);
	Variant vextensionAllowed;
	vextensionAllowed = new Variant(extensionAllowed);
	Variant vtimeStep;
	vtimeStep = new Variant(timeStep);
	Variant vjointsToReplay;
	vjointsToReplay = new Variant(jointsToReplay);
	Variant vreplayData;
	vreplayData = new Variant(replayData);
	Variant result = call("startPeriodicRecording" ,vjointsToRecord, vnbPoses, vextensionAllowed, vtimeStep, vjointsToReplay, vreplayData);
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
    /// Stop recording the motion and return data
    /// </summary>
    /// <returns> Returns the recorded data as an ALValue: [[JointName1,[pos1, pos2, ...]], [JointName2,[pos1, pos2, ...]], ...] </returns>

    public Variant stopAndGetRecording()
    {
	Variant result = call("stopAndGetRecording" );
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


