// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALResourceManagerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALResourceManagerProxy(String ip, int port) {
		super("ALResourceManager", ip, port);
	}
    /// <summary>
    /// True if resources free
    /// </summary>
    /// <param name="resourceNames"> Resource names </param>
    /// <returns> True if all the specify resources are free </returns>

    
    
    public Boolean areResourcesFree( String[] resourceNames)
    {
	Variant vresourceNames;
	vresourceNames = new Variant(resourceNames);
	Variant result = call("areResourcesFree" ,vresourceNames);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// True if all the specified resources are owned by the owner
    /// </summary>
    /// <param name="resourceNameList"> Resource name </param>
    /// <param name="ownerName"> Owner pointer with hierarchy </param>
    /// <returns> True if all the specify resources are owned by the owner </returns>

    
    
    
    
    public Boolean areResourcesOwnedBy( String[] resourceNameList,  String ownerName)
    {
	Variant vresourceNameList;
	vresourceNameList = new Variant(resourceNameList);
	Variant vownerName;
	vownerName = new Variant(ownerName);
	Variant result = call("areResourcesOwnedBy" ,vresourceNameList, vownerName);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Create a resource
    /// </summary>
    /// <param name="resourceName"> Resource name to create </param>
    /// <param name="parentResourceName"> Parent resource name or empty string for root resource </param>

    
    
    
    
    public void createResource( String resourceName,  String parentResourceName)
    {
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant vparentResourceName;
	vparentResourceName = new Variant(parentResourceName);
	Variant result = call("createResource" ,vresourceName, vparentResourceName);
		// no return value
    }
    /// <summary>
    /// True if a resource is in another parent resource
    /// </summary>
    /// <param name="resourceGroupName"> Group name. Ex: Arm </param>
    /// <param name="resourceName"> Resource name </param>

    
    
    
    
    public void createResourcesList( String[] resourceGroupName,  String resourceName)
    {
	Variant vresourceGroupName;
	vresourceGroupName = new Variant(resourceGroupName);
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant result = call("createResourcesList" ,vresourceGroupName, vresourceName);
		// no return value
    }
    /// <summary>
    /// Delete a root resource
    /// </summary>
    /// <param name="resourceName"> Resource name to delete </param>
    /// <param name="deleteChildResources"> Delete child resources if true </param>

    
    
    
    
    public void deleteResource( String resourceName,  Boolean deleteChildResources)
    {
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant vdeleteChildResources;
	vdeleteChildResources = new Variant(deleteChildResources);
	Variant result = call("deleteResource" ,vresourceName, vdeleteChildResources);
		// no return value
    }
    /// <summary>
    /// Enable or disable a state resource
    /// </summary>
    /// <param name="resourceName"> The name of the resource that you wish enable of disable. e.g. Standing </param>
    /// <param name="enabled"> True to enable, false to disable </param>

    
    
    
    
    public void enableStateResource( String resourceName,  Boolean enabled)
    {
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant venabled;
	venabled = new Variant(enabled);
	Variant result = call("enableStateResource" ,vresourceName, venabled);
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
    /// True if a resource is in another parent resource
    /// </summary>
    /// <param name="resourceGroupName"> Group name. Ex: Arm </param>
    /// <param name="resourceName"> Resource name </param>
    /// <returns>  </returns>

    
    
    
    
    public Boolean isInGroup( String resourceGroupName,  String resourceName)
    {
	Variant vresourceGroupName;
	vresourceGroupName = new Variant(resourceGroupName);
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant result = call("isInGroup" ,vresourceGroupName, vresourceName);
	    	return  result.toBoolean();
    }
    /// <summary>
    /// True if one resources free
    /// </summary>
    /// <param name="resourceNames"> Resource names </param>
    /// <returns> True if the specify resources is free </returns>

    
    
    public Boolean isResourceFree( String resourceNames)
    {
	Variant vresourceNames;
	vresourceNames = new Variant(resourceNames);
	Variant result = call("isResourceFree" ,vresourceNames);
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
    /// The tree of the resources owners.
    /// </summary>
    /// <returns>  </returns>

    public Variant ownersGet()
    {
	Variant result = call("ownersGet" );
	    	return  result;
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
    /// Release resource
    /// </summary>
    /// <param name="resourceName"> Resource name </param>
    /// <param name="ownerName"> Existing owner name </param>

    
    
    
    
    public void releaseResource( String resourceName,  String ownerName)
    {
	Variant vresourceName;
	vresourceName = new Variant(resourceName);
	Variant vownerName;
	vownerName = new Variant(ownerName);
	Variant result = call("releaseResource" ,vresourceName, vownerName);
		// no return value
    }
    /// <summary>
    /// Release  resources list
    /// </summary>
    /// <param name="resourceNames"> Resource names </param>
    /// <param name="ownerName"> Owner name </param>

    
    
    
    
    public void releaseResources( String[] resourceNames,  String ownerName)
    {
	Variant vresourceNames;
	vresourceNames = new Variant(resourceNames);
	Variant vownerName;
	vownerName = new Variant(ownerName);
	Variant result = call("releaseResources" ,vresourceNames, vownerName);
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
    /// <summary>
    /// Wait resource
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <param name="arg2"> arg </param>
    /// <param name="arg3"> arg </param>
    /// <param name="arg4"> arg </param>
    /// <param name="arg5"> arg </param>
    /// <returns>  </returns>

    
    
    
    
    
    
    
    
    
    
    public String[] waitForOptionalResourcesTree( String[] arg1,  String arg2,  String arg3,  int arg4,  String[] arg5)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant varg3;
	varg3 = new Variant(arg3);
	Variant varg4;
	varg4 = new Variant(arg4);
	Variant varg5;
	varg5 = new Variant(arg5);
	Variant result = call("waitForOptionalResourcesTree" ,varg1, varg2, varg3, varg4, varg5);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Wait resource
    /// </summary>
    /// <param name="ressourceName"> Resource name </param>
    /// <param name="ownerName"> Owner name </param>
    /// <param name="callbackName"> callback name </param>
    /// <param name="timeoutSeconds"> Timeout in seconds </param>

    
    
    
    
    
    
    
    
    public void waitForResource( String ressourceName,  String ownerName,  String callbackName,  int timeoutSeconds)
    {
	Variant vressourceName;
	vressourceName = new Variant(ressourceName);
	Variant vownerName;
	vownerName = new Variant(ownerName);
	Variant vcallbackName;
	vcallbackName = new Variant(callbackName);
	Variant vtimeoutSeconds;
	vtimeoutSeconds = new Variant(timeoutSeconds);
	Variant result = call("waitForResource" ,vressourceName, vownerName, vcallbackName, vtimeoutSeconds);
		// no return value
    }
    /// <summary>
    /// Wait for resource tree. Parent and children are not in conflict. Local function
    /// </summary>
    /// <param name="ressourceName"> Resource name </param>
    /// <param name="ownerName"> Owner name </param>
    /// <param name="callbackName"> callback name </param>
    /// <param name="timeoutSeconds"> Timeout in seconds </param>

    
    
    
    
    
    
    
    
    public void waitForResourcesTree( String[] ressourceName,  String ownerName,  String callbackName,  int timeoutSeconds)
    {
	Variant vressourceName;
	vressourceName = new Variant(ressourceName);
	Variant vownerName;
	vownerName = new Variant(ownerName);
	Variant vcallbackName;
	vcallbackName = new Variant(callbackName);
	Variant vtimeoutSeconds;
	vtimeoutSeconds = new Variant(timeoutSeconds);
	Variant result = call("waitForResourcesTree" ,vressourceName, vownerName, vcallbackName, vtimeoutSeconds);
		// no return value
    }
}


