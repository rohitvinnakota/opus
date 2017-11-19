package ca.opus.www.opus

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**
 * Created by James on 11/18/2017.
 */
class SongRecording : Serializable
{
    var instrument: String;
    var name: String;
    var artistName: String;
    var times: ArrayList<Long>;
    var records: ArrayList<Int>;

    constructor(instrument : String, name : String, artistName : String)
    {
        this.instrument = instrument;
        this.name = name;
        this.artistName = artistName;
        this.times = ArrayList(0);
        this.records = ArrayList(0);
    }

    fun add(time: Long, record: Int)
    {
        times.add(time);
        records.add(record);
    }

    fun size() : Int{
        return times.size;
    }

    fun get(index : Int) : Int
    {
        return records[index];
    }

    fun clear()
    {
        times.clear();
        records.clear();
    }
}