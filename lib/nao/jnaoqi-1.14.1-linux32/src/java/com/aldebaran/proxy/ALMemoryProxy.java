// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALMemoryProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALMemoryProxy(String ip, int port) {
		super("ALMemory", ip, port);
	}
    /// <summary>
    /// Declares an event to allow future subscriptions to the event
    /// </summary>
    /// <param name="eventName"> The name of the event </param>

    
    
    public void declareEvent( String eventName)
    {
	Variant veventName;
	veventName = new Variant(eventName);
	Variant result = call("declareEvent" ,veventName);
		// no return value
    }
    /// <summary>
    /// Declares an event to allow future subscriptions to the event
    /// </summary>
    /// <param name="eventName"> The name of the event </param>
    /// <param name="extractorName"> The name of the extractor capable of creating the event </param>

    
    
    
    
    public void declareEvent( String eventName,  String extractorName)
    {
	Variant veventName;
	veventName = new Variant(eventName);
	Variant vextractorName;
	vextractorName = new Variant(extractorName);
	Variant result = call("declareEvent" ,veventName, vextractorName);
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
    /// Gets the value of a key-value pair stored in memory
    /// </summary>
    /// <param name="key"> Name of the value. </param>
    /// <returns> The data as an ALValue. This can often be cast transparently into the original type. </returns>

    
    
    public Variant getData( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("getData" ,vkey);
	    	return  result;
    }
    /// <summary>
    /// DEPRECATED - Gets the value of a key-value pair stored in memory. Please use the version of this method with no second parameter.
    /// </summary>
    /// <param name="key"> Name of the value. </param>
    /// <param name="deprecatedParameter"> DEPRECATED - This parameter has no effect, but is left for compatibility reason. </param>
    /// <returns> The data as an ALValue </returns>

    
    
    
    
    public Variant getData( String key,  int deprecatedParameter)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vdeprecatedParameter;
	vdeprecatedParameter = new Variant(deprecatedParameter);
	Variant result = call("getData" ,vkey, vdeprecatedParameter);
	    	return  result;
    }
    /// <summary>
    /// Gets a list of all key names that contain a given string
    /// </summary>
    /// <param name="filter"> A string used as the search term </param>
    /// <returns> A list of all the data key names that contain the given string. </returns>

    
    
    public String[] getDataList( String filter)
    {
	Variant vfilter;
	vfilter = new Variant(filter);
	Variant result = call("getDataList" ,vfilter);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets the key names for all the key-value pairs in memory
    /// </summary>
    /// <returns> A list containing the keys in memory </returns>

    public String[] getDataListName()
    {
	Variant result = call("getDataListName" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// DEPRECATED - Blocks the caller until the value of a key changes
    /// </summary>
    /// <param name="key"> Name of the data. </param>
    /// <param name="deprecatedParameter"> DEPRECATED - this parameter has no effect </param>
    /// <returns> an array containing all the retrieved data </returns>

    
    
    
    
    public Variant getDataOnChange( String key,  int deprecatedParameter)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vdeprecatedParameter;
	vdeprecatedParameter = new Variant(deprecatedParameter);
	Variant result = call("getDataOnChange" ,vkey, vdeprecatedParameter);
	    	return  result;
    }
    /// <summary>
    /// Gets a pointer to 32 a bit data item. Beware, the pointer will only be valid during the lifetime of the ALMemory object. Use with care, at initialization, not every loop.
    /// </summary>
    /// <param name="key"> Name of the data. </param>
    /// <returns> A pointer converted to int </returns>

    
    
    public void  getDataPtr( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("getDataPtr" ,vkey);
    }
    /// <summary>
    /// Descriptions of all given keys
    /// </summary>
    /// <param name="keylist"> List of keys. (empty to get all descriptions) </param>
    /// <returns> an array of tuple (name, type, description) describing all keys. </returns>

    
    
    public Variant getDescriptionList( String[] keylist)
    {
	Variant vkeylist;
	vkeylist = new Variant(keylist);
	Variant result = call("getDescriptionList" ,vkeylist);
	    	return  result;
    }
    /// <summary>
    /// Get data value and timestamp
    /// </summary>
    /// <param name="key"> Name of the variable </param>
    /// <returns> A list of all the data key names that contain the given string. </returns>

    
    
    public Variant getEventHistory( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("getEventHistory" ,vkey);
	    	return  result;
    }
    /// <summary>
    /// Gets a list containing the names of all the declared events
    /// </summary>
    /// <returns> A list containing the names of all events </returns>

    public String[] getEventList()
    {
	Variant result = call("getEventList" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets the list of all events generated by a given extractor
    /// </summary>
    /// <param name="extractorName"> The name of the extractor </param>
    /// <returns> A list containing the names of the events associated with the given extractor </returns>

    
    
    public String[] getExtractorEvent( String extractorName)
    {
	Variant vextractorName;
	vextractorName = new Variant(extractorName);
	Variant result = call("getExtractorEvent" ,vextractorName);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Gets the values associated with the given list of keys. This is more efficient than calling getData many times, especially over the network.
    /// </summary>
    /// <param name="keyList"> An array containing the key names. </param>
    /// <returns> An array containing all the values corresponding to the given keys. </returns>

    
    
    public Variant getListData( Variant keyList)
    {
	Variant vkeyList;
	vkeyList = new Variant(keyList);
	Variant result = call("getListData" ,vkeyList);
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
    /// Gets a list containing the names of all the declared micro events
    /// </summary>
    /// <returns> A list containing the names of all the microEvents </returns>

    public String[] getMicroEventList()
    {
	Variant result = call("getMicroEventList" );
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
    /// Gets a list containing the names of subscribers to an event.
    /// </summary>
    /// <param name="name"> Name of the event or micro-event </param>
    /// <returns> List of subscriber names </returns>

    
    
    public String[] getSubscribers( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getSubscribers" ,vname);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Get data value and timestamp
    /// </summary>
    /// <param name="key"> Name of the variable </param>
    /// <returns> A list of all the data key names that contain the given string. </returns>

    
    
    public Variant getTimestamp( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("getTimestamp" ,vkey);
	    	return  result;
    }
    /// <summary>
    /// Gets the storage class of the stored data. This is not the underlying POD type.
    /// </summary>
    /// <param name="key"> Name of the variable </param>
    /// <returns> String type: Data, Event, MicroEvent </returns>

    
    
    public String getType( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("getType" ,vkey);
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
    /// Inserts a key-value pair into memory, where value is an int
    /// </summary>
    /// <param name="key"> Name of the value to be inserted. </param>
    /// <param name="value"> The int to be inserted </param>

    
    
    
    
    public void insertData( String key,  int value)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("insertData" ,vkey, vvalue);
		// no return value
    }
    /// <summary>
    /// Inserts a key-value pair into memory, where value is a float
    /// </summary>
    /// <param name="key"> Name of the value to be inserted. </param>
    /// <param name="value"> The float to be inserted </param>

    
    
    
    
    public void insertData( String key,  float value)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("insertData" ,vkey, vvalue);
		// no return value
    }
    /// <summary>
    /// Inserts a key-value pair into memory, where value is a string
    /// </summary>
    /// <param name="key"> Name of the value to be inserted. </param>
    /// <param name="value"> The string to be inserted </param>

    
    
    
    
    public void insertData( String key,  String value)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("insertData" ,vkey, vvalue);
		// no return value
    }
    /// <summary>
    /// Inserts a key-value pair into memory, where value is an ALValue
    /// </summary>
    /// <param name="key"> Name of the value to be inserted. </param>
    /// <param name="data"> The ALValue to be inserted. This could contain a basic type, or a more complex array. See the ALValue documentation for more information. </param>

    
    
    
    
    public void insertData( String key,  Variant data)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant vdata;
	vdata = new Variant(data);
	Variant result = call("insertData" ,vkey, vdata);
		// no return value
    }
    /// <summary>
    /// Inserts a list of key-value pairs into memory.
    /// </summary>
    /// <param name="list"> An ALValue list of the form [[Key, Value],...]. Each item will be inserted. </param>

    
    
    public void insertListData( Variant list)
    {
	Variant vlist;
	vlist = new Variant(list);
	Variant result = call("insertListData" ,vlist);
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
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>

    public Boolean ping()
    {
	Variant result = call("ping" );
	    	return  result.toBoolean();
    }
    /// <summary>
    /// Publishes the given data to all subscribers.
    /// </summary>
    /// <param name="name"> Name of the event to raise. </param>
    /// <param name="value"> The data associated with the event. This could contain a basic type, or a more complex array. See the ALValue documentation for more information. </param>

    
    
    
    
    public void raiseEvent( String name,  Variant value)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("raiseEvent" ,vname, vvalue);
		// no return value
    }
    /// <summary>
    /// Publishes the given data to all subscribers.
    /// </summary>
    /// <param name="name"> Name of the event to raise. </param>
    /// <param name="value"> The data associated with the event. This could contain a basic type, or a more complex array. See the ALValue documentation for more information. </param>

    
    
    
    
    public void raiseMicroEvent( String name,  Variant value)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vvalue;
	vvalue = new Variant(value);
	Variant result = call("raiseMicroEvent" ,vname, vvalue);
		// no return value
    }
    /// <summary>
    /// Removes a key-value pair from memory
    /// </summary>
    /// <param name="key"> Name of the data to be removed. </param>

    
    
    public void removeData( String key)
    {
	Variant vkey;
	vkey = new Variant(key);
	Variant result = call("removeData" ,vkey);
		// no return value
    }
    /// <summary>
    /// Removes a micro event from memory and unsubscribes any exiting subscribers.
    /// </summary>
    /// <param name="name"> Name of the event to remove. </param>

    
    
    public void removeMicroEvent( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("removeMicroEvent" ,vname);
		// no return value
    }
    /// <summary>
    /// Describe a key
    /// </summary>
    /// <param name="name"> Name of the key. </param>
    /// <param name="description"> The description of the event (text format). </param>

    
    
    
    
    public void setDescription( String name,  String description)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vdescription;
	vdescription = new Variant(description);
	Variant result = call("setDescription" ,vname, vdescription);
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
    /// Subscribes to an event and automaticaly launches the module that declared itself as the generator of the event if required.
    /// </summary>
    /// <param name="name"> The name of the event to subscribe to </param>
    /// <param name="callbackModule"> Name of the module to call with notifications </param>
    /// <param name="callbackMethod"> Name of the module's method to call when a data is changed </param>

    
    
    
    
    
    
    public void subscribeToEvent( String name,  String callbackModule,  String callbackMethod)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcallbackModule;
	vcallbackModule = new Variant(callbackModule);
	Variant vcallbackMethod;
	vcallbackMethod = new Variant(callbackMethod);
	Variant result = call("subscribeToEvent" ,vname, vcallbackModule, vcallbackMethod);
		// no return value
    }
    /// <summary>
    /// DEPRECATED Subscribes to event and automaticaly launches the module capable of generating the event if it is not already running. Please use the version without the callbackMessage parameter.
    /// </summary>
    /// <param name="name"> The name of the event to subscribe to </param>
    /// <param name="callbackModule"> Name of the module to call with notifications </param>
    /// <param name="callbackMessage"> DEPRECATED Message included in the notification. </param>
    /// <param name="callbacMethod"> Name of the module's method to call when a data is changed </param>

    
    
    
    
    
    
    
    
    public void subscribeToEvent( String name,  String callbackModule,  String callbackMessage,  String callbacMethod)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcallbackModule;
	vcallbackModule = new Variant(callbackModule);
	Variant vcallbackMessage;
	vcallbackMessage = new Variant(callbackMessage);
	Variant vcallbacMethod;
	vcallbacMethod = new Variant(callbacMethod);
	Variant result = call("subscribeToEvent" ,vname, vcallbackModule, vcallbackMessage, vcallbacMethod);
		// no return value
    }
    /// <summary>
    /// Subscribes to a microEvent. Subscribed modules are notified on theircallback method whenever the data is updated, even if the new value is the same as the old value.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="callbackModule"> Name of the module to call with notifications </param>
    /// <param name="callbackMessage"> Message included in the notification. This can be used to disambiguate multiple subscriptions. </param>
    /// <param name="callbackMethod"> Name of the module's method to call when a data is changed </param>

    
    
    
    
    
    
    
    
    public void subscribeToMicroEvent( String name,  String callbackModule,  String callbackMessage,  String callbackMethod)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcallbackModule;
	vcallbackModule = new Variant(callbackModule);
	Variant vcallbackMessage;
	vcallbackMessage = new Variant(callbackMessage);
	Variant vcallbackMethod;
	vcallbackMethod = new Variant(callbackMethod);
	Variant result = call("subscribeToMicroEvent" ,vname, vcallbackModule, vcallbackMessage, vcallbackMethod);
		// no return value
    }
    /// <summary>
    /// Does nothing. DEPRECATED.
    /// </summary>
    /// <param name="moduleName">  </param>

    
    
    public void unregisterModuleReference( String moduleName)
    {
	Variant vmoduleName;
	vmoduleName = new Variant(moduleName);
	Variant result = call("unregisterModuleReference" ,vmoduleName);
		// no return value
    }
    /// <summary>
    /// Unsubscribes a module from the given event. No further notifications will be received.
    /// </summary>
    /// <param name="name"> The name of the event </param>
    /// <param name="callbackModule"> The name of the module that was given when subscribing. </param>

    
    
    
    
    public void unsubscribeToEvent( String name,  String callbackModule)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcallbackModule;
	vcallbackModule = new Variant(callbackModule);
	Variant result = call("unsubscribeToEvent" ,vname, vcallbackModule);
		// no return value
    }
    /// <summary>
    /// Unsubscribes from the given event. No further notifications will be received.
    /// </summary>
    /// <param name="name"> Name of the event. </param>
    /// <param name="callbackModule"> The name of the module that was given when subscribing. </param>

    
    
    
    
    public void unsubscribeToMicroEvent( String name,  String callbackModule)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vcallbackModule;
	vcallbackModule = new Variant(callbackModule);
	Variant result = call("unsubscribeToMicroEvent" ,vname, vcallbackModule);
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


