// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALBehaviorManagerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALBehaviorManagerProxy(String ip, int port) {
		super("ALBehaviorManager", ip, port);
	}
    /// <summary>
    /// Set the given behavior as default
    /// </summary>
    /// <param name="behavior"> Behavior name </param>

    
    
    public void addDefaultBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("addDefaultBehavior" ,vbehavior);
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
    /// Get behaviors
    /// </summary>
    /// <returns> Returns the list of behaviors prefixed by their type (User/ or System/). DEPRECATED </returns>

    public String[] getBehaviorNames()
    {
	Variant result = call("getBehaviorNames" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get tags found on the given behavior.
    /// </summary>
    /// <param name="behavior"> The local path towards a behavior or a directory. </param>
    /// <returns> The list of tags found. </returns>

    
    
    public String[] getBehaviorTags( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("getBehaviorTags" ,vbehavior);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get installed behaviors directories names and filter it by tag.
    /// </summary>
    /// <param name="tag"> A tag to filter the list with. </param>
    /// <returns> Returns the behaviors list </returns>

    
    
    public String[] getBehaviorsByTag( String tag)
    {
	Variant vtag;
	vtag = new Variant(tag);
	Variant result = call("getBehaviorsByTag" ,vtag);
	    	return (String[]) result.toStringArray();
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
    /// Get default behaviors
    /// </summary>
    /// <returns> Return default behaviors </returns>

    public String[] getDefaultBehaviors()
    {
	Variant result = call("getDefaultBehaviors" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get installed behaviors directories names
    /// </summary>
    /// <returns> Returns the behaviors list </returns>

    public String[] getInstalledBehaviors()
    {
	Variant result = call("getInstalledBehaviors" );
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
    /// Get running behaviors
    /// </summary>
    /// <returns> Return running behaviors </returns>

    public String[] getRunningBehaviors()
    {
	Variant result = call("getRunningBehaviors" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get system behaviors
    /// </summary>
    /// <returns> Returns the list of system behaviors prefixed by System/. </returns>

    public String[] getSystemBehaviorNames()
    {
	Variant result = call("getSystemBehaviorNames" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get tags found on installed behaviors.
    /// </summary>
    /// <returns> The list of tags found. </returns>

    public String[] getTagList()
    {
	Variant result = call("getTagList" );
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
    /// Get user's behaviors
    /// </summary>
    /// <returns> Returns the list of user's behaviors prefixed by User/. DEPRECATED. </returns>

    public String[] getUserBehaviorNames()
    {
	Variant result = call("getUserBehaviorNames" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Install a behavior.
    ///
    /// Check the given local path for a valid behavior or package.
    ///
    /// On success, behavior added or updated signal is emitted.
    /// </summary>
    /// <param name="localPath"> the relative destination path. </param>
    /// <returns> true on success, false on failure. </returns>

    
    
    public Boolean installBehavior( String localPath)
    {
	Variant vlocalPath;
	vlocalPath = new Variant(localPath);
	Variant result = call("installBehavior" ,vlocalPath);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Install a behavior.
    ///
    /// Check and take the behavior found at the given absolute path andimport it to the given local path, relative to behaviors path.
    ///
    /// On success, behavior added signal is emitted before returning.
    /// </summary>
    /// <param name="absolutePath"> a behavior on the local file system to install. </param>
    /// <param name="localPath"> the relative destination path. </param>
    /// <param name="overwrite"> whether to replace existing behavior if present. </param>
    /// <returns> true on success, false on failure. </returns>

    
    
    
    
    
    
    public Boolean installBehavior( String absolutePath,  String localPath,  Boolean overwrite)
    {
	Variant vabsolutePath;
	vabsolutePath = new Variant(absolutePath);
	Variant vlocalPath;
	vlocalPath = new Variant(localPath);
	Variant voverwrite;
	voverwrite = new Variant(overwrite);
	Variant result = call("installBehavior" ,vabsolutePath, vlocalPath, voverwrite);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Tell if supplied name corresponds to a behavior that has been installed
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    /// <returns> Returns true if it is a valid behavior </returns>

    
    
    public Boolean isBehaviorInstalled( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("isBehaviorInstalled" ,vname);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Tell if the supplied namecorresponds to an existing behavior.
    /// </summary>
    /// <param name="prefixedBehavior"> Prefixed behavior or just behavior's name (latter usage deprecated, in this case the behavior is searched for amongst user's behaviors, then in system behaviors) DEPRECATED. </param>
    /// <returns> Returns true if it is an existing behavior </returns>

    
    
    public Boolean isBehaviorPresent( String prefixedBehavior)
    {
	Variant vprefixedBehavior;
	vprefixedBehavior = new Variant(prefixedBehavior);
	Variant result = call("isBehaviorPresent" ,vprefixedBehavior);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Tell if supplied name corresponds to a running behavior
    /// </summary>
    /// <param name="behavior"> Behavior name </param>
    /// <returns> Returns true if it is a running behavior </returns>

    
    
    public Boolean isBehaviorRunning( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("isBehaviorRunning" ,vbehavior);
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
    /// Play default behaviors
    /// </summary>

    public void playDefaultProject()
    {
	Variant result = call("playDefaultProject" );
		// no return value
    }
    /// <summary>
    /// Load a behavior
    /// </summary>
    /// <param name="behavior"> Behavior name </param>
    /// <returns> Returns true if it was successfully loaded. </returns>

    
    
    public Boolean preloadBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("preloadBehavior" ,vbehavior);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Remove a behavior from the filesystem
    /// </summary>
    /// <param name="behavior"> Behavior name </param>
    /// <returns>  </returns>

    
    
    public Boolean removeBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("removeBehavior" ,vbehavior);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Remove the given behavior from the default behaviors
    /// </summary>
    /// <param name="behavior"> Behavior name </param>

    
    
    public void removeDefaultBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("removeDefaultBehavior" ,vbehavior);
		// no return value
    }
    /// <summary>
    /// Run a behavior
    /// </summary>
    /// <param name="behavior"> Behavior name </param>

    
    
    public void runBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("runBehavior" ,vbehavior);
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
    /// Stop all behaviors
    /// </summary>

    public void stopAllBehaviors()
    {
	Variant result = call("stopAllBehaviors" );
		// no return value
    }
    /// <summary>
    /// Stop a behavior
    /// </summary>
    /// <param name="behavior"> Behavior name </param>

    
    
    public void stopBehavior( String behavior)
    {
	Variant vbehavior;
	vbehavior = new Variant(behavior);
	Variant result = call("stopBehavior" ,vbehavior);
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


