// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALFrameManagerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALFrameManagerProxy(String ip, int port) {
		super("ALFrameManager", ip, port);
	}
    /// <summary>
    /// Stop playing any behavior in FrameManager, and delete all of them.
    /// </summary>

    public void cleanBehaviors()
    {
	Variant result = call("cleanBehaviors" );
		// no return value
    }
    /// <summary>
    /// It will play a behavior and block until the behavior is finished. Note that it can block forever if the behavior output is never called.
    /// </summary>
    /// <param name="id"> The id of the box. </param>

    
    
    public void completeBehavior( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("completeBehavior" ,vid);
		// no return value
    }
    /// <summary>
    /// Creates and play completely a timeline
    /// </summary>
    /// <param name="xmlFile"> The choregraphe project (in plain text for the moment). </param>
    /// <returns> return a unique identifier for the created box that contains the timeline. You must call deleteBehavior on it at some point. DEPRECATED since 1.14 </returns>

    
    
    public String createAndPlayTimeline( String xmlFile)
    {
	Variant vxmlFile;
	vxmlFile = new Variant(xmlFile);
	Variant result = call("createAndPlayTimeline" ,vxmlFile);
	    	return  result.toString();
    }
    /// <summary>
    /// Deletes a behavior (meaning a box). Stop the whole behavior contained in this box first.
    /// </summary>
    /// <param name="id"> The id of the box to delete. </param>

    
    
    public void deleteBehavior( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("deleteBehavior" ,vid);
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
    /// Exit the reading of a timeline contained in a given box
    /// </summary>
    /// <param name="id"> The id of the box. </param>

    
    
    public void exitBehavior( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("exitBehavior" ,vid);
		// no return value
    }
    /// <summary>
    /// Returns a playing behavior absolute path.
    /// </summary>
    /// <param name="id"> The id of the behavior. </param>
    /// <returns> Returns the absolute path of given behavior. </returns>

    
    
    public String getBehaviorPath( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("getBehaviorPath" ,vid);
	    	return  result.toString();
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
    /// Returns in seconds, the duration of a given movement stored in a box. Returns 0 if the behavior has no motion layers.  DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box. </param>
    /// <returns> Returns the time in seconds. </returns>

    
    
    public float getMotionLength( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("getMotionLength" ,vid);
	    	return  result.toFloat();
    }
    /// <summary>
    /// Gets the FPS of a given timeline. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the timeline. </param>
    /// <returns> Returns the timeline's FPS. </returns>

    
    
    public int getTimelineFps( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("getTimelineFps" ,vid);
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
    /// Goes to a certain frame and continue playing. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box containing the box. </param>
    /// <param name="frame"> The behavior frame name we want the timeline to go to. If will jump to the starting index of the name given. </param>

    
    
    
    
    public void gotoAndPlay( String id,  String frame)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vframe;
	vframe = new Variant(frame);
	Variant result = call("gotoAndPlay" ,vid, vframe);
		// no return value
    }
    /// <summary>
    /// Goes to a certain frame and continue playing. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box containing the box. </param>
    /// <param name="frame"> The frame we want the timeline to go to. </param>

    
    
    
    
    public void gotoAndPlay( String id,  int frame)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vframe;
	vframe = new Variant(frame);
	Variant result = call("gotoAndPlay" ,vid, vframe);
		// no return value
    }
    /// <summary>
    /// Goes to a certain frame and pause. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box containing the box. </param>
    /// <param name="frame"> The behavior frame name we want the timeline to go to. If will jump to the starting index of the name given. </param>

    
    
    
    
    public void gotoAndStop( String id,  String frame)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vframe;
	vframe = new Variant(frame);
	Variant result = call("gotoAndStop" ,vid, vframe);
		// no return value
    }
    /// <summary>
    /// Goes to a certain frame and pause. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box containing the box. </param>
    /// <param name="frame"> The frame we want the timeline to go to. </param>

    
    
    
    
    public void gotoAndStop( String id,  int frame)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vframe;
	vframe = new Variant(frame);
	Variant result = call("gotoAndStop" ,vid, vframe);
		// no return value
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
    /// Creates a new behavior, from a box found in an xml file. Note that you have to give the xml file contents, so this method is not very user friendly. You have to open the file, and send the string that matches the file contents if you are working from a file. You probably want to use newBehaviorFromFile instead. DEPRECATED since 1.14
    /// </summary>
    /// <param name="path"> The path to reach the box to instantiate in the project (\"\" if root). </param>
    /// <param name="xmlFile"> The choregraphe project (in plain text for the moment). </param>
    /// <returns> return a unique identifier for the created box. </returns>

    
    
    
    
    public String newBehavior( String path,  String xmlFile)
    {
	Variant vpath;
	vpath = new Variant(path);
	Variant vxmlFile;
	vxmlFile = new Variant(xmlFile);
	Variant result = call("newBehavior" ,vpath, vxmlFile);
	    	return  result.toString();
    }
    /// <summary>
    /// Creates a new behavior, from the current Choregraphe behavior 0(uploaded to /tmp/currentChoregrapheBehavior/behavior.xar). DEPRECATED since 1.14
    /// </summary>
    /// <returns> return a unique identifier for the created behavior </returns>

    public String newBehaviorFromChoregraphe()
    {
	Variant result = call("newBehaviorFromChoregraphe" );
	    	return  result.toString();
    }
    /// <summary>
    /// Creates a new behavior, from a box found in an xml file stored in the robot.
    /// </summary>
    /// <param name="xmlFilePath"> Path to Xml file, ex : \"/home/youhou/mybehavior.xar\". </param>
    /// <param name="behName">  </param>
    /// <returns> return a unique identifier for the created box, that can be used by playBehavior </returns>

    
    
    
    
    public String newBehaviorFromFile( String xmlFilePath,  String behName)
    {
	Variant vxmlFilePath;
	vxmlFilePath = new Variant(xmlFilePath);
	Variant vbehName;
	vbehName = new Variant(behName);
	Variant result = call("newBehaviorFromFile" ,vxmlFilePath, vbehName);
	    	return  result.toString();
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
    /// Starts a behavior
    /// </summary>
    /// <param name="id"> The id of the box. </param>

    
    
    public void playBehavior( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("playBehavior" ,vid);
		// no return value
    }
    /// <summary>
    /// Starts playing a timeline contained in a given box. If the box is a flow diagram, it will look for the first onStart input of type Bang, and stimulate it ! DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box. </param>

    
    
    public void playTimeline( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("playTimeline" ,vid);
		// no return value
    }
    /// <summary>
    /// enable the deprecation warning
    /// </summary>
    /// <param name="arg1"> arg </param>

    
    
    public void setDeprecationWarningEnabled( Boolean arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("setDeprecationWarningEnabled" ,varg1);
		// no return value
    }
    /// <summary>
    /// Sets the FPS of a given timeline. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the timeline. </param>
    /// <param name="fps"> The FPS to set. </param>

    
    
    
    
    public void setTimelineFps( String id,  int fps)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vfps;
	vfps = new Variant(fps);
	Variant result = call("setTimelineFps" ,vid, vfps);
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
    /// Stops playing a timeline contained in a given box, at the current frame. DEPRECATED since 1.14
    /// </summary>
    /// <param name="id"> The id of the box. </param>

    
    
    public void stopTimeline( String id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("stopTimeline" ,vid);
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


