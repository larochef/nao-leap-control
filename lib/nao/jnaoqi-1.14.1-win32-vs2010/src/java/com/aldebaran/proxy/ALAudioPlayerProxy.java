// Author: Aldebaran-Robotics
// Auto generated file.



package com.aldebaran.proxy;
import com.aldebaran.proxy.Variant;
import com.aldebaran.proxy.ALProxy;

public class ALAudioPlayerProxy extends ALProxy {
 	static {
	  System.loadLibrary("jnaoqi");
	}

 	public ALProxy proxy;

	/// <summary>
	/// Default Constructor.
	/// </summary>
	public ALAudioPlayerProxy(String ip, int port) {
		super("ALAudioPlayer", ip, port);
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
    /// Returns the position in the file which is currently played
    /// </summary>
    /// <param name="playId"> Id of the process which is playing the file </param>
    /// <returns> Position in the file in seconds </returns>

    
    
    public float getCurrentPosition( int playId)
    {
	Variant vplayId;
	vplayId = new Variant(playId);
	Variant result = call("getCurrentPosition" ,vplayId);
	    	return  result.toFloat();
    }
    /// <summary>
    /// Returns the length of the file played
    /// </summary>
    /// <param name="playId"> Id of the process which is playing the file </param>
    /// <returns> Length of the file in seconds </returns>

    
    
    public float getFileLength( int playId)
    {
	Variant vplayId;
	vplayId = new Variant(playId);
	Variant result = call("getFileLength" ,vplayId);
	    	return  result.toFloat();
    }
    /// <summary>
    /// returns an array containing the Ids of the currently loaded files
    /// </summary>
    /// <returns> Array containing the Ids of the files which has been loaded </returns>

    public String[] getLoadedFilesIds()
    {
	Variant result = call("getLoadedFilesIds" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// returns an array containing the names of the currently loaded files
    /// </summary>
    /// <returns> Array containing the names of the files which has been loaded </returns>

    public String[] getLoadedFilesNames()
    {
	Variant result = call("getLoadedFilesNames" );
	    	return (String[]) result.toStringArray();
    }
    /// <summary>
    /// Returns the master volume of the player
    /// </summary>
    /// <returns> Volume of the master - range 0.0 to 1.0. </returns>

    public float getMasterVolume()
    {
	Variant result = call("getMasterVolume" );
	    	return  result.toFloat();
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
    /// Returns the volume of the player
    /// </summary>
    /// <param name="playId"> Id of the process which is playing the file </param>
    /// <returns> Volume of the player - range 0.0 to 1.0. </returns>

    
    
    public float getVolume( int playId)
    {
	Variant vplayId;
	vplayId = new Variant(playId);
	Variant result = call("getVolume" ,vplayId);
	    	return  result.toFloat();
    }
    /// <summary>
    /// Goes to a given position in a file which is playing.
    /// </summary>
    /// <param name="playId"> Id of the process which is playing the file </param>
    /// <param name="position"> Position in the file (in second) </param>

    
    
    
    
    public void goTo( int playId,  float position)
    {
	Variant vplayId;
	vplayId = new Variant(playId);
	Variant vposition;
	vposition = new Variant(position);
	Variant result = call("goTo" ,vplayId, vposition);
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
    /// Loads a file for ulterior playback
    /// </summary>
    /// <param name="fileName"> Path of the sound file (either mp3 or wav) </param>
    /// <returns> Id of the file which has been loaded. This file can then be played with the play function </returns>

    
    
    public int loadFile( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("loadFile" ,vfileName);
	    	return  result.toInt();
    }
    /// <summary>
    /// Pause a play back
    /// </summary>
    /// <param name="id"> Id of the process that is playing the file you want to put in pause </param>

    
    
    public void pause( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("pause" ,vid);
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
    /// Starts the playback of a file preloaded with the loadFile function.
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>

    
    
    public void play( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("play" ,vid);
		// no return value
    }
    /// <summary>
    /// Starts the playback of a file preloaded with the loadFile function, with specific volume and audio balance
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>

    
    
    
    
    
    
    public void play( int id,  float volume,  float pan)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant vpan;
	vpan = new Variant(pan);
	Variant result = call("play" ,vid, vvolume, vpan);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>

    
    
    public void playFile( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("playFile" ,vfileName);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file, with specific volume and audio balance
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right / 0.0 : centered) </param>

    
    
    
    
    
    
    public void playFile( String fileName,  float volume,  float pan)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant vpan;
	vpan = new Variant(pan);
	Variant result = call("playFile" ,vfileName, vvolume, vpan);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file from a given position in the file.
    /// </summary>
    /// <param name="fileName"> Name of the sound file </param>
    /// <param name="position"> Position in second where the playing has to begin </param>

    
    
    
    
    public void playFileFromPosition( String fileName,  float position)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant vposition;
	vposition = new Variant(position);
	Variant result = call("playFileFromPosition" ,vfileName, vposition);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file from a given position in the file, with specific volume and audio balance
    /// </summary>
    /// <param name="fileName"> Name of the sound file </param>
    /// <param name="position"> Position in second where the playing has to begin </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>

    
    
    
    
    
    
    
    
    public void playFileFromPosition( String fileName,  float position,  float volume,  float pan)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant vposition;
	vposition = new Variant(position);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant vpan;
	vpan = new Variant(pan);
	Variant result = call("playFileFromPosition" ,vfileName, vposition, vvolume, vpan);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file in loop
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>

    
    
    public void playFileInLoop( String fileName)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant result = call("playFileInLoop" ,vfileName);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file in loop, with specific volume and audio balance
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>

    
    
    
    
    
    
    public void playFileInLoop( String fileName,  float volume,  float pan)
    {
	Variant vfileName;
	vfileName = new Variant(fileName);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant vpan;
	vpan = new Variant(pan);
	Variant result = call("playFileInLoop" ,vfileName, vvolume, vpan);
		// no return value
    }
    /// <summary>
    /// Starts the playback in loop of a file preloaded with the loadFile function
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>

    
    
    public void playInLoop( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("playInLoop" ,vid);
		// no return value
    }
    /// <summary>
    /// Plays a wav or mp3 file in loop, with specific volume and audio balance
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>

    
    
    
    
    
    
    public void playInLoop( int id,  float volume,  float pan)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant vpan;
	vpan = new Variant(pan);
	Variant result = call("playInLoop" ,vid, vvolume, vpan);
		// no return value
    }
    /// <summary>
    /// Play a sine wave which specified caracteristics.
    /// </summary>
    /// <param name="frequence"> Frequence in Hertz </param>
    /// <param name="gain"> Volume Gain between 0 and 100 </param>
    /// <param name="pan"> Stereo Pan set to either {-1,0,+1} </param>
    /// <param name="duration"> Duration of the sine wave in seconds </param>

    
    
    
    
    
    
    
    
    public void playSine( int frequence,  int gain,  int pan,  float duration)
    {
	Variant vfrequence;
	vfrequence = new Variant(frequence);
	Variant vgain;
	vgain = new Variant(gain);
	Variant vpan;
	vpan = new Variant(pan);
	Variant vduration;
	vduration = new Variant(duration);
	Variant result = call("playSine" ,vfrequence, vgain, vpan, vduration);
		// no return value
    }
    /// <summary>
    /// Starts the playback of a wab audio stream
    /// </summary>
    /// <param name="streamName"> Path of the web audio stream </param>
    /// <param name="arg2"> arg </param>
    /// <param name="arg3"> arg </param>

    
    
    
    
    
    
    public void playWebStream( String streamName,  float arg2,  float arg3)
    {
	Variant vstreamName;
	vstreamName = new Variant(streamName);
	Variant varg2;
	varg2 = new Variant(arg2);
	Variant varg3;
	varg3 = new Variant(arg3);
	Variant result = call("playWebStream" ,vstreamName, varg2, varg3);
		// no return value
    }
    /// <summary>
    /// Sets the master volume of the player
    /// </summary>
    /// <param name="volume"> Volume - range 0.0 to 1.0 </param>

    
    
    public void setMasterVolume( float volume)
    {
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant result = call("setMasterVolume" ,vvolume);
		// no return value
    }
    /// <summary>
    /// sets the audio panorama : -1 for left speaker / 1 for right speaker
    /// </summary>
    /// <param name="arg1"> arg </param>

    
    
    public void setPanorama( float arg1)
    {
	Variant varg1;
	varg1 = new Variant(arg1);
	Variant result = call("setPanorama" ,varg1);
		// no return value
    }
    /// <summary>
    /// Sets the volume of the player
    /// </summary>
    /// <param name="id"> Id of the process that is playing the file you want to put louder or less loud </param>
    /// <param name="volume"> Volume - range 0.0 to 1.0 </param>

    
    
    
    
    public void setVolume( int id,  float volume)
    {
	Variant vid;
	vid = new Variant(id);
	Variant vvolume;
	vvolume = new Variant(volume);
	Variant result = call("setVolume" ,vid, vvolume);
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
    /// Stops all the files that are currently playing.
    /// </summary>

    public void stopAll()
    {
	Variant result = call("stopAll" );
		// no return value
    }
    /// <summary>
    /// unloads all the files already loaded.
    /// </summary>

    public void unloadAllFiles()
    {
	Variant result = call("unloadAllFiles" );
		// no return value
    }
    /// <summary>
    /// unloads a file previously loaded with the loadFile function
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>

    
    
    public void unloadFile( int id)
    {
	Variant vid;
	vid = new Variant(id);
	Variant result = call("unloadFile" ,vid);
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


