// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class DCMProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public DCMProxy(String ip, int port) {
		super("DCM", ip, port);
	}
    /// <summary>
    /// Calibration of a joint
    /// </summary>
    /// <param name="calibrationInput"> A complex ALValue. See red documentation </param>



    public void calibration( Variant calibrationInput)
    {
	Variant vcalibrationInput;
	vcalibrationInput = new Variant(calibrationInput);
	Variant result = call("calibration" ,vcalibrationInput);
		// no return value
    }
    /// <summary>
    /// Create or change an alias (list of actuators)
    /// </summary>
    /// <param name="alias"> Alias name and description </param>
    /// <returns> Same as pParams, but with the name removed if the actuator is not found </returns>



    public Variant createAlias( Variant alias)
    {
	Variant valias;
	valias = new Variant(alias);
	Variant result = call("createAlias" ,valias);
	    	return  result;
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
    /// Return the STM base name
    /// </summary>
    /// <returns> the STM base name for all device/sensors (1st string in the array) and all devices (2nd string in the array) </returns>

    public Variant getPrefix()
    {
	Variant result = call("getPrefix" );
	    	return  result;
    }
    /// <summary>
    /// Return the DCM time
    /// </summary>
    /// <param name="offset"> optional time in ms (signed) to add/remove </param>
    /// <returns> An integer (could be signed) with the DCM time </returns>



    public int getTime( int offset)
    {
	Variant voffset;
	voffset = new Variant(offset);
	Variant result = call("getTime" ,voffset);
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
    /// Save updated value from DCM in XML pref file
    /// </summary>
    /// <param name="action"> string : 'Save' 'Load' 'Add' </param>
    /// <param name="target"> string : 'Chest' 'Head' 'Main' 'All' </param>
    /// <param name="keyName"> The name of the key if action = 'Add'. </param>
    /// <param name="keyValue"> The ALVAlue of the key to add </param>
    /// <returns> Nothing </returns>









    public int preferences( String action,  String target,  String keyName,  Variant keyValue)
    {
	Variant vaction;
	vaction = new Variant(action);
	Variant vtarget;
	vtarget = new Variant(target);
	Variant vkeyName;
	vkeyName = new Variant(keyName);
	Variant vkeyValue;
	vkeyValue = new Variant(keyValue);
	Variant result = call("preferences" ,vaction, vtarget, vkeyName, vkeyValue);
	    	return  result.toInt();
    }
    /// <summary>
    /// Call this function to send a timed-command list to an actuator
    /// </summary>
    /// <param name="commands"> AL::ALValue with all data </param>



    public void set( Variant commands)
    {
	Variant vcommands;
	vcommands = new Variant(commands);
	Variant result = call("set" ,vcommands);
		// no return value
    }
    /// <summary>
    /// Call this function to send timed-command list to an alias (list of actuators)
    /// </summary>
    /// <param name="commands"> AL::ALValue with all data </param>



    public void setAlias( Variant commands)
    {
	Variant vcommands;
	vcommands = new Variant(commands);
	Variant result = call("setAlias" ,vcommands);
		// no return value
    }
    /// <summary>
    /// Special DCM commands
    /// </summary>
    /// <param name="result"> one string and could be Reset, Version, Chain, Diagnostic, Config </param>



    public void special( String res)
    {
	Variant vresult;
	vresult = new Variant(res);
	Variant result = call("special" ,vresult);
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


