// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALFileManagerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALFileManagerProxy(String ip, int port) {
		super("ALFileManager", ip, port);
	}
    /// <summary>
    /// Try to find if this file does exist on robot or not.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <returns> True upon success </returns>

    
    
    public Boolean dataFileExists( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("dataFileExists" ,vfileName);
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
    /// Try to find if this file does exist on robot or not.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <returns> True upon success </returns>

    
    
    public Boolean fileExists( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("fileExists" ,vfileName);
	    	return  result.toBoolean();
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
    /// Returns the complete path of the file if it does exist. Starts by looking in user's shared folder, then in system folder.
    /// </summary>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <returns> True upon success </returns>

    
    
    public String getFileCompletePath( String prefs)
    {
	Variant vprefs;
	vprefs = new Variant(prefs);
	Variant result = call("getFileCompletePath" ,vprefs);
	    	return  result.toString();
    }
    /// <summary>
    /// Returns the complete path of the file if it does exist. Starts by looking in user's shared folder, then in system folder.
    /// </summary>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <returns> True upon success </returns>

    
    
    public Variant getFileContents( String prefs)
    {
	Variant vprefs;
	vprefs = new Variant(prefs);
	Variant result = call("getFileContents" ,vprefs);
	    	return  result;
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
    /// Get the current system shared folder path.
    /// </summary>
    /// <returns> System shared folder path string. </returns>

    public String getSystemSharedFolderPath()
    {
	Variant result = call("getSystemSharedFolderPath" );
	    	return  result.toString();
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
    /// Get the current user shared folder path.
    /// </summary>
    /// <returns> User shared folder path string. </returns>

    public String getUserSharedFolderPath()
    {
	Variant result = call("getUserSharedFolderPath" );
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
    /// Set a new value of the user shared folder path.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>

    
    
    public void setUserSharedFolderPath( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("setUserSharedFolderPath" ,vfileName);
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


