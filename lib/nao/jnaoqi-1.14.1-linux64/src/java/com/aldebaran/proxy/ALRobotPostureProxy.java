// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALRobotPostureProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALRobotPostureProxy(String ip, int port) {
		super("ALRobotPosture", ip, port);
	}
    /// <summary>
    /// Set the angle of the joints of the  robot to the choosen posture.
    /// </summary>
    /// <param name="postureName"> Name of the desired posture. Use getPostureList to get the list of posture name available. </param>
    /// <param name="maxSpeedFraction"> A fraction. </param>
    /// <returns> Returns if the posture was reached or not. </returns>

    
    
    
    
    public Boolean applyPosture( String postureName,  float maxSpeedFraction)
    {
	Variant vpostureName;
	vpostureName = new Variant(postureName);
	Variant vmaxSpeedFraction;
	vmaxSpeedFraction = new Variant(maxSpeedFraction);
	Variant result = call("applyPosture" ,vpostureName, vmaxSpeedFraction);
	    	return  result.toBoolean();
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
    /// Returns the posture family for example Standing, LyingBelly,...
    /// </summary>
    /// <returns> Returns the posture family, e.g. Standing. </returns>

    public String getPostureFamily()
    {
	Variant result = call("getPostureFamily" );
	    	return  result.toString();
    }
    /// <summary>
    /// Get the list of posture family names available.
    /// </summary>
    /// <returns>  </returns>

    public String[] getPostureFamilyList()
    {
	Variant result = call("getPostureFamilyList" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get the list of posture names available.
    /// </summary>
    /// <returns>  </returns>

    public String[] getPostureList()
    {
	Variant result = call("getPostureList" );
	    	return (String[]) result.toStringArray();
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
    /// Make the robot go to the choosenposture.
    /// </summary>
    /// <param name="postureName"> Name of the desired posture. Use getPostureList to get the list of posture name available. </param>
    /// <param name="maxSpeedFraction"> A fraction. </param>
    /// <returns> Returns if the posture was reached or not. </returns>

    
    
    
    
    public Boolean goToPosture( String postureName,  float maxSpeedFraction)
    {
	Variant vpostureName;
	vpostureName = new Variant(postureName);
	Variant vmaxSpeedFraction;
	vmaxSpeedFraction = new Variant(maxSpeedFraction);
	Variant result = call("goToPosture" ,vpostureName, vmaxSpeedFraction);
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
    /// Set maximum of tries on goToPosture fail.
    /// </summary>
    /// <param name="pMaxTryNumber"> Number of retry if goToPosture fail. </param>

    
    
    public void setMaxTryNumber( int pMaxTryNumber)
    {
	Variant vpMaxTryNumber;
	vpMaxTryNumber = new Variant(pMaxTryNumber);
	Variant result = call("setMaxTryNumber" ,vpMaxTryNumber);
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
    /// Stop the posture move.
    /// </summary>

    public void stopMove()
    {
	Variant result = call("stopMove" );
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


