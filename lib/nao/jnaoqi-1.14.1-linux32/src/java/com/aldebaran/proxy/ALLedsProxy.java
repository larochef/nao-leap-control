// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALLedsProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALLedsProxy(String ip, int port) {
		super("ALLeds", ip, port);
	}
    /// <summary>
    /// Makes a group name for ease of setting multiple LEDs.
    /// </summary>
    /// <param name="groupName"> The name of the group. </param>
    /// <param name="ledNames"> A vector of the names of the LEDs in the group. </param>

    
    
    
    
    public void createGroup( String groupName,  String[] ledNames)
    {
	Variant vgroupName;
	vgroupName = new Variant(groupName);
	Variant vledNames;
	vledNames = new Variant(ledNames);
	Variant result = call("createGroup" ,vgroupName, vledNames);
		// no return value
    }
    /// <summary>
    /// An animation to show a direction with the ears.
    /// </summary>
    /// <param name="degrees"> The angle you want to show in degrees (int). 0 is up, 90 is forwards, 180 is down and 270 is back. </param>
    /// <param name="duration"> The duration in seconds of the animation. </param>
    /// <param name="leaveOnAtEnd"> If true the last led is left on at the end of the animation. </param>

    
    
    
    
    
    
    public void earLedsSetAngle( int degrees,  float duration,  Boolean leaveOnAtEnd)
    {
	Variant vdegrees;
	vdegrees = new Variant(degrees);
	Variant vduration;
	vduration = new Variant(duration);
	Variant vleaveOnAtEnd;
	vleaveOnAtEnd = new Variant(leaveOnAtEnd);
	Variant result = call("earLedsSetAngle" ,vdegrees, vduration, vleaveOnAtEnd);
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
    /// Sets the intensity of a LED or Group of LEDs within a given time.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="intensity"> The intensity of the LED or Group (a value between 0 and 1). </param>
    /// <param name="duration"> The duration of the fade in seconds </param>

    
    
    
    
    
    
    public void fade( String name,  float intensity,  float duration)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vintensity;
	vintensity = new Variant(intensity);
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("fade" ,vname, vintensity, vduration);
		// no return value
    }
    /// <summary>
    /// Chain a list of color for a device, as the motion.doMove command.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="rgbList"> List of RGB led value, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="timeList"> List of time to go to given intensity. </param>

    
    
    
    
    
    
    public void fadeListRGB( String name,  Variant rgbList,  Variant timeList)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vrgbList;
	vrgbList = new Variant(rgbList);
	Variant vtimeList;
	vtimeList = new Variant(timeList);
	Variant result = call("fadeListRGB" ,vname, vrgbList, vtimeList);
		// no return value
    }
    /// <summary>
    /// Sets the intensity of a led. If the name matches an RGB led, all channels are set to the same value.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="rgb"> The RGB value led, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="duration"> Time used to fade in seconds. </param>

    
    
    
    
    
    
    public void fadeRGB( String name,  int rgb,  float duration)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vrgb;
	vrgb = new Variant(rgb);
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("fadeRGB" ,vname, vrgb, vduration);
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
    /// Gets the intensity of a LED or device
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <returns> The intensity of the LED or Group. </returns>

    
    
    public Variant getIntensity( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("getIntensity" ,vname);
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
    /// Lists the devices in the group.
    /// </summary>
    /// <param name="groupName"> The name of the Group. </param>
    /// <returns> A vector of string device names. </returns>

    
    
    public String[] listGroup( String groupName)
    {
	Variant vgroupName;
	vgroupName = new Variant(groupName);
	Variant result = call("listGroup" ,vgroupName);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Lists available group names.
    /// </summary>
    /// <returns> A vector of group names. </returns>

    public String[] listGroups()
    {
	Variant result = call("listGroups" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Lists the devices aliased by a short LED name.
    /// </summary>
    /// <param name="name"> The name of the LED to list </param>
    /// <returns> A vector of device names. </returns>

    
    
    public String[] listLED( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("listLED" ,vname);
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Lists the short LED names.
    /// </summary>
    /// <returns> A vector of LED names. </returns>

    public String[] listLEDs()
    {
	Variant result = call("listLEDs" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Switch to a minimum intensity a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>

    
    
    public void off( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("off" ,vname);
		// no return value
    }
    /// <summary>
    /// Switch to a maximum intensity a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>

    
    
    public void on( String name)
    {
	Variant vname;
	vname = new Variant(name);
	Variant result = call("on" ,vname);
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
    /// Launch a random animation in eyes
    /// </summary>
    /// <param name="duration"> Approximate duration of the animation in seconds. </param>

    
    
    public void randomEyes( float duration)
    {
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("randomEyes" ,vduration);
		// no return value
    }
    /// <summary>
    /// Launch a green/yellow/red rasta animation on all body.
    /// </summary>
    /// <param name="duration"> Approximate duration of the animation in seconds. </param>

    
    
    public void rasta( float duration)
    {
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("rasta" ,vduration);
		// no return value
    }
    /// <summary>
    /// Launch a rotation using the leds of the eyes.
    /// </summary>
    /// <param name="rgb"> the RGB value led, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="timeForRotation"> Approximate time to make one turn. </param>
    /// <param name="totalDuration"> Approximate duration of the animation in seconds. </param>

    
    
    
    
    
    
    public void rotateEyes( int rgb,  float timeForRotation,  float totalDuration)
    {
	Variant vrgb;
	vrgb = new Variant(rgb);
	Variant vtimeForRotation;
	vtimeForRotation = new Variant(timeForRotation);
	Variant vtotalDuration;
	vtotalDuration = new Variant(totalDuration);
	Variant result = call("rotateEyes" ,vrgb, vtimeForRotation, vtotalDuration);
		// no return value
    }
    /// <summary>
    /// Sets the intensity of a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="intensity"> The intensity of the LED or Group (a value between 0 and 1). </param>

    
    
    
    
    public void setIntensity( String name,  float intensity)
    {
	Variant vname;
	vname = new Variant(name);
	Variant vintensity;
	vintensity = new Variant(intensity);
	Variant result = call("setIntensity" ,vname, vintensity);
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


