// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALNavigationProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALNavigationProxy(String ip, int port) {
		super("ALNavigation", ip, port);
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
    /// Makes the robot move at the given position.This is a blocking call.
    /// </summary>
    /// <param name="x"> The position along x axis [m]. </param>
    /// <param name="y"> The position along y axis [m]. </param>
    /// <param name="theta"> The angle around z axis [rad]. </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    public Boolean moveTo( float x,  float y,  float theta)
    {
	Variant vx;
	vx = new Variant(x);
	Variant vy;
	vy = new Variant(y);
	Variant vtheta;
	vtheta = new Variant(theta);
	Variant result = call("moveTo" ,vx, vy, vtheta);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Makes the robot move at the given position.This is a blocking call.
    /// </summary>
    /// <param name="x"> The position along x axis [m]. </param>
    /// <param name="y"> The position along y axis [m]. </param>
    /// <param name="theta"> The angle around z axis [rad]. </param>
    /// <param name="moveConfig"> An ALValue with custom move configuration. </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    
    
    public Boolean moveTo( float x,  float y,  float theta,  Variant moveConfig)
    {
	Variant vx;
	vx = new Variant(x);
	Variant vy;
	vy = new Variant(y);
	Variant vtheta;
	vtheta = new Variant(theta);
	Variant vmoveConfig;
	vmoveConfig = new Variant(moveConfig);
	Variant result = call("moveTo" ,vx, vy, vtheta, vmoveConfig);
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
    /// Distance in meters fromwhich the robot should stop if there is an obstacle.
    /// </summary>
    /// <param name="arg1"> arg </param>

    
    
    public void setSecurityDistance( float arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("setSecurityDistance" ,varg1);
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


