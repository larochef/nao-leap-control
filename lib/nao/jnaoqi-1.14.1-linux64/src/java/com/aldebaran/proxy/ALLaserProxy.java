// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALLaserProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALLaserProxy(String ip, int port) {
		super("ALLaser", ip, port);
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
    /// Disable laser light
    /// </summary>

    public void laserOFF()
    {
	Variant result = call("laserOFF" );
		// no return value
    }
    /// <summary>
    /// Enable laser light and sampling
    /// </summary>

    public void laserON()
    {
	Variant result = call("laserON" );
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
    /// Set detection threshold of the laser
    /// </summary>
    /// <param name="length_min_l"> int containing the min length that the laser will detect(mm), this value must be upper than 20 mm </param>
    /// <param name="length_max_l"> int containing the max length that the laser will detect(mm), this value must be lower than 5600 mm </param>

    
    
    
    
    public void setDetectingLength( int length_min_l,  int length_max_l)
    {
	Variant vlength_min_l;
	vlength_min_l = new Variant(length_min_l);
	Variant vlength_max_l;
	vlength_max_l = new Variant(length_max_l);
	Variant result = call("setDetectingLength" ,vlength_min_l, vlength_max_l);
		// no return value
    }
    /// <summary>
    /// Set openning angle of the laser
    /// </summary>
    /// <param name="angle_min_f"> float containing the min value in rad, this value must be upper than -2.35619449 </param>
    /// <param name="angle_max_f"> float containing the max value in rad, this value must be lower than 2.092349795 </param>

    
    
    
    
    public void setOpeningAngle( float angle_min_f,  float angle_max_f)
    {
	Variant vangle_min_f;
	vangle_min_f = new Variant(angle_min_f);
	Variant vangle_max_f;
	vangle_max_f = new Variant(angle_max_f);
	Variant result = call("setOpeningAngle" ,vangle_min_f, vangle_max_f);
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


