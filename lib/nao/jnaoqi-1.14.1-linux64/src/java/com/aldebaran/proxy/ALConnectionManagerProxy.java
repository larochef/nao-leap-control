// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALConnectionManagerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALConnectionManagerProxy(String ip, int port) {
		super("ALConnectionManager", ip, port);
	}
    /// <summary>
    /// Request a connection to the service. If some input is needed for the connection to succeed, an event will be raised
    /// </summary>
    /// <param name="serviceId"> Service identifier </param>

    
    
    public void connect( String serviceId)
    {
	Variant vserviceId;
	vserviceId = new Variant(serviceId);
	Variant result = call("connect" ,vserviceId);
		// no return value
    }
    /// <summary>
    /// Destroy the Access Point created on a given technology
    /// </summary>
    /// <param name="technology"> The technology to disable tethering </param>

    
    
    public void disableTethering( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("disableTethering" ,vtechnology);
		// no return value
    }
    /// <summary>
    /// Disconnect a service
    /// </summary>
    /// <param name="serviceId"> Service identifier </param>

    
    
    public void disconnect( String serviceId)
    {
	Variant vserviceId;
	vserviceId = new Variant(serviceId);
	Variant result = call("disconnect" ,vserviceId);
		// no return value
    }
    /// <summary>
    /// Create a Network Access Point on a given technology and share internet connection if any
    /// </summary>
    /// <param name="technology"> Technology on which enabling tethering </param>

    
    
    public void enableTethering( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("enableTethering" ,vtechnology);
		// no return value
    }
    /// <summary>
    /// Create a Network Access Point on a given technology and share internet connection if any
    /// </summary>
    /// <param name="technology"> The technology on which enabling tethering </param>
    /// <param name="name"> The name of the network to create </param>
    /// <param name="Passphrase"> The WPA2 passphrase to connect to the created network </param>

    
    
    
    
    
    
    public void enableTethering( String technology,  String name,  String Passphrase)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant vname;
	vname = new Variant(name);
	Variant vPassphrase;
	vPassphrase = new Variant(Passphrase);
	Variant result = call("enableTethering" ,vtechnology, vname, vPassphrase);
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
    /// Forget stored information about the service
    /// </summary>
    /// <param name="serviceId"> Service identifier </param>

    
    
    public void forget( String serviceId)
    {
	Variant vserviceId;
	vserviceId = new Variant(serviceId);
	Variant result = call("forget" ,vserviceId);
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
    /// 
    /// </summary>
    /// <param name="technology"> The technology </param>
    /// <returns> Return whether tethering mode is enabled for the given technology. </returns>

    
    
    public Boolean getTetheringEnable( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("getTetheringEnable" ,vtechnology);
	    	return  result.toBoolean();
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
    /// scan all available services on registered technologies
    /// </summary>

    public void scan()
    {
	Variant result = call("scan" );
		// no return value
    }
    /// <summary>
    /// scan for available services on a given technology
    /// </summary>
    /// <param name="technology"> The type of technology to scan </param>

    
    
    public void scan( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("scan" ,vtechnology);
		// no return value
    }
    /// <summary>
    /// Return the service properties
    /// </summary>
    /// <param name="serviceId"> Service identifier </param>
    /// <returns> Return the service properties </returns>

    
    
    public Variant service( String serviceId)
    {
	Variant vserviceId;
	vserviceId = new Variant(serviceId);
	Variant result = call("service" ,vserviceId);
	    	return  result;
    }
    /// <summary>
    /// Return the list of all network services with their properties
    /// </summary>
    /// <returns> An array of NetworkInfo </returns>

    public Variant services()
    {
	Variant result = call("services" );
	    	return  result;
    }
    /// <summary>
    /// Set the service configuration
    /// </summary>
    /// <param name="service"> The service to configure </param>

    
    
    public void setServiceConfiguration( Variant service)
    {
	Variant vservice;
	vservice = new Variant(service);
	Variant result = call("setServiceConfiguration" ,vservice);
		// no return value
    }
    /// <summary>
    /// provide input for pending connection
    /// </summary>
    /// <param name="reply"> The required input requested by the connection manager to finalize the pending connection </param>

    
    
    public void setServiceInput( Variant reply)
    {
	Variant vreply;
	vreply = new Variant(reply);
	Variant result = call("setServiceInput" ,vreply);
		// no return value
    }
    /// <summary>
    /// Return the current global state of the connection manager
    /// </summary>
    /// <returns> A string containing the current state </returns>

    public String state()
    {
	Variant result = call("state" );
	    	return  result.toString();
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
    /// return the list of all available technologies
    /// </summary>
    /// <returns> An AL::Value containing an array of string </returns>

    public Variant technologies()
    {
	Variant result = call("technologies" );
	    	return  result;
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="technology"> The technology </param>
    /// <returns> The name of the network used by the tethering mode </returns>

    
    
    public String tetheringName( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("tetheringName" ,vtechnology);
	    	return  result.toString();
    }
    /// <summary>
    /// 
    /// </summary>
    /// <param name="technology"> The technology </param>
    /// <returns> The passphrase of the network used by the tethering mode </returns>

    
    
    public String tetheringPassphrase( String technology)
    {
	Variant vtechnology;
	vtechnology = new Variant(technology);
	Variant result = call("tetheringPassphrase" ,vtechnology);
	    	return  result.toString();
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


