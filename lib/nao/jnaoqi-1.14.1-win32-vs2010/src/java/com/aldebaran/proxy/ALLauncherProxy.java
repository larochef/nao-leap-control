// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALLauncherProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALLauncherProxy(String ip, int port) {
		super("ALLauncher", ip, port);
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
    /// get the list of modules loaded on the robot and connected on the robot
    /// </summary>
    /// <returns> array of present modules </returns>

    public String[] getGlobalModuleList()
    {
	Variant result = call("getGlobalModuleList" );
	    	return (String[]) result.toStringArray();
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
    /// Tests the existence of an active module in the global system (in same executable or in another executable of the distributed system)
    /// </summary>
    /// <param name="strPartOfModuleName"> a part of the name of the module to test existence </param>
    /// <returns> the returned value is true if this module is present </returns>

    
    
    public Boolean isModulePresent( String strPartOfModuleName)
    {
	Variant vstrPartOfModuleName;
	vstrPartOfModuleName = new Variant(strPartOfModuleName);
	Variant result = call("isModulePresent" ,vstrPartOfModuleName);
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
    /// runs an executable and connect it to current broker (executable)
    /// </summary>
    /// <param name="moduleName"> the name of the module to launch or the name of the script file to execute </param>
    /// <returns> true if ok </returns>

    
    
    public Boolean launchExecutable( String moduleName)
    {
	Variant vmoduleName;
	vmoduleName = new Variant(moduleName);
	Variant result = call("launchExecutable" ,vmoduleName);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Loads dynamicaly a module
    /// </summary>
    /// <param name="moduleName"> the name of the module to launch or the name of the python script to evaluate </param>
    /// <returns> list of modules loaded </returns>

    
    
    public String[] launchLocal( String moduleName)
    {
	Variant vmoduleName;
	vmoduleName = new Variant(moduleName);
	Variant result = call("launchLocal" ,vmoduleName);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Import a python module
    /// </summary>
    /// <param name="moduleName"> the name of the module to launch </param>
    /// <returns> true if ok </returns>

    
    
    public Boolean launchPythonModule( String moduleName)
    {
	Variant vmoduleName;
	vmoduleName = new Variant(moduleName);
	Variant result = call("launchPythonModule" ,vmoduleName);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// runs a script connected the current broker
    /// </summary>
    /// <param name="moduleName"> the name of the script to launch (python) </param>
    /// <returns> true if ok </returns>

    
    
    public Boolean launchScript( String moduleName)
    {
	Variant vmoduleName;
	vmoduleName = new Variant(moduleName);
	Variant result = call("launchScript" ,vmoduleName);
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


