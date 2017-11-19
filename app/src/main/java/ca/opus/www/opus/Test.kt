package ca.opus.www.opus

import android.app.Application

/**
 * Created by Rohit on 2017-11-19.
 */
class Test : Application()
{
    var songs: ArrayList<SongRecording> = ArrayList(0)
    var songNames: ArrayList<String> = ArrayList(0)

    override fun onCreate() {
        super.onCreate()

        songs = ArrayList(0)
        songNames = ArrayList(0)

    }

//    fun getSongs(): ArrayList<SongRecording>
//    {
//        return songs;
//    }
}