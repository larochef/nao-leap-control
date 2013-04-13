// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALSentinelProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALSentinelProxy(String ip, int port) {
		super("ALSentinel", ip, port);
	}
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>

    
    
    
    
    
    
    public void batteryPowerPluggedChanged( String dataName,  Variant data,  String message)
    {
	Variant vdataName;
	vdataName = new Variant(dataName);
	Variant vdata;
	vdata = new Variant(data);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("batteryPowerPluggedChanged" ,vdataName, vdata, vmessage);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  check the battery information, voltage and alarm flag
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable (default: true) </param>

    
    
    public void enableBatteryMeasure( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableBatteryMeasure" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  check the remaining physical memory
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable (default: true) </param>

    
    
    public void enableCheckRemainingRam( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableCheckRemainingRam" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  enable or disable the \"ouch\" action after two pushes.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>

    
    
    public void enableDefaultActionDoubleClick( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableDefaultActionDoubleClick" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14.
    ///
    /// enable or disable the \"hello, i'm nao...\" after one short push of the Power button. In both cases the ALMemory ALSentinel/SimpleClickOccured key will be set to true, so users can read/registerOnChange it, then reset to false after handling the event.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>

    
    
    public void enableDefaultActionSimpleClick( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableDefaultActionSimpleClick" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  enable or disable the \"restart naoqi\" action after three pushes.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>

    
    
    public void enableDefaultActionTripleClick( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableDefaultActionTripleClick" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  Enable or Disable heat monitoring.
    /// </summary>
    /// <param name="enable"> true to enable, false to disable, default: true </param>

    
    
    public void enableHeatMonitoring( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enableHeatMonitoring" ,venable);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  Enable or Disable power monitoring.
    /// </summary>
    /// <param name="enable"> true to enable, false to disable, default: true </param>

    
    
    public void enablePowerMonitoring( Boolean enable)
    {
	Variant venable;
	venable = new Variant(enable);
	Variant result = call("enablePowerMonitoring" ,venable);
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
    /// DEPRECATED since 1.14
    ///
    ///  exit naoqi (warning: it will really exit Naoqi)
    /// </summary>

    public void exitNaoqi()
    {
	Variant result = call("exitNaoqi" );
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  Get the battery level (0..5) 5: full 0: totally empty (never reached).
    /// </summary>
    /// <returns> the battery level (0..5): 5: full 0: totally empty (never reached) </returns>

    public int getBatteryLevel()
    {
	Variant result = call("getBatteryLevel" );
	    	return  result.toInt();
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  Get a text presentation of the battery level ('My battery is...').
    /// </summary>
    /// <returns> the sentence describing the battery level </returns>

    public String getBatteryLevelDesc()
    {
	Variant result = call("getBatteryLevelDesc" );
	    	return  result.toString();
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
    /// DEPRECATED since 1.14
    ///
    ///  get the remaining physical memory value (one shot)
    /// </summary>
    /// <returns> the remaining RAM in kb </returns>

    public int getRemainingRam()
    {
	Variant result = call("getRemainingRam" );
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
    /// DEPRECATED since 1.14
    ///
    ///  callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>

    
    
    
    
    
    
    public void onBatteryMeasure( String dataName,  Variant data,  String message)
    {
	Variant vdataName;
	vdataName = new Variant(dataName);
	Variant vdata;
	vdata = new Variant(data);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("onBatteryMeasure" ,vdataName, vdata, vmessage);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  callback for change in battery power level. (internal use).
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>

    
    
    
    
    
    
    public void onMotorError( String dataName,  Variant data,  String message)
    {
	Variant vdataName;
	vdataName = new Variant(dataName);
	Variant vdata;
	vdata = new Variant(data);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("onMotorError" ,vdataName, vdata, vmessage);
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  callback for change in battery power level. (internal use).
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>

    
    
    
    
    
    
    public void onTemperatureMeasure( String dataName,  Variant data,  String message)
    {
	Variant vdataName;
	vdataName = new Variant(dataName);
	Variant vdata;
	vdata = new Variant(data);
	Variant vmessage;
	vmessage = new Variant(message);
	Variant result = call("onTemperatureMeasure" ,vdataName, vdata, vmessage);
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
    /// DEPRECATED since 1.14
    ///
    ///  Launch a small presentation of Nao: name, ip, battery. It's the default behavior launched when user press on the chest
    /// </summary>
    /// <param name="enableFastCheckJoints"> if true, Nao will quickly check that his joints are moving properly. </param>

    
    
    public void presentation( Boolean enableFastCheckJoints)
    {
	Variant venableFastCheckJoints;
	venableFastCheckJoints = new Variant(enableFastCheckJoints);
	Variant result = call("presentation" ,venableFastCheckJoints);
		// no return value
    }
    /// <summary>
    /// Monitors buttons and Battery.
    /// </summary>

    public void run()
    {
	Variant result = call("run" );
		// no return value
    }
    /// <summary>
    /// DEPRECATED since 1.14
    ///
    ///  Change the power threshold; below it, Nao will sit down and remove power from his motors.
    /// </summary>
    /// <param name="powerLimit"> power limit in percent, default: 0.07; 0.00 to disable this feature. </param>

    
    
    public void setPowerLimit( float powerLimit)
    {
	Variant vpowerLimit;
	vpowerLimit = new Variant(powerLimit);
	Variant result = call("setPowerLimit" ,vpowerLimit);
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


