package ca.opus.www.opus

import android.app.Application
import android.media.SoundPool

/**
 * Created by Rohit on 2017-11-19.
 */
class Test : Application()
{
//    var songs: ArrayList<SongRecording> = ArrayList(0)
//    var songNames: ArrayList<String> = ArrayList(0)
    var song = SongRecording("Piano","MyTune", "James");


    override fun onCreate() {
        super.onCreate()

//        songs = ArrayList(0)
//        songNames = ArrayList(0)
        var song = SongRecording("Piano","MyTune", "James");

    }

//    fun getSongs(): ArrayList<SongRecording>
//    {
//        return songs;
//    }
}